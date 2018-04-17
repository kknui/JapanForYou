package com.example.windowsuser.japanforyou;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class KatakanaActivity extends AppCompatActivity {

    ListView gridView;
    MediaPlayer mPlayer;
    int resId = 0;

    ArrayList<String> arrayList_a =new ArrayList();
    ArrayList<String> arrayList_i =new ArrayList();
    ArrayList<String> arrayList_u =new ArrayList();
    ArrayList<String> arrayList_e =new ArrayList();
    ArrayList<String> arrayList_o =new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_katakana);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar8);
        toolbar.setTitle("คะตะกะนะ");
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        gridView = (ListView)findViewById(R.id.ListView);
        CutstomGV ep = new CutstomGV();
        gridView.setAdapter(ep);

        // a
        arrayList_a.add("ア\na");
        arrayList_a.add("カ\nka");
        arrayList_a.add("サ\nsa");
        arrayList_a.add("タ\nta");
        arrayList_a.add("ナ\nna");
        arrayList_a.add("ハ\nha");
        arrayList_a.add("マ\nma");
        arrayList_a.add("ヤ\nya");
        arrayList_a.add("ワ\nra");
        arrayList_a.add("ワ\nwa");
        // i
        arrayList_i.add("イ\ni");
        arrayList_i.add("キ\nki");
        arrayList_i.add("シ\nshi");
        arrayList_i.add("チ\nchi");
        arrayList_i.add("ニ\nni");
        arrayList_i.add("ヒ\nhi");
        arrayList_i.add("ミ\nmi");
        arrayList_i.add(" ");
        arrayList_i.add("リ\nyi");
        arrayList_i.add(" ");
        // u
        arrayList_u.add("ウ\nu");
        arrayList_u.add("ク\nku");
        arrayList_u.add("ス\nsu");
        arrayList_u.add("ツ\ntsu");
        arrayList_u.add("ヌ\nnu");
        arrayList_u.add("フ\nhu");
        arrayList_u.add("ム\nmu");
        arrayList_u.add("ユ\nyu");
        arrayList_u.add("ル\nru");
        arrayList_u.add(" ");
        // e
        arrayList_e.add("エ\ne");
        arrayList_e.add("ケ\nke");
        arrayList_e.add("セ\nse");
        arrayList_e.add("テ\nte");
        arrayList_e.add("ネ\nne");
        arrayList_e.add("ヘ\nhe");
        arrayList_e.add("メ\nme");
        arrayList_e.add(" ");
        arrayList_e.add("レ\nre");
        arrayList_e.add(" ");
        // o
        arrayList_o.add("オ\no");
        arrayList_o.add("コ\nko");
        arrayList_o.add("ソ\nso");
        arrayList_o.add("ト\nto");
        arrayList_o.add("ノ\nno");
        arrayList_o.add("ホ\nho");
        arrayList_o.add("モ\nmo");
        arrayList_o.add("ヨ\nyo");
        arrayList_o.add("ロ\nro");
        arrayList_o.add("ヲ\nwo");
    }

    private class CutstomGV extends BaseAdapter{


        @Override
        public int getCount() {
            return arrayList_a.size();
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
        public View getView(final int position, View convertView, final ViewGroup parent) {

            ViemHold hold = null;
            convertView = getLayoutInflater().inflate(R.layout.custom_hiragana, null);
            Typeface typeface = Typeface.createFromAsset(getApplicationContext().getAssets(), "TH Kodchasal Bold.ttf");
            hold = new ViemHold();
            hold.a = (Button) convertView.findViewById(R.id.button5);
            hold.i = (Button) convertView.findViewById(R.id.button4);
            hold.u = (Button) convertView.findViewById(R.id.button3);
            hold.e = (Button) convertView.findViewById(R.id.button2);
            hold.o = (Button) convertView.findViewById(R.id.button);
            hold.a.setText(arrayList_a.get(position));
            hold.i.setText(arrayList_i.get(position));
            hold.u.setText(arrayList_u.get(position));
            hold.e.setText(arrayList_e.get(position));
            hold.o.setText(arrayList_o.get(position));
            hold.a.setTypeface(typeface);
            hold.i.setTypeface(typeface);
            hold.u.setTypeface(typeface);
            hold.e.setTypeface(typeface);
            hold.o.setTypeface(typeface);
            hold.a.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (position == 0){
                        resId =R.raw.a;
                    }else if (position == 1){
                        resId = R.raw.ka;
                    }else if (position == 2){
                        resId = R.raw.sa;
                    }else if (position == 3){
                        resId =R.raw.ta;
                    }else if (position == 4){
                        resId = R.raw.na;
                    }else if (position == 5){
                        resId = R.raw.ha;
                    }else if (position == 6){
                        resId = R.raw.ma;
                    } else if (position == 7){
                        resId = R.raw.ya;
                    }else if (position == 8){
                        resId = R.raw.ra;
                    }else if (position == 9){
                        resId = R.raw.wa;
                    }
                    playSound(resId);
                }


            });
            hold.i.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (position == 0){
                        resId = R.raw.i;
                    }else if (position == 1){
                        resId = R.raw.ki;
                    }else if (position == 2){
                        resId = R.raw.shi;
                    }else if (position == 3){
                        resId = R.raw.chi;
                    }else if (position == 4){
                        resId = R.raw.ni;
                    }else if (position == 5){
                        resId = R.raw.hi;
                    }else if (position == 6){
                        resId = R.raw.mi;
                    } else if (position == 7){

                    }else if (position == 8){
                        resId  = R.raw.ri;
                    }else if (position == 9){

                    }
                    playSound(resId);
                }
            });
            hold.u.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (position == 0){
                        resId = R.raw.u;
                    }else if (position == 1){
                        resId = R.raw.ku;
                    }else if (position == 2){
                        resId = R.raw.su;
                    }else if (position == 3){
                        resId = R.raw.tsu;
                    }else if (position == 4){
                        resId = R.raw.nu;
                    }else if (position == 5){
                        resId = R.raw.fu;
                    }else if (position == 6){
                        resId =R.raw.mu;
                    } else if (position == 7){
                        resId = R.raw.yu;
                    }else if (position == 8){
                        resId = R.raw.ru;
                    }else if (position == 9){

                    }
                    playSound(resId);
                }
            });
            hold.e.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (position == 0){
                        resId  = R.raw.e;
                    }else if (position == 1){
                        resId = R.raw.ke;
                    }else if (position == 2){
                        resId = R.raw.se;
                    }else if (position == 3){
                        resId = R.raw.te;
                    }else if (position == 4){
                        resId = R.raw.ne;
                    }else if (position == 5){
                        resId = R.raw.he;
                    }else if (position == 6){
                        resId = R.raw.me;
                    } else if (position == 7){

                    }else if (position == 8){
                        resId = R.raw.re;
                    }else if (position == 9){

                    }
                    playSound(resId);
                }
            });
            hold.o.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (position == 0){
                        resId = R.raw.o;
                    }else if (position == 1){
                        resId = R.raw.ko;
                    }else if (position == 2){
                        resId = R.raw.so;
                    }else if (position == 3){
                        resId = R.raw.to;
                    }else if (position == 4){
                        resId = R.raw.no;
                    }else if (position == 5){
                        resId = R.raw.ho;
                    }else if (position == 6){
                        resId = R.raw.mo;
                    } else if (position == 7){
                        resId = R.raw.yo;
                    }else if (position == 8){
                        resId =R.raw.ro;
                    }else if (position == 9){
                        resId = R.raw.wo;
                    }
                    playSound(resId);
                }
            });
            return convertView;
        }

        private void playSound(int resId) {
            if (mPlayer != null){
                mPlayer.stop();
                mPlayer.release();
            }
            mPlayer = MediaPlayer.create(KatakanaActivity.this,resId);
            mPlayer.start();
        }
    }
    public class ViemHold{
        Button a;
        Button i;
        Button u;
        Button e;
        Button o;

    }
}

