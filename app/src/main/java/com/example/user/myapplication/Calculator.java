package com.example.user.myapplication;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by User on 8/29/2016.
 */
public class Calculator {
    public static int total = 0;
    public static ArrayList<Expense> Expenses;


    public static void addexpense(Expense exp) {
        Expenses.add(exp);
        total += exp.expense;

    }


    public static void deleteexpense(Expense e) {
        Expenses.remove(e);

    }








}
