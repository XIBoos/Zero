package com.will.activity;

import android.content.Intent;

import android.os.Bundle;

import com.will.zero.R;

public class InitActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_init);
        startActivity(new Intent(this,LoginActivity.class));
    }
}
