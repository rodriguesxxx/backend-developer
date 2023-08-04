import dao.ClientUpdateDao;
import models.Client;
import dao.ClientAddDao;
import dao.ClientSearchDao;
import dao.ClientDelDao;

public class Main {
    public static void main(String[] args) {
        Client newCliente = new Client("Daniel", 12, "3372848374");
        Client newCliente2 = new Client("Maria", 99, "3344344");

        ClientAddDao.add(newCliente);

        System.out.println(ClientSearchDao.getAllClient());

        newCliente.setName("Jose");

        ClientUpdateDao.update(newCliente);

        System.out.println(ClientSearchDao.getAllClient());


    }
}