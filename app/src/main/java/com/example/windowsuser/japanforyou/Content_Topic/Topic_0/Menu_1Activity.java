package com.example.windowsuser.japanforyou.Content_Topic.Topic_0;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.example.windowsuser.japanforyou.R;
import com.example.windowsuser.japanforyou.TalkActivity;
import com.example.windowsuser.japanforyou.VocabularyActivity;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Menu_1Activity extends AppCompatActivity {
    Button button1;
    Button button2;
    Button button3;
    ImageView imageView;
    Typeface typeface;

    int id;
    ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_1);
        //------------------------------------------------------------------------------
        typeface = Typeface.createFromAsset(getAssets(), "thaisanslite.ttf");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar7);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        Intent intent = getIntent();
        id = intent.getIntExtra("id", 0);

        // -----------------------------------------------------------------------------
        button1 = (Button) findViewById(R.id.button7);
        button1.setTypeface(typeface);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), TalkActivity.class);
                intent.putExtra("id",id);
                startActivity(intent);
            }
        });
        //------------------------------------------------------------------------------
        button2 = (Button) findViewById(R.id.button8);
        button2.setTypeface(typeface);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), VocabularyActivity.class);
                intent.putExtra("id",id);
                startActivity(intent);
            }
        });
        //------------------------------------------------------------------------------
        button3 = (Button) findViewById(R.id.button9);
        button3.setTypeface(typeface);
        //------------------------------------------------------------------------------
        imageView = (ImageView) findViewById(R.id.imageView7);
        progressBar = (ProgressBar) findViewById(R.id.progressBar2);
        //------------------------------------------------------------------------------
        if (id == 1) {
            toolbar.setTitle("บทที่ 1 ดิฉันคือแอนนาค่ะ");
            String url = "https://firebasestorage.googleapis.com/v0/b/fir-dd17c.appspot.com/o/bg%2Flesson_1.jpg?alt=media&token=89faf1b6-2c7d-477f-b985-887c988700b3";
            Img(url);
        } else if (id == 2) {
            toolbar.setTitle("บทที่ 2 นี่คืออะไรคะ");
            String url = "https://firebasestorage.googleapis.com/v0/b/fir-dd17c.appspot.com/o/bg%2Flesson_2.jpg?alt=media&token=e0c3fb1d-22e6-4d12-ad1c-5844d041cac3";
            Img(url);
        } else if (id == 3) {
            toolbar.setTitle("บทที่ 3 ห้องน้ำอยู่ที่ไหนคะ");
            String url = "https://firebasestorage.googleapis.com/v0/b/fir-dd17c.appspot.com/o/bg%2Flesson_3.jpg?alt=media&token=5e9cd75e-1865-4995-92e8-53b7653df691";
            Img(url);
        } else if (id == 4) {
            toolbar.setTitle("บทที่ 4 กลับมาแล้ว");
            String url = "https://firebasestorage.googleapis.com/v0/b/fir-dd17c.appspot.com/o/bg%2Flesson_4.jpg?alt=media&token=8c05fb9c-dd2b-4543-a5c6-b0e8687a6181";
            Img(url);
        } else if (id == 5) {
            toolbar.setTitle("บทที่ 5 นั่นคือสมบัติของดิฉันค่ะ");
            String url = "https://firebasestorage.googleapis.com/v0/b/fir-dd17c.appspot.com/o/bg%2Flesson_5.jpg?alt=media&token=23c8df16-0503-4758-87ba-f273f4207fc7";
            Img(url);
        } else if (id == 6) {
            toolbar.setTitle("บทที่ 6 หมายเลขโทรศัพท์หมายเลขอะไรคะ");
            String url = "https://firebasestorage.googleapis.com/v0/b/fir-dd17c.appspot.com/o/bg%2Flesson_6.jpg?alt=media&token=1fee8c33-1841-4221-80c1-1947cf235b7e";
            Img(url);
        } else if (id == 7) {
            toolbar.setTitle("บทที่ 7 มีชูครีมไหมคะ");
            String url = "https://firebasestorage.googleapis.com/v0/b/fir-dd17c.appspot.com/o/bg%2Flesson_7.jpg?alt=media&token=b7804667-cd4e-4862-a7be-dff51f5a735b";
            Img(url);
        } else if (id == 8) {
            toolbar.setTitle("บทที่ 8 ขออีกครั้งค่ะ");
            String url = "https://firebasestorage.googleapis.com/v0/b/fir-dd17c.appspot.com/o/bg%2Flesson_8.jpg?alt=media&token=c88179ec-0b68-4ad8-80ba-d6fd6a34d711";
            Img(url);
        } else if (id == 9) {
            toolbar.setTitle("บทที่ 9 ตั้งแต่กี่โมงคะ");
            String url = "https://firebasestorage.googleapis.com/v0/b/fir-dd17c.appspot.com/o/bg%2Flesson_9.jpg?alt=media&token=3a2d7e6e-2f09-4e9c-b4b6-761b8da5b1a6";
            Img(url);
        } else if (id == 10) {
            toolbar.setTitle("บทที่ 10 ทุกคนอยู่ไหมครับ");
            String url = "https://firebasestorage.googleapis.com/v0/b/fir-dd17c.appspot.com/o/bg%2Flesson_10.jpg?alt=media&token=686bac98-3a8d-42a2-af8f-eb59916b7634";
            Img(url);
        } else if (id == 11) {
            toolbar.setTitle("บทที่ 11 กรุณามาให้ได้นะคะ");
            String url = "https://firebasestorage.googleapis.com/v0/b/fir-dd17c.appspot.com/o/bg%2Flesson_11.jpg?alt=media&token=10711bae-7a3f-4238-9501-ad60d5c6b2a5";
            Img(url);
        } else if (id == 12) {
            toolbar.setTitle("บทที่ 12 มาญี่ปุ่นเมื่อไรคะ");
            String url = "https://firebasestorage.googleapis.com/v0/b/fir-dd17c.appspot.com/o/bg%2Flesson_12.jpg?alt=media&token=516bf011-ba11-4d47-9400-37fe611e9fc4";
            Img(url);
        } else if (id == 13) {
            toolbar.setTitle("บทที่ 13 ชอบนวนิยายครับ");
            String url = "https://firebasestorage.googleapis.com/v0/b/fir-dd17c.appspot.com/o/bg%2Flesson_13.jpg?alt=media&token=d37f13d5-1d54-446e-b646-a6763b1720a2";
            Img(url);
        } else if (id == 14) {
            toolbar.setTitle("บทที่ 14 ทิ้งขยะที่นี่ได้ไหมคะ");
            String url = "https://firebasestorage.googleapis.com/v0/b/fir-dd17c.appspot.com/o/bg%2Flesson_14.jpg?alt=media&token=d52bea43-a2f6-4a1e-88db-8d26dd961912";
            Img(url);
        } else if (id == 15) {
            toolbar.setTitle("บทที่ 15 กำลังหลับครับ");
            String url = "https://firebasestorage.googleapis.com/v0/b/fir-dd17c.appspot.com/o/bg%2Flesson_15.jpg?alt=media&token=d7b72b1c-ccda-480c-afee-61f8c2b08896";
            Img(url);
        } else if (id == 16) {
            toolbar.setTitle("บทที่ 16 กรุณาขึ้นบันไดและไปทางขวาครับ");
            String url = "https://firebasestorage.googleapis.com/v0/b/fir-dd17c.appspot.com/o/bg%2Flesson_16.jpg?alt=media&token=cac6724e-378a-44dd-9d3d-195c4d5f5ed4";
            Img(url);
        } else if (id == 17) {
            toolbar.setTitle("บทที่ 17 สิ่งที่แนะนำคืออะไรคะ");
            String url = "https://firebasestorage.googleapis.com/v0/b/fir-dd17c.appspot.com/o/bg%2Flesson_17.jpg?alt=media&token=1dfe4ad9-6d3a-4278-912b-7e6fb0799968";
            Img(url);
        } else if (id == 18) {
            toolbar.setTitle("บทที่ 18 หลงทางไปเสียแล้วค่ะ");
            String url = "https://firebasestorage.googleapis.com/v0/b/fir-dd17c.appspot.com/o/bg%2Flesson_18.jpg?alt=media&token=9fd6184d-cb38-41b5-90f4-a87af99550b8";
            Img(url);
        } else if (id == 19) {
            toolbar.setTitle("บทที่ 19 ดี");
            String url = "https://firebasestorage.googleapis.com/v0/b/fir-dd17c.appspot.com/o/bg%2Flesson_19.jpg?alt=media&token=3f42f00e-7878-455a-ade9-9772e55485c1";
            Img(url);
        } else if (id == 20) {
            toolbar.setTitle("บทที่ 20 เคยร้องเพลงญี่ปุ่นไหมครับ");
            String url = "https://firebasestorage.googleapis.com/v0/b/fir-dd17c.appspot.com/o/bg%2Flesson_20.jpg?alt=media&token=c314b161-52e4-406f-bb86-19d01bf7939d";
            Img(url);
        }

        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }

    public void Img(String url) {
        ConnectivityManager connectivity = (ConnectivityManager)getSystemService(CONNECTIVITY_SERVICE);
        NetworkInfo info = connectivity.getActiveNetworkInfo();
        final WifiManager wifiManager = (WifiManager)getSystemService(WIFI_SERVICE);
        if (info != null && info.isConnected()){
            Glide.with(this)
                    .load(url)
                    .listener(new RequestListener<String, GlideDrawable>() {
                        @Override
                        public boolean onException(Exception e, String model, Target<GlideDrawable> target, boolean isFirstResource) {
                            progressBar.setVisibility(View.GONE);
                            return false;
                        }

                        @Override
                        public boolean onResourceReady(GlideDrawable resource, String model, Target<GlideDrawable> target, boolean isFromMemoryCache, boolean isFirstResource) {
                            progressBar.setVisibility(View.GONE);
                            return false;
                        }
                    })

                    .into(imageView);
        }else {
            new AlertDialog.Builder(Menu_1Activity.this)
                    .setIcon(R.drawable.ic_wifi_black_24dp)
                    .setTitle("เกิดข้อผิดพลาด")
                    .setMessage("ไม่สามารถเชื่อมอินเทอร์ได้\nคุณต้องการเปิดใช้งาน WiFi หรือไม่")
                    .setPositiveButton("ตกลง", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            wifiManager.setWifiEnabled(true);
                            Toast.makeText(getApplicationContext(),"กำลังเปิดใช้งาน Wifi ...",Toast.LENGTH_LONG).show();
                            onBackPressed();
                        }
                    })
                    .setNegativeButton("ยกเลิก", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            onBackPressed();

                        }
                    }).show();

        }

    }
}
