package com.sergiojavierre.dominio.entidades;

import com.sergiojavierre.dominio.entidades.enemies.Boss;

public class Player extends Character{

    private Boss boss;

    public Player(Integer posX, Integer posY, String name) {
        super(posX, posY, name);
    }

    public void take(Objective o){
        System.out.println("He encontrado el primer objetivo!");
        boss.run();
    }

    public void suscribe(Boss boss){
        this.boss = boss;
    }

}
