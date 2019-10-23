package com.ilerna.uf1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public final int CODE_ACTIVITY2=2;

    TextView textView;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        b1 = findViewById(R.id.alvaroButton);
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this,Activity2.class);
                intent.putExtra("edad",25);
                startActivityForResult(intent,CODE_ACTIVITY2);
            }

        });
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

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == CODE_ACTIVITY2) {
            if (resultCode == RESULT_OK) {
                Bundle extras = data.getExtras();
                if (extras != null) {
                    Toast.makeText(this, extras.getString("clase"), Toast.LENGTH_SHORT).show();
                }
            }
        }
    }
}
