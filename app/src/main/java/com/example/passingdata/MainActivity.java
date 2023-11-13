package com.example.passingdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText nameEditText,infoEditText,phoneNoEditText;
    Button uploadBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameEditText = (EditText) findViewById(R.id.nameEditId);
        infoEditText=(EditText)findViewById(R.id.infoEditId);
        phoneNoEditText=(EditText)findViewById(R.id.phoneEditId);
        uploadBtn = (Button) findViewById(R.id.uploadDataBtn);
        uploadBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=nameEditText.getText().toString();
                String info=infoEditText.getText().toString();
                String phone=phoneNoEditText.getText().toString();
                Intent intent=new Intent(MainActivity.this,ShowData.class);
                intent.putExtra("namekey",name);
                intent.putExtra("infokey",info);
                intent.putExtra("phonekey",phone);
                startActivity(intent);

            }
        });
    }
}