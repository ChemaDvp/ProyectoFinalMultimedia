package com.vedruna.proyectofinalmultimedia.interfaces;

import com.vedruna.proyectofinalmultimedia.model.Player;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CRUDInterfaces {

    @GET("player")
    Call<List<Player>> getAll();
}
