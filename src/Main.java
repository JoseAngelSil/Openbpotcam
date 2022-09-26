/*
    Author: Jose Angel Silva Cruz
    Fecha: 26/09/2022
 */

public class Main {
    public static void main(String[] args){
        // Creacion de objeto de cliente
        Cliente cliente1 = new Cliente();
        cliente1.setNombre("Jose Bolaños Santiago");
        cliente1.setEdad((byte) 42);
        cliente1.setTelefono("+52 56 1122 3556");
        cliente1.setCredito(4560);

        System.out.printf("Nombre de cliente: %s\nEdad: %d\nTelefono: %s\nCredito Disponible: %d",
                cliente1.getNombre(), cliente1.getEdad(), cliente1.getTelefono(), cliente1.getCredito());

        // Objeto de Trabajador
        Trabajador trabajador1 = new Trabajador();
        trabajador1.setNombre("Josue Araiza");
        trabajador1.setEdad((byte) 23);
        trabajador1.setTelefono("+52 56 2231 4578");
        trabajador1.setSalario(5600);
        System.out.printf("\n\nNombre de trabajador: %s\nEdad: %d\nTelefono: %s\nSalario: %d",
                trabajador1.getNombre(),trabajador1.getEdad(), trabajador1.getTelefono(), trabajador1.getSalario());
    }
}
