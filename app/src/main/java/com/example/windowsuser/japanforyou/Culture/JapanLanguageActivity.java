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

public class JapanLanguageActivity extends AppCompatActivity {
    private DatabaseReference mRootRef;
    private DatabaseReference JapanLanguage;
    private DatabaseReference JapanLanguage2;
    private DatabaseReference JapanLanguage3;
    private DatabaseReference JapanLanguage4;
    TextView JL1;
    TextView JL2;
    TextView JL3;
    TextView JL4;
    ImageView iJL1;
    ImageView iJL2;
    ImageView iJL3;
    Toolbar tool9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_japan_language);

        mRootRef = FirebaseDatabase.getInstance().getReference();
        JL1 = (TextView)findViewById(R.id.JL1);
        JL2 = (TextView)findViewById(R.id.JL2);
        JL3 = (TextView)findViewById(R.id.JL3);
        JL4 = (TextView)findViewById(R.id.JL4);
        iJL1 = (ImageView)findViewById(R.id.iJL1);
        iJL2 = (ImageView)findViewById(R.id.iJL2);
        iJL3 = (ImageView)findViewById(R.id.iJL3);
        tool9 = (Toolbar) findViewById(R.id.tool9);
        tool9.setTitle("ภาษาของญี่ปุ่น");
        tool9.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);

        setSupportActionBar(tool9);
        tool9.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        ConnectivityManager connectivity = (ConnectivityManager)getSystemService(CONNECTIVITY_SERVICE);
        NetworkInfo info = connectivity.getActiveNetworkInfo();
        final WifiManager wifiManager = (WifiManager)getSystemService(WIFI_SERVICE);
        if (info != null && info.isConnected()){
            final ProgressDialog dialog = new ProgressDialog(JapanLanguageActivity.this);
            dialog.setTitle("กรุณารอสักครู่");
            dialog.setMessage("กรุณารอสักครู่");
            dialog.setIndeterminate(true);
            dialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            dialog.show();
            JapanLanguage = mRootRef.child("Culture").child("Japan Language").child("content");
            JapanLanguage.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    JL1.setText(dataSnapshot.getValue(String.class));
                    Glide.with(JapanLanguageActivity.this)
                            .load("https://firebasestorage.googleapis.com/v0/b/fir-dd17c.appspot.com/o/iJL1.jpg?alt=media&token=81033302-ab3e-46bd-b547-ccaff0fa94d4")
                            .into(iJL1);
                    dialog.dismiss();
                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });
            JapanLanguage2 = mRootRef.child("Culture").child("Japan Language").child("content2");
            JapanLanguage2.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    JL2.setText(dataSnapshot.getValue(String.class));
                    Glide.with(JapanLanguageActivity.this)
                            .load("https://firebasestorage.googleapis.com/v0/b/fir-dd17c.appspot.com/o/iJL2.jpg?alt=media&token=beede8a2-34ca-4a9e-912a-24ae3d5ad744")
                            .into(iJL2);
                    dialog.dismiss();
                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });
            JapanLanguage3 = mRootRef.child("Culture").child("Japan Language").child("content3");
            JapanLanguage3.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    JL3.setText(dataSnapshot.getValue(String.class));
                    Glide.with(JapanLanguageActivity.this)
                            .load("https://firebasestorage.googleapis.com/v0/b/fir-dd17c.appspot.com/o/iJL3.jpg?alt=media&token=976c0d02-15f1-44aa-ad89-0e2c5551cee6")
                            .into(iJL3);
                    dialog.dismiss();
                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });
            JapanLanguage4 = mRootRef.child("Culture").child("Japan Language").child("content4");
            JapanLanguage4.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    JL4.setText(dataSnapshot.getValue(String.class));
//                Glide.with(JapanLanguageActivity.this)
//                        .load("https://firebasestorage.googleapis.com/v0/b/fir-dd17c.appspot.com/o/thumb-1920-740281.png?alt=media&token=044fdcf7-d4ca-4232-8682-b0c793f42c64")
//                        .into(iJL1);
                    dialog.dismiss();
                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });
        }else {
            new AlertDialog.Builder(JapanLanguageActivity.this)
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
