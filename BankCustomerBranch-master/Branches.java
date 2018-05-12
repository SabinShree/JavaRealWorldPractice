package com.javaArray;

import java.util.ArrayList;

public class Branches {
    private String bankName;
    private ArrayList<Customer> myCustomer;

    public Branches(String bankName) {
        this.bankName = bankName;
        this.myCustomer = new ArrayList<>();
    }

    public String getBankName() {
        return this.bankName;
    }

    public ArrayList<Customer> getMyCustomer() {
        return myCustomer;
    }

    public boolean addNewCustomer(String name, double amount) {
        if (findCustomerName(name) == null) {
            this.myCustomer.add(new Customer(name, amount));
            return true;
        }
        return false;
    }


    public boolean addCustomerTransactions(String name, double amount) {
        if (findCustomerName(name) == null) {
            return false;
        }
        findCustomerName(name).addTransaction(amount);
        return true;
    }

    public Customer findCustomerName(String customerName) {
        for (int i = 0; i < myCustomer.size() - 1; i++) {
            for (int j = 0; j < myCustomer.size() - 1 - i; j++) {
                if (myCustomer.get(j).getName().compareToIgnoreCase(myCustomer.get(j + 1).getName()) > 0) {
                    Customer customer = myCustomer.get(j + 1);
                    // b a d c
                    myCustomer.set(j + 1, myCustomer.get(j));
                    myCustomer.set(j, customer);
                }
            }
        }

        int low = 0;
        int high = myCustomer.size() - 1;
        while (low >= high) {
            int middle = (low + high) / 2;
            if (myCustomer.get(middle).getName().compareToIgnoreCase(customerName) > 0) {
                low = middle - 1;
            } else if (myCustomer.get(middle).getName().compareToIgnoreCase(customerName) < 0) {
                high = middle + 1;
            } else {
                return myCustomer.get(middle);
            }
        }

        return null;
    }


}
