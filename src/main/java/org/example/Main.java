package org.example;

import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);
    static String lectTeclado;
    static int posicion;

    public static void main(String[] args) {

        System.out.println("Introduzca una cadena: ");
        lectTeclado = scan.nextLine();
        System.out.println("Posición buscada (Desde la posición 0): ");
        posicion = scan.nextInt();
        scan.close();

        Main charEn = new Main();

        try {
           System.out.println("Carácter de la posición " + posicion + " encontrado: " + charEn.caracterEn(lectTeclado, posicion));
        } catch (Exception e){
            System.out.println("Excepcion: " + e.getMessage());
        }

    }

    char caracterEn(String lectTeclado, int posicion) throws Exception {
        if (posicion < 0 || lectTeclado.length() < posicion){
            throw new Exception("Has intentado recuperar una posición de la cadena de caracteres que no existe.");
        }
        return lectTeclado.charAt(posicion);
    }
}