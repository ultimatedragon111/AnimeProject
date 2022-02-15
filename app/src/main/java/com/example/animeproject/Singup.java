package com.example.animeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Singup extends AppCompatActivity {

    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singup);

        button1 =  findViewById(R.id.signUpButton2);
        button2 =  findViewById(R.id.loginButton2);
        /*button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Intent a = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(a);
            }
        });*/
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Intent a = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(a);
            }
        });
    }
}