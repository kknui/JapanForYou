package com.example.windowsuser.japanforyou.Fragment;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.windowsuser.japanforyou.Fragment.Tab_language.Pager_Tab;
import com.example.windowsuser.japanforyou.Fragment.Tab_language.Tab1Fragment;
import com.example.windowsuser.japanforyou.Fragment.Tab_language.Tab2Fragment;
import com.example.windowsuser.japanforyou.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class LanguageFragment extends Fragment {



    public LanguageFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_language, container, false);
        TabLayout tabLayout = (TabLayout)v.findViewById(R.id.tab_layout);

        ViewPager viewPager = (ViewPager)v.findViewById(R.id.pager);
        Pager_Tab pagerAdapter = new Pager_Tab(getChildFragmentManager());
        viewPager.setAdapter(pagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

        return v;
    }
}
