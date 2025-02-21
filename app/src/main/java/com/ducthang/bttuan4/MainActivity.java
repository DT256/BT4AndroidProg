package com.ducthang.bttuan4;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Switch;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout layout;
    private Switch switchBackground;
    private Button btnNextBT2;
    private Button btnNextBT3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        layout = findViewById(R.id.main);
        int[] backgrounds = {
                R.drawable.background_1,
                R.drawable.background_2,
                R.drawable.background_3,
                R.drawable.background_4
        };

        // Chọn ngẫu nhiên một hình nền
        Random random = new Random();
        int randomIndex = random.nextInt(backgrounds.length);

        // Đặt hình nền cho Layout
        layout.setBackgroundResource(backgrounds[randomIndex]);

        switchBackground = findViewById(R.id.switch1);

        // Bắt sự kiện khi Switch thay đổi trạng thái
        switchBackground.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                layout.setBackgroundResource(backgrounds[0]);
            } else {
                layout.setBackgroundResource(backgrounds[1]);

            }
        });

        btnNextBT2 = findViewById(R.id.btnNextBT2);
        // Xử lý sự kiện khi nhấn nút
        btnNextBT2.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, LinearLayoutActivity1.class);
            startActivity(intent);
        });


    }
}