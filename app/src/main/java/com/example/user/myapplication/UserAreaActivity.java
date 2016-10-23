package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Comparator;
import java.util.Iterator;

public class UserAreaActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView a;
    static TextView tv;
    public int p;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final Button del = (Button) findViewById(R.id.bDel);

        setContentView(R.layout.activity_user_area);
        a = (ListView) findViewById(R.id.listView);
        final Button button = (Button) findViewById(R.id.bAdd);
        tv = (TextView) findViewById(R.id.textView2);
        tv.setText("total: " + Integer.toString(Calculator.total));

        String[] stockArr = new String[LoginActivity.expense.size()];
        stockArr = LoginActivity.expense.toArray(stockArr);


        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println(Calculator.total);
                Intent intent = new Intent(UserAreaActivity.this, AddExpenseActivity.class);
                UserAreaActivity.this.startActivity(intent);

            }

        });

        del.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }


        });


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, LoginActivity.expense);
        a.setAdapter(adapter);

        a.setOnItemClickListener(this);
    }

        /**button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Chart.class);
                UserAreaActivity.this.startActivity(intent);


            }
        });
         */
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {



    }











    }



