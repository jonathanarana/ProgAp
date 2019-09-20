/**
 * 
 * Para Ejecuar pulse Mayus+F6
 * 
 * 
 * Si pulsa solo F6, ejecutara el primer ejercicio
 * 
 * 
 */

package Ejercicio2;



/**
 *
 * @author Jonathan Arana
 */
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // el primer argumento son las vidas y el segundo el numero a adivinar
        System.out.println("Adivina Numero");
        JuegoAdivinaNumero Adivina= new JuegoAdivinaNumero(3,2);
        Adivina.Juega();
        
        System.out.println("Adivina Numero Par");
        JuegoAdivinaPar AdivinaPar= new JuegoAdivinaPar(3,2);
        AdivinaPar.Juega();
        
        System.out.println("Adivina Numero Impar");
        JuegoAdivinaImpar AdivinaImpar= new JuegoAdivinaImpar(3,5);
        AdivinaImpar.Juega();
    }
    
}
