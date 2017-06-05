package com.bebrayan.com.basiclayout;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         ImageView header = (ImageView) findViewById(R.id.header);
        Glide.with(this).load(R.drawable.singapore).diskCacheStrategy(DiskCacheStrategy.ALL).centerCrop().into(header);

    }
}
