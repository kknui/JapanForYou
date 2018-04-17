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

public class Other3_Tab2_Activity extends AppCompatActivity {

    ArrayList<String> name;
    ArrayList<Integer> img;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other3__tab2_);


        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar11);
        toolbar.setTitle("การซื้อของและร้านอาหาร");
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        listView = (ListView)findViewById(R.id.listP3);
        listView.setAdapter(new EfficientAdapter());
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0){
                    Intent intent = new Intent(getApplicationContext(), Menu_1Activity.class);
                    intent.putExtra("id", 2);
                    startActivity(intent);
                }else if (i == 1){
                    Intent intent = new Intent(getApplicationContext(), Menu_1Activity.class);
                    intent.putExtra("id", 7);
                    startActivity(intent);
                }else if (i == 2){
                    Intent intent = new Intent(getApplicationContext(), Menu_1Activity.class);
                    intent.putExtra("id", 16);
                    startActivity(intent);
                }else if (i == 3){
                    Intent intent = new Intent(getApplicationContext(), Menu_1Activity.class);
                    intent.putExtra("id", 17);
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
            name.add("บทที่ 2 นี่คืออะไรคะ");
            img.add(R.drawable.p2);
            name.add("บทที่ 7 มีชูครีมไหมคะ");
            img.add(R.drawable.p7);
            name.add("บทที่ 16 กรุณาขึ้นบันได \nและไปทางขวาครับ");
            img.add(R.drawable.p6);
            name.add("บทที่ 17 สิ่งที่แนะนำคืออะไรคะ");
            img.add(R.drawable.p12);
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
