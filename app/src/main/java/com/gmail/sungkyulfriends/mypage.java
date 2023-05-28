package com.gmail.sungkyulfriends;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class mypage extends AppCompatActivity {

    private Button more_review_button;
    private Button retouch_profile_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypage);

        ImageView back_arrow = findViewById(R.id.back_arrow);
        back_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mypage.this, main_page.class);
                startActivity(intent);
            }
        });

        TextView certification_button = findViewById(R.id.certification_button);
        certification_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mypage.this, school_accreditation_choice.class);
                startActivity(intent);
            }
        });

        more_review_button = findViewById(R.id.more_review_button);
        more_review_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mypage.this, review_page.class);
                startActivity(intent);
            }
        });

        retouch_profile_button = findViewById(R.id.retouch_profile_button);
        retouch_profile_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mypage.this, profile_retouch.class);
                startActivity(intent);
            }
        });
    }
}