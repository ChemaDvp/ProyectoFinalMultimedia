package com.vedruna.proyectofinalmultimedia;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.vedruna.proyectofinalmultimedia.interfaces.CRUDInterfaces;
import com.vedruna.proyectofinalmultimedia.model.Player;
import com.vedruna.proyectofinalmultimedia.utils.Constants;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class anadir extends Fragment {


    EditText nameText;
    EditText idText;
    EditText posicionText;
    EditText equipoText;
    EditText editTextUrlImagen;
    Button button;
    CRUDInterfaces crudInterfaces;

    public anadir() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflar el diseño del fragmento
        View rootView = inflater.inflate(R.layout.fragment_anadir, container, false);

        // Inicializar los EditText
        idText = rootView.findViewById(R.id.editTextId);
        nameText = rootView.findViewById(R.id.editTextNombre);
        posicionText = rootView.findViewById(R.id.editTextPosicion);
        equipoText = rootView.findViewById(R.id.editTextEquipo);
        editTextUrlImagen = rootView.findViewById(R.id.editTextUrlImagen);

        // Inicializar el botón
        button = rootView.findViewById(R.id.buttonCrearProducto);

        // Puedes agregar un listener al botón si deseas manejar clics
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id = idText.getText().toString();
                String nombre = nameText.getText().toString();
                String posicion = posicionText.getText().toString();
                String equipo = equipoText.getText().toString();
                String urlImagen = editTextUrlImagen.getText().toString();

                // Verificar si alguno de los campos está vacío
                if (id.isEmpty() || nombre.isEmpty() || posicion.isEmpty() || equipo.isEmpty() || urlImagen.isEmpty()) {
                    // Mostrar Toast indicando que todos los campos son obligatorios
                    mostrarToast("Todos los campos son obligatorios");
                } else {
                    Player player = new Player(Integer.parseInt(id), nombre, posicion, equipo, urlImagen);
                    create(player);
                }
            }
        });

        return rootView;
    }

    private void create(Player player){
        Retrofit retrofit= new Retrofit.Builder().baseUrl(Constants.BASE_URL).
                addConverterFactory(GsonConverterFactory.create()).
                build();

        crudInterfaces= retrofit.create(CRUDInterfaces.class);
        Call<Player> call = crudInterfaces.create(player);

        call.enqueue(new Callback<Player>() {
            @Override
            public void onResponse(Call<Player> call, Response<Player> response) {
                if(!response.isSuccessful()){
                    Log.e("Response err ",response.message());
                    return;
                }
                Player player = response.body();
                mostrarToast("Jugador añadido correctamente: " + player.getName());
            }
            @Override
            public void onFailure(Call<Player> call, Throwable t) {
                Log.e("Throw err:",t.getMessage());
            }
        });
    }
    private void mostrarToast(String mensaje) {
        Toast.makeText(getActivity(), mensaje, Toast.LENGTH_SHORT).show();
    }
}