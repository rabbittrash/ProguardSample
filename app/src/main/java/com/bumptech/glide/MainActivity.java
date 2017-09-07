package com.bumptech.glide;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.BitmapRequestBuilder;
import com.bumptech.glide.BitmapTypeRequest;
import com.meituan.android.proguardsample.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BitmapRequestBuilder bitmapRequestBuilder = new BitmapTypeRequest(null, null, null, null);
        bitmapRequestBuilder.transform(null);
        bitmapRequestBuilder.applyCenterCrop();
        System.err.println("------------------------started");
        ImageView imageView = (ImageView) findViewById(R.id.imageview);

        Glide.with(this).load("http://goo.gl/gEgYUd").into(imageView);
    }
}
