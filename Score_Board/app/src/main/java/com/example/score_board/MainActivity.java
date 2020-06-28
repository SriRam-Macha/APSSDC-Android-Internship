package com.example.score_board;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView team_a,team_b;
    Button A1,A2,A3,B1,B2,B3,reset;
    int count_a,count_b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        team_a = findViewById(R.id.team_a);
        team_b  = findViewById(R.id.team_b);
        A1 = findViewById(R.id.A1);
        A2 = findViewById(R.id.A2);
        A3 = findViewById(R.id.A3);
        B1 = findViewById(R.id.B1);
        B2 = findViewById(R.id.B2);
        B3 = findViewById(R.id.B3);
        reset = findViewById(R.id.reset);

        A1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count_a++;
                team_a.setText(Integer.toString(count_a));
            }
        });
        A2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count_a += 2;
                team_a.setText(Integer.toString(count_a));
            }
        });
        A3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count_a += 3;
                team_a.setText(Integer.toString(count_a));
            }
        });
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count_b++;
                team_b.setText(Integer.toString(count_b));
            }
        });
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count_b += 2;
                team_b.setText(Integer.toString(count_b));
            }
        });
        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count_b += 3;
                team_b.setText(Integer.toString(count_b));
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count_a = 0;
                count_b = 0;
                team_a.setText("0");
                team_b.setText("0");
            }
        });

        if(savedInstanceState != null){
            String team_a_resume = savedInstanceState.getString("team_a");
            String team_b_resume = savedInstanceState.getString("team_b");
            count_a = Integer.parseInt(team_a_resume);
            count_b = Integer.parseInt(team_b_resume);
            team_a.setText(team_a_resume);
            team_b.setText(team_b_resume);
        }

    }


    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("team_a",team_a.getText().toString());
        outState.putString("team_b",team_b.getText().toString());
    }
}