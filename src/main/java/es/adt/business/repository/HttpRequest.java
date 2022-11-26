package es.adt.business.repository;

import com.google.gson.Gson;
import es.adt.business.model.Character;
import es.adt.business.model.Response;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class HttpRequest {

    public static Response getAliveAlien() throws MalformedURLException {

        return getResponse("https://rickandmortyapi.com/api/character/?species=alien&status=alive");
    }

    public static List<Character> getCharacterWithMoreEpisodes() throws MalformedURLException {

        return getResponse("https://rickandmortyapi.com/api/character").getResults();

    }

    public static Response getResponse(String url) throws MalformedURLException {
        URL requestUrl;

        Response response;

        try{
            requestUrl = new URL(url);
        } catch (Exception ex){
            throw ex;
        }

        try (
                Reader reader = new BufferedReader(new InputStreamReader(requestUrl.openStream()));

        ) {

            response = new Gson().fromJson(reader, Response.class);

            return  response;

        } catch (Exception exc){

        }

        return null;
    }

}
