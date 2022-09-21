/*
    Author: Jose Angel Silva Cruz
    Fecha: 21/09/2022
 */

import javax.swing.*;

public class Main {
    public static void main(String[] args){

        // Practica de sentencias
        int no1;
        no1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        numero_mayor_igual_cero no = new numero_mayor_igual_cero(no1);
        no.decicion();
        // Practica 2 de bucles
        bucle_While mi_bucle = new bucle_While();
        mi_bucle.bucle_while();
        mi_bucle.do_while();
        mi_bucle.bucle_for();

        // estacion
        int Opcion_estacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero de la estacion de cada año"));
        estaciones obten_estacion = new estaciones(Opcion_estacion);
        JOptionPane.showMessageDialog(null, obten_estacion.estacion_es());
    }

}
