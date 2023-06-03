package com.example.cometomytown;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    //ZONA DE ATRIBUTOS
    Button bttHotel;
    Button bttRest;
    Button bttSit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //asociando los atributos de tipo botón a los ID de xml
        bttHotel = findViewById(R.id.btt_hot);
        bttRest = findViewById(R.id.btt_res);
        bttSit = findViewById(R.id.btt_sitios);
        // Escuchando los eventos del click en el botón
        bttHotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //abrimos una nueva actividad desde el HOME
                Intent intent = new Intent(Home.this,Hoteles.class);
                startActivity(intent);
            }
        });
        bttRest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Home.this,Restaurantes.class);
                startActivity(intent2);
            }
        });
        bttSit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(Home.this,Sitios.class);
                startActivity(intent3);
            }
        });
    }
}