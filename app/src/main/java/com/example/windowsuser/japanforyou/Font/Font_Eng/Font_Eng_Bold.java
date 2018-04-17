package com.example.windowsuser.japanforyou.Font.Font_Eng;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Windows User on 28/5/2560.
 */

public class Font_Eng_Bold extends TextView {
    public Font_Eng_Bold(Context context) {
        super(context);
        font();
    }

    public Font_Eng_Bold(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        font();
    }

    public Font_Eng_Bold(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        font();
    }

    public Font_Eng_Bold(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        font();
    }
    private void font(){
        Typeface typeface = Typeface.createFromAsset(getContext().getAssets(), "TH Kodchasal Bold.ttf");
        setTypeface(typeface);
    }
}
