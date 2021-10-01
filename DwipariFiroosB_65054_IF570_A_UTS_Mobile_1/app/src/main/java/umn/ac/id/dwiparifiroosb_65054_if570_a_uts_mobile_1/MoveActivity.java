package umn.ac.id.dwiparifiroosb_65054_if570_a_uts_mobile_1;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MoveActivity extends AppCompatActivity {

    private int sound2StreamId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move);

        initial();
    }

    private void initial() {
        SoundPool soundPool;

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            AudioAttributes audioAttributes = new AudioAttributes.Builder()
                    .build();
            soundPool = new SoundPool.Builder()
                    .setMaxStreams(6)
                    .setAudioAttributes(audioAttributes)
                    .build();
        } else {
            soundPool = new SoundPool(6, AudioManager.STREAM_MUSIC,  0);
        }

        int sound1 = soundPool.load(this, R.raw.bell, 1);
        int sound2 = soundPool.load(this, R.raw.yugioh, 1);
        int sound3 = soundPool.load(this, R.raw.camera, 1);
        int sound4 = soundPool.load(this, R.raw.iphone, 1);

        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btn1:
                        soundPool.play(sound1,1,1,0,0,1);
                        soundPool.pause(sound2StreamId);
                        break;
                    case R.id.btn2:
                        sound2StreamId = soundPool.play(sound2,1,1,0,0,1);
                        break;
                    case R.id.btn3:
                        soundPool.play(sound3,1,1,0,0,1);
                        break;
                    case R.id.btn4:
                        soundPool.play(sound4,1,1,0,0,1);
                        break;
                }

            }
        };

        btn1.setOnClickListener(listener);
        btn2.setOnClickListener(listener);
        btn3.setOnClickListener(listener);
        btn4.setOnClickListener(listener);
    }
}