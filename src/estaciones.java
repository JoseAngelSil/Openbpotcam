public class estaciones {
    int estacion;

    public estaciones(int estacion) {
        this.estacion = estacion;
    }

    public String estacion_es(){
        switch (this.estacion){
            case 1:
                return "ES...Primavera";
            case 2:
                return "ES...Verano";
            case 3:
                return "ES...Otoño";
            case 4:
                return "ES...Invierno";
            default:
                return "Opcion no disponible";
        }
    }

}
