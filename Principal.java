package taller;

import java.util.Scanner;

/**
 *
 * @author Cristian Ibañez
 */
public class Principal {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int tam=2; //tamaño del vector
        GestionContacto gest = new GestionContacto(tam);//5 contactos
        System.out.println("Ingrese los contactos");
        gest.ingresarContactos();//ingreso de los contactos
        int op;
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
                    gest.agregarContacto();
                    
                    break;
                }
                case 2:{
                    System.out.println("\n||Contactos||\n");
                    gest.mostrarContactos();
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

