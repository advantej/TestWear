package com.advantej.mobile.android.testwear;

import android.app.Activity;
import android.os.Bundle;
import android.support.wearable.view.WatchViewStub;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class MyWearActivity extends Activity {

    private TextView mTextView;
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_wear);
        final WatchViewStub stub = (WatchViewStub) findViewById(R.id.watch_view_stub);
        stub.setOnLayoutInflatedListener(new WatchViewStub.OnLayoutInflatedListener() {
            @Override
            public void onLayoutInflated(WatchViewStub stub) {
                mTextView = (TextView) stub.findViewById(R.id.text);
                mImageView = (ImageView) stub.findViewById(R.id.image);

                loadImage();
            }
        });
    }

    private void loadImage() {
        //System rejects any network connections from the wearable
//        String imageUrl = "http://crackberry.com/sites/crackberry.com/files/styles/large/public/topic_images/2013/ANDROID.png";
//        Picasso.with(this).load(imageUrl).into(mImageView);
    }
}
