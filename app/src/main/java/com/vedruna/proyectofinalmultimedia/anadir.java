package com.vedruna.proyectofinalmultimedia;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class anadir extends Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_anadir, container, false);

        // Buscar referencia al ImageButton por su ID en la vista inflada
        ImageButton imageButton = view.findViewById(R.id.imageButton2);

        // Agregar un OnClickListener al ImageButton
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Manejar el clic del botón
                // Aquí puedes agregar el código para navegar de regreso a la actividad deseada
                Intent intent = new Intent(getActivity(), Login.class); // Reemplaza Login con el nombre de tu actividad objetivo
                startActivity(intent);
            }
        });

        return view;
    }
}