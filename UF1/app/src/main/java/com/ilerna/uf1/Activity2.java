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
            int edad = extras.getInt("edad");
            textView.setText(String.valueOf(edad));
        }
    }


    public void volverActivity1(View view) {
        Intent intent = new Intent(Activity2.this,MainActivity.class);
        intent.putExtra("clase","TODO HA IDO OK");
        setResult(RESULT_OK,intent);
        finish();
    }
}
