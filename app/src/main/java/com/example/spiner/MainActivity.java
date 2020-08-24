package com.example.spiner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String[] listForSpinner = {"Первый элемент", "Второй элемент", "Третий элемент"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, listForSpinner);
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        MyCustomAdapter adapter = new MyCustomAdapter(MainActivity.this, R.layout.row, listForSpinner);

        Spinner spinner = findViewById(R.id.spinner);
        spinner.setAdapter(adapter);

        spinner.setPrompt("Choose element");

        spinner.setSelection(2);
    }

    public class MyCustomAdapter extends ArrayAdapter<String> {
        public MyCustomAdapter(@NonNull Context context, int resource, String[] objects) {
            super(context, resource, objects);
        }

        @Override
        public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            return getCustomView(position, convertView, parent);
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            return getCustomView(position, convertView, parent);
        }

        public View getCustomView(int position, View convertView, ViewGroup parent){
            LayoutInflater inflater = getLayoutInflater();
            View row = inflater.inflate(R.layout.row, parent, false);
            TextView label  = row.findViewById(R.id.textView);
            label.setText(listForSpinner[position]);

            ImageView icon = row.findViewById(R.id.icon);

            if (listForSpinner[position].equals("Первый элемент")
                    || listForSpinner[position].equals("Третий элемент")) {
                icon.setImageResource(R.drawable.ic_launcher_background);
            }
            return row;
        }
    }
}
