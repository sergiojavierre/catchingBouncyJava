package com.sergiojavierre.dominio.entidades;

public abstract class Element {
    protected Integer posX;
    protected Integer posY;

    public Element(Integer posX, Integer posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public Integer getPosX() {
        return posX;
    }

    public Integer getPosY() {
        return posY;
    }
}
