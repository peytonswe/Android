package com.registration.ksusha.registration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button nameButton = (Button) findViewById(R.id.name_button);
        Button birthdayButton = (Button) findViewById(R.id.birthday_button);
        Button aboutMeButton = (Button) findViewById(R.id.about_me_button);
        Button registerButton = (Button) findViewById(R.id.register_button);

        nameButton.setOnClickListener(this);
        birthdayButton.setOnClickListener(this);
        aboutMeButton.setOnClickListener(this);
        registerButton.setOnClickListener(this);
    }

    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.name_button:
                intent = new Intent(this, EnterNameActivity.class);
                startActivity(intent);
                break;
            case R.id.birthday_button:
                intent = new Intent(this, BirthdayActivity.class);
                startActivity(intent);
                break;
            case R.id.about_me_button:
                intent = new Intent(this, AboutMeActivity.class);
                startActivity(intent);
                break;
            case R.id.register_button:
                intent = new Intent(this, CompleteActivity.class);
                startActivity(intent);
                break;
        }
    }
}
