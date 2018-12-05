package ni.com.emojis;


import android.os.Bundle;

import com.ni.emojis_library.controller.TelegramPanel;
import com.ni.emojis_library.model.layout.EmojiCompatActivity;

import com.ni.emojis_library.model.layout.TelegramPanelEventListener;


public class MainActivity extends EmojiCompatActivity implements TelegramPanelEventListener {
    private TelegramPanel mBottomPanel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.mBottomPanel = new TelegramPanel(this, this);
    }

    @Override
    public void onAttachClicked() {

    }

    @Override
    public void onMicClicked() {

    }

    @Override
    public void onSendClicked() {

    }
}
