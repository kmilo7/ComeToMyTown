package com.example.cometomytown;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Locale;

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
                Intent intent = new Intent(Home.this, Hoteles.class);
                startActivity(intent);
            }
        });
        bttRest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Home.this, Restaurantes.class);
                startActivity(intent2);
            }
        });
        bttSit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(Home.this, Sitios.class);
                startActivity(intent3);
            }
        });
    }

    // Cargamos el menú de opciones
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    // Función para cargar el funcionamiento del menu
    public boolean onOptionsItemSelected(MenuItem item) {
        // Observar el comportamiento del usuario frente al menú
        int itemSelect = item.getItemId();

        switch (itemSelect) {
            case (R.id.opt1):
                this.chgLang("es");
                Intent intSpa = new Intent(Home.this,Home.class);
                startActivity(intSpa);
                break;
            case (R.id.opt2):
                this.chgLang("en");
                Intent intEng = new Intent(Home.this,Home.class);
                startActivity(intEng);
                break;
            case (R.id.opt3):
                this.chgLang("fr");
                Intent intFre = new Intent(Home.this,Home.class);
                startActivity(intFre);
                break;
            case (R.id.opt4):
                Intent intAbUs = new Intent(Home.this,AbUs.class);
                startActivity(intAbUs);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
    //Method for change the app language

    public void chgLang(String lang){
        //Create the LOCALE object for change the language
        Locale locale = new Locale(lang);

        //Establecemos the language setting in the phone
        Resources reso = getResources();
        Configuration config = reso.getConfiguration();
        config.setLocale(locale);

        //Update the phone setting
        getBaseContext().getResources().updateConfiguration(config,getBaseContext().getResources().getDisplayMetrics());
    }
}