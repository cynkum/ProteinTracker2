package com.example.proteintracker2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//R itu kelas yg isinya semua variabel yang ada di folder layout
        //id bisa kembar yag penting beda layout
        //1 xml bisa dipake buat banyak java, menu, dll. tapi 1 java cuma bisa pake 1 xml kecuali kalau mau gonta ganti

        /*TextView textView = (TextView) findViewById(R.id.mainActivityTextView);
        textView.setText(R.string.test_untuk_update_view);*/

        Button myBtn = (Button) findViewById(R.id.button1);
        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                EditText myEditText = (EditText)findViewById(R.id.editText1);
                Log.d("ProteinTracker", myEditText.getText().toString());
            }

        });

        Button helpBtn = (Button) findViewById(R.id.helpButton);
        helpBtn.setOnClickListener(helpButtonListener);

        Button btnLayout = (Button) findViewById(R.id.btnLayout);

        Button btnFragment = (Button) findViewById(R.id.btnFragment);

        Button btnList = (Button) findViewById(R.id.btnList);

        Button btnKelola = (Button) findViewById(R.id.btnManajemen);

        btnKelola.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(MainActivity.this,MainKelolaActivity.class);
                startActivity(i);
            }
        });

        btnLayout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(i);
            }
        });

        btnFragment.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Main3FragmentActivity.class);
                startActivity(i);
            }
            });

        if (savedInstanceState != null) {
            Log.d("ProteinTracker", savedInstanceState.getString("abc"));//biar kalo dirotate layoutnya ga hancur
            //mau naruh di Lognya Android Studio
        }

        Button btnMahasiswa = (Button) findViewById(R.id.btnMahasiswa);

//        btnLayout.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view){
//                Intent i = new Intent(MainActivity.this,Main2Activity.class);
//                startActivity(i);
//            }
//        });

        btnMahasiswa.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Main4FragmentActivity.class);
                startActivity(i);
            }
        });


        if (savedInstanceState != null) {
            Log.d("ProteinTracker", savedInstanceState.getString("abc"));//biar kalo dirotate layoutnya ga hancur
            //mau naruh di Lognya Android Studio
        }

        btnList.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ListActivity.class);
                startActivity(i);
            }
        });
    }

    ;
    private View.OnClickListener myBtnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            EditText myEditText = (EditText) findViewById(R.id.editText1);
            Log.d("ProteinTracker", myEditText.getText().toString());
        }
    };
    private View.OnClickListener helpButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            //intent untuk berpindah-pindah kelas
            //ERROR-setText = null->mau ngeset view di objek tidak ada
            Intent intent = new Intent(MainActivity.this, HelpActivity.class);//class -> tujuan mau kemana (kemananya), this -> kelas ini (darimananya)
            Bundle b = new Bundle();//masukkan data di intent
            EditText myEditText = (EditText) findViewById(R.id.editText1);
            b.putString("helpString", myEditText.getText().toString());
            intent.putExtras(b);
            startActivity(intent);
        }
    };

    @Override
    protected void onSaveInstanceState(Bundle outState) {//state: untuk menyimpan nilai sementara
        super.onSaveInstanceState(outState);
        outState.putString("abc", "test");
        super.onSaveInstanceState(outState);
    }
}
