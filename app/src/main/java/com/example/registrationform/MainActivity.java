package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
Spinner spinner;
ListView listView;
GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         spinner = findViewById(R.id.spinner);

        String[] location = {"Dhanmondi", "Shamoly", "gulshan","savar" , "kollanpur"};
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.custom_spinner,location );
         spinner.setAdapter(adapter);



         listView = findViewById(R.id.listview);
         listView.setAdapter(adapter);


         gridView = findViewById(R.id.gridview);
         gridView.setAdapter(adapter);
    }
}