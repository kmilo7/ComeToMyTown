package com.example.cometomytown;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.cometomytown.mockups.MockupHotel;
import com.example.cometomytown.mockups.MockupSitio;

public class Sitios extends AppCompatActivity {
    Button btnSitio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sitios);
        btnSitio = findViewById(R.id.go_sit);
        // Escuchando los eventos del click en el botón
        btnSitio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //abrimos una nueva actividad desde el HOME
                Intent intent = new Intent(Sitios.this, ListSitio.class);
                startActivity(intent);
            }
        });
    }
}