package com.diligent.smart_expense_tracker_api.util;

import com.diligent.smart_expense_tracker_api.model.Expense;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class JsonStorageUtil {

    private static final String FILE_PATH = "src/main/resources/expenses.json";

    private final ObjectMapper objectMapper;

    public JsonStorageUtil() {
        objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
    }

    public List<Expense> readExpenses() {

        File file = new File(FILE_PATH);

        if (!file.exists()) {
            return new ArrayList<>();
        }

        try {
            return objectMapper.readValue(file, new TypeReference<List<Expense>>() {});
        } catch (IOException e) {
            return new ArrayList<>();
        }
    }

    public void saveExpenses(List<Expense> expenses) {

        try {
            objectMapper.writerWithDefaultPrettyPrinter()
                    .writeValue(new File(FILE_PATH), expenses);
        } catch (IOException e) {
            throw new RuntimeException("Unable to save expenses.");
        }

    }

}