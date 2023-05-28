package com.gmail.sungkyulfriends;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class checking_school_certification extends AppCompatActivity {

    private Button go_main_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checking_school_certification);

        go_main_button = findViewById(R.id.go_main_button);
        go_main_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(checking_school_certification.this, main_page.class);
                startActivity(intent);
            }
        });

    }
}