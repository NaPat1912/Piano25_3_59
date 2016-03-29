package ice_pbru.changlao.nataporn.piano;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //2.Explicit
    //access type   name
    private Button doButton;
    private Button reButton;
    private Button meButton;
    private Button faButton;
    private Button soButton;
    private Button laButton;
    private Button siButton;
    private Button DoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //3.Bind widget
        bindWidget();
        //4.button controller
        buttonController();


    }//main method

    private void buttonController() {
        doButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer doMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.song1);
                doMediaPlayer.start();
                doMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });
        reButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer reMediaPlayer = MediaPlayer.create(getBaseContext(),R.raw.song2);
                reMediaPlayer.start();
                reMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });
        meButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer meMediaPlayer = MediaPlayer.create(getBaseContext(),R.raw.song3);
                meMediaPlayer.start();
                meMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });
        faButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer faMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.song4);
                faMediaPlayer.start();
                faMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });
        soButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer soMediaPlayer = MediaPlayer.create(getBaseContext(),R.raw.song5);
                soMediaPlayer.start();
                soMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });
        laButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer laMediaPlayer = MediaPlayer.create(getBaseContext(),R.raw.song6);
                laMediaPlayer.start();
                laMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });
        siButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer siMediaPlayer = MediaPlayer.create(getBaseContext(),R.raw.song7);
                siMediaPlayer.start();
                siMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });
        DoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //web view
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=EEocnHtllJ8"));
                startActivity(intent);
            }
        });
    }//button controller

    private void bindWidget() {
        doButton = (Button) findViewById(R.id.button);
        reButton = (Button) findViewById(R.id.button2);
        meButton = (Button) findViewById(R.id.button3);
        faButton = (Button) findViewById(R.id.button4);
        soButton = (Button) findViewById(R.id.button5);
        laButton = (Button) findViewById(R.id.button6);
        siButton = (Button) findViewById(R.id.button7);
        DoButton = (Button) findViewById(R.id.button8);
    }//การ bind widget
}//main class


//1.หาขอบเขต
//2.Explicit(ประกาศตัวแปร)
//3.Bind widget(ทำให้โยงกัน)
