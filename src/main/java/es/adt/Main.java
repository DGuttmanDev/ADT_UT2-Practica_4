package es.adt;

import es.adt.business.repository.HttpRequest;
import es.adt.business.service.AlienService;

import java.net.MalformedURLException;

public class Main {
    public static void main(String[] args) throws MalformedURLException {
        
        AlienService as = new AlienService();

        System.out.println(as.getAliveAliens());

    }
}