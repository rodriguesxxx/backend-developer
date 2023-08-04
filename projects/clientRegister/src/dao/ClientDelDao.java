package dao;

import dao.ClientSearchDao;
import database.ClientDB;
import models.Client;

public class ClientDelDao {

    public static void del(Integer id){

        Client client = ClientSearchDao.getClietById(id);
        ClientDB.del(client);
    }

}
