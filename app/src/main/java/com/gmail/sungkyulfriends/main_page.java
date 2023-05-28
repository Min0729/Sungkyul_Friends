package com.gmail.sungkyulfriends;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.utils.widget.ImageFilterButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class main_page extends AppCompatActivity {

    private ImageButton class_matching_button;
    private ImageButton alarm_page_button;
    private ImageButton matching_list_button;
    private ImageButton mypage_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        class_matching_button = findViewById(R.id.class_matching_button);
        class_matching_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(main_page.this, class_main_friend.class);
                startActivity(intent); //엑티비티 이동
            }
        });

        alarm_page_button = findViewById(R.id.alarm_page_button);
        alarm_page_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(main_page.this, matching_alarm_list.class);
                startActivity(intent);
            }
        });

        matching_list_button = findViewById(R.id.matching_list_button);
        matching_list_button.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(main_page.this, matching_list.class);
                startActivity(intent);
            }
        }));

        mypage_button = findViewById(R.id.mypage_button);
        mypage_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(main_page.this, mypage.class);
                startActivity(intent);
            }
        });

    }
}