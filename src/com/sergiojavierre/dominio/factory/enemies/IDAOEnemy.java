package com.sergiojavierre.dominio.factory.enemies;

import com.sergiojavierre.dominio.entidades.enemies.Boss;
import com.sergiojavierre.dominio.entidades.enemies.Enemy;

import java.util.List;

public interface IDAOEnemy {
    public List<Enemy> generateEnemies(Integer levelNumber);
    public Boss generateBoss(Integer levelNumber);
}
