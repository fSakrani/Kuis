package com.example.kuis078;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private  AnggotaAdapter anggotaAdapter;
    private ArrayList<Anggota> anggotaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tambahData();
        recyclerView = findViewById(R.id.recycleView);
        anggotaAdapter = new AnggotaAdapter(anggotaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(anggotaAdapter);


    }
    private void tambahData(){
        anggotaArrayList = new ArrayList<>();
        anggotaArrayList.add(new Anggota("Abdul Rahman","Bapak",getDrawable(R.drawable.a)));
        anggotaArrayList.add(new Anggota("Fikriadi Sakrani","Anak pertama",getDrawable(R.drawable.b)));
        anggotaArrayList.add(new Anggota("Giaska Sarobi","Anak kedua",getDrawable(R.drawable.c)));


    }
}
