package com.example.mifune.uticommunity;

/**
 * Created by VG on 06/11/2017.
 */


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class InfoKuliah extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<ListItemKuliah> listItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_kuliah);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listItems = new ArrayList<>();

        for (int i = 1; i < 10; i++){
            ListItemKuliah listItem = new ListItemKuliah(
                    "Judul Forum",
                    "Deskripsi Forum"
            );
            listItems.add(listItem);

        }

        adapter = new MyAdapter(listItems, this);
        recyclerView.setAdapter(adapter);

    }
}