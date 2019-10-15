
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author master
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opt=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("¡¡Bienvenido!!\nSelecciona el proyecto a ejecutar:\n\t1\tJuego Adivina Numero\n\t2\tJuego Adivina Numero Par e Impar");
        System.out.println("\t3\tCalculadora de Intereses\n\t4\tCalculadora de Derivadas");
        System.out.print("Opcion:");
        opt=scanner.nextInt();
        System.out.println("\n\n\n\n\n\n\n");
        System.out.println("====================================================");
        switch(opt){
            case 1:
                Ejercicio1.Aplicacion.main(args);
                break;
            case 2:
                Ejercicio2.Aplicacion.main(args);
                break;
            case 3:
                Proyecto1.App.main(args);
                break;
            default:
                Proyecto2.Aplicacion.main(args);
                break;
        }
    }
    
}
