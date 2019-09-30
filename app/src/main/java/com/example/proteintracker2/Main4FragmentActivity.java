package com.example.proteintracker2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class Main4FragmentActivity extends AppCompatActivity implements DisplayFragment.SendMessage2, InsertUpdateFragment.SendMessage1{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4_fragment);
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                InsertUpdateFragment insertUpdateFragment = InsertUpdateFragment.newInstance(" ", " ");//kirim variabel(instance)
                ft.replace(R.id.frameMain2, insertUpdateFragment);
                ft.commit();
            }

    @Override
    public void SendData1(String Message) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        DisplayFragment displayFragment = DisplayFragment.newInstance(Message," ");
        ft.replace(R.id.frameMain2, displayFragment);
        ft.commit();
    }

    @Override
    public void SendData(String Message) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        InsertUpdateFragment insertUpdateFragment = InsertUpdateFragment.newInstance(Message, " ");//kirim variabel(instance)
        ft.replace(R.id.frameMain2, insertUpdateFragment);
        ft.commit();
        }
}
