package com.javaArray;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branches> myBranches;

    public boolean addBankTransactions(String BankName, String customerName, double amount) {
        if (findBank(BankName) != null) {
            findBank(BankName).addNewCustomer(customerName, amount);
            return true;
        }
        return false;
    }

    public boolean addBranch(String name) {
        if (findBank(name) != null) {
            this.myBranches.add(new Branches(name));
            return true;
        }
        return false;
    }

    public boolean addNewCustomer(String bankName, String customerName, double amount) {
        if (findBank(bankName) != null) {
            findBank(bankName).addNewCustomer(customerName, amount);
            return true;
        }
        return false;
    }

    public Branches findBank(String bankName) {
        for (int i = 0; i < this.myBranches.size(); i++) {
            Branches branches = this.myBranches.get(i);
            if (branches.getBankName().equalsIgnoreCase(bankName)) {
                return branches;
            }
        }
        return null;
    }

    public boolean listCustomers(String bankName, boolean showTransactions) {
        Branches branches = findBank(bankName);
        if (branches != null) {
            System.out.println("Customer details for branch: " + branches.getBankName());
            ArrayList<Customer> branchCustomers = branches.getMyCustomer();
            for (int i = 0; i < branchCustomers.size(); i++) {
                System.out.println("Customer: " + branchCustomers.get(i).getName() + " { " + (i + 1) + " } ");
                if (showTransactions) {
                    System.out.println("Transactions: ");
                    ArrayList<Double> transactions = branchCustomers.get(i).getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("{ " + (j + 1) + " Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        }
        return false;
    }


}
