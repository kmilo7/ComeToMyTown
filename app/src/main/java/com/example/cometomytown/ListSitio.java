package com.example.cometomytown;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.cometomytown.adaptadores.SitioAdaptador;
import com.example.cometomytown.mockups.MockupSitio;

import java.util.ArrayList;

public class ListSitio extends AppCompatActivity {

    ArrayList<MockupSitio> listSitio = new ArrayList<>();
    RecyclerView recyclerSitio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_sitio);

        recyclerSitio = findViewById(R.id.listSitio);
        recyclerSitio.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        crearLista();
        SitioAdaptador adaptador = new SitioAdaptador(listSitio);
        recyclerSitio.setAdapter(adaptador);
    }

    public void crearLista(){
        listSitio.add(new MockupSitio(R.drawable.sitio1,"Parroquia de San Pedro Alejandrino","Ubicada cerca al parque principal, esta hermosa edificación es digna de una foto en nuestras redes sociales."));
        listSitio.add(new MockupSitio(R.drawable.sitio2,"Balneario Nudillales","Venga y disfrute de piscinas naturales y zonas aptas para paseos de olla y camping, además se puede dar un corto paseo en caballo y practicar la pesca."));
        listSitio.add(new MockupSitio(R.drawable.sitio3,"Cascada Velo de la Novia","Cascadas, aguas termales y un paisaje de documentales. Definitivamente, ¡tienes que venir con los tuyos!"));
    }
}
