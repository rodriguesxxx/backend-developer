package database;

import models.Client;
import java.util.List;
import java.util.ArrayList;

public class ClientDB {

    private static List<Client> allClientSystem = new ArrayList<Client>();

    public static List<Client> getAllClients(){
        return allClientSystem;
    }

    public static void add(Client client){
        allClientSystem.add(client);
    }

    public static void del( Client client ) { allClientSystem.remove(client); }


}
