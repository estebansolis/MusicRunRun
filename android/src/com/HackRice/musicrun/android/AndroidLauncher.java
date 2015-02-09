package com.HackRice.musicrun.android;

import android.media.MediaPlayer;
import android.media.audiofx.Visualizer;
import android.os.Bundle;
import android.util.Log;

import com.HackRice.musicrun.MRGame;
import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;

public class AndroidLauncher extends AndroidApplication {
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
		initialize(new MRGame(), config);
        MediaPlayer mPlay;

        mPlay = MediaPlayer.create(this,R.raw.road);
        mPlay.start();

        Visualizer visualizer = new Visualizer(mPlay.getAudioSessionId());
        Log.i("VIZ", String.format("CaptureSize: %d", visualizer.getCaptureSize()));

        byte capture[] = new byte[1024];
        Log.i("VIZ", String.format("Enable: %d", visualizer.setEnabled(false)));

        int x = visualizer.setDataCaptureListener(new Visualizer.OnDataCaptureListener() {
            @Override
            public void onWaveFormDataCapture(Visualizer visualizer, byte[] bytes, int i) {
                int x = 1;
                byte max = 0;
                for ( byte b : bytes ) {
                    Log.i("VIZ", String.format("WF: %d", b));
                    //max = bytes[0];
                   // if(max < bytes[1]){
                     //   max = bytes[x];
                       // x++;
                }

            }
             //   int d = max.intValue();
               // System.out.println("Omar " + d);

              //Log.d("MAX",String.format("MX: %d",max));
//            }

            @Override
            public void onFftDataCapture(Visualizer visualizer, byte[] bytes, int i) {
                for ( byte b : bytes ) {
                    Log.i("VIZ", String.format("FFT: %d", b));
                }

            }
        }, Visualizer.getMaxCaptureRate(), true, false);

       // Log.i("VIZ", String.format("Enable: %d", visualizer.setEnabled(true)));

        //Log.i("VIZ", String.format("Start Capture: %d", x));
	}

}
