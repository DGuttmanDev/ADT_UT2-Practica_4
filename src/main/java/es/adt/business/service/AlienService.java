package es.adt.business.service;

import es.adt.business.dto.AlienDto;
import es.adt.business.mapper.AlienMapper;
import es.adt.business.model.Response;
import es.adt.business.repository.HttpRequest;

import java.net.MalformedURLException;

public class AlienService {

    public AlienDto getAliveAliens() throws MalformedURLException {

        Response response = HttpRequest.getAliveAlien();

        AlienDto alienDto = AlienMapper.alienToAlienDto(response);

        return alienDto;

    }
}
