package br.rodriguesxxx;

import java.util.Date;

import br.rodriguesxxx.services.DaysOfLifeService;
import jakarta.xml.ws.Endpoint;

public class App
{
    public static void main( String[] args )
    {
        DaysOfLifeService daysOfLifeService = new DaysOfLifeService();
        Endpoint.publish("http://localhost:8080/service/daysOfLife", daysOfLifeService);
        System.out.println("service is live!");
    }
}
