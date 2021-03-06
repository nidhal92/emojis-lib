package com.ni.emojis_library.model.layout;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import com.ni.emojis_library.R;




public class TelegramPanel extends LinearLayout {

    private static final String TAG = "EmojiKeyboardLayout";

    // CONSTRUCTORS
    public TelegramPanel(Context context) {
        super(context);
        init(context);
    }

    public TelegramPanel(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public TelegramPanel(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public TelegramPanel(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context);
    }

    // INITIALIZATIONS
    private void init(Context context) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.rsc_telegram_panel, this, true);
    }

}
