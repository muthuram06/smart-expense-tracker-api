package com.diligent.smart_expense_tracker_api.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.diligent.smart_expense_tracker_api.dto.ExpenseRequest;
import com.diligent.smart_expense_tracker_api.dto.ExpenseResponse;
import com.diligent.smart_expense_tracker_api.dto.SummaryResponse;
import com.diligent.smart_expense_tracker_api.model.Expense;
import com.diligent.smart_expense_tracker_api.repository.ExpenseRepository;

@Service
public class ExpenseService {

    private final ExpenseRepository repository;

    public ExpenseService(ExpenseRepository repository) {
        this.repository = repository;
    }

    public ExpenseResponse addExpense(ExpenseRequest request) {

        Expense expense = new Expense();

        expense.setTitle(request.getTitle());
        expense.setAmount(request.getAmount());
        expense.setCategory(request.getCategory());
        expense.setDate(request.getDate());

        Expense savedExpense = repository.save(expense);

        return new ExpenseResponse(
                savedExpense.getId(),
                savedExpense.getTitle(),
                savedExpense.getAmount(),
                savedExpense.getCategory(),
                savedExpense.getDate());
    }

    public List<Expense> getAllExpenses() {
        return repository.findAll();
    }

    public List<Expense> getExpensesByCategory(String category) {
        return repository.findByCategory(category);
    }

    public void deleteExpense(Long id) {
        repository.deleteById(id);
    }

    public SummaryResponse getSummary() {

        List<Expense> expenses = repository.findAll();

        double totalExpense = 0.0;

        Map<String, Double> categoryTotals = new HashMap<>();

        for (Expense expense : expenses) {

            totalExpense += expense.getAmount();

            categoryTotals.put(
                    expense.getCategory(),
                    categoryTotals.getOrDefault(expense.getCategory(), 0.0)
                            + expense.getAmount());
        }

        return new SummaryResponse(totalExpense, categoryTotals);
    }
}