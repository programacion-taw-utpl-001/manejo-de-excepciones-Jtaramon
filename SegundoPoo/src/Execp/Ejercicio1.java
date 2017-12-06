/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Execp;

import java.util.Scanner;

/**
 *
 * @author Juan Ramón
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        String nombre;
        int edad;
        Scanner teclado = new Scanner(System.in);
        
        
        
        System.out.println("Ingrese su Edad: ");
        edad = teclado.nextInt();
        // Limpiar el buffer
        teclado.nextLine();
        System.out.println("Ingrese su nombre: ");
        nombre = teclado.nextLine();
        
        
        System.out.printf("\nSu nombre es %s\n",nombre);
        System.out.printf("Su edad es %d\n",edad);
        
    }
    
}
