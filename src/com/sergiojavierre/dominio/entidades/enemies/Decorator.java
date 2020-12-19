package com.sergiojavierre.dominio.entidades.enemies;

public abstract class Decorator extends Enemy{

    protected Enemy enemy;

    public Decorator(Enemy enemy){
        super(enemy.getPosX(), enemy.getPosY(), enemy.getName());
        this.enemy = enemy;
    }

}
