package org.example;

import java.util.Scanner;

public class YoSoyTu {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("----------------------------------------------");

        System.out.print("Introduce cuantas pruebas se quieren realizar: ");
        int num_pruebas = teclado.nextInt();

        System.out.println("------------------------");

        for (int i = 1; i < num_pruebas+1; i++) {

            System.out.print("Nombre del PERSONAJE " + i + ": ");
            String nombre = teclado.next();
            System.out.print("Parentesco del PERSONAJE " + i + ": ");
            String parentesco = teclado.next();

            if (nombre.equals("Luke")  && parentesco.equals("padre")){
                System.out.println("Resultado de la prueba:");
                System.out.println("-> TOP SECRET");
            }else {
                System.out.println("Resultado de la prueba:");
                System.out.println("-> " + nombre + ", yo soy tu " + parentesco);
            }

            System.out.println("------------------------");

        }






    }
}
