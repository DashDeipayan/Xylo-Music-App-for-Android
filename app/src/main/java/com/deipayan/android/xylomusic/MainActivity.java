package com.deipayan.android.xylomusic;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    private int mCSound;
    private int mDSound;
    private int mESound;
    private int mFSound;
    private int mGSound;
    private int mASound;
    private int mBSound;
    SoundPool mSoundpool;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mSoundpool = new SoundPool(7, AudioManager.STREAM_MUSIC, 0);

        mCSound = mSoundpool.load(getApplicationContext(), R.raw.note1_c, 1);
        mDSound = mSoundpool.load(getApplicationContext(), R.raw.note2_d, 1);
        mESound = mSoundpool.load(getApplicationContext(), R.raw.note3_e, 1);
        mFSound = mSoundpool.load(getApplicationContext(), R.raw.note4_f, 1);
        mGSound = mSoundpool.load(getApplicationContext(), R.raw.note5_g, 1);
        mASound = mSoundpool.load(getApplicationContext(), R.raw.note6_a, 1);
        mBSound = mSoundpool.load(getApplicationContext(), R.raw.note7_b, 1);
    }

    public void playC(View view) {
        mSoundpool.play(mCSound, 1.0f, 1.0f, 0, 0, 1.0f);

    }

    public void playD(View view) {
        mSoundpool.play(mDSound, 1.0f, 1.0f, 0, 0, 1.0f);

    }

    public void playE(View view) {
        mSoundpool.play(mESound, 1.0f, 1.0f, 0, 0, 1.0f);

    }

    public void playF(View view) {
        mSoundpool.play(mFSound, 1.0f, 1.0f, 0, 0, 1.0f);

    }

    public void playG(View view) {
        mSoundpool.play(mGSound, 1.0f, 1.0f, 0, 0, 1.0f);

    }

    public void playA(View view) {
        mSoundpool.play(mASound, 1.0f, 1.0f, 0, 0, 1.0f);

    }

    public void playB(View view) {
        mSoundpool.play(mBSound, 1.0f, 1.0f, 0, 0, 1.0f);

    }


}
