package com.example.caloriecheckapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class UserInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);

        // 뷰 참조
        RadioGroup genderGroup = findViewById(R.id.genderGroup);
        EditText ageEditText = findViewById(R.id.ageEditText);
        EditText heightEditText = findViewById(R.id.heightEditText);
        EditText weightEditText = findViewById(R.id.weightEditText);
        Spinner experienceSpinner = findViewById(R.id.experienceSpinner);
        Spinner frequencySpinner = findViewById(R.id.frequencySpinner);
        Spinner fitnessLevelSpinner = findViewById(R.id.fitnessLevelSpinner);
        Button saveButton = findViewById(R.id.saveButton);

        // 운동 경력 선택 항목 설정
        ArrayAdapter<CharSequence> experienceAdapter = ArrayAdapter.createFromResource(this,
                R.array.experience_array, android.R.layout.simple_spinner_item);
        experienceAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        experienceSpinner.setAdapter(experienceAdapter);

        // 운동 횟수 선택 항목 설정
        ArrayAdapter<CharSequence> frequencyAdapter = ArrayAdapter.createFromResource(this,
                R.array.frequency_array, android.R.layout.simple_spinner_item);
        frequencyAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        frequencySpinner.setAdapter(frequencyAdapter);

        // 체력 수준 선택 항목 설정
        ArrayAdapter<CharSequence> fitnessLevelAdapter = ArrayAdapter.createFromResource(this,
                R.array.fitness_level_array, android.R.layout.simple_spinner_item);
        fitnessLevelAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        fitnessLevelSpinner.setAdapter(fitnessLevelAdapter);

        // 저장 버튼 클릭 리스너 설정
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedGenderId = genderGroup.getCheckedRadioButtonId();
                RadioButton selectedGenderButton = findViewById(selectedGenderId);
                String gender = selectedGenderButton == null ? "" : selectedGenderButton.getText().toString();
                String age = ageEditText.getText().toString();
                String height = heightEditText.getText().toString();
                String weight = weightEditText.getText().toString();
                String experience = experienceSpinner.getSelectedItem().toString();
                String frequency = frequencySpinner.getSelectedItem().toString();
                String fitnessLevel = fitnessLevelSpinner.getSelectedItem().toString();
                if (gender.isEmpty() || age.isEmpty() || height.isEmpty() || weight.isEmpty()) {
                    Toast.makeText(UserInfoActivity.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
                } else {
                    // 정보 저장 및 다음 화면으로 이동
                    Toast.makeText(UserInfoActivity.this, "Information Saved", Toast.LENGTH_SHORT).show();

                    //Intent intent = new Intent(UserInfoActivity.this, MainScreenActivity.class);
                    //startActivity(intent);
                    finish(); // 현재 화면 종료
                }
            }
        });
    }
}
