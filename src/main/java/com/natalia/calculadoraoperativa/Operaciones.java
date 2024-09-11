/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.natalia.calculadoraoperativa;

/**
 *
 * @author lenovo
 */
public class Operaciones {
    
    //Operadores aritméticos
    
    public int suma(int a, int b){
        System.out.println(a + " + " + b + " = " + (a+b));
        return a + b;
    }
    
    public int resta(int a, int b){
        System.out.println(a + " - " + b + " = " + (a-b));
        return a - b;
    }
    
    public int multiplicar(int a, int b){
        System.out.println(a + " * " + b + " = " + (a*b));
        return a*b;
    }
    
    public double dividir(double  a, double b){
        if (b==0){
            System.out.println("El divisor ingresado es cero, ingrese un numero diferente de cero");
            return 0;     
        }
        System.out.println(a + " / " + b + " = " + (a/b));
        return a / b;
    }
    
    // Operadores racionales
    
    public boolean igual(int a , int b){
        System.out.println(a + " == " + b + " = " + (a==b));
        return a == b;
    }
    
    public boolean mayor(int a, int b){
        System.out.println(a + " > " + b + " = " + (a>b));
        return a > b;
    }
    
    public boolean menor(int a, int b){
        System.out.println(a + " < " + b + " = " + (a>b));
        return a < b;
    }
    
    //Operadores de bits
    
    public int operadorAnd(int a, int b){
        System.out.println(a + " & " + b + " = " + (a & b));
        System.out.println(a + "(binario: "+ Integer.toBinaryString(a) + ")");
        System.out.println(b + "(binario: "+ Integer.toBinaryString(b) + ")");
        return (a & b);
    }
    
    public int operadorOr(int a, int b){
        System.out.println(a + "|" + b + "=" + (a|b));
        System.out.println(a + "(binario: "+ Integer.toBinaryString(a) + ")");
        System.out.println(b + "(binario: "+ Integer.toBinaryString(b) + ")");
        return a | b;
    }
    
    public int operadorNot(int a){  // el operador not solo invierte un valor
        System.out.println("~" + a + " = " + (~a));
        System.out.println(a + "(binario: "+ Integer.toBinaryString(a) + ")");
        return ~a;
    }
    
    public int operadorElevado(int a, int b){
        System.out.println(a + " ^ " + b + " = " + (a^b));
        System.out.println(a + "(binario: "+ Integer.toBinaryString(a) + ")");
        System.out.println(b + "(binario: "+ Integer.toBinaryString(b) + ")");
        return a ^ b;
    }
    
    public int operadorShiftDerecha(int a, int b){   //a es el numeor a dasplazar y b es el numero de posciones
        System.out.println(a + " >> " + b + " = " + (a>>b));
        return a >> b;
    }
    
    public int operadorShiftIzquierda(int a, int b){ //igual al anterior pero se desplaza hacia la izquierda
        System.out.println(a + " << " + b + " = " + (a<<b));
        return a << b;
    }
    
    //Operadores booleanos
    
    public boolean noBoolean(boolean a){
        System.out.println ("!" + a + "=" + (!a));
        return !a;
    }
    
    public int incremento(int a){
        
        System.out.println("++" + a + " = " + (++a));
        
        return a;
    }
    public int decremento(int a){
        
        System.out.println("--" + a + " = " + (--a));
        
        return a;
    }
    public int incremento2(int a, int b){
        System.out.println(a + " += " + b + "--->" + (a+=b) );
        return a;
    }
    public int decremento2(int a, int b){
        System.out.println(a + " -= " + b + "--->" + (a-=b) );
        return a;
    }
    public int incremento3(int a, int b){
        System.out.println(a + " *= " + b + "--->" + (a*=b) );
        return a;
    }  
    public int decremento3(int a, int b){
        System.out.println(a + " /= " + b + "--->" + (a/=b) );
        return a;
    }
}



