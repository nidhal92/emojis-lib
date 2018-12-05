package ni.com.emojis;


import android.os.Bundle;

import com.ni.emojis_library.controller.WhatsAppPanel;
import com.ni.emojis_library.model.layout.EmojiCompatActivity;
import com.ni.emojis_library.model.layout.WhatsAppPanelEventListener;


public class MainActivity extends EmojiCompatActivity implements WhatsAppPanelEventListener {
    private WhatsAppPanel mBottomPanel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.mBottomPanel = new WhatsAppPanel(this, this,R.color.colorPrimaryWhatsApp);
    }


    @Override
    public void onSendClicked() {

    }
}
