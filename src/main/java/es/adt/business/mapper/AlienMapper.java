package es.adt.business.mapper;

import es.adt.business.dto.AlienDto;
import es.adt.business.model.Character;
import es.adt.business.model.Response;

import java.util.ArrayList;
import java.util.List;

public class AlienMapper {

    public static AlienDto alienToAlienDto(Response aliensResponse){

        AlienDto alienDto = new AlienDto();
        alienDto.setCount(aliensResponse.getInfo().getCount());

        List<String> names = new ArrayList<>();

        for(Character character:aliensResponse.getResults()){
            names.add(character.getName());
        }

        alienDto.setNames(names);

        return alienDto;
    }

}
