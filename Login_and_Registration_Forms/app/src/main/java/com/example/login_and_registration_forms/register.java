package com.example.login_and_registration_forms;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class register extends AppCompatActivity {

    EditText username, password, mail, phone;
    Button register;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        username = findViewById(R.id.usernameR);
        password = findViewById(R.id.passwordR);
        mail = findViewById(R.id.mail);
        phone = findViewById(R.id.Phonenum);
        register = findViewById(R.id.registerR);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usernameext = username.getText().toString();
                String passtext = password.getText().toString();
                String mailtext = mail.getText().toString();
                String phonenum = phone.getText().toString();

                if (usernameext.isEmpty() || passtext.isEmpty() || mailtext.isEmpty() || phonenum.isEmpty()){
                    Toast.makeText(register.this, "Please enter Proper Credentials", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
