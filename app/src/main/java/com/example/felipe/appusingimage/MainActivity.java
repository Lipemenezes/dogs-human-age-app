package com.example.felipe.appusingimage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editAge;
    private TextView textResponse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.init();
    }

    public void calculateAge(View view) {
        String text = editAge.getText().toString();
        if (text.isEmpty()) {
            textResponse.setText(R.string.label_empty_age);
        } else {
            Integer dogAge = Integer.parseInt(text) * 15;
            textResponse.setText(
                    getString(R.string.label_dog_age_start) +
                    dogAge.toString() +
                    getString(R.string.label_dog_age_end)
            );
        }
    }

    private void init() {
        this.editAge = findViewById(R.id.editAge);
        this.textResponse = findViewById(R.id.textResponse);
    }

}
