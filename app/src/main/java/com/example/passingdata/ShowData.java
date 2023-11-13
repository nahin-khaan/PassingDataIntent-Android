package com.example.passingdata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ShowData extends AppCompatActivity {
    TextView nameText,infoText,phoneText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_data);
        nameText = (TextView) findViewById(R.id.nameTextId);
        infoText=(TextView)findViewById(R.id.addressTextId) ;
        phoneText=(TextView)findViewById(R.id.phoneTextId);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String name = bundle.getString("namekey");
            String info = bundle.getString("infokey");
            String phone = bundle.getString("phonekey");
            nameText.setText("Name:  " + name);
            infoText.setText("Address:  " + info);
            phoneText.setText("Phone No:  " + phone);
        }
    }
}