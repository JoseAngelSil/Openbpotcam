/*
    Author: Jose Angel Silva Cruz
    Fecha: 20/09/2022
 */

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        int no1,no2,no3;
        no1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        no2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        no3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        JOptionPane.showMessageDialog(null, "La Suma es: " + suma_tresNo(no1,no2,no3));

        //Ejercicio de Coche
        coche mi_coche = new coche();
        mi_coche.add_door();
        mi_coche.add_door();
        JOptionPane.showMessageDialog(null, "Cantidad de puertas es de " + mi_coche.can_doors);
    }
    public static int suma_tresNo(int a, int b, int c){
        return a + b + c;
    }
}

class coche {
    public int can_doors = 4;

    public void add_door(){
        this.can_doors++;
    }
    public void res_door(){
        this.can_doors--;
    }

}