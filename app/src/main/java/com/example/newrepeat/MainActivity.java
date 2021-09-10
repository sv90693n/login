package com.example.newrepeat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button buttonek;
    Button buttondho;
    Button buttontheen;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
buttonek = findViewById(R.id.APARTMENT);
buttondho = findViewById(R.id.Button2);
buttontheen = findViewById(R.id.button3);

buttonek.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

        Intent intent = new Intent(MainActivity.this, PAGE.class);
        startActivity(intent);
        Toast.makeText(MainActivity.this, "Your house is an apartment with 1000 sqft", Toast.LENGTH_SHORT).show();

    }});

        buttondho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, PAGE.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Your house is a Villa with 23445 sqft", Toast.LENGTH_SHORT).show();


            }});

        buttontheen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, PAGE.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Your house is a CONDO with 2209 sqft", Toast.LENGTH_SHORT).show();


            }}    );












    }

    }


//    buttondho.setOnClickListener(new View.OnClickListener() {
//@Override
//public void onClick(View view) {
//
//        Intent intent = new Intent(MainActivity.this,PAGE.class);
//        startActivity(intent);
//        Toast.makeText(MainActivity.this,"Your house is a Villa with 23445 sqft",Toast.LENGTH_SHORT).show();
//
//
//
//        });
//
//        }

//
//




