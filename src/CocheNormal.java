public class CocheNormal extends Motor{
    private int no_puerta;
    private float vel_act;
    private String modelo;

    public float getVel_act() {
        return vel_act;
    }

    public void setVel_act(float vel_act) {
        this.vel_act = vel_act;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void AumentarVelo(){
        this.vel_act += 20;
    }
    public void DisminuirVelo(){
        this.vel_act -= 3;
    }
}
