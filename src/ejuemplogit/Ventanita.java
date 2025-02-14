
package ejuemplogit;
import javax.swing.*;

/**
 *
 * @author maryse
 */


public class Ventanita extends JFrame{
    
    JLabel  nombre;
    JTextField tnombre;
    
    public Ventanita(){
        setTitle("Ejemplo");
        setSize(100, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        componentes();
        
    }
    
    public void componentes(){
        
        nombre = new JLabel("nombre");
        nombre.setBounds(50,50,100,50);
        
        tnombre = new JTextField();
        tnombre.setBounds(150, 50, 100, 50);
        
        add(nombre);
        add(tnombre);
        
        
    }
   
    
    public static void main(String args[]){
        
        Ventanita ven= new Ventanita();
        
        
        
    }
    
}
