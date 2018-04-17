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

public class CurvatureActivity extends AppCompatActivity {

    private DatabaseReference mRootRef;
    private DatabaseReference Curvature;
    private DatabaseReference Curvature2;
    private DatabaseReference Curvature3;
    private DatabaseReference Curvature4;
    TextView Cu1;
    TextView Cu2;
    TextView Cu3;
    TextView Cu4;
    ImageView iCu1;
    ImageView iCu2;
    ImageView iCu3;
    Toolbar tool3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curvature);

        mRootRef = FirebaseDatabase.getInstance().getReference();
        Cu1 = (TextView)findViewById(R.id.Cu1);
        Cu2 = (TextView)findViewById(R.id.Cu2);
        Cu3 = (TextView)findViewById(R.id.Cu3);
        Cu4 = (TextView)findViewById(R.id.Cu4);
        iCu1 = (ImageView)findViewById(R.id.iCu1);
        iCu2 = (ImageView)findViewById(R.id.iCu2);
        iCu3 = (ImageView)findViewById(R.id.iCu3);
        tool3 = (Toolbar) findViewById(R.id.tool3);
        tool3.setTitle("การโค้ง");
        tool3.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);

        setSupportActionBar(tool3);
        tool3.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        ConnectivityManager connectivity = (ConnectivityManager)getSystemService(CONNECTIVITY_SERVICE);
        NetworkInfo info = connectivity.getActiveNetworkInfo();
        final WifiManager wifiManager = (WifiManager)getSystemService(WIFI_SERVICE);
        if (info != null && info.isConnected()){
            final ProgressDialog dialog = new ProgressDialog(CurvatureActivity.this);
            dialog.setTitle("กรุณารอสักครู่");
            dialog.setMessage("กรุณารอสักครู่");
            dialog.setIndeterminate(true);
            dialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            dialog.show();
            Curvature = mRootRef.child("Culture").child("Curvature").child("content");
            Curvature.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Cu1.setText(dataSnapshot.getValue(String.class));
                    Glide.with(CurvatureActivity.this)
                            .load("https://firebasestorage.googleapis.com/v0/b/fir-dd17c.appspot.com/o/iCu1.jpg?alt=media&token=9bdcbe8d-c260-47b5-a2e6-5ae4ba4f062e")
                            .into(iCu1);
                    dialog.dismiss();
                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });
            Curvature2 = mRootRef.child("Culture").child("Curvature").child("content2");
            Curvature2.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Cu2.setText(dataSnapshot.getValue(String.class));
                    Glide.with(CurvatureActivity.this)
                            .load("https://firebasestorage.googleapis.com/v0/b/fir-dd17c.appspot.com/o/iCu2.jpg?alt=media&token=fb7db6ac-6549-4fb8-9e80-6f3a6cf71ec8")
                            .into(iCu2);
                    dialog.dismiss();
                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });
            Curvature3 = mRootRef.child("Culture").child("Curvature").child("content3");
            Curvature3.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Cu3.setText(dataSnapshot.getValue(String.class));
                    Glide.with(CurvatureActivity.this)
                            .load("https://firebasestorage.googleapis.com/v0/b/fir-dd17c.appspot.com/o/iCu3.jpg?alt=media&token=123cdba3-fec8-4a97-8850-f8f1dd656ec9")
                            .into(iCu3);
                    dialog.dismiss();
                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });
            Curvature4 = mRootRef.child("Culture").child("Curvature").child("content4");
            Curvature4.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Cu4.setText(dataSnapshot.getValue(String.class));
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
            new AlertDialog.Builder(CurvatureActivity.this)
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

