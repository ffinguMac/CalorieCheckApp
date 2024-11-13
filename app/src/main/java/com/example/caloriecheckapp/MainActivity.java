package com.example.caloriecheckapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Start 버튼 참조 및 클릭 리스너 설정
        Button startButton = findViewById(R.id.startButton);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 다음 화면으로 이동하는 인텐트 작성
                Intent intent = new Intent(MainActivity.this, LoginActivity.class); // NextActivity는 다음 화면의 액티비티
                startActivity(intent);
            }
        });
    }
}