package taller1;

import java.util.Scanner;

/**
 *
 * @author Cristian Ibañez
 */
public class Principal {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        GestionContacto gest = new GestionContacto(leer.nextInt());//5 contactos
        
        int op,i=0;
        do{
            System.out.println("\nMenu del Programa\n");
            System.out.println("1.Agregar un contacto");
            System.out.println("2.Mostrar inforamcion de los contactos");
            System.out.println("3.Modificar un contacto");
            System.out.println("0.Salir\n");

            
            op = leer.nextInt();//ingreso de opcion a elegir

            switch(op){
                case 1:{
                    System.out.println("\nIngrese los datos del nuevo contacto\n");
                    gest.agregarContactos(gest.getCon(),i);
                    i++;
                    break;
                }
                case 2:{
                    System.out.println("\n||Contactos||\n");
                    gest.mostrarContactos(gest.getCon(),i);
                    break;
                }
                case 3:{
                    int contacto;
                    System.out.print("\nIngrese el contacto a modificar: ");
                    contacto = leer.nextInt();
                    contacto--;
                    gest.modificarTelefono(contacto);
                    break;
                }

            }
        }while(op != 0);    
    }
    
}
