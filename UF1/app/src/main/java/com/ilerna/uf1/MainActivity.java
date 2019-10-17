package com.ilerna.uf1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        textView.append("OnCreate();\n");
        Toast.makeText(this, "OnCreate();\n", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        textView.append("OnStart();\n");
        Toast.makeText(this, "OnStart();\n", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        textView.append("OnResume();\n");
        Toast.makeText(this, "OnResume();\n", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        textView.append("OnPause();\n");
        Toast.makeText(this, "OnPause();\n", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        textView.append("OnStop();\n");
        Toast.makeText(this, "OnStop();\n", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        textView.append("OnRestart();\n");
        Toast.makeText(this, "OnRestart();\n", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        textView.append("OnDestroy()\n");
        Toast.makeText(this, "OnDestroy()\n", Toast.LENGTH_SHORT).show();
    }


    public void irActivity2(View view) {
        Intent intent = new Intent(MainActivity.this, Activity2.class);
        startActivity(intent);
        finish();
    }

    /*public void changeActivityForResult(View view) {
        Intent intent = new Intent(MainActivity.this,Activity2.class);
        intent.putExtra("name","Ilerna");
        startActivityForResult(intent,2);
    }*/
}
