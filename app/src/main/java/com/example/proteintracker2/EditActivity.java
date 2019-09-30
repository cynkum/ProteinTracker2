package com.example.proteintracker2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EditActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        Button btnSaveKelola2 = (Button) findViewById(R.id.btnSaveKelola2);
        btnSaveKelola2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(EditActivity.this,MainKelolaActivity.class);
                startActivity(i);
            }
        });
    }
}
