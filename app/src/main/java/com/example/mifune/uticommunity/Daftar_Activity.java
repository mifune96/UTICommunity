package com.example.mifune.uticommunity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;

public class Daftar_Activity extends AppCompatActivity {

    private Spinner jurusan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_);
        jurusan = (Spinner) findViewById(R.id.spinner_jurusan);
    }
}
