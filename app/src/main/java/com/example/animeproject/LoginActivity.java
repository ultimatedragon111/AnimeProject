package com.example.animeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        button1 =  findViewById(R.id.signUpButton1);
        button2 =  findViewById(R.id.loginButton1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Intent activity2Intent = new Intent(getApplicationContext(), Singup.class);
                startActivity(activity2Intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                //Intent a = new Intent(this,Singup.class);
                //startActivity(a);
            }
        });




    }
}