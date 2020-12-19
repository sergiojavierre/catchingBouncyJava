package com.sergiojavierre.dominio.factory.objectives;

import com.sergiojavierre.dominio.entidades.Objective;

public class DAOObjective implements IDAOObjective{
    @Override
    public Objective[] generateObjectives(Integer levelNumber) {
        //miro el nivel y genero los objetivos de acuerdo a ellos
        Objective[] objectives = new Objective[2];
        objectives[0] = new Objective(1,0); //objetivo que despierta al boss cuando lo coge el player
        objectives[1] = new Objective(5,0); //objetivo final para acabar el nivel
        return objectives;
    }
}
