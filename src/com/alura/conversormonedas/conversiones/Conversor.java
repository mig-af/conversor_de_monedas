package com.alura.conversormonedas.conversiones;
import com.google.gson.Gson;
import com.alura.conversormonedas.modulos.Requests;

public class Conversor extends Moneda{

   
    private String url = "https://v6.exchangerate-api.com/v6/b13a3bbdebfb6c1a0e8a2c37/pair/%s/%s/%d";



    public Conversion convertirMoneda(String from, String to, int monto){
        
        var resp = new Requests().get(url.formatted(getMoneda(from), getMoneda(to), monto));
        return new Gson().fromJson(resp.body(), Conversion.class);
    }


}
