package com.sergiojavierre.dominio.factory;

import com.sergiojavierre.dominio.factory.enemies.DAOEnemy;
import com.sergiojavierre.dominio.factory.objectives.DAOObjective;

public class DAOFactory {

    private static DAOFactory daoFactory;

    private DAOEnemy daoEnemy;
    private DAOObjective daoObjective;

    private DAOFactory(){}

    public static DAOFactory getInstance(){
        if(daoFactory == null){
            daoFactory = new DAOFactory();
        }
        return daoFactory;
    }

    public DAOEnemy getDaoEnemy(){
        if(daoEnemy == null){
            daoEnemy = new DAOEnemy();
        }
        return daoEnemy;
    }

    public DAOObjective getDaoObjective(){
        if(daoObjective == null){
            daoObjective = new DAOObjective();
        }
        return daoObjective;
    }

}
