package com.example.login_and_registration_forms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.lang.ref.SoftReference;

public class MainActivity extends AppCompatActivity {

    EditText username,password;
    Button login,register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);
        register = findViewById(R.id.register);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usr = username.getText().toString();
                String pass = password.getText().toString();
                if(usr.isEmpty() || pass.isEmpty()){
                    Toast.makeText(MainActivity.this, "Please Enter Username and Password", Toast.LENGTH_SHORT).show();
                }else {
                    Intent home = new Intent(view.getContext(),HomePage.class);
                    startActivity(home);
                }
            }
        });


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent register = new Intent(view.getContext(), register.class);
                startActivity(register);
            }
        });

    }




}