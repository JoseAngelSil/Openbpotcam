public class Persona {
    public Persona() {
    }

    private int edad_persona;
    private String nombre_persona, tel_persona;

    public void setEdad_persona(int edad_persona) {
        this.edad_persona = edad_persona;
    }

    public void setNombre_persona(String nombre_persona) {
        this.nombre_persona = nombre_persona;
    }

    public void setTel_persona(String tel_persona) {
        this.tel_persona = tel_persona;
    }

    public int getEdad_persona() {
        return edad_persona;
    }

    public String getNombre_persona() {
        return nombre_persona;
    }

    public String getTel_persona() {
        return tel_persona;
    }
}
