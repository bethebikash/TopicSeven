package com.bhattaraibikash.topicseven;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    private TextView tvMeaning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        tvMeaning= findViewById(R.id.tvMeaning);

        Bundle bundle = getIntent().getExtras();

        if (bundle!=null){
            String meaning = bundle.getString("meaning");
            tvMeaning.setText(meaning);
        }
    }
}
