package com.vedruna.proyectofinalmultimedia.model;

import androidx.annotation.NonNull;

public class Player {
    public String name;
    public String position;
    public String clubName;
    public String imageURL;

    public Player() {
    }

    public Player(String name, String position, String clubName, String imageURL) {
        this.name = name;
        this.position = position;
        this.clubName = clubName;
        this.imageURL = imageURL;
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
        return "Id: " + getName() + " / Posicion: " + getPosition() + " / Club: " + getClubName();
    }
}
