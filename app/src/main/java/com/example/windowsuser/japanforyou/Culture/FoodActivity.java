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

public class FoodActivity extends AppCompatActivity {
    private DatabaseReference mRootRef;
    private DatabaseReference Food;
    private DatabaseReference Food2;
    private DatabaseReference Food3;
    TextView F1;
    TextView F2;
    TextView F3;
    ImageView iF1;
    ImageView iF2;
    Toolbar tool12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        mRootRef = FirebaseDatabase.getInstance().getReference();
        F1 = (TextView)findViewById(R.id.F1);
        F2 = (TextView)findViewById(R.id.F2);
        F3 = (TextView)findViewById(R.id.F3);
        iF1 = (ImageView)findViewById(R.id.iF1);
        iF2 = (ImageView)findViewById(R.id.iF2);
        tool12 = (Toolbar) findViewById(R.id.tool12);
        tool12.setTitle("อาหาร");
        tool12.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);

        setSupportActionBar(tool12);
        tool12.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        ConnectivityManager connectivity = (ConnectivityManager)getSystemService(CONNECTIVITY_SERVICE);
        NetworkInfo info = connectivity.getActiveNetworkInfo();
        final WifiManager wifiManager = (WifiManager)getSystemService(WIFI_SERVICE);
        if (info != null && info.isConnected()){
            final ProgressDialog dialog = new ProgressDialog(FoodActivity.this);
            dialog.setTitle("กรุณารอสักครู่");
            dialog.setMessage("กรุณารอสักครู่");
            dialog.setIndeterminate(true);
            dialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            dialog.show();
            Food = mRootRef.child("Culture").child("Food").child("content");
            Food.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    F1.setText(dataSnapshot.getValue(String.class));
                    Glide.with(FoodActivity.this)
                            .load("https://firebasestorage.googleapis.com/v0/b/fir-dd17c.appspot.com/o/iF1.jpg?alt=media&token=f8b1f1ef-c192-4d16-8bcc-1533be5e621f")
                            .into(iF1);
                    dialog.dismiss();
                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });
            Food2 = mRootRef.child("Culture").child("Food").child("content2");
            Food2.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    F2.setText(dataSnapshot.getValue(String.class));
                    Glide.with(FoodActivity.this)
                            .load("https://firebasestorage.googleapis.com/v0/b/fir-dd17c.appspot.com/o/iF2.jpg?alt=media&token=b41fd9f1-9a75-46d6-a35c-806dbdf2a587")
                            .into(iF2);
                    dialog.dismiss();
                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });
            Food3 = mRootRef.child("Culture").child("Food").child("content3");
            Food3.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    F3.setText(dataSnapshot.getValue(String.class));
                    dialog.dismiss();
                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });
        }else {
            new AlertDialog.Builder(FoodActivity.this)
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

