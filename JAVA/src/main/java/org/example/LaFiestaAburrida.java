package org.example;

import java.util.Scanner;

public class LaFiestaAburrida {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("------------------------------");

        System.out.print("Personas que no conoce Tintín: ");
        int numero = teclado.nextInt();

        teclado.nextLine();

        System.out.println("------------------------------");

        for (int i = 0; i < numero; i++) {

            System.out.println("Introduce tu nombre: ");

            String frase = teclado.nextLine();
            String partes[] = frase.split(" ");

            String nombre = partes[1];

            System.out.println("Hola, " + nombre + ".");

            System.out.println("------------------------------");
        }
    }
}
