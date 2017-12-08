package com.example.findandfight;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Wenkun on 2017/12/8.
 */

public class FightActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fight);
        Message message = handler.obtainMessage(1);     // Message
        handler.sendMessageDelayed(message, 3000);
    }

    final Handler handler = new Handler(){

        public void handleMessage(Message msg){         // handle message
            switch (msg.what) {
                case 1:
                    finish();
            }

            super.handleMessage(msg);
        }
    };
}
