/*
    Author: Jose Angel Silva Cruz
    Fecha: 23/09/2022
 */

public class Main {
    public static void main(String[] args){
        // Creacion de objeto de clase persona
        Persona Carlos = new Persona();
        Carlos.setNombre_persona("Carlos Pacheco Solis");
        Carlos.setEdad_persona(30);
        Carlos.setTel_persona("+52 56 1733 6822");

        System.out.printf("Nombre: %s\nEdad: %d\nTeleforno: %s", Carlos.getNombre_persona(),
                Carlos.getEdad_persona(), Carlos.getTel_persona());
    }
}

