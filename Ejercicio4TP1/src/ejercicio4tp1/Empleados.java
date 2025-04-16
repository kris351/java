
package ejercicio4tp1;

public class Empleados {
    private String nombre;
    private int edad;
    private float sueldo;
    private int categoria;

    public Empleados(String nombre, int edad, float sueldo, int categoria) {
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
        this.categoria = categoria;
    }
    
    public void mostrarEmpleados(){
        Consola.emitirMensajeLN("Informacion del empleado");
        Consola.emitirMensajeLN(toString());
    }
    
    @Override
    public String toString(){
        return "Nombre:"+getNombre()+"\nEdad:"+getEdad()+"\nSueldo:"+getSueldo()
                +"\nCategoria:"+getCategoria();
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = Consola.leerString();
    }

    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = Consola.leerInt();
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = Consola.leerFloat();
    }

    public String getCategoria() {
        if(categoria==1){
            return "empleado subordinado";
        }else{
            return "empleado directivo";
        }
    }

    public void setCategoria(int categoria) {
        this.categoria = Consola.leerInt();
    }
    
}
