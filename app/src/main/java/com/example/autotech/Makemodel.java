package com.example.autotech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.ColorSpace;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.time.Year;

public class Makemodel extends AppCompatActivity {
    EditText e1,e2,e3;
    String Make,Model,Year;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makemodel);
        e1 = findViewById(R.id.make);
        e2 = findViewById(R.id.model);
        e3 = findViewById(R.id.year);
        b1= findViewById(R.id.btnsubmit);
        e1.setText(Make);
        e2.setText(Model);
        e3.setText(Year);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Make = e1.getText().toString();
                Model = e2.getText().toString();
                Year = e3.getText().toString();
                Intent i1 = new Intent(Makemodel.this, Price.class);
                i1.putExtra("key5", "Make");
                i1.putExtra("key6", "Model");
                i1.putExtra("key7", "Year");
                startActivity(i1);

            }
        });
    }
}
