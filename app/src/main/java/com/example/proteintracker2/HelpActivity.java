package com.example.proteintracker2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HelpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        TextView myTextView = findViewById(R.id.textView1);
        myTextView.setText("hehe");

        Bundle b = getIntent().getExtras();
        String helpText = b.getString("helpString");

        myTextView.setText(helpText);

        /*TextView myTextView = new TextView(this);
        myTextView.setText("Some Help Text");
        setContentView(myTextView);*/

    }
}
