package com.example.windowsuser.japanforyou;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class TalkActivity extends AppCompatActivity {

    ListView listView;
    int id;
    MediaPlayer mPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_talk);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar6);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        toolbar.setTitle("บทสนทนา");
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
                mPlayer.stop();
            }
        });
        Intent intent = getIntent();
        id = intent.getIntExtra("id", 0);

        listView = (ListView) findViewById(R.id.listm);
        if (id == 1) {
            listView.setAdapter(new Custom_Unit1());
        } else if (id == 2) {
            listView.setAdapter(new Custom_Unit2());
        } else if (id == 3) {
            listView.setAdapter(new Custom_Unit3());
        } else if (id == 4) {
            listView.setAdapter(new Custom_Unit4());
        } else if (id == 5) {
            listView.setAdapter(new Custom_Unit5());
        } else if (id == 6) {
            listView.setAdapter(new Custom_Unit6());
        } else if (id == 7) {
            listView.setAdapter(new Custom_Unit7());
        } else if (id == 8) {
            listView.setAdapter(new Custom_Unit8());
        } else if (id == 9) {
            listView.setAdapter(new Custom_Unit9());
        } else if (id == 10) {
            listView.setAdapter(new Custom_Unit10());
        } else if (id == 11) {
            listView.setAdapter(new Custom_Unit11());
        } else if (id == 12) {
            listView.setAdapter(new Custom_Unit12());
        } else if (id == 13) {
            listView.setAdapter(new Custom_Unit13());
        } else if (id == 14) {
            listView.setAdapter(new Custom_Unit14());
        } else if (id == 15) {
            listView.setAdapter(new Custom_Unit15());
        } else if (id == 16) {
            listView.setAdapter(new Custom_Unit16());
        } else if (id == 17) {
            listView.setAdapter(new Custom_Unit17());
        } else if (id == 18) {
            listView.setAdapter(new Custom_Unit18());
        } else if (id == 19) {
            listView.setAdapter(new Custom_Unit19());
        } else if (id == 20) {
            listView.setAdapter(new Custom_Unit20());
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_1, menu);
        return true;
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (mPlayer != null) {
            mPlayer.stop();
            mPlayer.release();
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id2 = item.getItemId();
        int resId = 0;
        if (id2 == R.id.song) {
            if (id == 1) {
                resId = R.raw.st1;
            } else if (id == 2) {
                resId = R.raw.st2;
            } else if (id == 3) {
                resId = R.raw.st3;
            } else if (id == 4) {
                resId = R.raw.st4;
            } else if (id == 5) {
                resId = R.raw.st5;
            } else if (id == 6) {
                resId = R.raw.st6;
            } else if (id == 7) {
                resId = R.raw.st7;
            } else if (id == 8) {
                resId = R.raw.st8;
            } else if (id == 9) {
                resId = R.raw.st9;
            } else if (id == 10) {
                resId = R.raw.st10;
            } else if (id == 11) {
                resId = R.raw.st11;
            } else if (id == 12) {
                resId = R.raw.st12;
            } else if (id == 13) {
                resId = R.raw.st13;
            } else if (id == 14) {
                resId = R.raw.st14;
            } else if (id == 15) {
                resId = R.raw.st15;
            } else if (id == 16) {
                resId = R.raw.st16;
            } else if (id == 17) {
                resId = R.raw.st17;
            } else if (id == 18) {
                resId = R.raw.st18;
            } else if (id == 19) {
                resId = R.raw.st19;
            } else if (id == 20) {
                resId = R.raw.st20;
            }
            playSonud(resId);
        }
        return super.onOptionsItemSelected(item);
    }

    private void playSonud(int resId) {
        if (mPlayer != null) {
            mPlayer.stop();
            mPlayer.release();
        }

        mPlayer = MediaPlayer.create(TalkActivity.this, resId);
        mPlayer.start();
    }


    public class Custom_Unit1 extends BaseAdapter {
        @Override
        public int getCount() {
            return 4;
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
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (i == 0) {
                view = getLayoutInflater().inflate(R.layout.custom_talk1, null);
                TextView name1 = (TextView) view.findViewById(R.id.textView5);
                TextView textJ1 = (TextView) view.findViewById(R.id.font_Thai6);
                TextView textE1 = (TextView) view.findViewById(R.id.font_Thai8);
                TextView textT1 = (TextView) view.findViewById(R.id.font_Thai12);
                ImageView img1 = (ImageView) view.findViewById(R.id.imageView6);
                name1.setText("แอนนา");
                textJ1.setText("はじめまして。私はアンナです。");
                textE1.setText("HAJIMEMASHITE. WATASHI WA ANNA DESU.");
                textT1.setText("สวัสดีค่ะดิฉันคือแอนนาค่ะ");
                img1.setImageResource(R.drawable.mascot_1);
            } else if (i == 1) {
                view = getLayoutInflater().inflate(R.layout.custom_talk2, null);
                TextView name2 = (TextView) view.findViewById(R.id.textViewp5);
                TextView textJ2 = (TextView) view.findViewById(R.id.font_Thai22);
                TextView textE2 = (TextView) view.findViewById(R.id.font_Thai21);
                TextView textT2 = (TextView) view.findViewById(R.id.font_Thai20);
                ImageView img2 = (ImageView) view.findViewById(R.id.imageViewp6);
                name2.setText("ซะกุระ ");
                textJ2.setText("はじめまして。さくらです。");
                textE2.setText("HAJIMEMASHITE.SAKURA DESU.");
                textT2.setText("สวัสดีค่ะดิฉันคือซะกุระค่ะ");
                img2.setImageResource(R.drawable.mascot_4);
            } else if (i == 2) {
                view = getLayoutInflater().inflate(R.layout.custom_talk1, null);
                TextView name1 = (TextView) view.findViewById(R.id.textView5);
                TextView textJ1 = (TextView) view.findViewById(R.id.font_Thai6);
                TextView textE1 = (TextView) view.findViewById(R.id.font_Thai8);
                TextView textT1 = (TextView) view.findViewById(R.id.font_Thai12);
                ImageView img1 = (ImageView) view.findViewById(R.id.imageView6);
                name1.setText("แอนนา");
                textJ1.setText("よろしくお願いします。");
                textE1.setText("YOROSHIKU ONEGAI SHIMASU.");
                textT1.setText("ยินดีที่ได้รู้จักค่ะ");
                img1.setImageResource(R.drawable.mascot_1);
            } else if (i == 3) {
                view = getLayoutInflater().inflate(R.layout.custom_talk2, null);
                TextView name2 = (TextView) view.findViewById(R.id.textViewp5);
                TextView textJ2 = (TextView) view.findViewById(R.id.font_Thai22);
                TextView textE2 = (TextView) view.findViewById(R.id.font_Thai21);
                TextView textT2 = (TextView) view.findViewById(R.id.font_Thai20);
                ImageView img2 = (ImageView) view.findViewById(R.id.imageViewp6);
                name2.setText("ซะกุระ ");
                textJ2.setText("こちらこそ。");
                textE2.setText("KOCHIRAKOSO.");
                textT2.setText("ทางนี้ก็เช่นกันค่ะ");
                img2.setImageResource(R.drawable.mascot_4);
            }
            return view;
        }
    }

    public class Custom_Unit2 extends BaseAdapter {
        @Override
        public int getCount() {
            return 5;
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
        public View getView(int i, View view, ViewGroup viewGroup) {

            if (i == 0) {
                view = getLayoutInflater().inflate(R.layout.custom_talk1, null);
                TextView name1 = (TextView) view.findViewById(R.id.textView5);
                TextView textJ1 = (TextView) view.findViewById(R.id.font_Thai6);
                TextView textE1 = (TextView) view.findViewById(R.id.font_Thai8);
                TextView textT1 = (TextView) view.findViewById(R.id.font_Thai12);
                ImageView img1 = (ImageView) view.findViewById(R.id.imageView6);
                name1.setText("แอนนา");
                textJ1.setText("さくらさん。はい、どうぞ。");
                textE1.setText("SAKURA-SAN. HAI, DÔZO.");
                textT1.setText("คุณซะกุระ ค่ะ เชิญค่ะ");
                img1.setImageResource(R.drawable.mascot_1);
            } else if (i == 1) {
                view = getLayoutInflater().inflate(R.layout.custom_talk2, null);
                TextView name2 = (TextView) view.findViewById(R.id.textViewp5);
                TextView textJ2 = (TextView) view.findViewById(R.id.font_Thai22);
                TextView textE2 = (TextView) view.findViewById(R.id.font_Thai21);
                TextView textT2 = (TextView) view.findViewById(R.id.font_Thai20);
                ImageView img2 = (ImageView) view.findViewById(R.id.imageViewp6);
                name2.setText("ซะกุระ ");
                textJ2.setText("これは何ですか。");
                textE2.setText("KORE WA NAN DESU KA.");
                textT2.setText("นี่คืออะไรคะ");
                img2.setImageResource(R.drawable.mascot_4);
            } else if (i == 2) {
                view = getLayoutInflater().inflate(R.layout.custom_talk1, null);
                TextView name1 = (TextView) view.findViewById(R.id.textView5);
                TextView textJ1 = (TextView) view.findViewById(R.id.font_Thai6);
                TextView textE1 = (TextView) view.findViewById(R.id.font_Thai8);
                TextView textT1 = (TextView) view.findViewById(R.id.font_Thai12);
                ImageView img1 = (ImageView) view.findViewById(R.id.imageView6);
                name1.setText("แอนนา");
                textJ1.setText("それはタイのお土産です。");
                textE1.setText("SORE WA TAI NO OMIYAGE DESU.");
                textT1.setText("นั่นคือของฝากจากเมืองไทยค่ะ");
                img1.setImageResource(R.drawable.mascot_1);
            } else if (i == 3) {
                view = getLayoutInflater().inflate(R.layout.custom_talk2, null);
                TextView name2 = (TextView) view.findViewById(R.id.textViewp5);
                TextView textJ2 = (TextView) view.findViewById(R.id.font_Thai22);
                TextView textE2 = (TextView) view.findViewById(R.id.font_Thai21);
                TextView textT2 = (TextView) view.findViewById(R.id.font_Thai20);
                ImageView img2 = (ImageView) view.findViewById(R.id.imageViewp6);
                name2.setText("ซะกุระ ");
                textJ2.setText("ありがとうございます。");
                textE2.setText("ARIGATÔ GOZAIMASU.");
                textT2.setText("ขอบคุณค่ะ");
                img2.setImageResource(R.drawable.mascot_4);
            } else if (i == 4) {
                view = getLayoutInflater().inflate(R.layout.custom_talk1, null);
                TextView name1 = (TextView) view.findViewById(R.id.textView5);
                TextView textJ1 = (TextView) view.findViewById(R.id.font_Thai6);
                TextView textE1 = (TextView) view.findViewById(R.id.font_Thai8);
                TextView textT1 = (TextView) view.findViewById(R.id.font_Thai12);
                ImageView img1 = (ImageView) view.findViewById(R.id.imageView6);
                name1.setText("แอนนา");
                textJ1.setText("どういたしまして。");
                textE1.setText("DÔITASHIMASHITE.");
                textT1.setText("ไม่เป็นไรค่ะ");
                img1.setImageResource(R.drawable.mascot_1);
            }
            return view;
        }
    }

    public class Custom_Unit3 extends BaseAdapter {
        @Override
        public int getCount() {
            return 5;
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
        public View getView(int i, View view, ViewGroup viewGroup) {

            if (i == 0) {
                view = getLayoutInflater().inflate(R.layout.custom_talk1, null);
                TextView name1 = (TextView) view.findViewById(R.id.textView5);
                TextView textJ1 = (TextView) view.findViewById(R.id.font_Thai6);
                TextView textE1 = (TextView) view.findViewById(R.id.font_Thai8);
                TextView textT1 = (TextView) view.findViewById(R.id.font_Thai12);
                ImageView img1 = (ImageView) view.findViewById(R.id.imageView6);
                name1.setText("ซะกุระ");
                textJ1.setText("ここは教室です。");
                textE1.setText("KOKO WA KYÔSHITSU DESU.");
                textT1.setText("ที่นี่คือห้องเรียนค่ะ");
                img1.setImageResource(R.drawable.mascot_4);
            } else if (i == 1) {
                view = getLayoutInflater().inflate(R.layout.custom_talk2, null);
                TextView name2 = (TextView) view.findViewById(R.id.textViewp5);
                TextView textJ2 = (TextView) view.findViewById(R.id.font_Thai22);
                TextView textE2 = (TextView) view.findViewById(R.id.font_Thai21);
                TextView textT2 = (TextView) view.findViewById(R.id.font_Thai20);
                ImageView img2 = (ImageView) view.findViewById(R.id.imageViewp6);
                name2.setText("แอนนา");
                textJ2.setText("わあ、広い。");
                textE2.setText("WÂ, HIROI.");
                textT2.setText("โอ้โห กว้าง");
                img2.setImageResource(R.drawable.mascot_1);
            } else if (i == 2) {
                view = getLayoutInflater().inflate(R.layout.custom_talk1, null);
                TextView name1 = (TextView) view.findViewById(R.id.textView5);
                TextView textJ1 = (TextView) view.findViewById(R.id.font_Thai6);
                TextView textE1 = (TextView) view.findViewById(R.id.font_Thai8);
                TextView textT1 = (TextView) view.findViewById(R.id.font_Thai12);
                ImageView img1 = (ImageView) view.findViewById(R.id.imageView6);
                name1.setText("ซะกุระ");
                textJ1.setText("あそこは図書館。");
                textE1.setText("ASOKO WA TOSHOKAN.");
                textT1.setText("ที่โน่นคือห้องสมุด");
                img1.setImageResource(R.drawable.mascot_4);
            } else if (i == 3) {
                view = getLayoutInflater().inflate(R.layout.custom_talk2, null);
                TextView name2 = (TextView) view.findViewById(R.id.textViewp5);
                TextView textJ2 = (TextView) view.findViewById(R.id.font_Thai22);
                TextView textE2 = (TextView) view.findViewById(R.id.font_Thai21);
                TextView textT2 = (TextView) view.findViewById(R.id.font_Thai20);
                ImageView img2 = (ImageView) view.findViewById(R.id.imageViewp6);
                name2.setText("แอนนา");
                textJ2.setText("トイレはどこですか。");
                textE2.setText("TOIRE WA DOKO DESU KA.");
                textT2.setText("ห้องน้ำอยู่ที่ไหนคะ");
                img2.setImageResource(R.drawable.mascot_1);
            } else if (i == 4) {
                view = getLayoutInflater().inflate(R.layout.custom_talk1, null);
                TextView name1 = (TextView) view.findViewById(R.id.textView5);
                TextView textJ1 = (TextView) view.findViewById(R.id.font_Thai6);
                TextView textE1 = (TextView) view.findViewById(R.id.font_Thai8);
                TextView textT1 = (TextView) view.findViewById(R.id.font_Thai12);
                ImageView img1 = (ImageView) view.findViewById(R.id.imageView6);
                name1.setText("ซะกุระ");
                textJ1.setText("すぐそこです。");
                textE1.setText("SUGU SOKO DESU.");
                textT1.setText("อยู่ที่นั่นเองค่ะ");
                img1.setImageResource(R.drawable.mascot_4);
            }
            return view;
        }
    }

    public class Custom_Unit4 extends BaseAdapter {
        @Override
        public int getCount() {
            return 5;
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
        public View getView(int i, View view, ViewGroup viewGroup) {

            if (i == 0) {
                view = getLayoutInflater().inflate(R.layout.custom_talk1, null);
                TextView name1 = (TextView) view.findViewById(R.id.textView5);
                TextView textJ1 = (TextView) view.findViewById(R.id.font_Thai6);
                TextView textE1 = (TextView) view.findViewById(R.id.font_Thai8);
                TextView textT1 = (TextView) view.findViewById(R.id.font_Thai12);
                ImageView img1 = (ImageView) view.findViewById(R.id.imageView6);
                name1.setText("แอนนา");
                textJ1.setText("ただいま。");
                textE1.setText("TADAIMA.");
                textT1.setText("กลับมาแล้ว");
                img1.setImageResource(R.drawable.mascot_4);
            } else if (i == 1) {
                view = getLayoutInflater().inflate(R.layout.custom_talk2, null);
                TextView name2 = (TextView) view.findViewById(R.id.textViewp5);
                TextView textJ2 = (TextView) view.findViewById(R.id.font_Thai22);
                TextView textE2 = (TextView) view.findViewById(R.id.font_Thai21);
                TextView textT2 = (TextView) view.findViewById(R.id.font_Thai20);
                ImageView img2 = (ImageView) view.findViewById(R.id.imageViewp6);
                name2.setText("寮母");
                textJ2.setText("お帰りなさい。");
                textE2.setText("OKAERINASAI.");
                textT2.setText("ยินดีต้อนรับกลับบ้านค่ะ");
                img2.setImageResource(R.drawable.mascot_2);
            } else if (i == 2) {
                view = getLayoutInflater().inflate(R.layout.custom_talk1, null);
                TextView name1 = (TextView) view.findViewById(R.id.textView5);
                TextView textJ1 = (TextView) view.findViewById(R.id.font_Thai6);
                TextView textE1 = (TextView) view.findViewById(R.id.font_Thai8);
                TextView textT1 = (TextView) view.findViewById(R.id.font_Thai12);
                ImageView img1 = (ImageView) view.findViewById(R.id.imageView6);
                name1.setText("ซะกุระ");
                textJ1.setText("こんにちは。");
                textE1.setText("AKONNICHIWA.");
                textT1.setText("สวัสดีค่ะ");
                img1.setImageResource(R.drawable.mascot_4);
            } else if (i == 3) {
                view = getLayoutInflater().inflate(R.layout.custom_talk2, null);
                TextView name2 = (TextView) view.findViewById(R.id.textViewp5);
                TextView textJ2 = (TextView) view.findViewById(R.id.font_Thai22);
                TextView textE2 = (TextView) view.findViewById(R.id.font_Thai21);
                TextView textT2 = (TextView) view.findViewById(R.id.font_Thai20);
                ImageView img2 = (ImageView) view.findViewById(R.id.imageViewp6);
                name2.setText("寮母");
                textJ2.setText("あなたも留学生ですか。");
                textE2.setText("ANATA MO RYÛGAKUSEI DESU KA.");
                textT2.setText("คุณก็เป็นนักศึกษาต่างชาติหรือคะ");
                img2.setImageResource(R.drawable.mascot_2);
            } else if (i == 4) {
                view = getLayoutInflater().inflate(R.layout.custom_talk3, null);
                TextView name1 = (TextView) view.findViewById(R.id.textView5);
                TextView textJ1 = (TextView) view.findViewById(R.id.font_Thai6);
                TextView textE1 = (TextView) view.findViewById(R.id.font_Thai8);
                TextView textT1 = (TextView) view.findViewById(R.id.font_Thai12);
                ImageView img1 = (ImageView) view.findViewById(R.id.imageView6);
                name1.setText("ซะกุระ");
                textJ1.setText("いいえ、私は留学生ではありません。\n             日本人の学生です。");
                textE1.setText("IIE, WATASHI WA RYÛGAKUSEI DEWA ARIMASEN.\n       NIHON-JIN NO GAKUSEI DESU.");
                textT1.setText("ไม่ใช่ค่ะ ดิฉันไม่ใช่นักศึกษาต่างชาติ\n      เป็นนักศึกษาญี่ปุ่นค่ะ");
                img1.setImageResource(R.drawable.mascot_1);
            }
            return view;
        }
    }

    public class Custom_Unit5 extends BaseAdapter {
        @Override
        public int getCount() {
            return 3;
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
        public View getView(int i, View view, ViewGroup viewGroup) {

            if (i == 0) {
                view = getLayoutInflater().inflate(R.layout.custom_talk1, null);
                TextView name1 = (TextView) view.findViewById(R.id.textView5);
                TextView textJ1 = (TextView) view.findViewById(R.id.font_Thai6);
                TextView textE1 = (TextView) view.findViewById(R.id.font_Thai8);
                TextView textT1 = (TextView) view.findViewById(R.id.font_Thai12);
                ImageView img1 = (ImageView) view.findViewById(R.id.imageView6);
                name1.setText("แอนนา");
                textJ1.setText("私の部屋はこちらです。どうぞ。");
                textE1.setText("WATASHI NO HEYA WA KOCHIRA DESU. DÔZO.");
                textT1.setText("ห้องของดิฉันทางนี้ค่ะ");
                img1.setImageResource(R.drawable.mascot_1);
            } else if (i == 1) {
                view = getLayoutInflater().inflate(R.layout.custom_talk2, null);
                TextView name2 = (TextView) view.findViewById(R.id.textViewp5);
                TextView textJ2 = (TextView) view.findViewById(R.id.font_Thai22);
                TextView textE2 = (TextView) view.findViewById(R.id.font_Thai21);
                TextView textT2 = (TextView) view.findViewById(R.id.font_Thai20);
                ImageView img2 = (ImageView) view.findViewById(R.id.imageViewp6);
                name2.setText("ซะกุระ");
                textJ2.setText("すごい！これは全部マンガ？。");
                textE2.setText("SUGOI! KORE WA ZENBU MANGA?");
                textT2.setText("สุดยอด! นี่ ทั้งหมด มังงะเหรอ");
                img2.setImageResource(R.drawable.mascot_4);
            } else if (i == 2) {
                view = getLayoutInflater().inflate(R.layout.custom_talk3, null);
                TextView name1 = (TextView) view.findViewById(R.id.textView5);
                TextView textJ1 = (TextView) view.findViewById(R.id.font_Thai6);
                TextView textE1 = (TextView) view.findViewById(R.id.font_Thai8);
                TextView textT1 = (TextView) view.findViewById(R.id.font_Thai12);
                ImageView img1 = (ImageView) view.findViewById(R.id.imageView6);
                name1.setText("แอนนา");
                textJ1.setText("それは私の宝物です。\n" + "私は毎日マンガを読みます。");
                textE1.setText("SORE WA WATASHI NO TAKARAMONO DESU.\n" + "WATASHI WA MAINICHI MANGA O YOMIMASU.");
                textT1.setText("นั่นคือสมบัติของดิฉันค่ะ\n" + "ดิฉันอ่านมังงะทุกวันค่ะ");
                img1.setImageResource(R.drawable.mascot_1);
            }
            return view;
        }
    }

    public class Custom_Unit6 extends BaseAdapter {
        @Override
        public int getCount() {
            return 3;
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
        public View getView(int i, View view, ViewGroup viewGroup) {

            if (i == 0) {
                view = getLayoutInflater().inflate(R.layout.custom_talk3, null);
                TextView name1 = (TextView) view.findViewById(R.id.textView5);
                TextView textJ1 = (TextView) view.findViewById(R.id.font_Thai6);
                TextView textE1 = (TextView) view.findViewById(R.id.font_Thai8);
                TextView textT1 = (TextView) view.findViewById(R.id.font_Thai12);
                ImageView img1 = (ImageView) view.findViewById(R.id.imageView6);
                name1.setText("ซะกุระ");
                textJ1.setText("ところでアンナさん。\n" +
                        "電話番号は何番ですか。");
                textE1.setText("TOKORODE ANNA-SAN. \n DENWABANGÔ WA NANBAN DESU KA.");
                textT1.setText("      ว่าแต่ว่า คุณแอนนา \n หมายเลขโทรศัพท์หมายเลขอะไรคะ");
                img1.setImageResource(R.drawable.mascot_4);
            } else if (i == 1) {
                view = getLayoutInflater().inflate(R.layout.custom_talk2, null);
                TextView name2 = (TextView) view.findViewById(R.id.textViewp5);
                TextView textJ2 = (TextView) view.findViewById(R.id.font_Thai22);
                TextView textE2 = (TextView) view.findViewById(R.id.font_Thai21);
                TextView textT2 = (TextView) view.findViewById(R.id.font_Thai20);
                ImageView img2 = (ImageView) view.findViewById(R.id.imageViewp6);
                name2.setText("แอนนา");
                textJ2.setText("ええと。０８０－１２３４－・・・。");
                textE2.setText("ÊTO. REI HACHI REI - ICHI NI SAN YON - ...");
                textT2.setText("เอ่อ 080 – 1234 – ....");
                img2.setImageResource(R.drawable.mascot_1);
            } else if (i == 2) {
                view = getLayoutInflater().inflate(R.layout.custom_talk8, null);
            }
            return view;
        }
    }

    public class Custom_Unit7 extends BaseAdapter {
        @Override
        public int getCount() {
            return 4;
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
        public View getView(int i, View view, ViewGroup viewGroup) {

            if (i == 0) {
                view = getLayoutInflater().inflate(R.layout.custom_talk1, null);
                TextView name1 = (TextView) view.findViewById(R.id.textView5);
                TextView textJ1 = (TextView) view.findViewById(R.id.font_Thai6);
                TextView textE1 = (TextView) view.findViewById(R.id.font_Thai8);
                TextView textT1 = (TextView) view.findViewById(R.id.font_Thai12);
                ImageView img1 = (ImageView) view.findViewById(R.id.imageView6);
                name1.setText("แอนนา");
                textJ1.setText("ケーキがいっぱいありますね。");
                textE1.setText("TKÊKI GA IPPAI ARIMASU NE.");
                textT1.setText("มีเค้กเยอะแยะนะคะ");
                img1.setImageResource(R.drawable.mascot_1);
            } else if (i == 1) {
                view = getLayoutInflater().inflate(R.layout.custom_talk2, null);
                TextView name2 = (TextView) view.findViewById(R.id.textViewp5);
                TextView textJ2 = (TextView) view.findViewById(R.id.font_Thai22);
                TextView textE2 = (TextView) view.findViewById(R.id.font_Thai21);
                TextView textT2 = (TextView) view.findViewById(R.id.font_Thai20);
                ImageView img2 = (ImageView) view.findViewById(R.id.imageViewp6);
                name2.setText("ซะกุระ");
                textJ2.setText("すみません、シュークリームはありますか。");
                textJ2.setTextSize(12);
                textE2.setText("SUMIMASEN, SHÛKURÎMU WA ARIMASU KA.");

                textT2.setText("ขอโทษค่ะ มีชูครีมไหมคะ");
                img2.setImageResource(R.drawable.mascot_4);
            } else if (i == 2) {
                view = getLayoutInflater().inflate(R.layout.custom_talk1, null);
                TextView name1 = (TextView) view.findViewById(R.id.textView5);
                TextView textJ1 = (TextView) view.findViewById(R.id.font_Thai6);
                TextView textE1 = (TextView) view.findViewById(R.id.font_Thai8);
                TextView textT1 = (TextView) view.findViewById(R.id.font_Thai12);
                ImageView img1 = (ImageView) view.findViewById(R.id.imageView6);
                name1.setText("พนักงาน");
                textJ1.setText("はい、こちらです。");
                textE1.setText("HAI, KOCHIRA DESU");
                textT1.setText("ค่ะ ทางนี้ค่ะ");
                img1.setImageResource(R.drawable.mascot_2);
            } else if (i == 3) {
                view = getLayoutInflater().inflate(R.layout.custom_talk2, null);
                TextView name2 = (TextView) view.findViewById(R.id.textViewp5);
                TextView textJ2 = (TextView) view.findViewById(R.id.font_Thai22);
                TextView textE2 = (TextView) view.findViewById(R.id.font_Thai21);
                TextView textT2 = (TextView) view.findViewById(R.id.font_Thai20);
                ImageView img2 = (ImageView) view.findViewById(R.id.imageViewp6);
                name2.setText("ซะกุระ");
                textJ2.setText("シュークリームを２つください。");
                textE2.setText("SHÛKURÎMU O FUTATSU KUDASAI.");
                textT2.setText("ขอชูครีม 2 ชิ้นค่ะ");
                img2.setImageResource(R.drawable.mascot_4);
            }
            return view;
        }
    }

    public class Custom_Unit8 extends BaseAdapter {
        @Override
        public int getCount() {
            return 3;
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
        public View getView(int i, View view, ViewGroup viewGroup) {

            if (i == 0) {
                view = getLayoutInflater().inflate(R.layout.custom_talk8, null);
            } else if (i == 1) {
                view = getLayoutInflater().inflate(R.layout.custom_talk2, null);
                TextView name2 = (TextView) view.findViewById(R.id.textViewp5);
                TextView textJ2 = (TextView) view.findViewById(R.id.font_Thai22);
                TextView textE2 = (TextView) view.findViewById(R.id.font_Thai21);
                TextView textT2 = (TextView) view.findViewById(R.id.font_Thai20);
                ImageView img2 = (ImageView) view.findViewById(R.id.imageViewp6);
                name2.setText("ซะกุระ");
                textJ2.setText("えっ。");
                textE2.setText("E'.");
                textT2.setText("เอ๊ะ");
                img2.setImageResource(R.drawable.mascot_4);
            } else if (i == 2) {
                view = getLayoutInflater().inflate(R.layout.custom_talk1, null);
                TextView name1 = (TextView) view.findViewById(R.id.textView5);
                TextView textJ1 = (TextView) view.findViewById(R.id.font_Thai6);
                TextView textE1 = (TextView) view.findViewById(R.id.font_Thai8);
                TextView textT1 = (TextView) view.findViewById(R.id.font_Thai12);
                ImageView img1 = (ImageView) view.findViewById(R.id.imageView6);
                name1.setText("แอนนา");
                textJ1.setText("先生、もう一度お願いします。");
                textE1.setText("SENSEI, MÔICHIDO ONEGAI SHIMASU.");
                textT1.setText("อาจารย์คะ ขออีกครั้งค่ะ");
                img1.setImageResource(R.drawable.mascot_1);
            }
            return view;
        }
    }

    public class Custom_Unit9 extends BaseAdapter {
        @Override
        public int getCount() {
            return 3;
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
        public View getView(int i, View view, ViewGroup viewGroup) {

            if (i == 0) {
                view = getLayoutInflater().inflate(R.layout.custom_talk1, null);
                TextView name1 = (TextView) view.findViewById(R.id.textView5);
                TextView textJ1 = (TextView) view.findViewById(R.id.font_Thai6);
                TextView textE1 = (TextView) view.findViewById(R.id.font_Thai8);
                TextView textT1 = (TextView) view.findViewById(R.id.font_Thai12);
                ImageView img1 = (ImageView) view.findViewById(R.id.imageView6);
                name1.setText("อาจารย์");
                textJ1.setText("明日、健康診断があります。");
                textE1.setText("ASHITA, KENKÔSHINDAN GA ARIMASU.");
                textT1.setText("พรุ่งนี้ มีการตรวจสุขภาพครับ");
                img1.setImageResource(R.drawable.mascot_6);
            } else if (i == 1) {
                view = getLayoutInflater().inflate(R.layout.custom_talk2, null);
                TextView name2 = (TextView) view.findViewById(R.id.textViewp5);
                TextView textJ2 = (TextView) view.findViewById(R.id.font_Thai22);
                TextView textE2 = (TextView) view.findViewById(R.id.font_Thai21);
                TextView textT2 = (TextView) view.findViewById(R.id.font_Thai20);
                ImageView img2 = (ImageView) view.findViewById(R.id.imageViewp6);
                name2.setText("แอนนา");
                textJ2.setText("何時からですか。");
                textE2.setText("NANJI KARA DESU KA.");
                textT2.setText("ตั้งแต่กี่โมงคะ");
                img2.setImageResource(R.drawable.mascot_1);
            } else if (i == 2) {
                view = getLayoutInflater().inflate(R.layout.custom_talk5, null);
            }
            return view;
        }
    }

    public class Custom_Unit10 extends BaseAdapter {
        @Override
        public int getCount() {
            return 3;
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
        public View getView(int i, View view, ViewGroup viewGroup) {

            if (i == 0) {
                view = getLayoutInflater().inflate(R.layout.custom_talk3, null);
                TextView name1 = (TextView) view.findViewById(R.id.textView5);
                TextView textJ1 = (TextView) view.findViewById(R.id.font_Thai6);
                TextView textE1 = (TextView) view.findViewById(R.id.font_Thai8);
                TextView textT1 = (TextView) view.findViewById(R.id.font_Thai12);
                ImageView img1 = (ImageView) view.findViewById(R.id.imageView6);
                name1.setText("อาจารย์");
                textJ1.setText("はじめに身長と体重をはかります。 \n             全員いますか。");
                textE1.setText("HAJIMENI SHINCHÔ TO TAIJÛ O HAKARIMASU. \n               ZEN-IN IMASU KA.");
                textT1.setText("อันดับแรก วัดส่วนสูงและน้ำหนักครับ\n          ทุกคนอยู่ไหมครับ");
                img1.setImageResource(R.drawable.mascot_6);
            } else if (i == 1) {
                view = getLayoutInflater().inflate(R.layout.custom_talk2, null);
                TextView name2 = (TextView) view.findViewById(R.id.textViewp5);
                TextView textJ2 = (TextView) view.findViewById(R.id.font_Thai22);
                TextView textE2 = (TextView) view.findViewById(R.id.font_Thai21);
                TextView textT2 = (TextView) view.findViewById(R.id.font_Thai20);
                ImageView img2 = (ImageView) view.findViewById(R.id.imageViewp6);
                name2.setText("โรดริโก");
                textJ2.setText("アンナさんがいません。");
                textE2.setText("ANNA-SAN GA IMASEN.");
                textT2.setText("คุณแอนนาไม่อยู่ครับ");
                img2.setImageResource(R.drawable.mascot_5);
            } else if (i == 2) {
                view = getLayoutInflater().inflate(R.layout.custom_talk1, null);
                TextView name1 = (TextView) view.findViewById(R.id.textView5);
                TextView textJ1 = (TextView) view.findViewById(R.id.font_Thai6);
                TextView textE1 = (TextView) view.findViewById(R.id.font_Thai8);
                TextView textT1 = (TextView) view.findViewById(R.id.font_Thai12);
                ImageView img1 = (ImageView) view.findViewById(R.id.imageView6);
                name1.setText("แอนนา");
                textJ1.setText("すみません。遅れました。");
                textE1.setText("SUMIMASEN. OKUREMASHITA.");
                textT1.setText("ขอโทษค่ะ มาสายค่ะ");
                img1.setImageResource(R.drawable.mascot_1);
            }
            return view;
        }
    }

    public class Custom_Unit11 extends BaseAdapter {
        @Override
        public int getCount() {
            return 2;
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
        public View getView(int i, View view, ViewGroup viewGroup) {

            if (i == 0) {
                view = getLayoutInflater().inflate(R.layout.custom_talk6, null);
            } else if (i == 1) {
                view = getLayoutInflater().inflate(R.layout.custom_talk2, null);
                TextView name2 = (TextView) view.findViewById(R.id.textViewp5);
                TextView textJ2 = (TextView) view.findViewById(R.id.font_Thai22);
                TextView textE2 = (TextView) view.findViewById(R.id.font_Thai21);
                TextView textT2 = (TextView) view.findViewById(R.id.font_Thai20);
                ImageView img2 = (ImageView) view.findViewById(R.id.imageViewp6);
                name2.setText("ซะกุระ");
                textJ2.setText("わあ、行く行く。今度の土曜日ね。");
                textE2.setText("WÂ, IKU IKU.KONDO NO DOYÔBI NE.");
                textT2.setText("โอ้โห ไป ไป วันเสาร์นี้นะ");
                img2.setImageResource(R.drawable.mascot_4);
            }
            return view;
        }
    }

    public class Custom_Unit12 extends BaseAdapter {
        @Override
        public int getCount() {
            return 3;
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
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (i == 0) {
                view = getLayoutInflater().inflate(R.layout.custom_talk1, null);
                TextView name1 = (TextView) view.findViewById(R.id.textView5);
                TextView textJ1 = (TextView) view.findViewById(R.id.font_Thai6);
                TextView textE1 = (TextView) view.findViewById(R.id.font_Thai8);
                TextView textT1 = (TextView) view.findViewById(R.id.font_Thai12);
                ImageView img1 = (ImageView) view.findViewById(R.id.imageView6);
                name1.setText("ซะกุระ");
                textJ1.setText("ロドリゴさんはいつ日本に来ましたか。");
                textE1.setText("RODORIGO-SAN WA ITSU NIHON NI KIMASHITA KA.");
                textT1.setText("คุณโรดริโก มาญี่ปุ่นเมื่อไรคะ");
                img1.setImageResource(R.drawable.mascot_4);
            } else if (i == 1) {
                view = getLayoutInflater().inflate(R.layout.custom_talk2, null);
                TextView name2 = (TextView) view.findViewById(R.id.textViewp5);
                TextView textJ2 = (TextView) view.findViewById(R.id.font_Thai22);
                TextView textE2 = (TextView) view.findViewById(R.id.font_Thai21);
                TextView textT2 = (TextView) view.findViewById(R.id.font_Thai20);
                ImageView img2 = (ImageView) view.findViewById(R.id.imageViewp6);
                name2.setText("โรดริโก");
                textJ2.setText("３月に来ました。");
                textE2.setText("SANGATSU NI KIMASHITA.");
                textT2.setText("มาเดือนมีนาคมครับ");
                img2.setImageResource(R.drawable.mascot_5);
            } else if (i == 2) {
                view = getLayoutInflater().inflate(R.layout.custom_talk1, null);
                TextView name1 = (TextView) view.findViewById(R.id.textView5);
                TextView textJ1 = (TextView) view.findViewById(R.id.font_Thai6);
                TextView textE1 = (TextView) view.findViewById(R.id.font_Thai8);
                TextView textT1 = (TextView) view.findViewById(R.id.font_Thai12);
                ImageView img1 = (ImageView) view.findViewById(R.id.imageView6);
                name1.setText("ซะกุระ");
                textJ1.setText("もう日本の生活に慣れた？");
                textE1.setText("MÔ NIHON NO SEIKATSU NI NARETA?");
                textT1.setText("เคยชินกับการใช้ชีวิตในญี่ปุ่นแล้วยัง");
                img1.setImageResource(R.drawable.mascot_4);
            } else if (i == 3) {
                view = getLayoutInflater().inflate(R.layout.custom_talk2, null);
                TextView name2 = (TextView) view.findViewById(R.id.textViewp5);
                TextView textJ2 = (TextView) view.findViewById(R.id.font_Thai22);
                TextView textE2 = (TextView) view.findViewById(R.id.font_Thai21);
                TextView textT2 = (TextView) view.findViewById(R.id.font_Thai20);
                ImageView img2 = (ImageView) view.findViewById(R.id.imageViewp6);
                name2.setText("โรดริโก");
                textJ2.setText("\tええ、まあ。");
                textE2.setText("Ê, MÂ.");
                textT2.setText("ก็ ในระดับหนึ่ง");
                img2.setImageResource(R.drawable.mascot_5);
            }
            return view;
        }
    }

    public class Custom_Unit13 extends BaseAdapter {
        @Override
        public int getCount() {
            return 3;
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
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (i == 0) {
                view = getLayoutInflater().inflate(R.layout.custom_talk1, null);
                TextView name1 = (TextView) view.findViewById(R.id.textView5);
                TextView textJ1 = (TextView) view.findViewById(R.id.font_Thai6);
                TextView textE1 = (TextView) view.findViewById(R.id.font_Thai8);
                TextView textT1 = (TextView) view.findViewById(R.id.font_Thai12);
                ImageView img1 = (ImageView) view.findViewById(R.id.imageView6);
                name1.setText("ซะกุระ");
                textJ1.setText("ロドリゴさんの趣味は何ですか。");
                textE1.setText("RODORIGO-SAN NO SHUMI WA NAN DESU KA.");
                textT1.setText("งานอดิเรกของคุณโรดริโก คืออะไรคะ");
                img1.setImageResource(R.drawable.mascot_4);
            } else if (i == 1) {
                view = getLayoutInflater().inflate(R.layout.custom_talk9, null);
            } else if (i == 2) {
                view = getLayoutInflater().inflate(R.layout.custom_talk6, null);
                TextView name1 = (TextView) view.findViewById(R.id.textView5);
                TextView textJ1 = (TextView) view.findViewById(R.id.font_Thai6);
                TextView textE1 = (TextView) view.findViewById(R.id.font_Thai8);
                TextView textT1 = (TextView) view.findViewById(R.id.font_Thai12);
                ImageView img1 = (ImageView) view.findViewById(R.id.imageView6);
                name1.setText("ซะกุระ");
                textJ1.setText("へえ。新宿に新しい本屋が出来ましたよ。\n             みんなで行きませんか。");
                textE1.setText("HÊ. SHINJUKU NI ATARASHII HON-YA GA DEKIMASHITA YO.\n            MINNA DE IKIMASEN KA.");
                textT1.setText("เหรอ ร้านหนังสือใหม่เปิดที่ชินจุกุนะคะ\n        ทุกคนไปกันไหมคะ");
                img1.setImageResource(R.drawable.mascot_4);
            }
            return view;
        }
    }

    public class Custom_Unit14 extends BaseAdapter {
        @Override
        public int getCount() {
            return 3;
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
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (i == 0) {
                view = getLayoutInflater().inflate(R.layout.custom_talk3, null);
                TextView name1 = (TextView) view.findViewById(R.id.textView5);
                TextView textJ1 = (TextView) view.findViewById(R.id.font_Thai6);
                TextView textE1 = (TextView) view.findViewById(R.id.font_Thai8);
                TextView textT1 = (TextView) view.findViewById(R.id.font_Thai12);
                ImageView img1 = (ImageView) view.findViewById(R.id.imageView6);
                name1.setText("แอนนา");
                textJ1.setText("                   お母さん、 \n      ここにゴミを捨ててもいいですか。");
                textE1.setText("OKÂSAN, KOKO NI GOMI O SUTETE MO II DESU KA.");
                textT1.setText("คุณแม่คะ ทิ้งขยะที่นี่ได้ไหมคะ");
                img1.setImageResource(R.drawable.mascot_1);
            } else if (i == 1) {
                view = getLayoutInflater().inflate(R.layout.custom_talk6, null);
                TextView name1 = (TextView) view.findViewById(R.id.textView5);
                TextView textJ1 = (TextView) view.findViewById(R.id.font_Thai6);
                TextView textE1 = (TextView) view.findViewById(R.id.font_Thai8);
                TextView textT1 = (TextView) view.findViewById(R.id.font_Thai12);
                ImageView img1 = (ImageView) view.findViewById(R.id.imageView6);
                name1.setText("寮母");
                textJ1.setText("そうねえ。缶は別の袋に入れてください。\n       資源ですから。");
                textE1.setText("SÔNÊ. KAN WA BETSU NO FUKURO NI IRETE KUDASAI.\n    SHIGEN DESU KARA.");
                textT1.setText("เอ่อ กระป๋อง กรุณาใส่ในถุงอีกใบ\n   เพราะเป็นสิ่งที่นำกลับมาใช้ใหม่ได้ค่ะ");
                img1.setImageResource(R.drawable.mascot_2);
            } else if (i == 2) {
                view = getLayoutInflater().inflate(R.layout.custom_talk1, null);
                TextView name1 = (TextView) view.findViewById(R.id.textView5);
                TextView textJ1 = (TextView) view.findViewById(R.id.font_Thai6);
                TextView textE1 = (TextView) view.findViewById(R.id.font_Thai8);
                TextView textT1 = (TextView) view.findViewById(R.id.font_Thai12);
                ImageView img1 = (ImageView) view.findViewById(R.id.imageView6);
                name1.setText("แอนนา");
                textJ1.setText("はい、分かりました。");
                textE1.setText("HAI, WAKARIMASHITA.");
                textT1.setText("ค่ะ เข้าใจแล้วค่ะ");
                img1.setImageResource(R.drawable.mascot_1);
            }
            return view;
        }
    }

    public class Custom_Unit15 extends BaseAdapter {
        @Override
        public int getCount() {
            return 4;
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
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (i == 0) {
                view = getLayoutInflater().inflate(R.layout.custom_talk1, null);
                TextView name1 = (TextView) view.findViewById(R.id.textView5);
                TextView textJ1 = (TextView) view.findViewById(R.id.font_Thai6);
                TextView textE1 = (TextView) view.findViewById(R.id.font_Thai8);
                TextView textT1 = (TextView) view.findViewById(R.id.font_Thai12);
                ImageView img1 = (ImageView) view.findViewById(R.id.imageView6);
                name1.setText("ซะกุระ");
                textJ1.setText("次は新宿駅です。さあ、降りましょう。");
                textE1.setText("TSUGI WA SHINJUKU EKI DESU. SÂ, ORIMASHÔ.");
                textT1.setText("ต่อไปคือสถานีชินจุกุค่ะ เอาละ ลงกันเถอะ");
                textT1.setTextSize(19);
                img1.setImageResource(R.drawable.mascot_4);
            } else if (i == 1) {
                view = getLayoutInflater().inflate(R.layout.custom_talk2, null);
                TextView name2 = (TextView) view.findViewById(R.id.textViewp5);
                TextView textJ2 = (TextView) view.findViewById(R.id.font_Thai22);
                TextView textE2 = (TextView) view.findViewById(R.id.font_Thai21);
                TextView textT2 = (TextView) view.findViewById(R.id.font_Thai20);
                ImageView img2 = (ImageView) view.findViewById(R.id.imageViewp6);
                name2.setText("โรดริโก");
                textJ2.setText("あれ。あの人たち、寝ています。");
                textE2.setText("ARE. ANO HITO TACHI, NETE IMASU.");
                textT2.setText("อ้าว คนเหล่านั้นกำลังหลับครับ");
                img2.setImageResource(R.drawable.mascot_5);
            } else if (i == 2) {
                view = getLayoutInflater().inflate(R.layout.custom_talk1, null);
                TextView name1 = (TextView) view.findViewById(R.id.textView5);
                TextView textJ1 = (TextView) view.findViewById(R.id.font_Thai6);
                TextView textE1 = (TextView) view.findViewById(R.id.font_Thai8);
                TextView textT1 = (TextView) view.findViewById(R.id.font_Thai12);
                ImageView img1 = (ImageView) view.findViewById(R.id.imageView6);
                name1.setText("แอนนา");
                textJ1.setText("大丈夫かな。");
                textE1.setText("DAIJÔBU KANA.");
                textT1.setText("เป็นไรหรือเปล่านะ");
                img1.setImageResource(R.drawable.mascot_1);
            } else if (i == 3) {
                view = getLayoutInflater().inflate(R.layout.custom_talk2, null);
                TextView name2 = (TextView) view.findViewById(R.id.textViewp5);
                TextView textJ2 = (TextView) view.findViewById(R.id.font_Thai22);
                TextView textE2 = (TextView) view.findViewById(R.id.font_Thai21);
                TextView textT2 = (TextView) view.findViewById(R.id.font_Thai20);
                ImageView img2 = (ImageView) view.findViewById(R.id.imageViewp6);
                name2.setText("ซะกุระ ");
                textJ2.setText("大丈夫、大丈夫。ほら、起きた。");
                textE2.setText("DAIJÔBU, DAIJÔBU. HORA, OKITA.");
                textT2.setText("ไม่เป็นไร ไม่เป็นไร ดูสิ ตื่นแล้ว");
                img2.setImageResource(R.drawable.mascot_4);
            }
            return view;
        }
    }

    public class Custom_Unit16 extends BaseAdapter {
        @Override
        public int getCount() {
            return 3;
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
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (i == 0) {
                view = getLayoutInflater().inflate(R.layout.custom_talk1, null);
                TextView name1 = (TextView) view.findViewById(R.id.textView5);
                TextView textJ1 = (TextView) view.findViewById(R.id.font_Thai6);
                TextView textE1 = (TextView) view.findViewById(R.id.font_Thai8);
                TextView textT1 = (TextView) view.findViewById(R.id.font_Thai12);
                ImageView img1 = (ImageView) view.findViewById(R.id.imageView6);
                name1.setText("店員");
                textJ1.setText("いらっしゃいませ。");
                textE1.setText("IRASSHAIMASE.");
                textT1.setText("ยินดีต้อนรับครับ");
                img1.setImageResource(R.drawable.mascot_5);
            } else if (i == 1) {
                view = getLayoutInflater().inflate(R.layout.custom_talk2, null);
                TextView name2 = (TextView) view.findViewById(R.id.textViewp5);
                TextView textJ2 = (TextView) view.findViewById(R.id.font_Thai22);
                TextView textE2 = (TextView) view.findViewById(R.id.font_Thai21);
                TextView textT2 = (TextView) view.findViewById(R.id.font_Thai20);
                ImageView img2 = (ImageView) view.findViewById(R.id.imageViewp6);
                name2.setText("แอนนา");
                textJ2.setText("あのう、マンガ売り場はどこですか。");
                textE2.setText("ANÔ, MANGA URIBA WA DOKO DESU KA.");
                textT2.setText("เอ่อ ที่ขายมังงะอยู่ที่ไหนคะ");
                img2.setImageResource(R.drawable.mascot_1);
            } else if (i == 2) {
                view = getLayoutInflater().inflate(R.layout.custom_talk8, null);
                TextView name1 = (TextView) view.findViewById(R.id.textView5);
                TextView textJ1 = (TextView) view.findViewById(R.id.font_Thai6);
                TextView textE1 = (TextView) view.findViewById(R.id.font_Thai8);
                TextView textT1 = (TextView) view.findViewById(R.id.font_Thai12);
                ImageView img1 = (ImageView) view.findViewById(R.id.imageView6);
                name1.setText("店員");
                textJ1.setText("２階です。階段を上がって、\n       右に行ってください。");
                textE1.setText("NIKAI DESU. KAIDAN O AGATTE, MIGI NI ITTE KUDASAI.");
                textT1.setText("ชั้นสองครับ กรุณาขึ้นบันได และไปทางขวาครับ");
                img1.setImageResource(R.drawable.mascot_5);
            }
            return view;
        }
    }

    public class Custom_Unit17 extends BaseAdapter {
        @Override
        public int getCount() {
            return 4;
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
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (i == 0) {
                view = getLayoutInflater().inflate(R.layout.custom_talk1, null);
                TextView name1 = (TextView) view.findViewById(R.id.textView5);
                TextView textJ1 = (TextView) view.findViewById(R.id.font_Thai6);
                TextView textE1 = (TextView) view.findViewById(R.id.font_Thai8);
                TextView textT1 = (TextView) view.findViewById(R.id.font_Thai12);
                ImageView img1 = (ImageView) view.findViewById(R.id.imageView6);
                name1.setText("แอนนา");
                textJ1.setText("あ、この本いいなあ。あれも面白そう。");
                textE1.setText("A, KONO HON II NÂ. ARE MO OMOSHIROSÔ.");
                textT1.setText("อ๊ะ หนังสือเล่มนี้ดีนะ โน่นก็ท่าทางน่าสนใจด้วย");
                textT1.setTextSize(16);
                img1.setImageResource(R.drawable.mascot_1);
            } else if (i == 1) {
                view = getLayoutInflater().inflate(R.layout.custom_talk1, null);
                TextView name1 = (TextView) view.findViewById(R.id.textView5);
                TextView textJ1 = (TextView) view.findViewById(R.id.font_Thai6);
                TextView textE1 = (TextView) view.findViewById(R.id.font_Thai8);
                TextView textT1 = (TextView) view.findViewById(R.id.font_Thai12);
                ImageView img1 = (ImageView) view.findViewById(R.id.imageView6);
                name1.setText("แอนนา");
                textJ1.setText("さくらさんのおすすめは何ですか。");
                textE1.setText("SAKURA-SAN NO OSUSUME WA NAN DESU KA.");
                textT1.setText("หนังสือแนะนำของคุณซะกุระคืออะไรคะ");
                img1.setImageResource(R.drawable.mascot_1);
            } else if (i == 2) {
                view = getLayoutInflater().inflate(R.layout.custom_talk2, null);
                TextView name2 = (TextView) view.findViewById(R.id.textViewp5);
                TextView textJ2 = (TextView) view.findViewById(R.id.font_Thai22);
                TextView textE2 = (TextView) view.findViewById(R.id.font_Thai21);
                TextView textT2 = (TextView) view.findViewById(R.id.font_Thai20);
                ImageView img2 = (ImageView) view.findViewById(R.id.imageViewp6);
                name2.setText("ซะกุระ");
                textJ2.setText("これはどう？");
                textE2.setText("KORE WA DÔ?");
                textT2.setText("นี่เป็นไง");
                img2.setImageResource(R.drawable.mascot_4);
            } else if (i == 3) {
                view = getLayoutInflater().inflate(R.layout.custom_talk1, null);
                TextView name1 = (TextView) view.findViewById(R.id.textView5);
                TextView textJ1 = (TextView) view.findViewById(R.id.font_Thai6);
                TextView textE1 = (TextView) view.findViewById(R.id.font_Thai8);
                TextView textT1 = (TextView) view.findViewById(R.id.font_Thai12);
                ImageView img1 = (ImageView) view.findViewById(R.id.imageView6);
                name1.setText("แอนนา");
                textJ1.setText("ホラーはちょっと…。");
                textE1.setText("HORÂ WA CHOTTO....");
                textT1.setText("เรื่องสยองขวัญ เดี๋ยวนะ...");
                img1.setImageResource(R.drawable.mascot_1);
            }
            return view;
        }
    }

    public class Custom_Unit18 extends BaseAdapter {
        @Override
        public int getCount() {
            return 4;
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
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (i == 0) {
                view = getLayoutInflater().inflate(R.layout.custom_talk6, null);
                TextView name1 = (TextView) view.findViewById(R.id.textView5);
                TextView textJ1 = (TextView) view.findViewById(R.id.font_Thai6);
                TextView textE1 = (TextView) view.findViewById(R.id.font_Thai8);
                TextView textT1 = (TextView) view.findViewById(R.id.font_Thai12);
                ImageView img1 = (ImageView) view.findViewById(R.id.imageView6);
                name1.setText("แอนนา");
                textJ1.setText("もしもし、さくらさん。助けてください。\n            道に迷ってしまいました。");
                textE1.setText("MOSHIMOSHI, SAKURA-SAN. TASUKETE KUDASAI. \n MICHI NI MAYOTTE SHIMAIMASHITA.");
                textT1.setText("สวัสดีค่ะ คุณซะกุระ กรุณาช่วยหน่อยค่ะ\n             หลงทางไปเสียแล้วค่ะ");
                img1.setImageResource(R.drawable.mascot_1);
            } else if (i == 1) {
                view = getLayoutInflater().inflate(R.layout.custom_talk2, null);
                TextView name2 = (TextView) view.findViewById(R.id.textViewp5);
                TextView textJ2 = (TextView) view.findViewById(R.id.font_Thai22);
                TextView textE2 = (TextView) view.findViewById(R.id.font_Thai21);
                TextView textT2 = (TextView) view.findViewById(R.id.font_Thai20);
                ImageView img2 = (ImageView) view.findViewById(R.id.imageViewp6);
                name2.setText("ซะกุระ");
                textJ2.setText("今、どこ？");
                textE2.setText("IMA, DOKO?");
                textT2.setText("ตอนนี้อยู่ไหน");
                img2.setImageResource(R.drawable.mascot_4);
            } else if (i == 2) {
                view = getLayoutInflater().inflate(R.layout.custom_talk1, null);
                TextView name1 = (TextView) view.findViewById(R.id.textView5);
                TextView textJ1 = (TextView) view.findViewById(R.id.font_Thai6);
                TextView textE1 = (TextView) view.findViewById(R.id.font_Thai8);
                TextView textT1 = (TextView) view.findViewById(R.id.font_Thai12);
                ImageView img1 = (ImageView) view.findViewById(R.id.imageView6);
                name1.setText("แอนนา");
                textJ1.setText("目の前に郵便局があります。");
                textE1.setText("ME NO MAE NI YÛBINKYOKU GA ARIMASU.");
                textT1.setText("มีที่ทำการไปรษณีย์ข้างหน้าค่ะ");
                img1.setImageResource(R.drawable.mascot_1);
            } else if (i == 3) {
                view = getLayoutInflater().inflate(R.layout.custom_talk2, null);
                TextView name2 = (TextView) view.findViewById(R.id.textViewp5);
                TextView textJ2 = (TextView) view.findViewById(R.id.font_Thai22);
                TextView textE2 = (TextView) view.findViewById(R.id.font_Thai21);
                TextView textT2 = (TextView) view.findViewById(R.id.font_Thai20);
                ImageView img2 = (ImageView) view.findViewById(R.id.imageViewp6);
                name2.setText("ซะกุระ");
                textJ2.setText("分かった。そこにいて。");
                textE2.setText("WAKATTA. SOKO NI ITE.");
                textT2.setText("เข้าใจแล้ว อยู่ที่นั่นแหละ");
                img2.setImageResource(R.drawable.mascot_4);
            }
            return view;
        }


    }

    public class Custom_Unit19 extends BaseAdapter {
        @Override
        public int getCount() {
            return 4;
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
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (i == 0) {
                view = getLayoutInflater().inflate(R.layout.custom_talk2, null);
                TextView name2 = (TextView) view.findViewById(R.id.textViewp5);
                TextView textJ2 = (TextView) view.findViewById(R.id.font_Thai22);
                TextView textE2 = (TextView) view.findViewById(R.id.font_Thai21);
                TextView textT2 = (TextView) view.findViewById(R.id.font_Thai20);
                ImageView img2 = (ImageView) view.findViewById(R.id.imageViewp6);
                name2.setText("โรดริโก");
                textJ2.setText("おーい、アンナさん。");
                textE2.setText("ÔI, ANNA-SAN.");
                textT2.setText("หวัดดี คุณแอนนา");
                img2.setImageResource(R.drawable.mascot_5);
            } else if (i == 1) {
                view = getLayoutInflater().inflate(R.layout.custom_talk1, null);
                TextView name1 = (TextView) view.findViewById(R.id.textView5);
                TextView textJ1 = (TextView) view.findViewById(R.id.font_Thai6);
                TextView textE1 = (TextView) view.findViewById(R.id.font_Thai8);
                TextView textT1 = (TextView) view.findViewById(R.id.font_Thai12);
                ImageView img1 = (ImageView) view.findViewById(R.id.imageView6);
                name1.setText("แอนนา");
                textJ1.setText("みんな。");
                textE1.setText("MINNA.");
                textT1.setText("ทุกคน");
                img1.setImageResource(R.drawable.mascot_1);
            } else if (i == 2) {
                view = getLayoutInflater().inflate(R.layout.custom_talk2, null);
                TextView name2 = (TextView) view.findViewById(R.id.textViewp5);
                TextView textJ2 = (TextView) view.findViewById(R.id.font_Thai22);
                TextView textE2 = (TextView) view.findViewById(R.id.font_Thai21);
                TextView textT2 = (TextView) view.findViewById(R.id.font_Thai20);
                ImageView img2 = (ImageView) view.findViewById(R.id.imageViewp6);
                name2.setText("โรดริโก");
                textJ2.setText("よかった。心配したよ。");
                textE2.setText("YOKATTA. SHINPAI SHITA YO.");
                textT2.setText("ดี เป็นห่วงนะ");
                img2.setImageResource(R.drawable.mascot_5);
            } else if (i == 3) {
                view = getLayoutInflater().inflate(R.layout.custom_talk6, null);
                TextView name1 = (TextView) view.findViewById(R.id.textView5);
                TextView textJ1 = (TextView) view.findViewById(R.id.font_Thai6);
                TextView textE1 = (TextView) view.findViewById(R.id.font_Thai8);
                TextView textT1 = (TextView) view.findViewById(R.id.font_Thai12);
                ImageView img1 = (ImageView) view.findViewById(R.id.imageView6);
                name1.setText("ซะกุระ");
                textJ1.setText("ごめんなさい。\n" +
                        "カメラが安かったので、つい見てしまいました。");
                textE1.setText("GOMENNASAI. \n" +
                        "KAMERA GA YASUKATTA NODE, TSUI MITE SHIMAIMASHITA.");
                textT1.setText("ขอโทษค่ะ กล้องราคาถูก ก็เลยเผลอดูไปค่ะ");
                img1.setImageResource(R.drawable.mascot_4);
            }
            return view;
        }
    }

    public class Custom_Unit20 extends BaseAdapter {
        @Override
        public int getCount() {
            return 4;
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
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (i == 0) {
                view = getLayoutInflater().inflate(R.layout.custom_talk7, null);
            } else if (i == 1) {
                view = getLayoutInflater().inflate(R.layout.custom_talk1, null);
                TextView name1 = (TextView) view.findViewById(R.id.textView5);
                TextView textJ1 = (TextView) view.findViewById(R.id.font_Thai6);
                TextView textE1 = (TextView) view.findViewById(R.id.font_Thai8);
                TextView textT1 = (TextView) view.findViewById(R.id.font_Thai12);
                ImageView img1 = (ImageView) view.findViewById(R.id.imageView6);
                name1.setText("แอนนา");
                textJ1.setText("はい、あります。");
                textE1.setText("HAI, ARIMASU.");
                textT1.setText("ค่ะ เคยค่ะ");
                img1.setImageResource(R.drawable.mascot_1);
            } else if (i == 2) {
                view = getLayoutInflater().inflate(R.layout.custom_talk2, null);
                TextView name2 = (TextView) view.findViewById(R.id.textViewp5);
                TextView textJ2 = (TextView) view.findViewById(R.id.font_Thai22);
                TextView textE2 = (TextView) view.findViewById(R.id.font_Thai21);
                TextView textT2 = (TextView) view.findViewById(R.id.font_Thai20);
                ImageView img2 = (ImageView) view.findViewById(R.id.imageViewp6);
                name2.setText("ซะกุระ");
                textJ2.setText("どんな曲が得意？");
                textE2.setText("DONNA KYOKU GA TOKUI?");
                textT2.setText("ถนัดเพลงแบบไหน");
                img2.setImageResource(R.drawable.mascot_4);
            } else if (i == 3) {
                view = getLayoutInflater().inflate(R.layout.custom_talk1, null);
                TextView name1 = (TextView) view.findViewById(R.id.textView5);
                TextView textJ1 = (TextView) view.findViewById(R.id.font_Thai6);
                TextView textE1 = (TextView) view.findViewById(R.id.font_Thai8);
                TextView textT1 = (TextView) view.findViewById(R.id.font_Thai12);
                ImageView img1 = (ImageView) view.findViewById(R.id.imageView6);
                name1.setText("แอนนา");
                textJ1.setText("アニメの曲です。");
                textE1.setText("ANIME NO KYOKU DESU.");
                textT1.setText("เพลงอะนิเมะค่ะ");
                img1.setImageResource(R.drawable.mascot_1);
            }
            return view;
        }
    }
}

