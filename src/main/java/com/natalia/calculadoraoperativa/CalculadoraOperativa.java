/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.natalia.calculadoraoperativa;
import com.natalia.calculadoraoperativa.Lectura.Opciones;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



/**
 *
 * @author lenovo
 */
public class CalculadoraOperativa {
/**
 * Clase principal de la calculadora operativa.
 * Inicia el programa y maneja posibles excepciones.
 */

     public static void main(String args[])
    {
        BufferedReader bIn = new BufferedReader( new InputStreamReader (System.in) ); // bIn es objeto de la clase Buffered, new InputStreamReade es un constructor, system.in entradas( ya sea teclado, mouse, etc)
        try{   
            Opciones.logica(bIn);
        }
        catch(IOException e){

            System.err.println("Ocurrio un erro de IO" + e); //system.err imprime mensajes informando un error
            System.out.println("Hubo un erro de IO" + e);
        }       
        catch(Exception e){
            System.err.println("Ocurrio un error grave " + e);
        }
}
}     
     
    