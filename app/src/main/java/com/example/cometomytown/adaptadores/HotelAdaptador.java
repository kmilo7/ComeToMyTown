package com.example.cometomytown.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cometomytown.R;
import com.example.cometomytown.mockups.MockupHotel;

import java.util.ArrayList;

public class HotelAdaptador extends RecyclerView.Adapter<HotelAdaptador.viewHolder> {
    //ATRIBUTOS
    public ArrayList<MockupHotel> listHotel;

    //CONSTRUCTOR
    public HotelAdaptador(ArrayList<MockupHotel> listHotel){
        this.listHotel = listHotel;
    }

    @NonNull
    @Override
    public HotelAdaptador.viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View vista= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mockuphotel,null,false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull HotelAdaptador.viewHolder viewHolder, int i) {
        viewHolder.updateInfo(listHotel.get(i));
    }

    @Override
    public int getItemCount() {
        return  listHotel.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{
        ImageView photHotel;
        TextView nomHotel;
        TextView priceHotel;
        TextView descHotel;

        public viewHolder(View item){
            super(item);
            photHotel=item.findViewById(R.id.phototel);
            nomHotel=item.findViewById(R.id.nomhotel);
            priceHotel=item.findViewById(R.id.pricehotel);
            descHotel=item.findViewById(R.id.deschotel);
        }

        public void updateInfo(MockupHotel mockupHotel){
            photHotel.setImageResource(mockupHotel.getPhoto());
            nomHotel.setText(mockupHotel.getNom());
            priceHotel.setText(mockupHotel.getPrice());
            descHotel.setText(mockupHotel.getDesc());
        }
    }
}
