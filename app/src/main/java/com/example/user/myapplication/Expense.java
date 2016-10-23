package com.example.user.myapplication;

import android.widget.ListView;

/**
 * Created by User on 8/29/2016.
 */
public class Expense  {
    public String name;
    public int expense;
    public String date;
    public String description;
    


public Expense(String name, int expense){
    this.name = name;
    this.expense = expense;
}
    @Override
    public boolean equals(Object o){
        Expense ex = (Expense) o;
        return Double.compare(this.expense, ex.expense) == 0
                && ex.name.equals(this.name) == true;

    }


}
