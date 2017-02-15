package com.example.ksusha.transferdata;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    SharedPreferences sPref;

    final String SAVED_TEXT = "saved_text";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonSend = (Button) findViewById(R.id.buttonSend);
        Button buttonCancel = (Button) findViewById(R.id.buttonCancel);

        buttonSend.setOnClickListener(this);
        buttonCancel.setOnClickListener(this);

        loadText();
    }

    @Override
    public void onClick(View v) {
        EditText userEditText = (EditText) findViewById(R.id.editTextUser);

        Intent intent;
        switch(v.getId()) {
            case R.id.buttonSend:
                intent = new Intent(this, SecondActivity.class);
                intent.putExtra("username", userEditText.getText().toString());
                String username = userEditText.getText().toString();
                if (username.matches("")){
                    Toast.makeText(this, "You did not enter a username",Toast.LENGTH_SHORT).show();
                    return;
                }
                startActivity(intent);
                break;
            case R.id.buttonCancel:
                intent = new Intent(this, StartActivity.class);
                startActivity(intent);
                break;
        }

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        saveText();
    }

    void saveText() {
        EditText userEditText = (EditText) findViewById(R.id.editTextUser);
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT, userEditText.getText().toString());
        ed.commit();
    }

    void loadText() {
        EditText userEditText = (EditText) findViewById(R.id.editTextUser);
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT, "");
        userEditText.setText(savedText);
    }

}
