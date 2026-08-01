package com.diligent.smart_expense_tracker_api.controller;

import java.util.List;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.diligent.smart_expense_tracker_api.dto.ExpenseRequest;
import com.diligent.smart_expense_tracker_api.dto.ExpenseResponse;
import com.diligent.smart_expense_tracker_api.dto.SummaryResponse;
import com.diligent.smart_expense_tracker_api.model.Expense;
import com.diligent.smart_expense_tracker_api.service.ExpenseService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/expenses")
@Validated
public class ExpenseController {

    private final ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @PostMapping
    public ExpenseResponse addExpense(
            @Valid @RequestBody ExpenseRequest request) {

        return expenseService.addExpense(request);
    }

    @GetMapping
    public List<Expense> getExpenses(
            @RequestParam(required = false) String category) {

        if (category != null && !category.isBlank()) {
            return expenseService.getExpensesByCategory(category);
        }

        return expenseService.getAllExpenses();
    }

    @DeleteMapping("/{id}")
    public void deleteExpense(@PathVariable Long id) {
        expenseService.deleteExpense(id);
    }

    @GetMapping("/summary")
    public SummaryResponse getSummary() {
        return expenseService.getSummary();
    }
}