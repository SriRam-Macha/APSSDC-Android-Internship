package com.example.input_controls;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et_name,et_mobile,et_email,et_pass,et_roll;
    RadioButton r_male,r_female;
    String gender;
    Spinner sp_branch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_roll = findViewById(R.id.rollno);
        et_name = findViewById(R.id.name);
        et_mobile = findViewById(R.id.mobile);
        et_email = findViewById(R.id.email);
        et_pass = findViewById(R.id.password);
        r_male = findViewById(R.id.male);
        r_female = findViewById(R.id.female);
        sp_branch = findViewById(R.id.branch);


        ArrayAdapter<CharSequence> districts_adapter = ArrayAdapter.createFromResource(this,
                R.array.Branches, android.R.layout.preference_category);
        sp_branch.setAdapter(districts_adapter);

    }

    public void submit(View view) {
        String name = et_name.getText().toString();
        String mobile = et_mobile.getText().toString();
        String email = et_email.getText().toString();
        String pass = et_pass.getText().toString();
        String roll = et_roll.getText().toString();
        if(r_male.isChecked()){
            gender = r_male.getText().toString();
        }
        if(r_female.isChecked()){
            gender = r_female.getText().toString();
        }

        String branch = sp_branch.getSelectedItem().toString();

        String message = ("User Details:\n"+ "Rollno: " +roll+"\nName: "+name+"\nPhone: "+mobile+"\nEmailId: "+email+"\nPassword: "+pass+"\nGender: " +gender+"\nBranch: "+branch+"\n");

        Intent newpage = new  Intent(view.getContext(),Newpage.class);
        newpage.putExtra("message", message);
        startActivity(newpage);

    }
}