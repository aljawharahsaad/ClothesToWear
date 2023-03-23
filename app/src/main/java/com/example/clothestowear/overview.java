package com.example.clothestowear;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class overview extends AppCompatActivity {
    public static final String overText="overview";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overview);
        Intent intent = getIntent();
        String messageText = intent.getStringExtra(overText);
        TextView maintext = (TextView)findViewById(R.id.overviewtext);
        maintext.setText(messageText);
    }
    public void onClick(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}