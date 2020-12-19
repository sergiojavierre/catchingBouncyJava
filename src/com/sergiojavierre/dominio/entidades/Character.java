package com.sergiojavierre.dominio.entidades;

public abstract class Character extends Element{
    protected String name;

    public Character(Integer posX, Integer posY, String name) {
        super(posX, posY);
        this.name = name;
    }

    public void move(Integer x, Integer y) {
        this.posX += x;
        this.posY += y;
    }

    public String getName() {
        return name;
    }
}
