package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    Button btnevent1;
    Button btnevent2;
    Button btnevent3;
    Button btnevent4;
    Button btnevent5;
    Button btnevent6;
    Button btnevent7;
    Button btnevent8;
    Button btnevent9;
    Button btnevent10;
    Button btnevent11;
    Button btnevent12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnevent1 = findViewById(R.id.button49);
        btnevent1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),  "Welcome to GOA", Toast.LENGTH_SHORT).show();

                Intent intent= new Intent(getApplicationContext(), GoaActivity.class);
                startActivity(intent);
            }
        });

        btnevent2 = findViewById(R.id.button50);
        btnevent2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),  "Welcome to GUJARAT", Toast.LENGTH_SHORT).show();

                Intent intent= new Intent(getApplicationContext(), GujaratActivity.class);
                startActivity(intent);
            }
        });

        btnevent3 = findViewById(R.id.button51);
        btnevent3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),  "Welcome to HIMACHAL PRADESH", Toast.LENGTH_SHORT).show();

                Intent intent= new Intent(getApplicationContext(), HimachalActivity.class);
                startActivity(intent);
            }
        });

        btnevent4 = findViewById(R.id.button52);
        btnevent4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),  "Welcome to JAMMU & KASHMIR", Toast.LENGTH_SHORT).show();

                Intent intent= new Intent(getApplicationContext(), JakActivity.class);
                startActivity(intent);
            }
        });

        btnevent5 = findViewById(R.id.button53);
        btnevent5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),  "Welcome to KARNATAKA", Toast.LENGTH_SHORT).show();

                Intent intent= new Intent(getApplicationContext(), KarnatakaActivity.class);
                startActivity(intent);
            }
        });

        btnevent6 = findViewById(R.id.button54);
        btnevent6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),  "Welcome to KERALA", Toast.LENGTH_SHORT).show();

                Intent intent= new Intent(getApplicationContext(), KeralaActivity.class);
                startActivity(intent);
            }
        });

        btnevent7 = findViewById(R.id.button55);
        btnevent7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),  "Welcome to MADHYA PRADESH", Toast.LENGTH_SHORT).show();

                Intent intent= new Intent(getApplicationContext(), MpActivity.class);
                startActivity(intent);
            }
        });

        btnevent8 = findViewById(R.id.button56);
        btnevent8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),  "Welcome to PUNJAB", Toast.LENGTH_SHORT).show();

                Intent intent= new Intent(getApplicationContext(), PunjabActivity.class);
                startActivity(intent);
            }
        });

        btnevent9 = findViewById(R.id.button57);
        btnevent9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),  "Welcome to RAJASTHAN", Toast.LENGTH_SHORT).show();

                Intent intent= new Intent(getApplicationContext(), RajasthanActivity.class);
                startActivity(intent);
            }
        });

        btnevent10 = findViewById(R.id.button58);
        btnevent10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),  "Welcome to TAMIL NADU", Toast.LENGTH_SHORT).show();

                Intent intent= new Intent(getApplicationContext(), TnActivity.class);
                startActivity(intent);
            }
        });

        btnevent11 = findViewById(R.id.button59);
        btnevent11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),  "Welcome to UTTAR PRADESH", Toast.LENGTH_SHORT).show();

                Intent intent= new Intent(getApplicationContext(), UpActivity.class);
                startActivity(intent);
            }
        });

        btnevent12 = findViewById(R.id.button60);
        btnevent12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),  "Welcome to WEST BENGAL", Toast.LENGTH_SHORT).show();

                Intent intent= new Intent(getApplicationContext(), WbActivity.class);
                startActivity(intent);
            }
        });
    }
}