package ice_pbru.changlao.nataporn.piano;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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


    }//main method

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
