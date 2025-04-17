
package ejercicio4tp1Herencia;

public class Principal {

    public static void main(String[] args) {
        String[] op = new String[]{
            "cargarCliente","mostrarCliente","Salir"
        };
        Menu menu = new Menu(op, 2);
        menu.mostrarOpciones();
        
        int operacion=menu.ejecutar();
        switch(operacion){
            case 1:{
                
                break;
            }
            case 2:{
                
                break;
            }
            case 3:{
                
                break;
            }
        }
    }
    
}
