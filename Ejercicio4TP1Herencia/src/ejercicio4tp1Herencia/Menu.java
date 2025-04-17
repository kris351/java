
package ejercicio4tp1Herencia;

import java.util.Scanner;

public class Menu {
    private String[] opciones;
    private int cantOpciones;

    public Menu(String[] opciones, int cantOpciones) {
        this.opciones = opciones;
        this.cantOpciones = cantOpciones;
    }

    public String[] getOpciones() {
        return opciones;
    }

    public int getCantOpciones() {
        return cantOpciones;
    }

    public void setOpciones(String[] opciones) {
        this.opciones = opciones;
    }

    public void setCantOpciones(int cantOpciones) {
        this.cantOpciones = cantOpciones;
    }

    public void mostrarOpciones(){
        for(int i=0;i<getCantOpciones();i++){
            Consola.emitirMensajeLN("opcion"+(i+1)+":"+this.opciones[i]);
        }
    }
    
    public int ejecutar(){
        int opciones=0;
        do{
            Consola.emitirMensajeLN("Ingresar opcion:");
            opciones=Consola.leerInt();
        }while(opciones<=0 && opciones>cantOpciones);
        return opciones;
    }
}
