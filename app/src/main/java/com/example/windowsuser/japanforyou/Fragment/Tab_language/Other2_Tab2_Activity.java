package com.example.windowsuser.japanforyou.Fragment.Tab_language;

import android.content.Intent;
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

import com.example.windowsuser.japanforyou.Content_Topic.Topic_0.Menu_1Activity;
import com.example.windowsuser.japanforyou.R;

import java.util.ArrayList;

public class Other2_Tab2_Activity extends AppCompatActivity {

    ArrayList<String> name;
    ArrayList<Integer> img;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other2__tab2_);


        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar10);
        toolbar.setTitle("สถานที่พัก");
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        listView = (ListView)findViewById(R.id.listP2);
        listView.setAdapter(new EfficientAdapter());
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0){
                    Intent intent = new Intent(getApplicationContext(), Menu_1Activity.class);
                    intent.putExtra("id", 4);
                    startActivity(intent);
                }else if (i == 1){
                    Intent intent = new Intent(getApplicationContext(), Menu_1Activity.class);
                    intent.putExtra("id", 5);
                    startActivity(intent);
                }else if (i == 2){
                    Intent intent = new Intent(getApplicationContext(), Menu_1Activity.class);
                    intent.putExtra("id", 6);
                    startActivity(intent);
                }else if (i == 3){
                    Intent intent = new Intent(getApplicationContext(), Menu_1Activity.class);
                    intent.putExtra("id", 12);
                    startActivity(intent);
                }else if (i == 4){
                    Intent intent = new Intent(getApplicationContext(), Menu_1Activity.class);
                    intent.putExtra("id", 13);
                    startActivity(intent);
                }
            }
        });

    }
    public class EfficientAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            name = new ArrayList<>();
            img = new ArrayList<>();
            name.add("บทที่ 4 กลับมาแล้ว");
            img.add(R.drawable.p4);
            name.add("บทที่ 5 นั่นคือสมบัติของดิฉันค่ะ");
            img.add(R.drawable.p5);
            name.add("บทที่ 6 หมายเลขโทรศัพท์หมายเลขอะไรคะ");
            img.add(R.drawable.p6);
            name.add("บทที่ 12 มาญี่ปุ่นเมื่อไรคะ");
            img.add(R.drawable.p12);
            name.add("บทที่ 13 ชอบนวนิยายครับ");
            img.add(R.drawable.p13);
            return name.size();
        }
        @Override
        public Object getItem(int position) {
            return null;
        }
        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int i, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.layout_clv, null);
            TextView textView = (TextView) convertView.findViewById(R.id.textView);
            ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView);
            textView.setText(name.get(i));
            imageView.setImageResource(img.get(i));
            return convertView;
        }
    }

}
