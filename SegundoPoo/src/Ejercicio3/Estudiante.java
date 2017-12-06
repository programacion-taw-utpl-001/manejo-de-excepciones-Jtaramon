/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author Juan Ramón
 */
public class Estudiante {
    String nombre;
    String apellido;
//CONSTRUCTOR
   
//METODOS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s %s", nombre,apellido);
        return cadena;
    }
     
    
}
