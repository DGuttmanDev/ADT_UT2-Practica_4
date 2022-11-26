package es.adt.business.repository;

import com.google.gson.Gson;
import es.adt.business.model.Response;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class HttpRequest {

    public static Response getAliveAlien() throws MalformedURLException {

        URL url;

        Response response;

        try{
            url = new URL("https://rickandmortyapi.com/api/character/?species=alien&status=alive");
        } catch (Exception ex){
            throw ex;
        }

        try (
                Reader reader = new BufferedReader(new InputStreamReader(url.openStream()));

                ) {

            response = new Gson().fromJson(reader, Response.class);

            return  response;

        } catch (Exception exc){

        }

        return null;
    }

}
