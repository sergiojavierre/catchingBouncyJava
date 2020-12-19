package com.sergiojavierre.dominio.entidades.enemies;

public class Boss extends Decorator{

    public Boss(Enemy enemy) {
        super(enemy);
    }

    public void run(){
        System.out.println("Grrrr!! :<(");
    }

}
