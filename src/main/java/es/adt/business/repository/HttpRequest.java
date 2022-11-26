package es.adt.business.repository;

import com.google.gson.Gson;
import es.adt.business.model.Response;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class HttpRequest {

    public static List<Response> getAliveAlien() throws MalformedURLException {

        URL url;

        try{
            url = new URL("https://rickandmortyapi.com/api/character/?species=alien&status=alive");
        } catch (Exception ex){
            throw ex;
        }

        try (
                Reader reader = new BufferedReader(new InputStreamReader(url.openStream()));

                ) {

            Response response = new Gson().fromJson(reader, Response.class);

            System.out.println(response);

        } catch (Exception exc){

        }


        Gson gson = new Gson();

        return null;
    }

}
