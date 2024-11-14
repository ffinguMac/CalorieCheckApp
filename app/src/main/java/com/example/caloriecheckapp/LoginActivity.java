package com.example.caloriecheckapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // 로그인 버튼 클릭 시 이벤트
        findViewById(R.id.loginButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 사용자 입력값 확인
                EditText emailField = findViewById(R.id.emailEditText);
                EditText passwordField = findViewById(R.id.passwordEditText);

                String email = emailField.getText().toString();
                String password = passwordField.getText().toString();

                // 로그인 검증
                if (email.isEmpty() || password.isEmpty()) {
                    Toast.makeText(LoginActivity.this, "Please enter all fields", Toast.LENGTH_SHORT).show();
                } else if (email.equals("admin") && password.equals("1234")) {
                    // 로그인 성공 시 UserInfoActivity로 이동
                    Toast.makeText(LoginActivity.this, "Login successful", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginActivity.this, UserInfoActivity.class);
                    startActivity(intent);
                    finish(); // 현재 액티비티 종료
                } else {
                    // 로그인 실패 메시지
                    Toast.makeText(LoginActivity.this, "Invalid credentials", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
