package com.ilerna.uf1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        textView = findViewById(R.id.textView2);
        Bundle extras = getIntent().getExtras();
        if (extras !=null) {
            String name = extras.getString("name");
            textView.setText(name);
        }
    }



}
