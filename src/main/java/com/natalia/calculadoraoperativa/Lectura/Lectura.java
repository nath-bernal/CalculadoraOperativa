/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.natalia.calculadoraoperativa.Lectura;

/**
 *
 * @author lenovo
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * Esta clase Lectura proporciona métodos para leer diferentes tipos de datos (int, double, String, boolean)
 * desde el teclado, utilizando un objeto BufferedReader para capturar la entrada del usuario.
 * Además, se han implementado validaciones básicas para garantizar que el usuario ingrese los datos en el formato correcto.
 */

public class Lectura {
        // Método para leer un número de tipo double
       public static double tecladoDouble(BufferedReader bIn, String mensaje) throws IOException{
        do
        {
               System.out.print(mensaje);
                      try{
                             double retornar = Double.parseDouble(bIn.readLine());
                             return retornar; // Retorna el valor 
                    }
                      catch(NumberFormatException e){
                            System.err.println("Debe ingresar un numero");// Captura el error si el usuario no ingresa un número válido
                    }
               }while(true);  // Repite el bucle hasta que se ingrese un valor válido
         }

       // Método para leer una cadena de texto (String)
       public static String tecladoCadena(BufferedReader bIn, String mensaje) throws IOException{
              System.out.print(mensaje);
              return bIn.readLine();    // Lee y retorna la cadena de texto ingresada
        }
       // Método para leer un valor boolean
       public static boolean tecladoBoolean(BufferedReader bIn, String mensaje) throws IOException{
              System.out.print(mensaje);
              return bIn.ready();
        }
        // Método para leer un número de tipo int
       public static int tecladoInt(BufferedReader bIn, String mensaje) throws IOException{
        do
        {
               System.out.print(mensaje);
                      try{
                             int retornar = Integer.parseInt(bIn.readLine());  // Intenta convertir la entrada en un número de tipo int
                             return retornar;
                    }
                      catch(NumberFormatException e){ // Captura el error si el usuario no ingresa un número entero válido
                            System.err.println("Debe ingresar un numero entero");
                    }
               }while(true); // Repite el bucle hasta que se ingrese un valor válido
       }

              
      
}
      
   