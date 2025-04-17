
package ejercicio4tp1Herencia;

public class Empresas {
    private Empleados[] empleados;
    private Clientes[] clientes;
    private int cantEmpleados;
    private int cantClientes;

    public Empresas(Empleados empleados, Clientes clientes, int cantEmpleados,
            int cantClientes) {
        this.empleados = new Empleados[cantEmpleados];
        this.clientes = new Clientes[cantClientes];
    }
    
    public void leerEmpleados(){
        for(int i=0;i<cantEmpleados;i++){
            empleados[i].setNombre(nombre);
            empleados[i].setEdad(i);
            empleados[i].setSueldo(i);
            empleados[i].setCategoria(i);
        }
    }
    
    public void leerClientes(){
        for(int i=0;i<cantClientes;i++){
            clientes[i].setNombre(nombre);
            clientes[i].setEdad(i);
            clientes[i].setTelefono(i);
        }
    }
}
