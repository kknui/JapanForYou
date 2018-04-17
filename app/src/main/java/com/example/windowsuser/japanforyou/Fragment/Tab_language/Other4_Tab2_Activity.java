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

public class Other4_Tab2_Activity extends AppCompatActivity {
    ArrayList<String> name;
    ArrayList<Integer> img;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other4_tab2);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar12);
        toolbar.setTitle("การท่องเที่ยวและการออกไปข้างนอก");
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        listView = (ListView)findViewById(R.id.listP4);
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
                    intent.putExtra("id", 9);
                    startActivity(intent);
                }else if (i == 2){
                    Intent intent = new Intent(getApplicationContext(), Menu_1Activity.class);
                    intent.putExtra("id", 10);
                    startActivity(intent);
                }else if (i == 3){
                    Intent intent = new Intent(getApplicationContext(), Menu_1Activity.class);
                    intent.putExtra("id", 15);
                    startActivity(intent);
                }else if (i == 4){
                    Intent intent = new Intent(getApplicationContext(), Menu_1Activity.class);
                    intent.putExtra("id", 16);
                    startActivity(intent);
                }else if (i == 5){
                    Intent intent = new Intent(getApplicationContext(), Menu_1Activity.class);
                    intent.putExtra("id", 18);
                    startActivity(intent);
                }else if (i == 6){
                    Intent intent = new Intent(getApplicationContext(), Menu_1Activity.class);
                    intent.putExtra("id", 19);
                    startActivity(intent);
                }else if (i == 7){
                    Intent intent = new Intent(getApplicationContext(), Menu_1Activity.class);
                    intent.putExtra("id", 20);
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
            name.add("บทที่ 7 มีชูครีมไหมคะ");
            img.add(R.drawable.p7);
            name.add("บทที่ 9 ตั้งแต่กี่โมงคะ");
            img.add(R.drawable.p9);
            name.add("บทที่ 10 ทุกคนอยู่ไหมครับ");
            img.add(R.drawable.p10);
            name.add("บทที่ 15 กำลังหลับครับ");
            img.add(R.drawable.p15);
            name.add("บทที่ 16 กรุณาขึ้นบันได \nและไปทางขวาครับ");
            img.add(R.drawable.p16);
            name.add("บทที่ 18 หลงทางไปเสียแล้วค่ะ");
            img.add(R.drawable.p18);
            name.add("บทที่ 19 ดี");
            img.add(R.drawable.p19);
            name.add("บทที่ 20 เคยร้องเพลงญี่ปุ่นไหมครับ");
            img.add(R.drawable.p20);
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
