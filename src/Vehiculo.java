abstract public class Vehiculo {
    public int VelocidadMaxima;
    public String Matricula, sonido;

    abstract void setSonido(String sonido); // Creacion de metodos abstractos
    abstract public String getSonido();
    public void DiHola(){
        System.out.println("Hola!!");
    }
    public  boolean ValidacionMatricula(String Matricula){
        if(Matricula == "XXX")
            return true;
        return false;
    }
}
