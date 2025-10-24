package com.example.androiduitesting;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;

public class ShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        TextView cityNameTextView = findViewById(R.id.text_cityName);
        Button backButton = findViewById(R.id.button_back);

        String cityName = getIntent().getStringExtra("CITY_NAME");
        cityNameTextView.setText(cityName);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Navigates back to MainActivity
            }
        });
    }
}