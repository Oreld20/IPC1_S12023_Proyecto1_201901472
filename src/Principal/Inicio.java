
package Principal;

import java.util.ArrayList;

/**
 *
 * @author Oreld
 */
public class Inicio {
    
    public static ArrayList<Clientes> clientes;
    public static void main (String[] args){
    Login pantalla = new Login(clientes);
   
    pantalla.setVisible(true);
    pantalla.setLocationRelativeTo(null);
    } 
}
