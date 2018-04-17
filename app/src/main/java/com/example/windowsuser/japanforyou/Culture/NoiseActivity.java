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

public class NoiseActivity extends AppCompatActivity {

    private DatabaseReference mRootRef;
    private DatabaseReference Noise;
    private DatabaseReference Noise2;
    TextView N1;
    TextView N2;
    ImageView iN1;
    Toolbar tool6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noise);
        mRootRef = FirebaseDatabase.getInstance().getReference();
        Noise2 = FirebaseDatabase.getInstance().getReference();
        N1 = (TextView)findViewById(R.id.N1);
        N2 = (TextView)findViewById(R.id.N2);
        iN1 = (ImageView)findViewById(R.id.iN1);
        tool6 = (Toolbar) findViewById(R.id.tool6);
        tool6.setTitle("การส่งเสียง");
        tool6.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);

        setSupportActionBar(tool6);
        tool6.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        ConnectivityManager connectivity = (ConnectivityManager)getSystemService(CONNECTIVITY_SERVICE);
        NetworkInfo info = connectivity.getActiveNetworkInfo();
        final WifiManager wifiManager = (WifiManager)getSystemService(WIFI_SERVICE);
        if (info != null && info.isConnected()){
            final ProgressDialog dialog = new ProgressDialog(NoiseActivity.this);
            dialog.setTitle("กรุณารอสักครู่");
            dialog.setMessage("กรุณารอสักครู่");
            dialog.setIndeterminate(true);
            dialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            dialog.show();
            Noise = mRootRef.child("Culture").child("Noise").child("content");
            Noise.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    N1.setText(dataSnapshot.getValue(String.class));
                    Glide.with(NoiseActivity.this)
                            .load("https://firebasestorage.googleapis.com/v0/b/fir-dd17c.appspot.com/o/iN1.jpg?alt=media&token=a2ed068f-a5e1-4c3c-913d-1b5656b60775")
                            .into(iN1);
                    dialog.dismiss();
                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });
            Noise2 = mRootRef.child("Culture").child("Noise").child("content2");
            Noise2.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    N2.setText(dataSnapshot.getValue(String.class));
//                Glide.with(NoiseActivity.this)
//                        .load("https://firebasestorage.googleapis.com/v0/b/fir-dd17c.appspot.com/o/thumb-1920-740281.png?alt=media&token=044fdcf7-d4ca-4232-8682-b0c793f42c64")
//                        .into(iN1);
                    dialog.dismiss();
                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });
        }else {
            new AlertDialog.Builder(NoiseActivity.this)
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
