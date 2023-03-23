package com.example.clothestowear;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class detailed extends AppCompatActivity {
    public static final String detailText="detiles";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed);
        Intent intent = getIntent();
        String messageText = intent.getStringExtra(detailText);
        TextView maintext = (TextView)findViewById(R.id.detailedtext);
        maintext.setText(messageText);
    }
    public void onClick(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}