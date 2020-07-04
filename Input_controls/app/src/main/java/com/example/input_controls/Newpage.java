package com.example.input_controls;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Newpage extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newpage);
        Bundle bundle = getIntent().getExtras();
        String message = bundle.getString("message");
        tv = findViewById(R.id.result);
        tv.setText(message);

    }
}
