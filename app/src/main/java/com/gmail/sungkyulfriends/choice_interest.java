package com.gmail.sungkyulfriends;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class choice_interest extends AppCompatActivity {

    private Button retouch_interest_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_interest);

        ImageView back_arrow = findViewById(R.id.back_arrow);
        back_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(choice_interest.this, profile_retouch.class);
                startActivity(intent);
            }
        });

        retouch_interest_button = findViewById(R.id.retouch_interest_button);
        retouch_interest_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(choice_interest.this, profile_retouch.class);
                startActivity(intent);
            }
        });

    }
}