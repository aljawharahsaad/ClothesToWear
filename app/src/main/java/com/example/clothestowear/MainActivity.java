package com.example.clothestowear;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private occasionwear occasion = new occasionwear();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickoverview(View view) {
        Intent intent = new Intent(this,overview.class);
        Spinner occasions = (Spinner) findViewById(R.id.occasion);

        String occasionType = String.valueOf(occasions.getSelectedItem());
        String occasionText= occasion.getoccasionoverview(occasionType);
        intent.putExtra(overview.overText, occasionText);
        startActivity(intent);
    }

    public void onClickdetailed(View view) {
        Intent intent = new Intent(this,detailed.class);
        Spinner occasions = (Spinner) findViewById(R.id.occasion);
        String occasionType = String.valueOf(occasions.getSelectedItem());

        String occasionText= occasion.getoccasiondetailed(occasionType);
        intent.putExtra(detailed.detailText, occasionText);
        startActivity(intent);
    }
}
