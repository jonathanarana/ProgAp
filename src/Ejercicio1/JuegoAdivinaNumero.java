
package Ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Jonathan Arana
 */

public class JuegoAdivinaNumero extends Juego{
    private int numero,vidas;
    
    public JuegoAdivinaNumero(int vidas, int numero){
        super(vidas);
        this.numero=numero;
        this.vidas=vidas;
    }

    @Override
    public void Juega() {
        Scanner scanner = new Scanner(System.in);
        int actual;
        
        super.Juega();
        
        super.ReiniciarPartida(vidas);
        
        do {
            System.out.println("Ingresa un numero entre 0 y 10");
            actual=scanner.nextInt();
            if (actual==numero) {
                System.out.println("Acertaste!!");
                ActualizarRecord();
                break;
            }
            else{
                if (actual<numero) {
                    System.out.println("Buscamos un numero Mas Grande");
                }
                else{
                    System.out.println("Buscamos un numero Mas Pequeño");
                }
            }
            
        } while (super.QuitaVida());
        
    }
    
    public void ActualizarRecord(){
        System.out.println("Felicidades, lo lograste en "+((vidas+1) - super.getVidas())+" Intento(s)");
    }
    
}
