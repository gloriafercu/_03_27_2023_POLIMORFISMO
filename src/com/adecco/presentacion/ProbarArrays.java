package com.adecco.presentacion;

import java.util.Arrays;

public class ProbarArrays {
    public static void main(String[] args) {
        // Definición de Array
        int[] numeros = new int[3];
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 5;
        System.out.println("Primera celda -> " + numeros[0]);
        System.out.println("Segunda celda -> " + numeros[1]);
        System.out.println("Tercera celda -> " + numeros[2]);

        // Definición de array en dos líneas
        String[] nombres; // no se cuantas posiciones tiene mi array aún
        // Puedo pedir los nombres mediante un scanner o como sea
        nombres = new String[3];
        nombres[0] = "Juan";
        nombres[1] = "Ana";
        nombres[2] = "Julia";
        System.out.println("Primera celda -> " + nombres[0]);
        System.out.println("Segunda celda -> " + nombres[1]);
        System.out.println("Tercera celda -> " + nombres[2]);

        System.out.println(Arrays.toString(nombres));
    }
}
