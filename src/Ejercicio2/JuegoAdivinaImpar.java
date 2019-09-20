
package Ejercicio2;

/**
 *
 * @author Jonathan Arana
 */
public class JuegoAdivinaImpar extends JuegoAdivinaNumero{

    public JuegoAdivinaImpar(int vidas, int numero) {
        super(vidas, numero);
    }
    
    @Override
    public boolean ValidaNumero(int n){
        if (n%2!=0) {
           return true; 
        }
        else{
            System.out.println("Error, Ingresa un numero impar");
            return false;
        }
        
    }
}
