package com.alura.conversormonedas.conversiones;

import java.util.HashMap;
import java.util.Map;

public class Moneda {



    Map<String, String> moneda;

    public Moneda(){
        this.setMoneda();
    }

    public String getMoneda(String nombreMoneda){
        return moneda.get(nombreMoneda);
    }
    private void setMoneda(){
        moneda = new HashMap<>();
        moneda.put("dolar", "USD");
        moneda.put("peso argentino", "ARS");
        moneda.put("real brasilero", "BRL");
        moneda.put("peso colombiano", "COP");
    }


}
