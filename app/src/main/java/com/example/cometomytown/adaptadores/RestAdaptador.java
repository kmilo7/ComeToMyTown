package com.example.cometomytown.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cometomytown.R;
import com.example.cometomytown.mockups.MockupRest;

import java.util.ArrayList;

public class RestAdaptador extends RecyclerView.Adapter<RestAdaptador.viewHolder> {
    //ATRIBUTOS
    public ArrayList<MockupRest> listRest;

    //CONSTRUCTOR
    public RestAdaptador(ArrayList<MockupRest> listRest) {
        this.listRest = listRest;
    }

    @NonNull
    @Override
    public RestAdaptador.viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View vista= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mockuprest,null,false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder viewHolder, int i) {
        viewHolder.updateInfo(listRest.get(i));
    }

    @Override
    public int getItemCount() {
        return  listRest.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView photorest;
        TextView nomrest;
        TextView pricerest;

        public viewHolder(View item) {
            super(item);
            photorest=item.findViewById(R.id.photorest);
            nomrest=item.findViewById(R.id.nomrest);
            pricerest=item.findViewById(R.id.pricerest);
        }

        public void updateInfo(MockupRest mockupHotel) {
            photorest.setImageResource(mockupHotel.getPhoto());
            nomrest.setText(mockupHotel.getNom());
            pricerest.setText(mockupHotel.getPrice());
        }
    }
}
