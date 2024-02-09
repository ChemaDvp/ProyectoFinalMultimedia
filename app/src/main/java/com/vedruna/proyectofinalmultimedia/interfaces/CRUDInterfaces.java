package com.vedruna.proyectofinalmultimedia.interfaces;

import com.vedruna.proyectofinalmultimedia.model.Player;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface CRUDInterfaces {

    @GET("player")
    Call<List<Player>> getAll();

    @POST("player")
    Call<Player>create(@Body Player player);

    @PUT("player/{id}")
    Call<Player> actualizar(@Path("id") int id, @Body Player player);

    @DELETE("player/{id}")
    Call<Void>delete(@Path("id")int id);
}
