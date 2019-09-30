 package com.example.proteintracker2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

 public class CreateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);

        Button btnSaveKelola = (Button) findViewById(R.id.btnSaveKelola);
        btnSaveKelola.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(CreateActivity.this,MainKelolaActivity.class);
                startActivity(i);
            }
        });
    }
}
