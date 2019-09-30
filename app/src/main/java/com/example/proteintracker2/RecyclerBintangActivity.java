package com.example.proteintracker2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.proteintracker2.Adapter.BintangAdapter;
import com.example.proteintracker2.Model.Bintang;

import java.util.ArrayList;
import java.util.List;

public class RecyclerBintangActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private BintangAdapter bintangAdapter;
    private ArrayList<Bintang> bintangArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_bintang);

        addData();

        recyclerView = findViewById(R.id.rvBintang);
        bintangAdapter = new BintangAdapter(bintangArrayList);
        List<Bintang> bintangList;

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(RecyclerBintangActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(bintangAdapter);
    }
    private void addData(){
        bintangArrayList = new ArrayList<>();
        bintangArrayList.add(new Bintang("Emma Norren", "72170097", "Perempuan", "Melukis",
                "Pengusaha di bidang fashion", "Stop dreaming and start doing", R.drawable.emma));
        bintangArrayList.add(new Bintang("Eva Kristina", "72170091", "Perempuan", "Bermain game",
                "Animal rescuer dan berguna bagi orang lain", "Kalo laper ya makan, kalo ngantuk ya tidur, kalo kangen yauda, dia uda sama yg lain", R.drawable.eva));
        bintangArrayList.add(new Bintang("Friska F. Nainggolan", "72170157", "Perempuan", "Menggambar",
                "Gapunya cita-cita :(", "Let's life without regret", R.drawable.friska));
        bintangArrayList.add(new Bintang("Jonathan Prajna Marga P.", "72170094", "Laki-laki", "Kerja lapangan",
                "Konglomerat", "Apa yang aku perbuat dibuat Tuhan berhasil", R.drawable.jona));

    }
}

