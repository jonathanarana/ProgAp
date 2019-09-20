
package Ejercicio2;


/**
 *
 * @author Jonathan Arana
 */
public abstract class Juego {
    private int vidas;
    public Juego(int vidas){
     this.vidas=vidas;   
    }
    
    public void Juega(){
        
    }
    
    public void ReiniciarPartida(int vidas){
        this.vidas=vidas;
        System.out.println("Bienvenido al Juego, Tienes "+vidas+" Vidas para Adivinar un numero entre 0 y 10\n¡¡SUERTE!!");
    }
    
    public boolean QuitaVida(){
        vidas=vidas-1;
        boolean retorno=true;
        if (vidas<1) {
            retorno=false;
            System.out.println("Perdiste, Hasta la Proxima!!");
        }
        return retorno;
    }
    
    public int getVidas(){
        return vidas;
    }
}
