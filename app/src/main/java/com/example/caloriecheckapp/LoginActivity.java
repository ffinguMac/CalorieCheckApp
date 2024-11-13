package com.example.caloriecheckapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        // 로그인 버튼 클릭 시 이벤트
        findViewById(R.id.loginButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 사용자 입력값 확인
                EditText emailField = findViewById(R.id.emailEditText);
                EditText passwordField = findViewById(R.id.passwordEditText);

                String email = emailField.getText().toString();
                String password = passwordField.getText().toString();

                // 간단한 검증 예제
                if (email.isEmpty() || password.isEmpty()) {
                    Toast.makeText(LoginActivity.this, "Please enter all fields", Toast.LENGTH_SHORT).show();
                } else {
                    // 로그인 처리 로직 추가 예정
                    Toast.makeText(LoginActivity.this, "Logging in...", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}