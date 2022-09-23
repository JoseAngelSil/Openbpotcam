public class Main {
    public static void main(String[] args){
        //Declaracion de un nuevo objeto de la clase coche.
        coche mi_coche = new coche();

        //Enviar datos del objeto
        mi_coche.setModelo("Renault Clio 2003");
        //invocar funciones del coche
        System.out.printf("Cantidad de puertas: %d\n", mi_coche.no_puerta);
        System.out.printf("Velocidad Maxima: %d\n", mi_coche.velocidad_max);
        System.out.printf("Modelo: %S\n",mi_coche.getModelo());

        coche mi_coche2 = new coche(7,360);

        //invocar funciones del coche
        System.out.printf("Cantidad de puertas: %d\n", mi_coche2.no_puerta);
        System.out.printf("Velocidad Maxima: %d\n", mi_coche2.velocidad_max);
    }

}
