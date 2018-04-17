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
import java.util.List;

/**
 * Created by Windows User on 29/5/2560.
 */

public class Listview_Culture extends BaseAdapter{

    private LayoutInflater mInflater;
    ArrayList<String> name;
    ArrayList<Integer> img;


    public Listview_Culture(Context photosFragment){
        mInflater = LayoutInflater.from(photosFragment);
    }

    @Override
    public int getCount() {
        name = new ArrayList<>();
        img = new ArrayList<>();
        name.add("ดนตรี");
        img.add(R.drawable.l1);
        name.add("การใช้ภาษา");
        img.add(R.drawable.l2);
        name.add("การโค้ง");
        img.add(R.drawable.l3);
        name.add("รองเท้า");
        img.add(R.drawable.l4);
        name.add("มารยาทบนโต๊ะอาหาร");
        img.add(R.drawable.l5);
        name.add("การส่งเสียงดัง");
        img.add(R.drawable.l6);
        name.add("ความเชื่อ");
        img.add(R.drawable.l7);
        name.add("ศาสนา");
        img.add(R.drawable.l8);
        name.add("ภาษาญี่ปุ่น");
        img.add(R.drawable.l9);
        name.add("การซดบะหมี่");
        img.add(R.drawable.l10);
        name.add("กีฬา");
        img.add(R.drawable.l11);
        name.add("อาหาร");
        img.add(R.drawable.l12);
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
