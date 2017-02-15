package com.example.ksusha.transferdata;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class StartActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_main);

        Button buttonStart = (Button) findViewById(R.id.buttonStart);
        Button buttonReg = (Button) findViewById(R.id.buttonReg);

        buttonStart.setOnClickListener(this);
        buttonReg.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch(v.getId()) {
            case R.id.buttonStart:
                intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.buttonReg:
                intent = new Intent(this, SecondActivity.class);
                startActivity(intent);
                break;
        }

    }

    /*@Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        EditText userEditText = (EditText) findViewById(R.id.editTextUser);
        if (data == null) {return;}
        String username = data.getStringExtra("username");
        userEditText.setText(username);
    }*/
}
