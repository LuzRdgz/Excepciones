package org.example;

import java.util.Scanner;

public class Main extends NumeroNegativoExcepcion {

    static Scanner scan = new Scanner(System.in);
    static double raiz, numero;

    public static void main(String[] args) {
        System.out.println("Ingrese un número: ");
        numero = scan.nextDouble();
        scan.close();

        try{
            numNegativo(numero);
        }catch (NumeroNegativoExcepcion e){
            System.out.println("Excepcion: " + e.getMessage());
        }

    }
    static void numNegativo(double numero) throws NumeroNegativoExcepcion{
            if (Main.numero < 0){
                throw new NumeroNegativoExcepcion("El número es negativo. La operación no puede realizarse.");
            } else {
                raiz = Math.sqrt(numero);
                System.out.println("La raíz cuadrada de " + numero + " es igual a " + raiz);
            }
        }
    }
