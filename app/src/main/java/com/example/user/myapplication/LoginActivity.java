package com.example.user.myapplication;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class LoginActivity extends AppCompatActivity {
    ListView a;
    public static ArrayList<String> expense;
    public static ArrayList<Integer> price;
    public static DataBase myDb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        myDb = new DataBase(this);
        SQLiteDatabase sqLiteDatabase = myDb.getWritableDatabase();
        final EditText etUsername = (EditText) findViewById(R.id.etUsername);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);
        final Button bLogin = (Button) findViewById(R.id.bLogin);
        final TextView registerLink = (TextView) findViewById(R.id.tvRegisterHere);

        registerLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(LoginActivity.this, RegisterActivity.class);
                LoginActivity.this.startActivity(registerIntent);



            }
        });

        bLogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                 Login login = new Login();
                 if(login.login(etUsername.getText().toString(),etPassword.getText().toString()) == true){
                    Calculator.Expenses = new ArrayList<Expense>();
                    expense = new ArrayList<String>();
                    Intent r = new Intent(LoginActivity.this, UserAreaActivity.class);
                    LoginActivity.this.startActivity(r);

            }else {
                    System.out.println("a");
                }


            }


        });

    }
}
