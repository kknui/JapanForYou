package com.example.windowsuser.japanforyou.Fragment;


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
import com.example.windowsuser.japanforyou.Culture.ConfressionActivity;
import com.example.windowsuser.japanforyou.Culture.CourtesyActivity;
import com.example.windowsuser.japanforyou.Culture.CurvatureActivity;
import com.example.windowsuser.japanforyou.Culture.FoodActivity;
import com.example.windowsuser.japanforyou.Culture.JapanLanguageActivity;
import com.example.windowsuser.japanforyou.Culture.LanguageActivity;
import com.example.windowsuser.japanforyou.Culture.MusicActivity;
import com.example.windowsuser.japanforyou.Culture.NoiseActivity;
import com.example.windowsuser.japanforyou.Culture.NoodleActivity;
import com.example.windowsuser.japanforyou.Culture.RelegionActivity;
import com.example.windowsuser.japanforyou.Culture.ShoesActivity;
import com.example.windowsuser.japanforyou.Culture.SportActivity;
import com.example.windowsuser.japanforyou.Custom.Listview_Culture;
import com.example.windowsuser.japanforyou.R;


import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class CultureFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_culture, container, false);

        ListView lv = (ListView)rootView.findViewById(R.id.listvime3);
        lv.setAdapter(new Listview_Culture(getActivity()));
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0){
                    Intent intent = new Intent(getActivity(), MusicActivity.class);
                    startActivity(intent);
                }else if (i == 1){
                    Intent intent = new Intent(getActivity(), LanguageActivity.class);
                    startActivity(intent);
                }else if (i == 2){
                    Intent intent = new Intent(getActivity(), CurvatureActivity.class);
                    startActivity(intent);
                }else if (i == 3){
                    Intent intent = new Intent(getActivity(), ShoesActivity.class);
                    startActivity(intent);
                }else if (i == 4){
                    Intent intent = new Intent(getActivity(), CourtesyActivity.class);
                    startActivity(intent);
                }else if (i == 5){
                    Intent intent = new Intent(getActivity(), NoiseActivity.class);
                    startActivity(intent);
                }else if (i == 6){
                    Intent intent = new Intent(getActivity(), ConfressionActivity.class);
                    startActivity(intent);
                }else if (i == 7){
                    Intent intent = new Intent(getActivity(), RelegionActivity.class);
                    startActivity(intent);
                }else if (i == 8){
                    Intent intent = new Intent(getActivity(), JapanLanguageActivity.class);
                    startActivity(intent);
                }else if (i == 9){
                    Intent intent = new Intent(getActivity(), NoodleActivity.class);
                    startActivity(intent);
                }else if (i == 10){
                    Intent intent = new Intent(getActivity(), SportActivity.class);
                    startActivity(intent);
                }else if (i == 11){
                    Intent intent = new Intent(getActivity(), FoodActivity.class);
                    startActivity(intent);
                }
            }
        });
        return rootView;
    }
}
