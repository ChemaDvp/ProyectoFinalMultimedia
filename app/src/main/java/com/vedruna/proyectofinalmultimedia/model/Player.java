package com.vedruna.proyectofinalmultimedia.model;

import androidx.annotation.NonNull;

public class Player {
    public int idPlayer;
    public String name;
    public String position;
    public String clubName;
    public String imageURL;

    public Player() {
    }

    public Player(int idPlayer, String name, String position, String clubName, String imageURL) {
        this.idPlayer = idPlayer;
        this.name = name;
        this.position = position;
        this.clubName = clubName;
        this.imageURL = imageURL;
    }

    public int getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(int idPlayer) {
        this.idPlayer = idPlayer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    @NonNull
    @Override
    public String toString() {
        return "Id: " + getIdPlayer() + " / Nombre: " + getName() + " / Posicion: " + getPosition() + " / Club: " + getClubName();
    }
}
