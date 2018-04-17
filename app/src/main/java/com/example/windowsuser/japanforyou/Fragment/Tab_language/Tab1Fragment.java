package com.example.windowsuser.japanforyou.Fragment.Tab_language;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.windowsuser.japanforyou.Content_Topic.Topic_0.Menu_0Activity;
import com.example.windowsuser.japanforyou.Content_Topic.Topic_0.Menu_1Activity;
import com.example.windowsuser.japanforyou.Custom.Listview_Language_Topic;
import com.example.windowsuser.japanforyou.R;

public class Tab1Fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tab1, container, false);
        ListView lv = (ListView)rootView.findViewById(R.id.listvime1);
        lv.setAdapter(new Listview_Language_Topic(getActivity()));
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Intent intent = new Intent(getActivity(), Menu_0Activity.class);
                    startActivity(intent);
                }else {
                    Intent intent = new Intent(getActivity(), Menu_1Activity.class);
                    intent.putExtra("id",position);
                    startActivity(intent);
                }
            }
        });

        return rootView;
    }
}
