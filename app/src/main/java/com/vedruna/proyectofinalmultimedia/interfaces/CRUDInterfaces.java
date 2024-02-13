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

/**
 * Esta interfaz define métodos para realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) en la entidad Player
 */
public interface CRUDInterfaces {

    /**
     * Recupera todos los jugadores.
     * @return Una llamada asíncrona que devuelve una lista de objetos Player.
     */
    @GET("player")
    Call<List<Player>> getAll();

    /**
     * Crea un nuevo jugador.
     * @param player El objeto Player que se va a crear.
     * @return Una llamada asíncrona que devuelve el jugador recién creado.
     */
    @POST("player")
    Call<Player>create(@Body Player player);

    /**
     * Actualiza la información de un jugador existente.
     * @param id El identificador del jugador que se va a actualizar.
     * @param player El objeto Player con los nuevos datos.
     * @return Una llamada asíncrona que devuelve el jugador actualizado.
     */
    @PUT("player/{id}")
    Call<Player> actualizar(@Path("id") int id, @Body Player player);

    /**
     * Elimina un jugador existente.
     * @param id El identificador del jugador que se va a eliminar.
     * @return Una llamada asíncrona que no devuelve ningún resultado.
     */
    @DELETE("player/{id}")
    Call<Void>delete(@Path("id")int id);
}
