package com.example.proteintracker2.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.proteintracker2.Model.Mahasiswa;
import com.example.proteintracker2.R;

import java.util.ArrayList;

public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaAdapter.ViewHolder> {//adapter untuk menampung data

    ArrayList<Mahasiswa> mahasiswaArrayList;//isi data dari luar

    public MahasiswaAdapter(ArrayList<Mahasiswa> mahasiswaArrayList) {
        this.mahasiswaArrayList = mahasiswaArrayList; // set data ke array list
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.card_view_mhs, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtNama.setText(mahasiswaArrayList.get(position).getNama());
        holder.txtNpm.setText(mahasiswaArrayList.get(position).getNpm());
        holder.txtHp.setText(mahasiswaArrayList.get(position).getNohp());
        //holder.imgFoto.setImageIcon(bintangArrayList.get(position).get);
    }

    @Override
    public int getItemCount() {
        return (mahasiswaArrayList != null) ? mahasiswaArrayList.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {//ketika kita masukkan card kedalam view ini maka view akan tahu bahwa di card udah ada atribut nama, dll
        private TextView txtNama, txtNpm, txtHp;
        //private ImageView imgFoto;
        public ViewHolder(View view){ //implementasi dari recycler view biar bisa dapet layout yg udah dibuat
            super(view);
            txtNama = view.findViewById(R.id.txt_nama_mahasiswa);
            txtNpm = view.findViewById(R.id.txt_npm_mahasiswa);
            txtHp = view.findViewById(R.id.txt_nohp_mahasiswa);
            //imgFoto = view.findViewById(R.id.imgFoto);
        }


    }

}
