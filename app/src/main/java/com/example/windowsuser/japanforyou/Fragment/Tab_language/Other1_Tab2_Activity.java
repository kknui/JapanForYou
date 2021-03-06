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

import static android.R.attr.name;

public class Other1_Tab2_Activity extends AppCompatActivity {

    ArrayList<String> name;
    ArrayList<Integer> img;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other1_tab2);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar9);
        toolbar.setTitle("โรงเรียน เเละ มหาวิทยาลัย");
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        listView = (ListView)findViewById(R.id.ListVime);
        listView.setAdapter(new EfficientAdapter());
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0){
                    Intent intent = new Intent(getApplicationContext(), Menu_1Activity.class);
                    intent.putExtra("id", 1);
                    startActivity(intent);
                }else if (i == 1){
                    Intent intent = new Intent(getApplicationContext(), Menu_1Activity.class);
                    intent.putExtra("id", 2);
                    startActivity(intent);
                }else if (i == 2){
                    Intent intent = new Intent(getApplicationContext(), Menu_1Activity.class);
                    intent.putExtra("id", 3);
                    startActivity(intent);
                }else if (i == 3){
                    Intent intent = new Intent(getApplicationContext(), Menu_1Activity.class);
                    intent.putExtra("id", 8);
                    startActivity(intent);
                }else if (i == 4){
                    Intent intent = new Intent(getApplicationContext(), Menu_1Activity.class);
                    intent.putExtra("id", 9);
                    startActivity(intent);
                }else if (i == 5){
                    Intent intent = new Intent(getApplicationContext(), Menu_1Activity.class);
                    intent.putExtra("id", 10);
                    startActivity(intent);
                }else if (i == 5){
                    Intent intent = new Intent(getApplicationContext(), Menu_1Activity.class);
                    intent.putExtra("id", 11);
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
            name.add("บทที่ 1 ดิฉันคือแอนนาค่ะ");
            img.add(R.drawable.p1);
            name.add("บทที่ 2 นี่คืออะไรคะ");
            img.add(R.drawable.p2);
            name.add("บทที่ 3 ห้องน้ำอยู่ที่ไหนคะ");
            img.add(R.drawable.p3);
            name.add("บทที่ 8 ขออีกครั้งค่ะ");
            img.add(R.drawable.p8);
            name.add("บทที่ 9 ตั้งแต่กี่โมงคะ");
            img.add(R.drawable.p9);
            name.add("บทที่ 10 ทุกคนอยู่ไหมครับ");
            img.add(R.drawable.p10);
            name.add("บทที่ 11 กรุณามาให้ได้นะคะ");
            img.add(R.drawable.p11);
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

