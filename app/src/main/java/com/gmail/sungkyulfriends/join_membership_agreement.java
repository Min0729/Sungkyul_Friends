package com.gmail.sungkyulfriends;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class join_membership_agreement extends AppCompatActivity {

    private Button next_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_membership_agreement);

        //TextView 객체 참조
        TextView textView = findViewById(R.id.agreement_textView_1);

        //TextView 텍스트 설정
        //textView.setText(R.string.long_text);

        //TextView의 스크롤바가 항상 표시되도록 설정
        textView.setScrollbarFadingEnabled(false);

        //TextView의 스크롤 위치를 맨 위로 설정
        textView.scrollTo(0,0);



        //TextView 객체 참조
        TextView textView2 = findViewById(R.id.agreement_textView_2);

        //TextView 텍스트 설정
        //textView2.setText(R.string.long_text);

        //TextView의 스크롤바가 항상 표시되도록 설정
        textView2.setScrollbarFadingEnabled(false);

        //TextView의 스크롤 위치를 맨 위로 설정
        textView2.scrollTo(0,0);

        ImageView back_arrow = findViewById(R.id.back_arrow);
        back_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(join_membership_agreement.this, login_page.class);
                startActivity(intent);
            }
        });

        next_button = findViewById(R.id.next_button);
        next_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(join_membership_agreement.this, join_personal_information.class);
                startActivity(intent);
            }
        });
    }
}