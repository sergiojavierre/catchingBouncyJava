package com.sergiojavierre.aplicacion;

import com.sergiojavierre.dominio.entidades.Objective;
import com.sergiojavierre.dominio.entidades.Player;
import com.sergiojavierre.dominio.entidades.enemies.Boss;
import com.sergiojavierre.dominio.entidades.enemies.Enemy;
import com.sergiojavierre.dominio.factory.DAOFactory;

import java.util.List;

public class Level {
    private Integer number;

    private Player player;
    private Boss boss;
    private List<Enemy> enemies;
    private Objective[] objectives;

    public Level(Integer number) {
        this.number = number;
    }

    public void play(){
        player = new Player(0,0,"sergiojavierre");
        enemies = DAOFactory.getInstance().getDaoEnemy().generateEnemies(number);
        boss = DAOFactory.getInstance().getDaoEnemy().generateBoss(number);
        objectives = DAOFactory.getInstance().getDaoObjective().generateObjectives(number);
        Objective firstObjective = objectives[0];
        Objective finalObjective = objectives[1];
        System.out.println("Enemigos en el nivel");
        enemies.stream().forEach(System.out::println);
        player.suscribe(boss);
        //bucle infinito hasta que el jugador y el objetivo final no coincidan en el escenario
        while(player.getPosX() != finalObjective.getPosX() || player.getPosY() != finalObjective.getPosY()){
            System.out.println("El jugador "+player.getName()+" está en ("+player.getPosX()+","+player.getPosY()+")");
            player.move(1,0);
            if(player.getPosX() == firstObjective.getPosX() && player.getPosY() == firstObjective.getPosY()){
                player.take(firstObjective);
            }
            else{
                boss.move(1,1); // aquí debería moverse hacia el jugador calculando el vector dirección
            }
        }
        System.out.println("He acabado");
    }
}
