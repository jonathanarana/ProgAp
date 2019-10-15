//Temas
//Paradigma de POO, Clases y Objetos, Atributos, Métodos y Herencia.
//Agregación y asociación.

package Proyecto1;

import java.util.Scanner;

/**
 *
 * @author master
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double variables[] = {0.0,0.0,0.0,0.0};
       String nvariables[]={"valor presente","valor futuro","tasa de interes en decimal","numero de periodos"};
       int var,tipo;
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("Software para calcular Interés Simple e Interés Compuesto");
       
       
        System.out.println("Instrucciones: Selecciona la variable a calcular:\n\t0\tValor Presente\n\t1\tValor Futuro\n\t2\tTasa de Interes\n\t3\tNumero de periodos");
        System.out.print("Opcion:");
        var=scanner.nextInt();
        
        for (int i = 0; i < 4; i++) {
            if (i != var) {
                System.out.print("Ingresa valor para "+nvariables[i]+": ");
                variables[i]=scanner.nextDouble();
            }
        }
        
       System.out.println("Selecciona el tipo de interes a calcular:\n\t1\tInterés Simple\n\t2\tInterés Compuesto");
       System.out.print("Opcion:");
       
       tipo=scanner.nextInt();
       
       
       
       System.out.println("=====================================================");
        if (tipo == 1) {
            InteresSimple Inter=new InteresSimple(variables);
            switch(var){
                case 0:
                    Inter.CalculaVP();
                    break;
                case 1:
                    Inter.CalculaVF();
                    break;
                case 2:
                    Inter.CalculaI();
                    break;
                default:
                    Inter.CalculaN();
                    break;
            }
            Inter.ImprimeVariables();
        }
        else{
            InteresCompuesto Inter=new InteresCompuesto(variables);
            switch(var){
                case 0:
                    Inter.CalculaVP();
                    break;
                case 1:
                    Inter.CalculaVF();
                    break;
                case 2:
                    Inter.CalculaI();
                    break;
                default:
                    Inter.CalculaN();
                    break;
            }
            Inter.ImprimeVariables();
        }
        System.out.println("=====================================================");
    }
    
    
}
