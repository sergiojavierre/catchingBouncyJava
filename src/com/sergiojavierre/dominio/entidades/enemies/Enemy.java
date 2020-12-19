package com.sergiojavierre.dominio.entidades.enemies;

import com.sergiojavierre.dominio.entidades.Character;

public class Enemy extends Character {

    protected Integer speed = 5;

    public Enemy(Integer posX, Integer posY, String name) {
        super(posX, posY, name);
    }

}
