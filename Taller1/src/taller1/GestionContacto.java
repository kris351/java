package taller1;

/**
 *
 * @author Cristian
 */
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
    
    public void agregarContactos(Contacto[] contacto, int indice){ 
       if(indice >= 0 && indice < contacto.length){
            Contacto cont = contacto[indice];
            cont.leerContacto();
        }
    }

    public void mostrarContactos(Contacto[] contacto, int tamanio){ //mostrar todos los contactos
        for(int i=0;i<tamanio;i++){
            contacto[i].mostrarContacto();
        }
    }
    
    public void modificarTelefono(int contacto){
        for(int i=0;i<getCon().length;i++){
            if(i == contacto){
                getCon()[i].setTelefono(leer.nextFloat());
            }
        }
    }

    public Contacto[] getCon() {
        return con;
    }

    public void setCon(Contacto[] con) {
        this.con = con;
    }
}
