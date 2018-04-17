package com.example.windowsuser.japanforyou.Fragment.Tab_language;

        import android.support.v4.app.Fragment;
        import android.support.v4.app.FragmentManager;
        import android.support.v4.app.FragmentStatePagerAdapter;

public class Pager_Tab extends FragmentStatePagerAdapter {

    public Pager_Tab(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
            Tab1Fragment tab1 = new Tab1Fragment();
            return tab1;
            case 1:
                Tab2Fragment tab2 = new Tab2Fragment();
                return tab2;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0: return "หัวข้อ";
            default:return  "กลุ่ม";
        }
    }
}
