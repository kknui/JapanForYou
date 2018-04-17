package com.example.windowsuser.japanforyou;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class VocabularyActivity extends AppCompatActivity {

    private int id;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocabulary);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar15);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        toolbar.setTitle("คำศัพท์");
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        Intent intent = getIntent();
        id = intent.getIntExtra("id", 0);
        listView = (ListView) findViewById(R.id.lisy);
        if (id == 1) {
            listView.setAdapter(new Custom_Unit01());
        }
        if (id == 2) {
            listView.setAdapter(new Custom_Unit02());
        }
        if (id == 3) {
            listView.setAdapter(new Custom_Unit03());
        }
        if (id == 4) {
            listView.setAdapter(new Custom_Unit04());
        }
        if (id == 5) {
            listView.setAdapter(new Custom_Unit05());
        }
        if (id == 6) {
            listView.setAdapter(new Custom_Unit06());
        }
        if (id == 7) {
            listView.setAdapter(new Custom_Unit07());
        }
        if (id == 8) {
            listView.setAdapter(new Custom_Unit08());
        }
        if (id == 9) {
            listView.setAdapter(new Custom_Unit09());
        }
        if (id == 10) {
            listView.setAdapter(new Custom_Unit010());
        }
        if (id == 11) {
            listView.setAdapter(new Custom_Unit011());
        }
        if (id == 12) {
            listView.setAdapter(new Custom_Unit012());
        }
        if (id == 13) {
            listView.setAdapter(new Custom_Unit013());
        }
        if (id == 14) {
            listView.setAdapter(new Custom_Unit014());
        }
        if (id == 15) {
            listView.setAdapter(new Custom_Unit015());
        }
        if (id == 16) {
            listView.setAdapter(new Custom_Unit016());
        }
        if (id == 17) {
            listView.setAdapter(new Custom_Unit017());
        }
        if (id == 18) {
            listView.setAdapter(new Custom_Unit018());
        }
        if (id == 19) {
            listView.setAdapter(new Custom_Unit019());
        }
        if (id == 20) {
            listView.setAdapter(new Custom_Unit020());
        }
    }

    public class Custom_Unit01 extends BaseAdapter {
        String[] TextJ = {"私", " ", "先生", "学生", "会社員", "銀行員", "医者", "大学", "はい", "いいえ"};
        String[] TextJSup = {"わたし", " ", "せんせい", "がくせい", "かいしゃいん", "ぎんこういん", "いしゃ", "だいがく", " ", " "};
        String[] TextR = {"Watashi", " ", "Sensei", "Gakusei", "Kaishain", "Ginkouin", "isha", "daigaku", "hai", "iie"};
        String[] TextThai = {"ผม,ดิฉัน", " ", "คุณครู,อาจารย์", "นักเรียน,นักศึกษา", "พนักงานบริษัท", "พนักงานธนาคาร", "หมอ, แพทย์", "มหาวิทยาลัย", "ใช่, ครับ/ค่ะ", "ไม่ใช่, เปล่า"};

        @Override
        public int getCount() {
            return TextJ.length;
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
            if (i == 1) {
                view = getLayoutInflater().inflate(R.layout.custom_vocabulary1, null);
            } else {
                view = getLayoutInflater().inflate(R.layout.custom_vocabulary, null);
                TextView TextJ1 = (TextView) view.findViewById(R.id.textView11);
                TextView TextJSup1 = (TextView) view.findViewById(R.id.textView12);
                TextView TextR1 = (TextView) view.findViewById(R.id.TextRomanji);
                TextView TextThai1 = (TextView) view.findViewById(R.id.TextThai);
                TextJ1.setText(TextJ[i]);
                TextJSup1.setText(TextJSup[i]);
                TextR1.setText(TextR[i]);
                TextThai1.setText(TextThai[i]);
                if (i == 3) {
                    TextThai1.setTextSize(20);
                } else if (i == 5) {
                    TextThai1.setTextSize(20);
                }
            }
            return view;
        }

    }
    public class Custom_Unit02 extends BaseAdapter {
        String[] TextJ = {"これ", "それ", "あれ", "このー", "そのー", "あのー", "本", "英語", "日本語", "何"};
        String[] TextJSup = {" ", " ", " ", " ", " ", " ", "ほん", "えいご", "にほんご", "なん"};
        String[] TextR = {"kore", "sore", "are", "kono-", "sono-", "ano-", "hon", "eigo", "nihongo", "nan"};
        String[] TextThai = {"นี่, สิ่งนี้", "นั่น, สิ่งนั้น", "โน่น, สิ่งโน้น", "~นี้, ~ที่อยู่ตรงนี้", "~นั้น", "~โน้น", "หนังสือ", "ภาษาอังกฤษ", "ภาษาญี่ปุ่น", "อะไร"};

        @Override
        public int getCount() {
            return TextJ.length;
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
            view = getLayoutInflater().inflate(R.layout.custom_vocabulary, null);
            TextView TextJ1 = (TextView) view.findViewById(R.id.textView11);
            TextView TextJSup1 = (TextView) view.findViewById(R.id.textView12);
            TextView TextR1 = (TextView) view.findViewById(R.id.TextRomanji);
            TextView TextThai1 = (TextView) view.findViewById(R.id.TextThai);
            TextJ1.setText(TextJ[i]);
            TextJSup1.setText(TextJSup[i]);
            TextR1.setText(TextR[i]);
            TextThai1.setText(TextThai[i]);
            return view;
        }
    }
    public class Custom_Unit03 extends BaseAdapter {
        String[] TextJ = {"ここ", "そこ", "あそこ", "どこ", "こちら", "そちら", "あちら", "だちら", "すみません。", "いくら"};
        String[] TextThai = {"ที่นี่, ตรงนั้น", "ที่นั่น, ตรงนั้น", "ที่โน่น, ตรงโน้น", "ที่ไหน, ตรงไหน", "ทางนี้, ตรงนี้", "ทางนั้น, ตรงนั้น", "ทางโน้น, ตรงโน้น", "ทางไหน, ที่ไหน", "ขอโทษ", "ราคาเท่าไร"};

        @Override
        public int getCount() {
            return TextJ.length;
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
            view = getLayoutInflater().inflate(R.layout.custom_vocabulary, null);
            TextView TextJ1 = (TextView) view.findViewById(R.id.textView11);
            TextView TextJSup1 = (TextView) view.findViewById(R.id.textView12);
            TextView TextR1 = (TextView) view.findViewById(R.id.TextRomanji);
            TextView TextThai1 = (TextView) view.findViewById(R.id.TextThai);
            TextJ1.setText(TextJ[i]);
            TextJSup1.setText(" ");
            TextR1.setText(" ");
            TextThai1.setText(TextThai[i]);
            return view;
        }
    }
    public class Custom_Unit04 extends BaseAdapter {
        String[] TextJ = {"－時", "－ふん", "ごぜん", "ごご", "朝", "昼", "晩", "今日", "明日", "きのう"};
        String[] TextJSup = {"－じ", "      ", "     ", "   ", "あさ", "ひる", "ばん", "きょう", "あした", " "};
        String[] TextThai = {"โมง, นาฬิกา", "นาที", "a.m.,ช่วงเช้า", "p.m.,ช่วงบ่าย", "เช้า", "กลางวัน, เที่ยง", "เย็น, กลางคืน", "วันนี้", "พรุ่งนี้", "เมื่อวาน"};

        @Override
        public int getCount() {
            return TextJ.length;
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
            view = getLayoutInflater().inflate(R.layout.custom_vocabulary, null);
            TextView TextJ1 = (TextView) view.findViewById(R.id.textView11);
            TextView TextJSup1 = (TextView) view.findViewById(R.id.textView12);
            TextView TextR1 = (TextView) view.findViewById(R.id.TextRomanji);
            TextView TextThai1 = (TextView) view.findViewById(R.id.TextThai);
            TextJ1.setText(TextJ[i]);
            TextJSup1.setText(TextJSup[i]);
            TextR1.setText(" ");
            TextThai1.setText(TextThai[i]);

            return view;
        }
    }
    public class Custom_Unit05 extends BaseAdapter {
        String[] TextJ = {"生きます", "来ます", "帰ります",      "学校",     "飛行機",  "電車",      "人",   "友達",     "いつ", "どう　いたしまして。"};
        String[] TextJSup = {"いきます", "きます", "かえります", "がっこう", "ひこうき", "でんしゃ",  "ひと", "ともだち", " ", " "};
        String[] TextThai = {"ไป ", "มา", "กลับ",                  "โรงเรียน",    "เครื่องบิน"   , "รถไฟฟ้า ",      "คน",  "เพื่อน",      "เมื่อไร", "ไม่เป็นไร"};

        @Override
        public int getCount() {
            return TextJ.length;
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
            view = getLayoutInflater().inflate(R.layout.custom_vocabulary, null);
            TextView TextJ1 = (TextView) view.findViewById(R.id.textView11);
            TextView TextJSup1 = (TextView) view.findViewById(R.id.textView12);
            TextView TextR1 = (TextView) view.findViewById(R.id.TextRomanji);
            TextView TextThai1 = (TextView) view.findViewById(R.id.TextThai);
            TextJ1.setText(TextJ[i]);
            TextJSup1.setText(TextJSup[i]);
            TextR1.setText(" ");
            TextThai1.setText(TextThai[i]);
            return view;
        }
    }
    public class Custom_Unit06 extends BaseAdapter {
        String[] TextJ = {"食べます","飲みます","吸います","見ます","聞きます","読みます","します","朝ごはん","昼ごはん","晩ご飯"};
        String[] TextJSup = {"たべます","のみます","すいます","みます","ききます","よみます"," ","あさごはん","ひるごはん","ばんごはん"};
        String[] TextThai = {"กิน, รับประทาน","ดื่ม","สูบ,(บุหรี่)","ดู (ภาพยนตร์ ฯลฯ)","ฟัง","อ่าน","ทำ,กระทำ","อาหารเช้า","อาหารกลางวัน","อาหารเย็น"};

        @Override
        public int getCount() {
            return TextJ.length;
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
            view = getLayoutInflater().inflate(R.layout.custom_vocabulary, null);
            TextView TextJ1 = (TextView) view.findViewById(R.id.textView11);
            TextView TextJSup1 = (TextView) view.findViewById(R.id.textView12);
            TextView TextR1 = (TextView) view.findViewById(R.id.TextRomanji);
            TextView TextThai1 = (TextView) view.findViewById(R.id.TextThai);
            TextJ1.setText(TextJ[i]);
            TextJSup1.setText(TextJSup[i]);
            TextR1.setText(" ");
            TextThai1.setText(TextThai[i]);
            return view;
        }
    }
    public class Custom_Unit07 extends BaseAdapter {
        String[] TextJ = {"パン","卵","肉","魚","野菜","果物","水","映画","店"};
        String[] TextJSup = {" ","たまご","にく","さかな","やさい","くだもの","みず","えいが","みせ"};
        String[] TextThai = {"ขนมปัง","ไข่","เนื้อ(วัว,หมู,ไก่)","ปลา","ผัก","ผลไม้","น้ำ","ภาพยนตร์","ร้าน,ร้านค้า"};

        @Override
        public int getCount() {
            return TextJ.length;
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
            view = getLayoutInflater().inflate(R.layout.custom_vocabulary, null);
            TextView TextJ1 = (TextView) view.findViewById(R.id.textView11);
            TextView TextJSup1 = (TextView) view.findViewById(R.id.textView12);
            TextView TextR1 = (TextView) view.findViewById(R.id.TextRomanji);
            TextView TextThai1 = (TextView) view.findViewById(R.id.TextThai);
            TextJ1.setText(TextJ[i]);
            TextJSup1.setText(TextJSup[i]);
            TextR1.setText(" ");
            TextThai1.setText(TextThai[i]);
            return view;
        }
    }
    public class Custom_Unit08 extends BaseAdapter {
        String[] TextJ = {"庭","お花見","何","いつも","切ります","送ります","上げます","もらいます","教えます","習います"};
        String[] TextJSup = {"にわ","（お）はなみ","なに"," ","きります","おくります","あげます"," ","おしえます","ならいます"};
        String[] TextThai = {"สวน","ดูดอกซากุระ","อะไร","เสมอๆ","ตัด","ส่ง(ของ,โทรสาร ฯลฯ)","ให้","ได้รับ","สอน","เรียน(โดยมีผู้สอน)"};

        @Override
        public int getCount() {
            return TextJ.length;
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
            view = getLayoutInflater().inflate(R.layout.custom_vocabulary, null);
            TextView TextJ1 = (TextView) view.findViewById(R.id.textView11);
            TextView TextJSup1 = (TextView) view.findViewById(R.id.textView12);
            TextView TextR1 = (TextView) view.findViewById(R.id.TextRomanji);
            TextView TextThai1 = (TextView) view.findViewById(R.id.TextThai);
            TextJ1.setText(TextJ[i]);
            TextJSup1.setText(TextJSup[i]);
            TextR1.setText(" ");
            TextThai1.setText(TextThai[i]);
            return view;
        }
    }
    public class Custom_Unit09 extends BaseAdapter {
        String[] TextJ = {"スプーン","ナイフ","フォーク","紙","花","プレゼント","お金","父","母"};
        String[] TextJSup = {" "," "," ","かみ","はな"," ","おかね","ちち","はは"};
        String[] TextThai = {"ช้อน","มีด","ส้อม","กระดาษ","ดอกไม้","ของขวัญ","เงิน","พ่อ(ของฉัน)","แม่(ของฉัน)"};

        @Override
        public int getCount() {
            return TextJ.length;
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
            view = getLayoutInflater().inflate(R.layout.custom_vocabulary, null);
            TextView TextJ1 = (TextView) view.findViewById(R.id.textView11);
            TextView TextJSup1 = (TextView) view.findViewById(R.id.textView12);
            TextView TextR1 = (TextView) view.findViewById(R.id.TextRomanji);
            TextView TextThai1 = (TextView) view.findViewById(R.id.TextThai);
            TextJ1.setText(TextJ[i]);
            TextJSup1.setText(TextJSup[i]);
            TextR1.setText(" ");
            TextThai1.setText(TextThai[i]);
            return view;
        }
    }
    public class Custom_Unit010 extends BaseAdapter {
        String[] TextJ = {"ハンサム","きれい","しずか","有名","親切","元気","便利","すてき","大きい"};
        String[] TextJSup = {" "," "," ","ゆうめい","しんせつ","げんき","べんり"," ","おおきい"};
        String[] TextThai = {"หล่อ","สวย","เงียบ,เงียบสงบ","มีชื่อเสียง","ใจดี, โอบอ้อมอารี","แข็งแรง","สะดวก","ดูดี","ใหญ่, โต"};

        @Override
        public int getCount() {
            return TextJ.length;
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
            view = getLayoutInflater().inflate(R.layout.custom_vocabulary, null);
            TextView TextJ1 = (TextView) view.findViewById(R.id.textView11);
            TextView TextJSup1 = (TextView) view.findViewById(R.id.textView12);
            TextView TextR1 = (TextView) view.findViewById(R.id.TextRomanji);
            TextView TextThai1 = (TextView) view.findViewById(R.id.TextThai);
            TextJ1.setText(TextJ[i]);
            TextJSup1.setText(TextJSup[i]);
            TextR1.setText(" ");
            TextThai1.setText(TextThai[i]);
            return view;
        }
    }
    public class Custom_Unit011 extends BaseAdapter {
        String[] TextJ = {"小さい","新しい","古い","いい","悪い","暑い","寒い","難しい","優しい"};
        String[] TextJSup = {"ちいさい","あたらしい","ふるい"," ","わるい","あつい","さむい","むずかしい","やさしい"};
        String[] TextThai = {"เล็ก","ใหม่","เก่า","ดี","เลว, ไม่ดี","(อากาศ)ร้อน","(อากาศ)หนาว","ยาก","ง่าย"};

        @Override
        public int getCount() {
            return TextJ.length;
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
            view = getLayoutInflater().inflate(R.layout.custom_vocabulary, null);
            TextView TextJ1 = (TextView) view.findViewById(R.id.textView11);
            TextView TextJSup1 = (TextView) view.findViewById(R.id.textView12);
            TextView TextR1 = (TextView) view.findViewById(R.id.TextRomanji);
            TextView TextThai1 = (TextView) view.findViewById(R.id.TextThai);
            TextJ1.setText(TextJ[i]);
            TextJSup1.setText(TextJSup[i]);
            TextR1.setText(" ");
            TextThai1.setText(TextThai[i]);
            return view;
        }
    }
    public class Custom_Unit012 extends BaseAdapter {
        String[] TextJ = {"分かります","あります","すき","きらい","上手","へた","スポーツ","野球"};
        String[] TextJSup = {"わかります"," "," "," ","じょうず"," "," ","やきゅう"};
        String[] TextThai = {"เข้าใจ,รู้","มี (อยู่ในครอบครอง)","ชอบ","ไม่ชอบ","เก่ง,ชำนาญ","ไม่เก่ง,ไม่ถนัด","กีฬา","เบสบอล"};

        @Override
        public int getCount() {
            return TextJ.length;
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
            view = getLayoutInflater().inflate(R.layout.custom_vocabulary, null);
            TextView TextJ1 = (TextView) view.findViewById(R.id.textView11);
            TextView TextJSup1 = (TextView) view.findViewById(R.id.textView12);
            TextView TextR1 = (TextView) view.findViewById(R.id.TextRomanji);
            TextView TextThai1 = (TextView) view.findViewById(R.id.TextThai);
            TextJ1.setText(TextJ[i]);
            TextJSup1.setText(TextJSup[i]);
            TextR1.setText(" ");
            TextThai1.setText(TextThai[i]);
            return view;
        }
    }
    public class Custom_Unit013 extends BaseAdapter {
        String[] TextJ = {"ダンス","音楽","歌","絵","字","ひらがな","カタカナ","時間","約束"};
        String[] TextJSup = {" ","おんがく","うた","え","じ"," "," ","じかん","やくそく"};
        String[] TextThai = {"การเต้นรำ","ดนตรี","เพลง","รูปภาพ","ตัวหนังสือ,ตัวอักษร","อักษรฮิรางานะ","อักษรคาตากานะ","เวลา","นัด,สัญญา"};

        @Override
        public int getCount() {
            return TextJ.length;
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
            view = getLayoutInflater().inflate(R.layout.custom_vocabulary, null);
            TextView TextJ1 = (TextView) view.findViewById(R.id.textView11);
            TextView TextJSup1 = (TextView) view.findViewById(R.id.textView12);
            TextView TextR1 = (TextView) view.findViewById(R.id.TextRomanji);
            TextView TextThai1 = (TextView) view.findViewById(R.id.TextThai);
            TextJ1.setText(TextJ[i]);
            TextJSup1.setText(TextJSup[i]);
            TextR1.setText(" ");
            TextThai1.setText(TextThai[i]);
            return view;
        }
    }
    public class Custom_Unit014 extends BaseAdapter {
        String[] TextJ = {"よく","だいたい","たくさん","すこし","ぜんぜん","早く","ーから","どうして","ざんねんです"};
        String[] TextJSup = {" "," "," "," "," ","はやく"," "," "," "};
        String[] TextThai = {"ดี,อย่างดี","โดยมาก,ส่วนมาก","มาก","นิดหน่อย","ไม่ ~เลย","เร็ว,ไว","เพราะว่า~","ทำไม","น่าเสียดาย"};

        @Override
        public int getCount() {
            return TextJ.length;
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
            view = getLayoutInflater().inflate(R.layout.custom_vocabulary, null);
            TextView TextJ1 = (TextView) view.findViewById(R.id.textView11);
            TextView TextJSup1 = (TextView) view.findViewById(R.id.textView12);
            TextView TextR1 = (TextView) view.findViewById(R.id.TextRomanji);
            TextView TextThai1 = (TextView) view.findViewById(R.id.TextThai);
            TextJ1.setText(TextJ[i]);
            TextJSup1.setText(TextJSup[i]);
            TextR1.setText(" ");
            TextThai1.setText(TextThai[i]);
            return view;
        }
    }
    public class Custom_Unit015 extends BaseAdapter {
        String[] TextJ = {"います","あります","いろいろ","犬","猫","木","物","テーブル"};
        String[] TextJSup = {" "," "," ","いぬ","ねこ","き","もの"," "};
        String[] TextThai = {"อยู่","มี,อยู่","ต่างๆ มากมาย","สุนัข","เเมว","ต้นไม้, ไม้","สิ่งของ","โต๊ะ"};

        @Override
        public int getCount() {
            return TextJ.length;
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
            view = getLayoutInflater().inflate(R.layout.custom_vocabulary, null);
            TextView TextJ1 = (TextView) view.findViewById(R.id.textView11);
            TextView TextJSup1 = (TextView) view.findViewById(R.id.textView12);
            TextView TextR1 = (TextView) view.findViewById(R.id.TextRomanji);
            TextView TextThai1 = (TextView) view.findViewById(R.id.TextThai);
            TextJ1.setText(TextJ[i]);
            TextJSup1.setText(TextJSup[i]);
            TextR1.setText(" ");
            TextThai1.setText(TextThai[i]);
            return view;
        }
    }
    public class Custom_Unit016 extends BaseAdapter {
        String[] TextJ = {"小さい","新しい","古い","いい","悪い","暑い","寒い","難しい","優しい"};
        String[] TextJSup = {"ちいさい","あたらしい","ふるい"," ","わるい","あつい","さむい","むずかしい","やさしい"};
        String[] TextThai = {"เล็ก","ใหม่","เก่า","ดี","เลว, ไม่ดี","(อากาศ)ร้อน","(อากาศ)หนาว","ยาก","ง่าย"};

        @Override
        public int getCount() {
            return TextJ.length;
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
            view = getLayoutInflater().inflate(R.layout.custom_vocabulary, null);
            TextView TextJ1 = (TextView) view.findViewById(R.id.textView11);
            TextView TextJSup1 = (TextView) view.findViewById(R.id.textView12);
            TextView TextR1 = (TextView) view.findViewById(R.id.TextRomanji);
            TextView TextThai1 = (TextView) view.findViewById(R.id.TextThai);
            TextJ1.setText(TextJ[i]);
            TextJSup1.setText(TextJSup[i]);
            TextR1.setText(" ");
            TextThai1.setText(TextThai[i]);
            return view;
        }
    }
    public class Custom_Unit017 extends BaseAdapter {
        String[] TextJ = {"外国","ー時間","ー週間","－ヶ月","ーねん","ーぐらい","どのくらい","ぜんぶで","みんな"};
        String[] TextJSup = {"がいこく","ーじかん","ーしゅうかん","ーかげつ"," "," "," "," "," "};
        String[] TextThai = {"ต่างประเทศ","ชั่วโมง","สัปดาห์","เดือน","ปี","ประมาณ~,ราว~","สักเท่าไร","รวมทั้งหมดเป็น...","ทั้งหมด, ทุกอย่าง"};

        @Override
        public int getCount() {
            return TextJ.length;
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
            view = getLayoutInflater().inflate(R.layout.custom_vocabulary, null);
            TextView TextJ1 = (TextView) view.findViewById(R.id.textView11);
            TextView TextJSup1 = (TextView) view.findViewById(R.id.textView12);
            TextView TextR1 = (TextView) view.findViewById(R.id.TextRomanji);
            TextView TextThai1 = (TextView) view.findViewById(R.id.TextThai);
            TextJ1.setText(TextJ[i]);
            TextJSup1.setText(TextJSup[i]);
            TextR1.setText(" ");
            TextThai1.setText(TextThai[i]);
            return view;
        }
    }
    public class Custom_Unit018 extends BaseAdapter {
        String[] TextJ = {"ーだけ","かんたん","近い","遠い","早い","遅い","多い","少ない"};
        String[] TextJSup = {" "," ","ちかい","とおい","はやい","おそい","おおい","すくない"};
        String[] TextThai = {"เพียง~เท่านั้น","ไม่ซับซ้อน","ใกล้","ไกล","เร็ว,ไว","ช้า,สาย","(คน)มาก,เยอะ","(คน) น้อย"};

        @Override
        public int getCount() {
            return TextJ.length;
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
            view = getLayoutInflater().inflate(R.layout.custom_vocabulary, null);
            TextView TextJ1 = (TextView) view.findViewById(R.id.textView11);
            TextView TextJSup1 = (TextView) view.findViewById(R.id.textView12);
            TextView TextR1 = (TextView) view.findViewById(R.id.TextRomanji);
            TextView TextThai1 = (TextView) view.findViewById(R.id.TextThai);
            TextJ1.setText(TextJ[i]);
            TextJSup1.setText(TextJSup[i]);
            TextR1.setText(" ");
            TextThai1.setText(TextThai[i]);
            return view;
        }
    }
    public class Custom_Unit019 extends BaseAdapter {
        String[] TextJ = {"ーだけ","かんたん","近い","遠い","早い","遅い","多い","少ない"};
        String[] TextJSup = {" "," ","ちかい","とおい","はやい","おそい","おおい","すくない"};
        String[] TextThai = {"เพียง~เท่านั้น","ไม่ซับซ้อน","ใกล้","ไกล","เร็ว,ไว","ช้า,สาย","(คน)มาก,เยอะ","(คน) น้อย"};

        @Override
        public int getCount() {
            return TextJ.length;
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
            view = getLayoutInflater().inflate(R.layout.custom_vocabulary, null);
            TextView TextJ1 = (TextView) view.findViewById(R.id.textView11);
            TextView TextJSup1 = (TextView) view.findViewById(R.id.textView12);
            TextView TextR1 = (TextView) view.findViewById(R.id.TextRomanji);
            TextView TextThai1 = (TextView) view.findViewById(R.id.TextThai);
            TextJ1.setText(TextJ[i]);
            TextJSup1.setText(TextJSup[i]);
            TextR1.setText(" ");
            TextThai1.setText(TextThai[i]);
            return view;
        }
    }
    public class Custom_Unit020 extends BaseAdapter {
        String[] TextJ = {"スプーン","ナイフ","フォーク","紙","花","プレゼント","お金","父","母"};
        String[] TextJSup = {" "," "," ","かみ","はな"," ","おかね","ちち","はは"};
        String[] TextThai = {"ช้อน","มีด","ส้อม","กระดาษ","ดอกไม้","ของขวัญ","เงิน","พ่อ(ของฉัน)","แม่(ของฉัน)"};

        @Override
        public int getCount() {
            return TextJ.length;
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
            view = getLayoutInflater().inflate(R.layout.custom_vocabulary, null);
            TextView TextJ1 = (TextView) view.findViewById(R.id.textView11);
            TextView TextJSup1 = (TextView) view.findViewById(R.id.textView12);
            TextView TextR1 = (TextView) view.findViewById(R.id.TextRomanji);
            TextView TextThai1 = (TextView) view.findViewById(R.id.TextThai);
            TextJ1.setText(TextJ[i]);
            TextJSup1.setText(TextJSup[i]);
            TextR1.setText(" ");
            TextThai1.setText(TextThai[i]);
            return view;
        }
    }
}
