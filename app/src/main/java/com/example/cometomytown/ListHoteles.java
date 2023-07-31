package com.example.cometomytown;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.cometomytown.adaptadores.HotelAdaptador;
import com.example.cometomytown.mockups.MockupHotel;

import java.util.ArrayList;

public class ListHoteles extends AppCompatActivity {

    ArrayList<MockupHotel> listHoteles = new ArrayList<>();
    RecyclerView recyclerHoteles;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_hotel);

        recyclerHoteles = findViewById(R.id.listHoteles);
        recyclerHoteles.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        crearLista();
        HotelAdaptador adaptador = new HotelAdaptador(listHoteles);
        recyclerHoteles.setAdapter(adaptador);
    }

    public void crearLista(){
        listHoteles.add(new MockupHotel(R.drawable.hotel1,"Hotel Mi Llanerito","$ 49.900 COP / noche","Perfectas para descansar y seguir disfrutando del pueblo."));
        listHoteles.add(new MockupHotel(R.drawable.hotel2,"Hotel Cabañas Doradas","$ 119.900 COP / noche","Maravillosa Aldea de ensueño, donde vivirás una completa experiencia de fantasía. Cuenta con restaurante."));
        listHoteles.add(new MockupHotel(R.drawable.hotel3,"Hotel Séptima Maravilla","$ 249.900 COP / noche","Completo paraiso lleno de mágica vegetación. Calefacción, aire acondicionado, jacuzzi, y alimentación completa."));
    }
}