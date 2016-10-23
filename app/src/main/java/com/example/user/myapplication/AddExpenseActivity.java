package com.example.user.myapplication;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.util.Date;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Message;
public class AddExpenseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        final Button buttonadd = (Button) findViewById(R.id.buttonadd);
        final EditText et = (EditText) findViewById(R.id.editText);
        final EditText et2 = (EditText) findViewById(R.id.editText2);
        final EditText et3 = (EditText) findViewById(R.id.editText3);



        buttonadd.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String a = et.getText().toString();
                System.out.println(a);
                int b = Integer.parseInt(et2.getText().toString());
                String c = et3.getText().toString();
                Expense exp = new Expense(a,b);
                LoginActivity.myDb.addtotable(exp
                );
                Calculator.addexpense(exp);
                UserAreaActivity.tv.setText("total: "+ Integer.toString(Calculator.total));
                String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
                LoginActivity.expense.add(exp.name + "    "+ Integer.toString(exp.expense) + "         " + date);
                exp.description = "et3";
                Intent intent = new Intent(AddExpenseActivity.this,UserAreaActivity.class);
                AddExpenseActivity.this.startActivity(intent);




            }

        });

    }

}
