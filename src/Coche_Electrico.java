final public class Coche_Electrico extends coche { //hacer que la clase no herede a mas clases
    private int estadoBateria;

    public Coche_Electrico() {
    }

    public int getEstadoBateria() {
        return estadoBateria;
    }

    public void setEstadoBateria(int estadoBateria) {
        this.estadoBateria = estadoBateria;
    }
}
