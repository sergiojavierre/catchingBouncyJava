package com.sergiojavierre.dominio.entidades.enemies;

public class FastEnemy extends Decorator{

    public FastEnemy(Enemy enemy) {
        super(enemy);
        speed += 5;
    }
}
