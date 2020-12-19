package com.sergiojavierre.dominio.factory.objectives;

import com.sergiojavierre.dominio.entidades.Objective;

public interface IDAOObjective {
    public Objective[] generateObjectives(Integer levelNumber);
}
