package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = findViewById(R.id.spinner);

        String[] location = {"Dhanmondi", "Shamoly", "gulshan"};
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.custom_spinner,location );
         spinner.setAdapter(adapter);
    }
}