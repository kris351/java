package taller;

import java.util.Scanner;

public class Contacto {
    private String nombre;
    private float telefono;
    private String email;
    private int tamanio;
    
    Scanner leer = new Scanner(System.in);
    
    public Contacto(){
        this.nombre=nombre;
        this.telefono=telefono;
        this.email=email;
    }
    
    public void leerContacto(){ //ingresar los datos del contacto
        System.out.print("\nIngrese el nombre:");
        nombre = leer.nextLine();
        System.out.print("\nIngrese el telefono:");
        telefono = leer.nextFloat();
        System.out.print("\nIngrese el correo electronico:");
        email = leer.next();
    }
    
    public void mostrarContacto(){ //mostrar los datos del contacto
        System.out.print("\nNombre:"+nombre);
        System.out.print("\nTelefono:"+telefono);
        System.out.print("\nCorreo:"+email);
    }
    // getters/setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getTelefono() {
        return telefono;
    }

    public void setTelefono(float telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
    
    
}
