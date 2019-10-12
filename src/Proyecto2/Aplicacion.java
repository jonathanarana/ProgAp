/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto2;


import java.util.Scanner;


/**
 *
 * @author master
 */
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String argumento;
        Scanner scanner = new Scanner(System.in);

        CalculoDiferencial derivada = new CalculoDiferencial();

        derivada.instrucciones();

        argumento = scanner.next();

        System.out.println(derivada.calcular(argumento));

    }

}
