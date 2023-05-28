package com.gmail.sungkyulfriends;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class matching_list extends AppCompatActivity {

    private ImageButton main_button;
    private ImageButton alarm_page_button;
    private ImageButton mypage_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matching_list);

        ImageView back_arrow = findViewById(R.id.back_arrow);
        back_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(matching_list.this, main_page.class);
                startActivity(intent);
            }
        });

        main_button = findViewById(R.id.main_button);
        main_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(matching_list.this, main_page.class);
                startActivity(intent);
            }
        });

        alarm_page_button = findViewById(R.id.alarm_page_button);
        alarm_page_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(matching_list.this, matching_alarm_list.class);
                startActivity(intent);
            }
        });

        mypage_button = findViewById(R.id.mypage_button);
        mypage_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(matching_list.this, mypage.class);
                startActivity(intent);
            }
        });

        TextView class_matching_1 = findViewById(R.id.class_matching_1);
        class_matching_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(matching_list.this, matching_list_same_class.class);
                startActivity(intent);
            }
        });

    }
}