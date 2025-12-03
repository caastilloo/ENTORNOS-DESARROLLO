package org.example;

import java.util.Scanner;

public class MaryPoppins {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("------------------------------------------");

        System.out.print("Introduce cuantas palabras quieres dar la vuelta: ");
        int numero_vueltas = teclado.nextInt();

        System.out.println("------------------------------------------");

        for (int i = 0; i < numero_vueltas; i++) {

            System.out.println("Introduce la palabra para darle la vuelta:");
            String palabra = teclado.next();
            String invertida = "";

            for (int j = palabra.length()-1; j >= 0; j--) {
                invertida += palabra.charAt(j);
            }

            System.out.println("Palabra invertida:");
            System.out.println(invertida);

            System.out.println("------------------------------------------");
        }


        }




    }
