package com.ni.emojis_library.model.layout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class EmojiCompatActivity extends AppCompatActivity {

    private OnBackPressedListener mOnBackPressedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onBackPressed() {
        if (this.mOnBackPressedListener != null) {
            if (!this.mOnBackPressedListener.onBackPressed()) {
                super.onBackPressed();
            }
        } else {
            super.onBackPressed();
        }
    }

    public void setOnBackPressed(OnBackPressedListener backListener) {
        this.mOnBackPressedListener = backListener;
    }

    public interface OnBackPressedListener {
        Boolean onBackPressed();
    }
}
