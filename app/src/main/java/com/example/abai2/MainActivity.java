package com.example.abai2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    LinearLayout list;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.showToast_button);
        list = findViewById(R.id.linearLayout);

        addEvents();
    }

    private void addEvents() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, resultList(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private String resultList() {
        String str = "Toppings: ";
        for (int i = 0; i < list.getChildCount() - 1; i++) {
            CheckBox checkBox = (CheckBox) list.getChildAt(i);
            if (checkBox.isChecked()) {
                str += checkBox.getText() + " ";
            }
        }
        return str;
    }
}