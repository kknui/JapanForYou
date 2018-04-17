package com.example.windowsuser.japanforyou;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.windowsuser.japanforyou.Fragment.AboutFragment;
import com.example.windowsuser.japanforyou.Fragment.CultureFragment;
import com.example.windowsuser.japanforyou.Fragment.HomeFragment;
import com.example.windowsuser.japanforyou.Fragment.LanguageFragment;


public class MainActivity extends AppCompatActivity  {



    public BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    HomeFragment Home = new HomeFragment();
                    FragmentManager mang3 = getSupportFragmentManager();
                    mang3.beginTransaction().replace(R.id.content,Home).commit();
                    return true;
                case R.id.navigation_Language:
                    LanguageFragment Language = new LanguageFragment();
                    FragmentManager mang = getSupportFragmentManager();
                    mang.beginTransaction().replace(R.id.content,Language).commit();
                    return true;
                case R.id.navigation_Culture:
                    CultureFragment Culture = new CultureFragment();
                    FragmentManager mang1 = getSupportFragmentManager();
                    mang1.beginTransaction().replace(R.id.content,Culture).commit();
                    return true;
                case R.id.navigation_about:
                    AboutFragment about = new AboutFragment();
                    FragmentManager mang2 = getSupportFragmentManager();
                    mang2.beginTransaction().replace(R.id.content,about).commit();
                    return true;
            }
            return true;
        }

    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.app_name);
        setSupportActionBar(toolbar);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        HomeFragment myf = new HomeFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.content, myf);
        transaction.commit();

    }

}
