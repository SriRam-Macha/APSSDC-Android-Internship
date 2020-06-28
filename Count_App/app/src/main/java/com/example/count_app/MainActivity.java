package com.example.count_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    Button plus, minus, reset, toast;
    int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.count);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        reset = findViewById(R.id.reset);
        toast = findViewById(R.id.toast);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                tv.setText(Integer.toString(count));
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count--;
                tv.setText(Integer.toString(count));
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = 0;
                tv.setText("0");
            }
        });

        if(savedInstanceState != null){
            String resume_count = savedInstanceState.getString("saved_count");
            count = Integer.parseInt(resume_count);
            tv.setText(resume_count);
        }

    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("saved_count", tv.getText().toString());

    }
    public void display_toast(View view){
        Toast.makeText(this,"Current Count is :" + tv.getText(),Toast.LENGTH_SHORT).show();
    }

}