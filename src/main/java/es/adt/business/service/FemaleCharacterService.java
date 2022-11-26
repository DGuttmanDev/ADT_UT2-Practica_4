package es.adt.business.service;

import es.adt.business.model.Character;
import es.adt.business.repository.HttpRequest;

import java.net.MalformedURLException;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FemaleCharacterService {

    public Character getCharactersWithMaxEpisodes() throws MalformedURLException {

        List<Character> characters = HttpRequest.getCharacters();

        Collections.sort(characters, (o1, o2) -> {
            if(o2.getEpisode().size() > o1.getEpisode().size()){
                return 1;
            } else if(o2.getEpisode().size() > o1.getEpisode().size()){
                return 0;
            } else {
                return -1;
            }
        });

        return characters.get(0);
    }


}
