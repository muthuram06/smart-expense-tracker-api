package com.diligent.smart_expense_tracker_api.dto;

import java.util.Map;

public class SummaryResponse {

    private Double totalExpense;
    private Map<String, Double> categoryTotals;

    public SummaryResponse() {
    }

    public SummaryResponse(Double totalExpense, Map<String, Double> categoryTotals) {
        this.totalExpense = totalExpense;
        this.categoryTotals = categoryTotals;
    }

    public Double getTotalExpense() {
        return totalExpense;
    }

    public void setTotalExpense(Double totalExpense) {
        this.totalExpense = totalExpense;
    }

    public Map<String, Double> getCategoryTotals() {
        return categoryTotals;
    }

    public void setCategoryTotals(Map<String, Double> categoryTotals) {
        this.categoryTotals = categoryTotals;
    }
}