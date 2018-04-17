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
import com.example.windowsuser.japanforyou.Content_Topic.Topic_0.Menu_1Activity;
import com.example.windowsuser.japanforyou.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class RelegionActivity extends AppCompatActivity {
    private DatabaseReference mRootRef;
    private DatabaseReference Relegion;
    private DatabaseReference Relegion2;
    private DatabaseReference Relegion3;
    TextView R1;
    TextView R2;
    TextView R3;
    ImageView iR1;
    ImageView iR2;
    ImageView iR3;
    Toolbar tool8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relegion);

        mRootRef = FirebaseDatabase.getInstance().getReference();
        R1 = (TextView)findViewById(R.id.R1);
        R2 = (TextView)findViewById(R.id.R2);
        R3 = (TextView)findViewById(R.id.R3);
        iR1 = (ImageView)findViewById(R.id.iR1);
        iR2 = (ImageView)findViewById(R.id.iR2);
        iR3 = (ImageView)findViewById(R.id.iR3);
        tool8 = (Toolbar) findViewById(R.id.tool8);
        tool8.setTitle("ศาสนา");
        tool8.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);

        setSupportActionBar(tool8);
        tool8.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        ConnectivityManager connectivity = (ConnectivityManager)getSystemService(CONNECTIVITY_SERVICE);
        NetworkInfo info = connectivity.getActiveNetworkInfo();
        final WifiManager wifiManager = (WifiManager)getSystemService(WIFI_SERVICE);
        if (info != null && info.isConnected()){
            final ProgressDialog dialog = new ProgressDialog(RelegionActivity.this);
            dialog.setTitle("กรุณารอสักครู่");
            dialog.setMessage("กรุณารอสักครู่");
            dialog.setIndeterminate(true);
            dialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            dialog.show();
            Relegion = mRootRef.child("Culture").child("Religion").child("content");
            Relegion.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    R1.setText(dataSnapshot.getValue(String.class));
                    Glide.with(RelegionActivity.this)
                            .load("https://firebasestorage.googleapis.com/v0/b/fir-dd17c.appspot.com/o/iR1.jpg?alt=media&token=f9507ed7-af77-4de6-8d28-208cfb71d98c")
                            .into(iR1);
                    dialog.dismiss();
                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });
            Relegion2 = mRootRef.child("Culture").child("Religion").child("content2");
            Relegion2.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    R2.setText(dataSnapshot.getValue(String.class));
                    Glide.with(RelegionActivity.this)
                            .load("https://firebasestorage.googleapis.com/v0/b/fir-dd17c.appspot.com/o/iR2.jpg?alt=media&token=67314476-9e61-4b7e-abe1-cba696cfc291")
                            .into(iR2);
                    dialog.dismiss();
                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });
            Relegion3 = mRootRef.child("Culture").child("Religion").child("content3");
            Relegion3.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    R3.setText(dataSnapshot.getValue(String.class));
                    Glide.with(RelegionActivity.this)
                            .load("https://firebasestorage.googleapis.com/v0/b/fir-dd17c.appspot.com/o/iR3.jpg?alt=media&token=8dbaf01f-8120-47bd-b27c-a079cb99848c")
                            .into(iR3);
                    dialog.dismiss();
                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });
        }else {
            new AlertDialog.Builder(RelegionActivity.this)
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

