package taller;

import java.util.Scanner;

public class GestionContacto {
    private Contacto[] con;
    Scanner leer = new Scanner(System.in);
    public GestionContacto(int tamanio) { //crear vector de tipo Contacto()
        con = new Contacto[tamanio];
        for(int i=0;i<tamanio;i++){
            con[i] = new Contacto();
        }
    }
    
    public void ingresarContactos(){ //ingresar los n contactos
        for(int i=0;i<con.length;i++){
            System.out.println("\nContacto "+(i+1)+":");
            con[i].leerContacto();
        }
    }
    
    public void agregarContacto(){//agregar un contacto al vector
        con[con.length] = new Contacto();
        con[con.length].leerContacto();
        
    }
    
    public void mostrarContactos(){ //mostrar todos los contactos
        for(int i=0;i<con.length;i++){
            con[i].mostrarContacto();
        }
    }
    
    public void modificarTelefono(int contacto){
        for(int i=0;i<con.length;i++){
            if(i == contacto){
                con[i].setTelefono(leer.nextFloat());
            }
        }
    }
}
