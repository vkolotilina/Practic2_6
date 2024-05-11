package com.mirea.kt.practice_2_6;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CalculActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcul);
        EditText editTextDelimoe = findViewById(R.id.delimoe);
        EditText editTextDelitel = findViewById(R.id.delitel);
        Button btnCalc = findViewById(R.id.btnStart);
        btnCalc.setOnClickListener(v -> {
            String DelimoeStr = editTextDelimoe.getText().toString();
            String DelitelStr = editTextDelitel.getText().toString();
            if (!DelimoeStr.isEmpty() && !DelitelStr.isEmpty()) {
                int result = Integer.parseInt(DelimoeStr) / Integer.parseInt(DelitelStr);
                Intent intent = new Intent();
                intent.putExtra("data", result);
                setResult(RESULT_OK, intent);
                finish();
            } else {
                Toast.makeText(getApplicationContext(), "Invalid terms", Toast.LENGTH_LONG).show();
            }
        });
    }

}
