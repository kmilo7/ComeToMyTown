package com.example.cometomytown.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cometomytown.mockups.MockupSitio;
import com.example.cometomytown.R;

import java.util.ArrayList;

public class SitioAdaptador extends RecyclerView.Adapter<SitioAdaptador.viewHolder> {

    //ATRIBUTOS
    public ArrayList<MockupSitio> listSitio;

    //CONSTRUCTOR
    public SitioAdaptador(ArrayList<MockupSitio> listSitio) {
        this.listSitio = listSitio;
    }

    @NonNull
    @Override
    public SitioAdaptador.viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View vista= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mockupsitio,null,false);
        return new viewHolder(vista);

    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder viewHolder, int i) {
        viewHolder.updateInfo(listSitio.get(i));
    }

    @Override
    public int getItemCount() {
        return  listSitio.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView photositio;
        TextView nomsitio;
        TextView descsitio;

        public viewHolder(View item) {
            super(item);
            photositio=item.findViewById(R.id.photositio);
            nomsitio=item.findViewById(R.id.nomsitio);
            descsitio=item.findViewById(R.id.descsitio);
        }

        public void updateInfo(MockupSitio mockupHotel) {
            photositio.setImageResource(mockupHotel.getPhoto());
            nomsitio.setText(mockupHotel.getNom());
            descsitio.setText(mockupHotel.getDesc());
        }
    }
}
