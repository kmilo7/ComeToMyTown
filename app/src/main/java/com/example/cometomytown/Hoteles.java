package com.example.cometomytown;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.cometomytown.mockups.MockupHotel;

public class Hoteles extends AppCompatActivity {

    Button btnCont;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoteles);

        btnCont = findViewById(R.id.go_hot);
        // Escuchando los eventos del click en el botón
        btnCont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //abrimos una nueva actividad desde el HOME
                Intent intent = new Intent(Hoteles.this, ListHoteles.class);
                startActivity(intent);
            }
        });
    }
}