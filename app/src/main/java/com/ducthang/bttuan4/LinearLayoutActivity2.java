package com.ducthang.bttuan4;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LinearLayoutActivity2 extends AppCompatActivity {
    TextView doisang1, trovemain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linearlayout2);
        doisang1 = findViewById(R.id.doisang1);
        doisang1.setOnClickListener(v -> {
            Intent intent = new Intent(LinearLayoutActivity2.this, LinearLayoutActivity1.class);
            startActivity(intent);
        });

        trovemain = findViewById(R.id.trovemain1);
        trovemain.setOnClickListener(v -> {
            Intent intent = new Intent(LinearLayoutActivity2.this, MainActivity.class);
            startActivity(intent);
        });
    }
}
