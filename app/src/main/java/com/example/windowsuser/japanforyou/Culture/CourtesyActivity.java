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

public class CourtesyActivity extends AppCompatActivity {
    private DatabaseReference mRootRef;
    private DatabaseReference Courtesy;
    private DatabaseReference Courtesy2;
    private DatabaseReference Courtesy3;
    private DatabaseReference Courtesy4;
    TextView Co1;
    TextView Co2;
    TextView Co3;
    TextView Co4;
    ImageView iCo1;
    ImageView iCo2;
    ImageView iCo3;
    Toolbar tool5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courtesy);

        mRootRef = FirebaseDatabase.getInstance().getReference();
        Co1 = (TextView)findViewById(R.id.Co1);
        Co2 = (TextView)findViewById(R.id.Co2);
        Co3 = (TextView)findViewById(R.id.Co3);
        Co4 = (TextView)findViewById(R.id.Co4);
        iCo1 = (ImageView)findViewById(R.id.iCo1);
        iCo2 = (ImageView)findViewById(R.id.iCo2);
        iCo3 = (ImageView)findViewById(R.id.iCo3);
        tool5 = (Toolbar) findViewById(R.id.tool5);
        tool5.setTitle("มารยาทบนโต๊ะอาหาร");
        tool5.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);

        setSupportActionBar(tool5);
        tool5.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        ConnectivityManager connectivity = (ConnectivityManager)getSystemService(CONNECTIVITY_SERVICE);
        NetworkInfo info = connectivity.getActiveNetworkInfo();
        final WifiManager wifiManager = (WifiManager)getSystemService(WIFI_SERVICE);
        if (info != null && info.isConnected()){
            final ProgressDialog dialog = new ProgressDialog(CourtesyActivity.this);
            dialog.setTitle("กรุณารอสักครู่");
            dialog.setMessage("กรุณารอสักครู่");
            dialog.setIndeterminate(true);
            dialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            dialog.show();
            Courtesy = mRootRef.child("Culture").child("Courtesy").child("content");
            Courtesy.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Co1.setText(dataSnapshot.getValue(String.class));
                    Glide.with(CourtesyActivity.this)
                            .load("https://firebasestorage.googleapis.com/v0/b/fir-dd17c.appspot.com/o/iCo1.jpg?alt=media&token=3bd31952-c895-43d0-beca-0e3df848fc03")
                            .into(iCo1);
                    dialog.dismiss();
                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });
            Courtesy2 = mRootRef.child("Culture").child("Courtesy").child("content2");
            Courtesy2.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Co2.setText(dataSnapshot.getValue(String.class));
                    Glide.with(CourtesyActivity.this)
                            .load("https://firebasestorage.googleapis.com/v0/b/fir-dd17c.appspot.com/o/iCo2.jpg?alt=media&token=7fada078-82de-4e4e-9454-beff697ea90c")
                            .into(iCo2);
                    dialog.dismiss();
                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });
            Courtesy3 = mRootRef.child("Culture").child("Courtesy").child("content3");
            Courtesy3.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Co3.setText(dataSnapshot.getValue(String.class));
                    Glide.with(CourtesyActivity.this)
                            .load("https://firebasestorage.googleapis.com/v0/b/fir-dd17c.appspot.com/o/iCo3.jpg?alt=media&token=aac61012-9930-4b28-ad77-c879e7bb6959")
                            .into(iCo3);
                    dialog.dismiss();
                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });
            Courtesy4 = mRootRef.child("Culture").child("Courtesy").child("content4");
            Courtesy4.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Co4.setText(dataSnapshot.getValue(String.class));
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
            new AlertDialog.Builder(CourtesyActivity.this)
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
