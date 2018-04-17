package com.example.windowsuser.japanforyou.Content_Topic.Topic_0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.windowsuser.japanforyou.R;

public class RecommendHKActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommend_hk);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar4);
        toolbar.setTitle("เเนะนำฮิรางานะเเละคะตะกะนะ");
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}
