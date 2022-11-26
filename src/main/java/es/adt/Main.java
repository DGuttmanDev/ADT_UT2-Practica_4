package es.adt;

import es.adt.business.repository.HttpRequest;
import es.adt.business.service.AlienService;
import es.adt.business.service.FemaleCharacterService;

import java.net.MalformedURLException;

public class Main {
    public static void main(String[] args) throws MalformedURLException {

        FemaleCharacterService fcs = new FemaleCharacterService();
        System.out.println(fcs.getCharactersWithMaxEpisodes());

        /*
        AlienService as = new AlienService();

        System.out.println(as.getAliveAliens());


         */
    }
}