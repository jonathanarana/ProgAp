/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto1;

/**
 *
 * @author master
 */
public class Interes {
    
    protected double variables[] = new double[4];
    protected String nvariables[]={"valor presente","valor futuro","tasa de interes en decimal","numero de periodos"};
    
    public Interes(double[] variables){
        this.variables=variables;
    }
    
    public double CalculaVP(){
        double resultado=0.0;
        return resultado;
    }
    
    public double CalculaVF(){
        double resultado=0.0;
        return resultado;
    }
    
    public double CalculaI(){
        double resultado=0.0;
        return resultado;
    }
    
    public double CalculaN(){
        double resultado=0.0;
        return resultado;
    }
    
    public void ImprimeVariables(){
        for (int i = 0; i < 4; i++) {
            System.out.println(this.nvariables[i]+": "+this.variables[i]);
        }
    }
    
}
