package com.example.cometomytown;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.cometomytown.adaptadores.RestAdaptador;
import com.example.cometomytown.mockups.MockupRest;

import java.util.ArrayList;

public class ListRest extends AppCompatActivity {

    ArrayList<MockupRest> listRest = new ArrayList<>();
    RecyclerView recyclerRest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activiy_list_rest);

        recyclerRest = findViewById(R.id.listRest);
        recyclerRest.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        crearLista();
        RestAdaptador adaptador = new RestAdaptador(listRest);
        recyclerRest.setAdapter(adaptador);
    }

    public void crearLista(){
        listRest.add(new MockupRest(R.drawable.rest1,"Restaurante Típico Full","$ 12.900 COP"));
        listRest.add(new MockupRest(R.drawable.rest2,"Restaurante Fresh Colombia","$ 29.900 COP"));
        listRest.add(new MockupRest(R.drawable.rest3,"Restaurante Gold Town","$ 79.900 COP"));
    }
}
