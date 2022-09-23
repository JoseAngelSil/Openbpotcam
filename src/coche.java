// Creacion de una clase
public class coche {
    //Creacion y declaracion de atributos
    int no_puerta, velocidad_max;
    float vel_act;
    private String modelo;
    private boolean estado;

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return this.modelo;
    }

    public coche(){ // Constructor sin entradas
        no_puerta = 5;
        velocidad_max = 12;
    }
    public coche(int no_puerta, int velocidad_max) {// Creacion de un constructor con entrada
        // buena practica con this.nombreVariableGlobal = VariableLocal
        this.no_puerta = no_puerta;
        this.velocidad_max = velocidad_max;
    }

    // Creacion de funciones de la clase
    public void acelerar(){
        vel_act += 15;
    }
    public void desacelerar(){
        vel_act -= 10;
    }
}
