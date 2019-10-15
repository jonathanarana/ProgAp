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
public class InteresSimple extends Interes{

    public InteresSimple(double[] variables) {
        super(variables);
    }
    //0 vp      1 vf        2 i         3 n
    
    @Override
    public double CalculaVP(){
        double resultado=0.0;
        resultado=super.variables[1]/(1+super.variables[2]*super.variables[3]);
        super.variables[0]=resultado;
        return resultado;
    }
    
    @Override
    public double CalculaVF(){
        double resultado=0.0;
        resultado=super.variables[0]*(1+super.variables[2]*super.variables[3]);
        super.variables[1]=resultado;
        return resultado;
    }
    
    @Override
    public double CalculaI(){
        double resultado=0.0;
        resultado=((super.variables[1]/super.variables[0])-1)/super.variables[3];
        super.variables[2]=resultado;
        return resultado;
    }
    
    @Override
    public double CalculaN(){
        double resultado=0.0;
        resultado=((super.variables[1]/super.variables[0])-1)/super.variables[2];
        super.variables[3]=resultado;
        return resultado;
    }
}
