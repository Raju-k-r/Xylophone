package com.myapps.xylophone;

import android.app.Activity;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    private final int MAX_STREAM = 7;
    private final int PRIORITY = 0;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;

    private SoundPool soundPool;

    private int cSoundId, dSoundId, eSoundId, fSoundId, gSoundId, aSoundId, bSoundId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        soundPool = new SoundPool(MAX_STREAM, AudioManager.STREAM_MUSIC,0);

        cSoundId = soundPool.load(this,R.raw.note1_c,PRIORITY);
        dSoundId = soundPool.load(this,R.raw.note2_d,PRIORITY);
        eSoundId = soundPool.load(this,R.raw.note3_e,PRIORITY);
        fSoundId = soundPool.load(this,R.raw.note4_f,PRIORITY);
        gSoundId = soundPool.load(this,R.raw.note5_g,PRIORITY);
        aSoundId = soundPool.load(this,R.raw.note6_a,PRIORITY);
        bSoundId = soundPool.load(this,R.raw.note7_b,PRIORITY);

    }

    public void playC(View view) {
        soundPool.play(cSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,0);
    }

    public void playD(View view) {
        soundPool.play(dSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,0);
    }

    public void playE(View view){
        soundPool.play(eSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,0);
    }

    public void playF(View view){
        soundPool.play(fSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,0);
    }

    public void playG(View view){
        soundPool.play(gSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,0);
    }

    public void playA(View view){
        soundPool.play(aSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,0);
    }

    public void playB(View view){
        soundPool.play(bSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,0);
    }
}
