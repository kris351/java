package enunciado5.tp8;

import java.util.Scanner;

/**
 *
 * @author alumnos
 */
public class Televisor {
    private String marca;
    private int cantCanales;
    private boolean estado;
    private int pulgadas;
    private int canalActual;
    
    Televisor(){//Primer constructor
        this.marca="Samsung";
        this.cantCanales=120;
        this.estado=false;
        this.pulgadas=42;
        this.canalActual=1;
    }
    
    Televisor(String m,int p){//Segundo constructor con parametros
        this.marca=m;
        this.cantCanales=120;
        this.estado=false;
        this.pulgadas=p;
        this.canalActual=2;
    }
    
    Televisor(int cant){//Tercer constructor con parametros
        this.setMarca();
        this.cantCanales=cant;
        this.estado=false;
        this.setPulgadas();
        this.canalActual=1;
    }

    public String getMarca() {
        return marca;
    }

    public final void setMarca() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la marca del televisor");
        marca = leer.nextLine();
    }

    public int getCantCanales() {
        return cantCanales;
    }

    public final void setCantCanales() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cant de canales del televisor");
        cantCanales = leer.nextInt();
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public final void setPulgadas() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese las pulgadas del televisor");
        pulgadas = leer.nextInt();
    }

    public int getCanalActual() {
        return canalActual;
    }

    public void setCanalActual(int canalActual) {
        this.canalActual = canalActual;
    }
    
    public void mostrar(){
        System.out.println("Marca: "+getMarca()+" Cantidad de Canales: "+getCantCanales()+
                " Pulgadas: "+getPulgadas()+" CanalActual: "+getCanalActual());
    }
    
    public void cambiarEstado(){
        if(isEstado()){
            setEstado(false);
            System.out.println("El TV "+getMarca()+" está apagado");
        }
        else{
            System.out.println("El TV "+getMarca()+" está prendido");
        }
    }
    
    public void cambiarCanal(int canal){
        if(canal<=getCantCanales()){
            canalActual = canal;
        }
        else
        {
            while(canal>getCantCanales()){
                canal = canal - getCantCanales();
            }
            canalActual = canal;
        }
        System.out.println("Canal actual: "+getCanalActual());
    }
    
    public void cambiarCanal(boolean canal){
        if(canal){
            if(canalActual!=cantCanales){
                canalActual++;
            }
            else{
                canalActual=1;
            }
            System.out.println("Canal actual: "+getCanalActual());
        }
        
    }
}
