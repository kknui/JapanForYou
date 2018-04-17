package com.example.windowsuser.japanforyou.Fragment.Tab_language;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;


import com.example.windowsuser.japanforyou.Custom.Listview_Culture;
import com.example.windowsuser.japanforyou.Custom.Listview_Language_Goup;
import com.example.windowsuser.japanforyou.Custom.Listview_Language_Topic;
import com.example.windowsuser.japanforyou.R;
import com.example.windowsuser.japanforyou.TalkActivity;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Tab2Fragment extends Fragment {


    public Tab2Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tab2, container, false);
        ListView lv = (ListView)rootView.findViewById(R.id.listvime2);
        lv.setAdapter(new Listview_Language_Goup(getActivity()));
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0){
                    Intent intent = new Intent(getActivity(), Other1_Tab2_Activity.class);
                    startActivity(intent);
                }else if (i == 1){
                    Intent intent = new Intent(getActivity(), Other2_Tab2_Activity.class);
                    startActivity(intent);
                }else if (i == 2){
                    Intent intent = new Intent(getActivity(), Other3_Tab2_Activity.class);
                    startActivity(intent);
                }else if (i == 3){
                    Intent intent = new Intent(getActivity(), Other4_Tab2_Activity.class);
                    startActivity(intent);
                }else if (i == 4){
                    Intent intent = new Intent(getActivity(), Other5_Tab2_Activity.class);
                    startActivity(intent);
                }else if (i == 5){
                    Intent intent = new Intent(getActivity(), Other5_Tab2_Activity.class);
                    startActivity(intent);
                }
            }
        });

        return rootView;
    }

}
