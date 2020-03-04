package com.londonappbrewery.xylophonepm;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // Helpful Constants
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    // TODO: Add member variables here
    private SoundPool mSoundPool;
    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mBSoundId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Create a new SoundPool
        mSoundPool = new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS, AudioManager.STREAM_MUSIC, 0);

        // TODO: Load and get the IDs to identify the sounds
        final Context context = getApplicationContext();
        mCSoundId = mSoundPool.load(context, R.raw.note1_c, PRIORITY);
        mDSoundId = mSoundPool.load(context, R.raw.note2_d, PRIORITY);
        mESoundId = mSoundPool.load(context, R.raw.note3_e, PRIORITY);
        mFSoundId = mSoundPool.load(context, R.raw.note4_f, PRIORITY);
        mGSoundId = mSoundPool.load(context, R.raw.note5_g, PRIORITY);
        mASoundId = mSoundPool.load(context, R.raw.note6_a, PRIORITY);
        mBSoundId = mSoundPool.load(context, R.raw.note7_b, PRIORITY);

    }

    // TODO: Add the play methods triggered by the buttons
    public void playC(View view) {
        Log.d("Xylophone", "Play C Key");
        playNote(mCSoundId);
    }


    public void playD(View view) {
        Log.d("Xylophone", "Play D Key");
        playNote(mDSoundId);
    }

    public void playE(View view) {
        Log.d("Xylophone", "Play E Key");
        playNote(mESoundId);
    }

    public void playF(View view) {
        Log.d("Xylophone", "Play F Key");
        playNote(mFSoundId);
    }

    public void playG(View view) {
        Log.d("Xylophone", "Play G Key");
        playNote(mGSoundId);
    }

    public void playA(View view) {
        Log.d("Xylophone", "Play A Key");
        playNote(mASoundId);
    }

    public void playB(View view) {
        Log.d("Xylophone", "Play B Key");
        playNote(mBSoundId);
    }

    private int playNote(int noteSoundId) {
        return mSoundPool.play(noteSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }
}
