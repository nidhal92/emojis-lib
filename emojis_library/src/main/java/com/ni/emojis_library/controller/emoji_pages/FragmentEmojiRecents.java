package com.ni.emojis_library.controller.emoji_pages;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.ni.emojis_library.R;
import com.ni.emojis_library.adapter.EmojiAdapter;
import com.ni.emojis_library.controller.FragmentEmoji;
import com.ni.emojis_library.model.Emoji;
import com.ni.emojis_library.util.Constants;

import java.util.ArrayList;
import java.util.List;


public class FragmentEmojiRecents extends FragmentEmoji implements FragmentEmoji.RecentListener {

    public static final String TAG = "FragmentEmojiRecents";

    private View mRootView;
    private GridView mGridView;
    private List<Emoji> mData;
    private EmojiAdapter mAdapter;
    private boolean mUseSystemDefault = false;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater,container,savedInstanceState);
        this.mRootView = inflater.inflate(R.layout.frag_emoji_recents, container, false);
        return this.mRootView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        this.mGridView = (GridView) view.findViewById(R.id.Emoji_GridView);
        Bundle bundle = getArguments();

        if (bundle == null) {
            this.mData = mRecentEmojisManager.getRecentEmojis();
            this.mUseSystemDefault = false;
        } else {
            Parcelable[] parcels = bundle.getParcelableArray(Constants.EMOJI_KEY);

            this.mData = new ArrayList<>();

            for (int i = 0; i < parcels.length; i++) {
                this.mData.add((Emoji) parcels[i]);
            }

            this.mUseSystemDefault = bundle.getBoolean(Constants.USE_SYSTEM_DEFAULT_KEY);
        }
        if (null != mData && mData.size() > 0) {
            mAdapter = new EmojiAdapter(view.getContext(), this.mData, this.mUseSystemDefault);
            this.mGridView.setAdapter(mAdapter);
            this.mGridView.setOnItemClickListener(this);
        }



    }

    @Override
    public void notifyEmojiAdded() {
        if(mAdapter!=null)
            mAdapter.notifyDataSetChanged();
    }
}
