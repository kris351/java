package enunciado6_tp8;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Principal {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Racional rac1 = new Racional();
        Racional rac2 = new Racional();
        
        System.out.println("||Menu de opciones||");
        System.out.println("1.Ingresar racionales");
        System.out.println("2.Operar multiplicacion");
        System.out.println("3.Operar division");
        System.out.println("0.Salir");
        
        int op;
        op = leer.nextInt();
        
        do{
            switch(op){
                case 1:{
                    System.out.print("\nIngrese un numero racional:");
                    System.out.print("\nNumero 1:");
                    System.out.print("\nNumerador:"+rac1.setNum());
                    System.out.print("\nDenominador:"+rac1.setDen());
                    System.out.print("\n\nNumero 2:");
                    System.out.print("\nNumerador:"+rac2.setNum());
                    System.out.print("\nDenominador:"+rac2.setDen());
                }
            }
            
        }while(op!=0);
    }
    
}
