package com.example.jstauffer.bloomcoffeeassistant.ui.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;

/**
 * Created by jstauffer on 11/23/16.
 */

public class CustomImgBtn extends Button{
    public CustomImgBtn(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public CustomImgBtn(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CustomImgBtn(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/Ultra.ttf");
            setTypeface(tf);
        }
    }

}
