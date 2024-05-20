package com.example.classapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
Button addBtn;
EditText num1;
EditText num2;
EditText num3;
Integer int1,int2,int3;
String string3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addBtn=findViewById(R.id.buttonAdd);
        num1=findViewById(R.id.editText1);
        num2=findViewById(R.id.editTextText2);
        num3=findViewById(R.id.editTextText3);


        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int1=Integer.parseInt(num1.getText().toString());
                int2=Integer.parseInt(num2.getText().toString());
                int3=int1+int2;
                string3=int3.toString();
                num3.setText(string3);
            }
        });
    }

}