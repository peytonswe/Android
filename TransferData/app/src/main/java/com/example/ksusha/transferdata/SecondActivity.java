package com.example.ksusha.transferdata;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_main);

        String user = getIntent().getExtras().getString("username");

        TextView infoTextView = (TextView) findViewById(R.id.textViewInfo);
        infoTextView.setText(user);

    }

}
