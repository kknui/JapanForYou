package com.example.windowsuser.japanforyou.Culture;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.example.windowsuser.japanforyou.Content_Topic.Topic_0.Menu_1Activity;
import com.example.windowsuser.japanforyou.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class ConfressionActivity extends AppCompatActivity {

    private DatabaseReference mRootRef;
    private DatabaseReference Confression;
    private DatabaseReference Confression2;
    private DatabaseReference Confression3;
    private DatabaseReference Confression4;
    TextView Con1;
    TextView Con2;
    TextView Con3;
    TextView Con4;
    ImageView iCon1;
    ImageView iCon2;
    ImageView iCon3;
    Toolbar tool7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confression);

        mRootRef = FirebaseDatabase.getInstance().getReference();
        Con1 = (TextView)findViewById(R.id.Con1);
        Con2 = (TextView)findViewById(R.id.Con2);
        Con3 = (TextView)findViewById(R.id.Con3);
        Con4 = (TextView)findViewById(R.id.Con4);
        iCon1 = (ImageView)findViewById(R.id.iCon1);
        iCon2 = (ImageView)findViewById(R.id.iCon2);
        iCon3 = (ImageView)findViewById(R.id.iCon3);
        tool7 = (Toolbar) findViewById(R.id.tool7);
        tool7.setTitle("ด้านความเชื่อ");
        tool7.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);

        setSupportActionBar(tool7);
        tool7.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        ConnectivityManager connectivity = (ConnectivityManager)getSystemService(CONNECTIVITY_SERVICE);
        NetworkInfo info = connectivity.getActiveNetworkInfo();
        final WifiManager wifiManager = (WifiManager)getSystemService(WIFI_SERVICE);
        if (info != null && info.isConnected()){
            final ProgressDialog dialog = new ProgressDialog(ConfressionActivity.this);
            dialog.setTitle("กรุณารอสักครู่");
            dialog.setMessage("กรุณารอสักครู่");
            dialog.setIndeterminate(true);
            dialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            dialog.show();
            Confression = mRootRef.child("Culture").child("Confession").child("content");
            Confression.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Con1.setText(dataSnapshot.getValue(String.class));
                    Glide.with(ConfressionActivity.this)
                            .load("https://firebasestorage.googleapis.com/v0/b/fir-dd17c.appspot.com/o/iCon1.jpg?alt=media&token=cd254987-9b9c-49e5-bfc1-7fafcf5cb1e6")
                            .into(iCon1);
                    dialog.dismiss();
                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });
            Confression2 = mRootRef.child("Culture").child("Confession").child("content2");
            Confression2.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Con2.setText(dataSnapshot.getValue(String.class));
                    Glide.with(ConfressionActivity.this)
                            .load("https://firebasestorage.googleapis.com/v0/b/fir-dd17c.appspot.com/o/iCon2.jpg?alt=media&token=f4f1580d-42e2-4aa7-b1ee-10b033046b4e")
                            .into(iCon2);
                    dialog.dismiss();
                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });
            Confression3 = mRootRef.child("Culture").child("Confession").child("content3");
            Confression3.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Con3.setText(dataSnapshot.getValue(String.class));
                    Glide.with(ConfressionActivity.this)
                            .load("https://firebasestorage.googleapis.com/v0/b/fir-dd17c.appspot.com/o/iCo3.jpg?alt=media&token=aac61012-9930-4b28-ad77-c879e7bb6959")
                            .into(iCon3);
                    dialog.dismiss();
                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });
            Confression4 = mRootRef.child("Culture").child("Confession").child("content4");
            Confression4.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Con4.setText(dataSnapshot.getValue(String.class));
//                Glide.with(CurvatureActivity.this)
//                        .load("https://firebasestorage.googleapis.com/v0/b/fir-dd17c.appspot.com/o/thumb-1920-740281.png?alt=media&token=044fdcf7-d4ca-4232-8682-b0c793f42c64")
//                        .into(" ");
                    dialog.dismiss();
                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });
        }else {
            new AlertDialog.Builder(ConfressionActivity.this)
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

