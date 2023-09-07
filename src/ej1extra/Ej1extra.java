package ej1extra;

import Entidades.Alquiler;

public class Ej1extra {

    public static void main(String[] args) {
        Alquiler alquiler1 = new Alquiler();
        
        alquiler1.crearAlquiler();
        System.out.println(alquiler1 + alquiler1.getBarco().toString());
    }

}
