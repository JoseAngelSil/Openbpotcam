public class Main {
    public static void main(String[] args){
        //Declaracion de un nuevo objeto de la clase coche.
        coche mi_coche = new coche();

        //Enviar datos del objeto
        mi_coche.setModelo("Renault Clio 2003");
        //invocar funciones del coche
        System.out.printf("Cantidad de puertas: %d\n", mi_coche.no_puerta);
        System.out.printf("Velocidad Maxima: %d\n", mi_coche.VelocidadMaxima);
        System.out.printf("Modelo: %S\n",mi_coche.getModelo());
        System.out.println(mi_coche.ValidacionMatricula(mi_coche.Matricula = "XXX"));
        mi_coche.DiHola();


        coche mi_coche2 = new coche(7,360);

        //invocar funciones del coche
        System.out.printf("Cantidad de puertas: %d\n", mi_coche2.no_puerta);
        System.out.printf("Velocidad Maxima: %d\n", mi_coche2.VelocidadMaxima);

        // Objeto de coche electrico
        Coche_Electrico C_Elec1 = new Coche_Electrico();
        C_Elec1.Matricula = "ASC-45S";
        C_Elec1.setModelo("Tesla 2023");
        C_Elec1.setEstadoBateria(45);
        C_Elec1.setSonido("brbrbrbrbrbrbrbr");
        System.out.printf("Modelo: %s\nEstado Bateria = %d porciento\n",C_Elec1.getModelo(),C_Elec1.getEstadoBateria());
        System.out.printf("Cantidad de puertas = %d\n", C_Elec1.no_puerta);
        System.out.printf("Velocidad Maxima: %d\n", C_Elec1.VelocidadMaxima);
        System.out.println(mi_coche.ValidacionMatricula(C_Elec1.Matricula = "XXX"));
        System.out.printf("Sonido = %S\n", C_Elec1.getSonido());

    }

}
