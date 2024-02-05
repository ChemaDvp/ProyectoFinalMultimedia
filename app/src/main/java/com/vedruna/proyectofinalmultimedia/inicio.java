package com.vedruna.proyectofinalmultimedia;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;

import com.vedruna.proyectofinalmultimedia.interfaces.CRUDInterfaces;
import com.vedruna.proyectofinalmultimedia.model.Player;
import com.vedruna.proyectofinalmultimedia.utils.Constants;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class inicio extends Fragment {

    List<Player> players;
    CRUDInterfaces crudInterface;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getAll();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_inicio, container, false);

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

    private void getAll() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create()).build();
        crudInterface = retrofit.create(CRUDInterfaces.class);
        Call<List<Player>> call = crudInterface.getAll();
        call.enqueue(new Callback<List<Player>>() {
            @Override
            public void onResponse(Call<List<Player>> call, Response<List<Player>> response) {
                if (!response.isSuccessful()) {
                    Log.e("Reponse error: " , response.message());
                    return;
                }
                players = response.body();
                players.forEach(p -> Log.i("Players: " , p.toString()));
            }

            @Override
            public void onFailure(Call<List<Player>> call, Throwable t) {
                Log.e("throw error: " , t.getMessage());
            }
        });
    }
}