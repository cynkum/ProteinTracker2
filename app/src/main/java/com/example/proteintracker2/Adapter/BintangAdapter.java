package com.example.proteintracker2.Adapter;

import android.view.LayoutInflater;
import android.widget.ImageView;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.proteintracker2.Model.Bintang;
import com.example.proteintracker2.R;

import java.util.ArrayList;

public class BintangAdapter extends RecyclerView.Adapter<BintangAdapter.ViewHolder> {//adapter untuk menampung data
    Context context;
    ArrayList<Bintang> bintangArrayList;//isi data dari luar

    public BintangAdapter(ArrayList<Bintang> bintangArrayList) {
        this.bintangArrayList = bintangArrayList; // set data ke array list
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.card_view_bintang, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.txtNama.setText(bintangArrayList.get(position).getNama());
        holder.txtNim.setText(bintangArrayList.get(position).getNim());
        holder.txtGender.setText(bintangArrayList.get(position).getGender());
        holder.txtHobi.setText(bintangArrayList.get(position).getHobi());
        holder.txtCita.setText(bintangArrayList.get(position).getCita());
        holder.txtMoto.setText(bintangArrayList.get(position).getMoto());
        holder.imgFoto.setImageResource(bintangArrayList.get(position).getFoto());

        holder.imgFoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = bintangArrayList.get(position).getNama().toString();
                Toast.makeText(context, nama + " is selected", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return (bintangArrayList != null) ? bintangArrayList.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {//ketika kita masukkan card kedalam view ini maka view akan tahu bahwa di card udah ada atribut nama, dll
        private TextView txtNama, txtNim, txtGender, txtHobi, txtCita, txtMoto;
        ImageView imgFoto;
        //private ImageView imgFoto;
        public ViewHolder(View view){ //implementasi dari recycler view biar bisa dapet layout yg udah dibuat
            super(view);
            txtNama = view.findViewById(R.id.txt_nama_bintang);
            txtNim = view.findViewById(R.id.txt_nim_bintang);
            txtGender = view.findViewById(R.id.txt_gender_bintang);
            txtHobi = view.findViewById(R.id.txt_hobi_bintang);
            txtCita = view.findViewById(R.id.txt_cita_bintang);
            txtMoto = view.findViewById(R.id.txt_moto_bintang);
            imgFoto = view.findViewById(R.id.imgFoto);
        }


    }

}
