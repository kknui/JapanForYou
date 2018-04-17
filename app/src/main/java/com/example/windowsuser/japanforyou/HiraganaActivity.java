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

import static java.security.AccessController.getContext;

public class HiraganaActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_hiragana);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("ฮิรางานะ");
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        gridView = (ListView)findViewById(R.id.gridView);
        CutstomGV ep = new CutstomGV();
        gridView.setAdapter(ep);
        // a
        arrayList_a.add("あ \na");
        arrayList_a.add("か \nka");
        arrayList_a.add("さ \nsa");
        arrayList_a.add("た \nta");
        arrayList_a.add("な \nna");
        arrayList_a.add("は \nha");
        arrayList_a.add("ま \nma");
        arrayList_a.add("や \nya");
        arrayList_a.add("ら \nra");
        arrayList_a.add("わ \nwa");
        // i
        arrayList_i.add("い \ni");
        arrayList_i.add("き \nki");
        arrayList_i.add("し\nshi");
        arrayList_i.add("ち\nchi");
        arrayList_i.add("に\nni");
        arrayList_i.add("ひ\nhi");
        arrayList_i.add("み\nmi");
        arrayList_i.add(" ");
        arrayList_i.add("り\nri");
        arrayList_i.add(" ");
        // u
        arrayList_u.add("う\nu");
        arrayList_u.add("く\nku");
        arrayList_u.add("す\nsu");
        arrayList_u.add("つ\ntsu");
        arrayList_u.add("ぬ\nnu");
        arrayList_u.add("ふ\nfu");
        arrayList_u.add("む\nmu");
        arrayList_u.add("ゆ\nyu");
        arrayList_u.add("る\nru");
        arrayList_u.add(" ");
        // e
        arrayList_e.add("え\ne");
        arrayList_e.add("け\nke");
        arrayList_e.add("せ\nse");
        arrayList_e.add("て\nte");
        arrayList_e.add("ね\nne");
        arrayList_e.add("へ\nhe");
        arrayList_e.add("め\nme");
        arrayList_e.add(" ");
        arrayList_e.add("れ\nre");
        arrayList_e.add(" ");
        // o
        arrayList_o.add("お\no");
        arrayList_o.add("こ\nko");
        arrayList_o.add("そ\nso");
        arrayList_o.add("と \nto");
        arrayList_o.add("の\nno");
        arrayList_o.add("ほ\nho");
        arrayList_o.add("も\nmo");
        arrayList_o.add("よ\nyo");
        arrayList_o.add("ろ\nro");
        arrayList_o.add("を\nwo");
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
            mPlayer = MediaPlayer.create(HiraganaActivity.this,resId);
            mPlayer.start();
        }
    }
    public class ViemHold{
        Button a;
        Button i;
        Button u;
        Button e;
        Button o;
        Button p;

    }
}

