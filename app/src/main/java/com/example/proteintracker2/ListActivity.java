package com.example.proteintracker2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class ListActivity extends AppCompatActivity {

    String[] items={"lorem", "ipsum", "dolor", "sit", "amet",
            "consectetuer", "adipiscing", "elit", "morbi", "vel",
            "ligula", "vitae", "arcu", "aliquet", "mollis",
            "etiam", "vel", "erat", "placerat", "ante",
            "porttitor", "sodales", "pellentesque", "augue", "purus"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListView lv = findViewById(R.id.lvLoremIpsum);// (ListView)findViewById->casting(memaksa nilai returnnya itu ListView)
        Spinner spinner = findViewById(R.id.spinnerProgmob);

        lv.setAdapter(new ArrayAdapter<String>(ListActivity.this, android.R.layout.simple_list_item_1, items));//untuk menampilkan data list view (menampung data dari xml)
        //simple_list_item_1 adalah pola sederhana yang untuk menampilkan list view misal data* yang tidak kompleks
        ArrayAdapter<String> aa = new ArrayAdapter<String>(ListActivity.this, android.R.layout.simple_spinner_dropdown_item,items);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(aa);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ListActivity.this, "Anda memilih = " + items[i],Toast.LENGTH_SHORT).show();//kalo milih bisa
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(ListActivity.this, "Anda tidak memilih", Toast.LENGTH_SHORT).show();//kalo ga milih juga bisa
            }
        });


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {//yg dipake yg i saja(posisi kita memilih item misal pencet yg pertama berarti index ke-0, parameter lain cuma buat tahu parentnya
                Toast.makeText(ListActivity.this,"Anda memilih = " + items[i],Toast.LENGTH_LONG).show();
                //untuk perantara, yg dikasi ke kita cuma positionnya aja karena view gabisa ditampilkan langsung
            }
        });
    }
}
