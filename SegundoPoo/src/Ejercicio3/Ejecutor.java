/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Juan Ramón
 */
public class Ejecutor {

    public static void main(String[] args) {
        int numero_alumnos = 4;
        int contador = 1;
        int i=0;
        Scanner teclado = new Scanner(System.in);

        Estudiante[] lista = new Estudiante[4];

        double[] notas_matematicas = new double[4];

        double[] notas_sociales = new double[4];

        String nm;
        String ns;
        
        

        while (contador <= numero_alumnos) {
            try {
                String nombre;
                String apellido;
                Estudiante e = new Estudiante();
                
                System.out.print("Ingrese Nombre: ");
                nombre = teclado.nextLine();
                e.setNombre(nombre);
                

                System.out.print("Ingrese Apellido: ");
                apellido = teclado.nextLine();
                e.setApellido(apellido);
                
                lista[i] = e;
                
                System.out.print("Ingrese Nota Matematicas: ");
                nm = teclado.nextLine();
                notas_matematicas[i] = Double.parseDouble(nm);
                
                System.out.print("Ingrese Nota Sociales: ");
                ns = teclado.nextLine();
                notas_sociales[i] = Double.parseDouble(ns);
                
                
                
                System.out.println();
                contador++;
                i++;
                
                
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("ERROR");
            }
        }
        Asignacion as = new Asignacion(lista, notas_sociales, notas_sociales);
        System.out.println(lista);

    }

}
