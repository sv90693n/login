package com.example.newrepeat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TabWidget;
import android.widget.Toast;

public class PAGE extends AppCompatActivity {

    EditText type;
    Button  ting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page);

        type = findViewById(R.id.TypeID);
ting = findViewById(R.id.button4);
        type.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(PAGE.this,"Please enter the requirements okay?",Toast.LENGTH_SHORT).show();

            }
        });

        ting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Openactivity();
                Toast.makeText(PAGE.this,"PPlease leave now",Toast.LENGTH_SHORT).show();

            }
        });












    }

    public void Openactivity() {
        Intent intent = new Intent(PAGE.this, activity3.class);
        startActivity(intent);
    }

}