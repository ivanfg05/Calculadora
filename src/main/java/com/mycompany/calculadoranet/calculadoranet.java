package com.mycompany.calculadoranet;

import java.util.Scanner;

public class calculadoranet {
//estamos trabajando en la rama1 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bienvenido a la Calculadora");
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        
        double resultado = sumar(num1, num2);
        
        System.out.println("El resultado de la suma es: " + resultado);
    }
    
    public static double sumar(double num1, double num2) {
        return num1 + num2;
    }
}
