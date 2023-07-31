package com.example.cometomytown;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.cometomytown.mockups.MockupSitio;

public class Restaurantes extends AppCompatActivity {

    Button btnRest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantes);
        btnRest = findViewById(R.id.go_res);
        // Escuchando los eventos del click en el botón
        btnRest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //abrimos una nueva actividad desde el HOME
                Intent intent = new Intent(Restaurantes.this, ListRest.class);
                startActivity(intent);
            }
        });
    }
}