package com.example.spiner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MyCustomAdapter extends ArrayAdapter<String> {
    public MyCustomAdapter(@NonNull Context context, int resource) {
        super(context, resource);
    }

    // Сделал в MainActivity
//    @Override
//    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        return getCustomView(position, convertView, parent);
//    }
//
//    @NonNull
//    @Override
//    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        return getCustomView(position, convertView, parent);
//    }
//
//    public View getCustomView(int position, View convertView, ViewGroup parent){
//        LayoutInflater inflater = getLayoutInflater();
//        View row = inflater.inflate(R.layout.row, parent, false);
//        TextView label  = row.findViewById(R.id.textView);
//        label.setText(listForSpinner[position]);
//
//        ImageView icon = row.findViewById(R.id.icon);
//
//        if (listForSpinner[position] == "Первый элемент"
//                || listForSpinner[position] == "Третий элемент") {
//            icon.setImageResource(R.drawable.ic_launcher_background);
//        }
//        return row;
//    }
}
