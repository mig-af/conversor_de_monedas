package com.alura.conversormonedas.modulos;

import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest;

import java.net.URI;

public class Requests {



    public HttpResponse<String> get(String url){
        try{
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();

            HttpResponse<String> resp = client.send(request, HttpResponse.BodyHandlers.ofString());
            return resp;
        
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
