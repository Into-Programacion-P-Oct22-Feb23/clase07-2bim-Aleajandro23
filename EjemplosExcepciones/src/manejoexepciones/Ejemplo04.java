/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoexepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author reroes﻿​_
 */
public class Ejemplo04 {

    public static void main(String[] args) {
        
        try {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Ingrese valor 1:");
            int valor1 = entrada.nextInt(); // se espera un valor entero
            System.out.println("Ingrese valor 2:");
            int valor2 = entrada.nextInt(); // se espera un valor entero
            int resultado = valor1 / valor2;

            System.out.printf("Resultado %d", resultado);
        } catch (InputMismatchException input) {

            System.out.printf("Existe un error de tipo %s\n",
                    input);
        }
          catch (ArithmeticException arithmeticException) {

           System.out.printf("Existe un error de tipo %s\n",
                 arithmeticException);
       }
        System.out.println("Continuamos");

    }
}


// ENTRA EN EL EXAMEEEEEEEEN 
// ENTRA EN EL EXAMEEEEEEEEN 
// ENTRA EN EL EXAMEEEEEEEEN 
// ENTRA EN EL EXAMEEEEEEEEN 
// ENTRA EN EL EXAMEEEEEEEEN 
// ENTRA EN EL EXAMEEEEEEEEN 
// ENTRA EN EL EXAMEEEEEEEEN 