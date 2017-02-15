package com.registration.ksusha.registration;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class CompleteActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.complete_main);

        String userName = getIntent().getExtras().getString("user_name");
        String userLastName = getIntent().getExtras().getString("last_name");
        String userBirthday = getIntent().getExtras().getString("user_birthday");
        String userAbout = getIntent().getExtras().getString("user_about");

        TextView textName = (TextView) findViewById(R.id.text_name);
        TextView textLastName = (TextView) findViewById(R.id.text_last_name);
        TextView textBirthday = (TextView) findViewById(R.id.text_birthday);
        TextView textAbout = (TextView) findViewById(R.id.text_about_me);

        textName.setText(userName);
        textLastName.setText(userLastName);
        textBirthday.setText(userBirthday);
        textAbout.setText(userAbout);

    }
}
