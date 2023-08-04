package dao;

import models.Client;

public class ClientUpdateDao {

    public static void update(Client client){

        ClientDelDao.del( client.getId() );

        ClientAddDao.add( client );
    }

}
