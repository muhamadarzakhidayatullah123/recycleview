package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private adaptor adaptor;
    private ArrayList<modelbangunruang> mahasiswaArrayList;
        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            addData();

            recyclerView = (RecyclerView) findViewById(R.id.aaa);

            adaptor = new adaptor(mahasiswaArrayList);

            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

            recyclerView.setLayoutManager(layoutManager);

            recyclerView.setAdapter(adaptor);
        }
    void addData(){
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new modelbangunruang("kubus", "luas 6 x (sisi x sisi)"));
        mahasiswaArrayList.add(new modelbangunruang("bola", "Volume bola = 4/3 x π x r3"));
        mahasiswaArrayList.add(new modelbangunruang("tabung", "Volume = luas alas x tinggi atau V = π x r2 x t"));
        mahasiswaArrayList.add(new modelbangunruang("kerucut", "Volume kerucut = 1/3 x π x r2 x t."));
    }

}