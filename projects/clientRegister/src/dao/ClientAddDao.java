package dao;

import java.util.Random;

import models.Client;
import database.ClientDB;

public class ClientAddDao {



    //PUBLIC METHODS
    public static  void add(Client client){


        if( isUniqueCpf(client.getCpf()) ){
            client.setId( generateId() );
            ClientDB.add(client);

        }
    }

    //PRIVATE METHODS
    private static boolean isUniqueCpf(String cpf){

       if( ClientSearchDao.getClientByCpf(cpf) == null) {
           return true;
       }

       return false;

    }

    private static Integer generateId(){

        Random generator = new Random();

        Integer id;

        do{
            id = generator.nextInt( 9999  );
        } while( !isUniqueId(id) );

        return id;
    }

    private static boolean isUniqueId(Integer id){

        if( ClientSearchDao.getClietById(id) == null ){
            return true;
        }

        return false;
    }

}
