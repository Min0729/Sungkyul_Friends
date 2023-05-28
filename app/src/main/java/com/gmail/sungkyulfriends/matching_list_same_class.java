package com.gmail.sungkyulfriends;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class matching_list_same_class extends AppCompatActivity {

    private ImageButton main_button;
    private ImageButton alarm_page_button;
    private ImageButton matching_list_button;
    private ImageButton mypage_button;;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matching_list_same_class);

        ImageView back_arrow = findViewById(R.id.back_arrow);
        back_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(matching_list_same_class.this, matching_list.class);
                startActivity(intent);
            }
        });

        main_button = findViewById(R.id.main_button);
        main_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(matching_list_same_class.this, main_page.class);
                startActivity(intent);
            }
        });

        alarm_page_button = findViewById(R.id.alarm_page_button);
        alarm_page_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(matching_list_same_class.this, matching_alarm_list.class);
                startActivity(intent);
            }
        });

        matching_list_button = findViewById(R.id.matching_list_button);
        matching_list_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(matching_list_same_class.this, matching_list.class);
                startActivity(intent);
            }
        });

        mypage_button = findViewById(R.id.mypage_button);
        mypage_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(matching_list_same_class.this, mypage.class);
                startActivity(intent);
            }
        });

        ImageView chat_button = findViewById(R.id.chat_button);
        chat_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(matching_list_same_class.this, chat_room.class);
                startActivity(intent);
            }
        });

        ImageView profile = findViewById(R.id.profile);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(matching_list_same_class.this, other_person_profile.class);
                startActivity(intent);
            }
        });

    }
}