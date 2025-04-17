
package ejercicio4tp1Herencia;

public class Persona {
    private String nombre;
    private int edad;
    private int telefono;
  
    public Persona(String nombre, int edad) {
        this.nombre = "";
        this.edad = edad;
    }
    public Persona() {
        this.nombre = "";
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
