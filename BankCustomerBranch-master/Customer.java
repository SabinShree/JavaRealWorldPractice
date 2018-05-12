package com.javaArray;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double amount) {
        this.name = name;
        this.transactions = new ArrayList<>();
        addTransaction(amount);
    }

    public boolean addTransaction(double amount) {
        if (amount >= 0) {
            return this.transactions.add(amount);
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
