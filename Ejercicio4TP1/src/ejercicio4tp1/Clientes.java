
package ejercicio4tp1;

public class Clientes {
    private String nombre;
    private int edad;
    private int telefono;

    public Clientes(String nombre, int edad, int telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
    }

    public void mostrarClientes(){
        Consola.emitirMensajeLN("Informacion del cliente");
        Consola.emitirMensajeLN(toString());
    }
    
    @Override
    public String toString(){
        return "Nombre:"+getNombre()+"\nEdad:"+getEdad()+
                "\nTelefono:"+getTelefono();
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = Consola.leerString();
    }

    public void setEdad(int edad) {
        this.edad = Consola.leerInt();
    }

    public void setTelefono(int telefono) {
        this.telefono = Consola.leerInt();
    }
    
    
}
