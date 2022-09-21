public class numero_mayor_igual_cero {
    public int numero;

    public numero_mayor_igual_cero(int numero) {
        this.numero = numero;
    }

    public void decicion(){
        mayor();
        menor();
        igual();
    }

    public void mayor(){
        if(numero > 0)
            System.out.println("El numero es mayor que 0");
    }
    public void menor(){
        if(numero < 0)
            System.out.println("El numero es menor que 0");
    }
    public void igual(){
        if(numero == 0)
            System.out.println("El numero es igual a 0");
    }
}
