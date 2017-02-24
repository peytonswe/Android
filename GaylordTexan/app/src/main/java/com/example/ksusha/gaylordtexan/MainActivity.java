package com.example.ksusha.gaylordtexan;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.gaylord_hotels);

        TextView textAddress = (TextView) findViewById(R.id.text_address);
        TextView textPhoneNumber = (TextView) findViewById(R.id.text_phone_number);

        textAddress.setOnClickListener(this);
        textPhoneNumber.setOnClickListener(this);
    }
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.text_address:
                    String strUri = "http://maps.google.com/maps?q=loc:"+ 32.955574 + "," + (-97.064209) + "," + " (" + "Gaylord Texan Resort &amp; Convention Center" + ")";
                    Intent locIntent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(strUri));
                    locIntent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                    startActivity(locIntent);
                    break;
                case R.id.text_phone_number:
                    Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
                    phoneIntent.setData(Uri.parse("tel:18177781000"));
                    startActivity(phoneIntent);
                    break;
            }

        }

}
