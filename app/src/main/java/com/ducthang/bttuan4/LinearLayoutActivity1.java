package com.ducthang.bttuan4;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LinearLayoutActivity1 extends AppCompatActivity {
    TextView doisang2, trovemain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linearlayout1);
        doisang2 = findViewById(R.id.doisang2);
        doisang2.setOnClickListener(v -> {
            Intent intent = new Intent(LinearLayoutActivity1.this, LinearLayoutActivity2.class);
            startActivity(intent);
        });

        trovemain = findViewById(R.id.trovemain);
        trovemain.setOnClickListener(v -> {
            Intent intent = new Intent(LinearLayoutActivity1.this, MainActivity.class);
            startActivity(intent);
        });
    }
}
