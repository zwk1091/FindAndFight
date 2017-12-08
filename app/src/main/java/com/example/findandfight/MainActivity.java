package com.example.findandfight;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button nationalMode=(Button)findViewById(R.id.nationalMode);
        nationalMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,NationalModeActivity.class);
                startActivity(intent);
            }
        });

        Button ranklist=(Button)findViewById(R.id.ranklist);
        ranklist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,FriendsRanklistActivity.class);
                startActivity(intent);
            }
        });
    }
}
