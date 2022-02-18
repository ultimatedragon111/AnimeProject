package com.example.animeproject;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class LoginActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private TextInputEditText email;
    private TextInputEditText pass;

    String JSON;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        button1 =  findViewById(R.id.signUpButton1);
        button2 =  findViewById(R.id.loginButton1);
        email = findViewById(R.id.email);
        pass = findViewById(R.id.password);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Intent activity2Intent = new Intent(getApplicationContext(), Singup.class);
                startActivity(activity2Intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                JSON = Server.JSON_USER_LOGIN + "email=" + email.getText().toString().trim() + "&password=" + pass.getText().toString().trim();
                Toast.makeText(getApplicationContext(),"Gsadao",Toast.LENGTH_SHORT);
                getComp();

                // Do something in response to button click
                //Intent a = new Intent(this,Singup.class);
                //startActivity(a);
            }
        });




    }
    private void getComp() {
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(
                Request.Method.GET,
                JSON,
                null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        Intent activity2Intent = new Intent(getApplicationContext(), ListActivity.class);
                        startActivity(activity2Intent);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(getApplicationContext(), "Error login", Toast.LENGTH_SHORT).show();
                    }
                }
        );
        queue.add(jsonObjectRequest);

    }
    }

