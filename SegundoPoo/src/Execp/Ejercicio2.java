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
public class Ejercicio2 {

    public static void main(String[] args) {

        //int valor = 10/0;
        //int valor = Integer.parseInt("Loja");
        Scanner td = new Scanner(System.in);

        int num;
        int dem;
        int op =1;
        int result=0;
        
        do {
                try {
                    System.out.println("Ingrese Numerador: ");
                    num = td.nextInt();
                    System.out.println("Ingrese Denominador: ");
                    dem = td.nextInt();
                    result = num/dem;
                    op=0;
                    

                } catch (ArithmeticException e) {
                    System.err.println("Ingrese Nuevamente la Operacion: ");
                }

        } while (op ==1);
        System.out.println(result);

    }

}
