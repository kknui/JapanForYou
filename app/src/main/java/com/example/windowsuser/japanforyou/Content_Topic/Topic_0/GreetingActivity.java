package com.example.windowsuser.japanforyou.Content_Topic.Topic_0;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.windowsuser.japanforyou.R;

import java.util.ArrayList;

public class GreetingActivity extends AppCompatActivity {
    ArrayList<String> TextJ;
    ArrayList<String> TextS;
    ArrayList<String> TextT;
    ArrayList<Integer> Img;
    MediaPlayer mPlayer;
    int mRa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);
        TextJ = new ArrayList<>();
        TextJ.add("おはよう ございます");
        TextJ.add("こんにちわ");
        TextJ.add("こんばんは");
        TextJ.add("ありがとう ございます");
        TextJ.add("どういたしまして");
        TextJ.add("すみません");
        TextJ.add("ごめんなさい");
        TextJ.add("はじめまして");
        TextJ.add("じゃ、またね ");
        TextS = new ArrayList<>();
        TextS.add("Ohayou gozaimasu");
        TextS.add("Konnichiwa");
        TextS.add("Konbanwa");
        TextS.add("Arigatou gozaimasu");
        TextS.add("Douitashimashite");
        TextS.add("Sumimasen");
        TextS.add("Gomennasai");
        TextS.add("Hajimemashite");
        TextS.add("Ja, Matane");
        TextT = new ArrayList<>();
        TextT.add("สวัสดีตอนเช้า");
        TextT.add("สวัสดีตอนบ่าย");
        TextT.add("สวัสดีตอนกลางคืน");
        TextT.add("ขอบคุณมาก");
        TextT.add("ไม่เป็นไร");
        TextT.add("ขอโทษ (รบกวน)");
        TextT.add("ขอโทษ");
        TextT.add("ยินดีที่ได้รู้จัก");
        TextT.add("บาย เจอกันใหม่");
        Img = new ArrayList<>();
        Img.add(R.drawable.w1);
        Img.add(R.drawable.w2);
        Img.add(R.drawable.w3);
        Img.add(R.drawable.w5);
        Img.add(R.drawable.w6);
        Img.add(R.drawable.w7);
        Img.add(R.drawable.w8);
        Img.add(R.drawable.w9);
        Img.add(R.drawable.w10);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar5);
        toolbar.setTitle("การทักท้ายในชีวิตประจำวัน");
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        ListView lv = (ListView)findViewById(R.id.LVG);
        lv.setAdapter(new Custom());
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0){
                    mRa = R.raw.ohayo;
                }else if (i == 1){
                    mRa = R.raw.konnichiwa;
                }else if (i == 2){
                    mRa = R.raw.konbanwa;
                }else if (i == 3){
                    mRa = R.raw.oyasuminasai;
                }else if (i == 4){
                    mRa = R.raw.arigatou;
                }else if (i == 5){
                    mRa = R.raw.douitashimashite;
                }else if (i == 6){
                    mRa = R.raw.sumimasen;
                }else if (i == 7){
                    mRa = R.raw.gomennasai;
                }else if (i == 8){
                    mRa = R.raw.hajimemashite;
                }else if (i == 9){
                    mRa = R.raw.matane;
                }
                playSound(mRa);
            }

            private void playSound(int mRa) {
                if (mPlayer != null){
                    mPlayer.stop();
                    mPlayer.release();
                }
                mPlayer = MediaPlayer.create(GreetingActivity.this,mRa);
                mPlayer.start();
            }
        });
    }
    public class Custom extends BaseAdapter{

        @Override
        public int getCount() {
            return TextJ.size();
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (i == 0){
                view = getLayoutInflater().inflate(R.layout.custom_greeting1, null);
            }else if (i == 3){
                view = getLayoutInflater().inflate(R.layout.custom_greeting2, null);
            }else {
                view = getLayoutInflater().inflate(R.layout.custom_greeting, null);
                TextView textViewJ = (TextView) view.findViewById(R.id.textView4);
                textViewJ.setText(TextJ.get(i));
                TextView textViewS = (TextView) view.findViewById(R.id.font_Thai18);
                textViewS.setText(TextS.get(i));
                TextView textViewT = (TextView) view.findViewById(R.id.font_Thai19);
                textViewT.setText(TextT.get(i));
                ImageView img = (ImageView) view.findViewById(R.id.imageView5);
                img.setImageResource(Img.get(i));
            }
            return view;
        }
    }
    @Override
    protected void onPause() {
        super.onPause();
        if (mPlayer != null) {
            mPlayer.stop();
            mPlayer.release();
        }
    }
}
