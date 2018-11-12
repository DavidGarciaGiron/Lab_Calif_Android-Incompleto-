package com.example.david.matriculaapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class PersonasAdapter extends RecyclerView.Adapter<PersonasAdapter.ViewHolder>{
    private List<Persona> personas;

    public PersonasAdapter(){
        this.personas = new ArrayList<>();
    }

    public void setPersonas(List<Persona> personas){
        this.personas = personas;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tipoText;
        public TextView correoText;

        public ViewHolder(View itemView){
            super(itemView);
            tipoText = itemView.findViewById(R.id.tipo_text);
            correoText = itemView.findViewById(R.id.correo_text);
        }
    }

    @Override
    public PersonasAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_persona, parent,
                false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(PersonasAdapter.ViewHolder viewHolder,int position){
        Persona persona = this.personas.get(position);

        viewHolder.tipoText.setText(persona.getTipo());
        viewHolder.correoText.setText(persona.getCorreo());


    }

    @Override
    public int getItemCount(){
        return this.personas.size();
    }




}
