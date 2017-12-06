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
public class Asignacion {

    Estudiante[] lista_Est;
    double[] notas_mats;
    double[] notas_soci;
// CONSTRUCTOR

    public Asignacion(Estudiante[] lista_Est, double[] notas_mats, double[] notas_soci) {
        this.lista_Est = lista_Est;
        this.notas_mats = notas_mats;
        this.notas_soci = notas_soci;
    }

    //METODOS
    public void setLista_Est(Estudiante[] lista_Est) {
        this.lista_Est = lista_Est;
    }

    public Estudiante[] getLista_Est() {
        return lista_Est;
    }

    public void setNotas_mats(double[] notas_mats) {
        this.notas_mats = notas_mats;
    }

    public double[] getNotas_mats() {
        return notas_mats;
    }

    public void setNotas_soci(double[] notas_soci) {
        this.notas_soci = notas_soci;
    }

    public double[] getNotas_soci() {
        return notas_soci;
    }

    //METODOS PROMEDIOS
    public double obtener_promedios() {
        double prom = 0;
        for (int i = 0; i < notas_mats.length; i++) {
            prom = (notas_mats[i] + notas_soci[i]) / 2;
        }
        return prom;
    }

    public double obtener_promedios_totales_m() {
        double sum = 0;
        double prom = 0;
        for (int i = 0; i < notas_mats.length; i++) {
            sum = sum + notas_mats[i];
        }
        prom = sum / notas_mats.length;
        return prom;
    }

    public double obtener_promedios_totales_s() {
        double sum2 = 0;
        double prom = 0;
        for (int i = 0; i < notas_soci.length; i++) {
            sum2 = sum2 + notas_soci[i];
        }
        prom = sum2 / notas_soci.length;
        return prom;
        
    }

    @Override
    public String toString() {
        String cadena = String.format("\n\tMatematicas: %.2f"
                + "\nSociales: %.2f\nPromedio: %.2f",getNotas_mats(),getNotas_soci()
                ,obtener_promedios() );
        return cadena;
    }
    
    

}
