package com.sergiojavierre.dominio.factory.enemies;

import com.sergiojavierre.aplicacion.Level;
import com.sergiojavierre.dominio.entidades.enemies.Boss;
import com.sergiojavierre.dominio.entidades.enemies.Enemy;
import com.sergiojavierre.dominio.entidades.enemies.FastEnemy;

import java.util.Arrays;
import java.util.List;

public class DAOEnemy implements IDAOEnemy{

    @Override
    public List<Enemy> generateEnemies(Integer levelNumber) {
        Enemy common1 = new Enemy(2,2,"Common1");
        Enemy common2 = new Enemy(5,5,"Common2");
        Enemy fast = new Enemy(10,10,"Fast");
        fast = new FastEnemy(fast); //le aumenta la velocidad a este enemigo
        return Arrays.asList(common1,common2,fast);
    }

    @Override
    public Boss generateBoss(Integer levelNumber) {
        return new Boss(new Enemy(5,10,"Boss"));
    }
}
