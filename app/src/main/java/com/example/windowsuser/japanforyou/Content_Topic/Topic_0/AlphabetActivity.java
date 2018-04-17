package com.example.windowsuser.japanforyou.Content_Topic.Topic_0;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.windowsuser.japanforyou.HiraganaActivity;
import com.example.windowsuser.japanforyou.KatakanaActivity;
import com.example.windowsuser.japanforyou.R;

public class AlphabetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet);


        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar3);
        toolbar.setTitle("ตัวอักษรในภาษาญี่ปุ่น");
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        CardView cardView = (CardView)findViewById(R.id.cardView2);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),HiraganaActivity.class);
                startActivity(intent);
            }
        });
        CardView cardView2 = (CardView)findViewById(R.id.cardView5);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getApplicationContext(),KatakanaActivity.class);
                startActivity(intent2);
            }
        });
        CardView cardView3 = (CardView)findViewById(R.id.cardView);
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(getApplicationContext(),RecommendHKActivity.class);
                startActivity(intent3);
            }
        });
    }
}
