package com.example.user.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Message;

/**
 * Created by User on 9/14/2016.
 */
public class DataBase extends SQLiteOpenHelper{
    public static final String DATABASE_NAME = "EXPENSEMANAGER";
    public static final String TABLE_NAME = "EXPENSES";
    public static final String COL1 = "ID";
    public static final String COL2 = "EXPENSENAME";
    public static final String COL3 = "EXPENSEVALUE";
    public static final String COL4 = "DATES";
    public static final String COL5 = "DESCRIPTION";
    private Context context;

    public DataBase(Context context){
        super(context, DATABASE_NAME, null,12 );
        this.context = context;
        SQLiteDatabase db = this.getWritableDatabase();
        com.example.user.myapplication.Message.message(context,"constructor called");

    }
    @Override
    public void onCreate(SQLiteDatabase db){
        try {
            String query = "CREATE TABLE EXPENSES(ID INTEGER PRIMARY KEY AUTOINCREMENT, EXPENSENAME VARCHAR(255), EXPENSEVALUE INTEGER, DATES VARCHAR(255),DESCRIPTION VARCHAR(255));";
            db.execSQL(query);
            System.out.println("a");
            com.example.user.myapplication.Message.message(context,"On create called");
        }catch(Exception e){
            System.out.println("a");
        }
    }

    public  void addtotable(Expense expense){
        try{
            com.example.user.myapplication.Message.message(context,"Expense added");
            ContentValues values = new ContentValues();
            values.put(COL2,expense.name);
            values.put(COL3,expense.expense);
            values.put(COL4,expense.date);
            values.put(COL4,expense.description);
            SQLiteDatabase db = getWritableDatabase();
            db.insert(TABLE_NAME,null,values);


        }catch(Exception e){

        }
    }


    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        try {
            com.example.user.myapplication.Message.message(context,"On upgrade called");
            db.execSQL("DROP TABLE " + TABLE_NAME);

            onCreate(db);
        }catch (Exception e){
            System.out.println("d");
            com.example.user.myapplication.Message.message(context,"On create called");

        }
    }
}
