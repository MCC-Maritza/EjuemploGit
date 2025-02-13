
package ejuemplogit;
import java.util.Scanner;

/**
 *
 * @author maryse
 */

public class EjuemploGit {
    
    Scanner entrada = new Scanner (System.in);    
    String mensaje;
    
    public  void Mensaje(){
        
        mensaje= entrada.nextLine();
        System.out.println("El mensaje es: " + mensaje);
        
        
    }
    


    public static void main(String[] args) {
        //System.out.println("Hola Mundo");
        
        EjuemploGit ejemplo= new EjuemploGit();
        ejemplo.Mensaje();
    }
    
}
