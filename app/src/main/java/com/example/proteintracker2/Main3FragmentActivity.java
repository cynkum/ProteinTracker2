package com.example.proteintracker2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3FragmentActivity extends AppCompatActivity implements ProteinFragment.SendMessage{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3_fragment);

        Button btnPress= findViewById(R.id.btnTesFragment);
        btnPress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ProteinFragment proteinFragment = ProteinFragment.newInstance("Hai", "para progmobers");//kirim variabel(instance)
                ft.replace(R.id.frameMain, proteinFragment);//mengganti frameMain dengan proteinFragment
                ft.commit();
            }
        });

        }

    @Override
    public void SendData(String Message) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        Protein2Fragment protein2Fragment = Protein2Fragment.newInstance(Message,"Para progmobers");
        ft.replace(R.id.frameMain, protein2Fragment);
        ft.commit();
    }
}
