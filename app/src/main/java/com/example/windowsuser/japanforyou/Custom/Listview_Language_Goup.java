package com.example.windowsuser.japanforyou.Custom;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.windowsuser.japanforyou.R;

import java.util.ArrayList;

/**
 * Created by Windows User on 5/6/2560.
 */

public class Listview_Language_Goup extends BaseAdapter {

    private LayoutInflater mInflater;
    ArrayList<String> name;
    ArrayList<Integer> img;


    public Listview_Language_Goup(Context photosFragment){
        mInflater = LayoutInflater.from(photosFragment);
    }

    @Override
    public int getCount() {
        name = new ArrayList<>();
        name.add("โรงเรียน และ มหาวิทยาลัย");
        name.add("สถานที่พัก");
        name.add("การซื้อของและร้านอาหาร");
        name.add("การท่องเที่ยวและการออกไปข้างนอก");
        name.add("รับมือกับปัญหา");
        name.add("โอกาสต่าง ๆ");
        img = new ArrayList<>();
        img.add(R.drawable.x1);
        img.add(R.drawable.x2);
        img.add(R.drawable.x3);
        img.add(R.drawable.x5);
        img.add(R.drawable.x6);
        img.add(R.drawable.x7);
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
