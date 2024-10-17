package com.alura.conversormonedas.modulos;

public class MenuOpciones {

    String message = """
        ---------------------------------\033[1;32m
        
    ░█████╗░░█████╗░███╗░░██╗██╗░░░██╗███████╗██████╗░░██████╗░█████╗░██████╗░
    ██╔══██╗██╔══██╗████╗░██║██║░░░██║██╔════╝██╔══██╗██╔════╝██╔══██╗██╔══██╗
    ██║░░╚═╝██║░░██║██╔██╗██║╚██╗░██╔╝█████╗░░██████╔╝╚█████╗░██║░░██║██████╔╝
    ██║░░██╗██║░░██║██║╚████║░╚████╔╝░██╔══╝░░██╔══██╗░╚═══██╗██║░░██║██╔══██╗
    ╚█████╔╝╚█████╔╝██║░╚███║░░╚██╔╝░░███████╗██║░░██║██████╔╝╚█████╔╝██║░░██║
    ░╚════╝░░╚════╝░╚═╝░░╚══╝░░░╚═╝░░░╚══════╝╚═╝░░╚═╝╚═════╝░░╚════╝░╚═╝░░╚═╝\033[0m
        
        Bienvenido al conversor de monedas 

        Elige una opcion
        
        1: convertir de dolar a peso argentino $USD > $ARS
        2: convertir peso arg a dolar $ARS > $USD
        3: convertir dolar a real brasileno $USD > $BRL
        4: Convertir real a dolar $BRL > USD 
        5: convertir dolar a peso colombiano $USD > $COP
        6: convertir peso colombiano a dolar $COP > $USD 
        7: Salir 
            """;

    
    @Override
    public String toString(){
        return this.message;
    }
}
