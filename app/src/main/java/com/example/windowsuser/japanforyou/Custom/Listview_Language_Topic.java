package com.example.windowsuser.japanforyou.Custom;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.example.windowsuser.japanforyou.R;
import java.util.ArrayList;

public class Listview_Language_Topic extends BaseAdapter {

    private LayoutInflater mInflater;
    ArrayList<String> name;
    ArrayList<Integer> img;

    public Listview_Language_Topic(Context photosFragment){
                mInflater = LayoutInflater.from(photosFragment);
    }

    @Override
    public int getCount() {
        name = new ArrayList<>();
        img = new ArrayList<>();
        name.add("บทที่ 0 ปฐมบท");
        img.add(R.drawable.s1);
        name.add("บทที่ 1 ดิฉันคือแอนนาค่ะ");
        img.add(R.drawable.p1);
        name.add("บทที่ 2 นี่คืออะไรคะ");
        img.add(R.drawable.p2);
        name.add("บทที่ 3 ห้องน้ำอยู่ที่ไหนคะ");
        img.add(R.drawable.p3);
        name.add("บทที่ 4 กลับมาแล้ว");
        img.add(R.drawable.p4);
        name.add("บทที่ 5 นั่นคือสมบัติของดิฉันค่ะ");
        img.add(R.drawable.p5);
        name.add("บทที่ 6 หมายเลขโทรศัพท์หมายเลขอะไรคะ");
        img.add(R.drawable.p6);
        name.add("บทที่ 7 มีชูครีมไหมคะ");
        img.add(R.drawable.p7);
        name.add("บทที่ 8 ขออีกครั้งค่ะ");
        img.add(R.drawable.p8);
        name.add("บทที่ 9 ตั้งแต่กี่โมงคะ");
        img.add(R.drawable.p9);
        name.add("บทที่ 10 ทุกคนอยู่ไหมครับ");
        img.add(R.drawable.p10);
        name.add("บทที่ 11 กรุณามาให้ได้นะคะ");
        img.add(R.drawable.p11);
        name.add("บทที่ 12 มาญี่ปุ่นเมื่อไรคะ");
        img.add(R.drawable.p12);
        name.add("บทที่ 13 ชอบนวนิยายครับ");
        img.add(R.drawable.p13);
        name.add("บทที่ 14 ทิ้งขยะที่นี่ได้ไหมคะ");
        img.add(R.drawable.p14);
        name.add("บทที่ 15 กำลังหลับครับ");
        img.add(R.drawable.p15);
        name.add("บทที่ 16 กรุณาขึ้นบันได \nและไปทางขวาครับ");
        img.add(R.drawable.p16);
        name.add("บทที่ 17 สิ่งที่แนะนำคืออะไรคะ");
        img.add(R.drawable.p17);
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
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        convertView = mInflater.inflate(R.layout.layout_clv, null);
        holder = new ViewHolder();
        holder.txt1 = (TextView) convertView.findViewById(R.id.textView);
        holder.img = (ImageView)convertView.findViewById(R.id.imageView);
        convertView.setTag(holder);
        holder.txt1.setText(name.get(position));
        holder.img.setImageResource(img.get(position));
        return convertView;
    }

    static class ViewHolder{
        TextView txt1;
        ImageView img;
    }
}
