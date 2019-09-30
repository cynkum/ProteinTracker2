package com.example.proteintracker2;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link InsertUpdateFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class InsertUpdateFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    SendMessage1 sm1;
    public InsertUpdateFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment InsertUpdateFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static InsertUpdateFragment newInstance(String param1, String param2) {
        InsertUpdateFragment fragment = new InsertUpdateFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button btnCreate = (Button)view.findViewById(R.id.btnCreate);
        Button btnUpdate = (Button)view.findViewById(R.id.btnUpdate);
        Button btnDelete = (Button)view.findViewById(R.id.btnDelete);

        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sm1.SendData1("");
            }
        });

        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sm1.SendData1("");
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sm1.SendData1("");
            }
        });
    }

    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        try{
            sm1 = (SendMessage1) getActivity();
        } catch(ClassCastException e){
            throw new ClassCastException("Error in retrieving data. Please try again");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_insert_update, container, false);
    }

    interface SendMessage1{
        void SendData1(String Message);
    }
}
