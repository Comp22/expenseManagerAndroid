package com.example.user.myapplication;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by User on 9/15/2016.
 */
public class Message {
    public static void message(Context context, String message)
    {
        Toast.makeText(context,message, Toast.LENGTH_LONG).show();
    }
}
