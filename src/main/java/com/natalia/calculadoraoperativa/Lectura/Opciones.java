/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.natalia.calculadoraoperativa.Lectura;
import com.natalia.calculadoraoperativa.Lectura.Lectura;
import com.natalia.calculadoraoperativa.Operaciones;
import static com.natalia.calculadoraoperativa.Lectura.Lectura.tecladoInt;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author lenovo
 */
public class Opciones{
 /**
 * Clase Opciones
 * Se encarga de manejar la lógica de la calculadora operativa.
 * Permite seleccionar diferentes operaciones aritméticas, lógicas y de bits.
 */
    
    // Método principal que contiene la lógica del menú de opciones
    public static void logica(BufferedReader bIn) throws IOException{
    
    Lectura lectura = new Lectura();
    Operaciones operaciones =  new Operaciones();
    
    int opcion;
    // Ciclo que muestra el menú y realiza operaciones hasta que el usuario elija salir (opción 0)
    do{
        
         // Muestra las opciones del menú
            System.out.println("\n Calcualdora Operativa");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Igual");
            System.out.println("6. Mayor");
            System.out.println("7. Menor");
            System.out.println("8. Operador AND");
            System.out.println("9 Operador OR");
            System.out.println("10. Operador NOT");
            System.out.println("11. Operador Elevado");
            System.out.println("12. Operador desplazar shift a la derecha");
            System.out.println("13. Operador desplazar shift a la izquierda");
            System.out.println("14. Saber si es booleano");
            System.out.println("15. Operadores incrementales ++ ");
            System.out.println("16. Operadores decrementales -- ");
            System.out.println("17 Operadores incrementales +=" );
            System.out.println("18. Operadores decrementales -=");
            System.out.println("19. Operadores incrementales *=");
            System.out.println("20. Operadores decrementales /=");
            
            System.out.println("0. Salir");
            opcion = Lectura.tecladoInt(bIn, "Seleccione una opción: ");
            
            try {
                switch (opcion){
                    case 1:
                        int suma1 = Lectura.tecladoInt (bIn, "Ingrese el primer numero = " );
                        int suma2 = Lectura.tecladoInt (bIn, "Ingrese el segundo numero = " );
                        operaciones.suma(suma1,suma2);
                        break;
                    case 2:
                        int resta1 = Lectura.tecladoInt (bIn, "Ingrese el primer numero = " );
                        int resta2 = Lectura.tecladoInt (bIn, "Ingrese el segundo numero = " );
                        operaciones.resta(resta1,resta2);
                        break;
                    case 3:
                        int multiplicacion1 = Lectura.tecladoInt (bIn, "Ingrese el primer numero = " );
                        int multiplicacion2 = Lectura.tecladoInt (bIn, "Ingrese el segundo numero = " );
                        operaciones.multiplicar(multiplicacion1,multiplicacion2);
                        break;
                    case 4:
                        int division1 = Lectura.tecladoInt (bIn, "Ingrese el primer numero = " );
                        int division2 = Lectura.tecladoInt (bIn, "Ingrese el segundo numero = " );
                        operaciones.dividir(division1,division2);
                        break;
                    case 5:
                        int igual1 = Lectura.tecladoInt (bIn, "Ingrese el primer numero = " );
                        int igual2 = Lectura.tecladoInt (bIn, "Ingrese el segundo numero = " );
                        operaciones.igual(igual1,igual2);
                        break;
                    case 6:
                        int mayor1 = Lectura.tecladoInt (bIn, "Ingrese el primer numero = " );
                        int mayor2 = Lectura.tecladoInt (bIn, "Ingrese el segundo numero = " );
                        operaciones.mayor(mayor1,mayor2);
                        break;
                    case 7:
                        int menor1 = Lectura.tecladoInt (bIn, "Ingrese el primer numero = " );
                        int menor2 = Lectura.tecladoInt (bIn, "Ingrese el segundo numero = " );
                        operaciones.menor(menor1,menor2);
                        break;
                    case 8:
                        int and1 = Lectura.tecladoInt (bIn, "Ingrese el primer numero = " );
                        int and2 = Lectura.tecladoInt (bIn, "Ingrese el segundo numero = " );
                        operaciones.operadorAnd((and1),(and2));
                        break;
                    case 9:
                        int or1 = Lectura.tecladoInt (bIn, "Ingrese el primer numero = " );
                        int or2 = Lectura.tecladoInt (bIn, "Ingrese el segundo numero = " );
                        operaciones.operadorOr(or1,or2);
                        break;
                    case 10:
                        int not1 = Lectura.tecladoInt (bIn, "Ingrese el numero numero = " );
                        operaciones.operadorNot(not1);
                        break;
                    case 11:
                        int elevado1 = Lectura.tecladoInt (bIn, "Ingrese el primer numero = " );
                        int elevado2 = Lectura.tecladoInt (bIn, "Ingrese la potencia = " );
                        operaciones.operadorElevado(elevado1,elevado2);
                        break;
                    case 12:
                        int shiftderecha1 = Lectura.tecladoInt (bIn, "Ingrese el primer numero = " );
                        int shiftderecha2 = Lectura.tecladoInt (bIn, "Ingrese el numero de posiciones a correr el numero= " );
                        operaciones.operadorShiftDerecha(shiftderecha1,shiftderecha2);
                        break;
                    case 13:
                        int shiftizquierda1 = Lectura.tecladoInt (bIn, "Ingrese el primer numero = " );
                        int shiftizquierda2 = Lectura.tecladoInt (bIn, "Ingrese el numero de posiciones a correr el numero= " );
                        operaciones.operadorShiftIzquierda(shiftizquierda1,shiftizquierda2);
                        break;
                    case 14:
                        boolean valor = Lectura.tecladoBoolean(bIn, "Ingrese true or false = ");
                        operaciones.noBoolean(valor);
                        break;
                        
                    case 15:
                        int valorIncremental= Lectura.tecladoInt(bIn, "Ingrese un valor: ");
                     
                        operaciones.incremento(valorIncremental);
                        break;
                        
                    case 16:
                        int alorIncremental= Lectura.tecladoInt(bIn, "Ingrese un valor: ");
                        operaciones.decremento(alorIncremental);
                        break;
                    case 17:
                       int ValorIncremental= Lectura.tecladoInt(bIn, "Ingrese un valor: ");
                       int incremento= Lectura.tecladoInt(bIn, "Ingrese el valor a incrementar: ");
                       operaciones.incremento2(ValorIncremental, incremento);
                       break;
                    case 18:    
                       int vvalorIncremental= Lectura.tecladoInt(bIn, "Ingrese un valor: ");
                       int iincremento= Lectura.tecladoInt(bIn, "Ingrese el valor a decrementar: ");
                       operaciones.decremento2(vvalorIncremental, iincremento);
                       break;
                    case 19:
                       int valorIncremental2= Lectura.tecladoInt(bIn, "Ingrese un valor: ");
                       int incremento2= Lectura.tecladoInt(bIn, "Ingrese el valor a incrementar: ");
                       operaciones.incremento3(valorIncremental2 , incremento2); 
                       break;
                    case 20:   
                       int valorIncremental3= Lectura.tecladoInt(bIn, "Ingrese un valor: ");
                       int incremento3= Lectura.tecladoInt(bIn, "Ingrese el valor a decrementar: ");
                       operaciones.decremento3(valorIncremental3 , incremento3);
                    
                        
                    case 0:
                        System.out.println("Finalizado");
                        break;
                    default:
                        System.out.println("Opción no válida");
                        break;
                }
            }
                catch (IOException e){
                    System.out.println("Errro en la operacion");
                      // Captura errores de entrada/salida
            }
            
        }
         while (opcion != 0);
    }
}