
package enunciado6_tp8;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Racional {
    private float num;
    private float den;
    Scanner leer = new Scanner(System.in);
    public Racional() {
        this.num = num;
        this.den = den;
        if(num/2==0)this.num=num/2;
        if(den/2==0)this.den=den/2;
    }
    
    public boolean distintoAUno(){
        boolean x = true;
        if(den==1){
            x = false;
        }
        return x;
    }
    
    public void Multiplicacion(int num1,int den1,int num2,int den2){
        System.out.print("El resultado de la multiplicacion: "+(num1*num2)+"/"+(den1*den2));
    }
    
    public void Division(int num1,int den1,int num2,int den2){
        int aux1=0,aux2=0;
        aux1=(num1*den2);
        aux2=(num2*den1);
        
        System.out.print("El resultado de la multiplicacion: "+aux1+"/"+aux2);
    }
    
    public float getNum() {
        return num;
    }

    public float setNum() {
        this.num=num;
        num = leer.nextFloat();
        return num;
    }

    public float getDen() {
        return den;
    }

    public float setDen() {
        this.den=den;
        den = leer.nextFloat();
        return den;
    }
    
    
}
