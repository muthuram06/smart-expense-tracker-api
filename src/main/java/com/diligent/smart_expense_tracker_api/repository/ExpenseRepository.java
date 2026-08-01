package com.diligent.smart_expense_tracker_api.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.diligent.smart_expense_tracker_api.model.Expense;
import com.diligent.smart_expense_tracker_api.util.JsonStorageUtil;

@Repository
public class ExpenseRepository {

    private final JsonStorageUtil jsonStorageUtil;

    public ExpenseRepository(JsonStorageUtil jsonStorageUtil) {
        this.jsonStorageUtil = jsonStorageUtil;
    }

    public List<Expense> findAll() {
        return jsonStorageUtil.readExpenses();
    }

    public Expense save(Expense expense) {

        List<Expense> expenses = jsonStorageUtil.readExpenses();

        long nextId = expenses.stream()
                .mapToLong(Expense::getId)
                .max()
                .orElse(0) + 1;

        expense.setId(nextId);

        expenses.add(expense);

        jsonStorageUtil.saveExpenses(expenses);

        return expense;
    }

    public Optional<Expense> findById(Long id) {

        return jsonStorageUtil.readExpenses()
                .stream()
                .filter(expense -> expense.getId().equals(id))
                .findFirst();
    }

    public void deleteById(Long id) {

        List<Expense> expenses = jsonStorageUtil.readExpenses();

        expenses.removeIf(expense -> expense.getId().equals(id));

        jsonStorageUtil.saveExpenses(expenses);
    }

    public List<Expense> findByCategory(String category) {

        return jsonStorageUtil.readExpenses()
                .stream()
                .filter(expense ->
                        expense.getCategory().equalsIgnoreCase(category))
                .toList();
    }
}