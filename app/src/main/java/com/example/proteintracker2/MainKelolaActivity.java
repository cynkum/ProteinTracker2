package com.example.proteintracker2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainKelolaActivity extends AppCompatActivity {
    String[] items={"Riyan Mozes Sahetapy", "Brian Eldrin Sombuk", "Elias Aru F. Langer", "Aditya Halimawan", "Immanuel Harold Maga",
            "Eben Haezer Gultom", "Yosua Erick Gunawan", "Nana Eka Wulandari", "Eva Kristina", "Jonathan Prajna Marga Parama",
            "Emma Norren Cahya Putri", "Michael Gerardi Adji", "Cynthia Kumalasari", "Nikolaus Aryawan Ravato Wijaya", "Daniel Surya Nugraha",
            "Lionrico Sanjay Exauvida Jeipy", "Jonathan Alvin Ananto", "Monica Carista", "Didimus Candra Gased", "Valeriana Tanesha Indra S",
            "Ivan Bernov", "Friska F. Nainggolan", "Grace Hutabarat", "Beni Mulia Tabarus"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelola);

        ListView lv = findViewById(R.id.lvMahasiswa);// (ListView)findViewById->casting(memaksa nilai returnnya itu ListView)


        lv.setAdapter(new ArrayAdapter<String>(MainKelolaActivity.this, android.R.layout.simple_list_item_1, items));//untuk menampilkan data list view (menampung data dari xml)
        //simple_list_item_1 adalah pola sederhana yang untuk menampilkan list view misal data* yang tidak kompleks
        ArrayAdapter<String> aa = new ArrayAdapter<String>(MainKelolaActivity.this, android.R.layout.simple_spinner_dropdown_item,items);


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {//yg dipake yg i saja(posisi kita memilih item misal pencet yg pertama berarti index ke-0, parameter lain cuma buat tahu parentnya
                Toast.makeText(MainKelolaActivity.this,"Anda memilih = " + items[i],Toast.LENGTH_LONG).show();
                //untuk perantara, yg dikasi ke kita cuma positionnya aja karena view gabisa ditampilkan langsung
            }
        });

        Button btnCreateKelola = (Button) findViewById(R.id.btnCreateKelola);
        Button btnUpdateKelola = (Button) findViewById(R.id.btnUpdateKelola);

        btnCreateKelola.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(MainKelolaActivity.this,CreateActivity.class);
                startActivity(i);
            }
        });

        btnUpdateKelola.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(MainKelolaActivity.this,EditActivity.class);
                startActivity(i);
            }
        });
    }
}
