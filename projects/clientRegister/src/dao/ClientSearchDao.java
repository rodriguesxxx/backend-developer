package dao;
import database.ClientDB;
import models.Client;
import java.util.List;


public class ClientSearchDao {

    public static List<Client> getAllClient(){
        return ClientDB.getAllClients();
    }


    public static Client getClietById( Integer id ){

        for( Client client : ClientDB.getAllClients() ){

            if( client.getId() == id) {
                return client;
            }
        }

        return null;


    }

    public static Client getClientByCpf(String cpf){

        for( Client client : ClientDB.getAllClients() ){

            if( client.getCpf().equals( cpf ) )
                return client;

        }
        return null;
    }






}
