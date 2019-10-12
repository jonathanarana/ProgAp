/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto2;


import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;


/**
 *
 * @author master
 */
public class CalculoDiferencial extends Calculo implements Operaciones{

    
    void instrucciones(){
        System.out.println("ingresa la ecuacion con el siguiente formato (Ax^n) +/- (Ax^n)");
        System.out.println("siendo A=coheficiente y n=exponente");
        System.out.println("(-9x^2)+(10)");
    }
    
    @Override
    String calcular(String a) {
        String funcion=a,resultado = "Resultado \t ";

        String monomios[]=funcion.split("\\)");
        int longitud=monomios.length;
       
        
        for (int i=0;i<longitud;i++){
            String coeficiente="",exponente="";
            
            monomios[i]=monomios[i].replace("(","");
            
            //buscamos coeficiente
            String aux[]=monomios[i].split("x");
            if (aux.length>1) {
                coeficiente=aux[0];
            }

            //buscamos exponente
            aux=monomios[i].split("\\^");
            if (aux.length>1) {
                exponente=aux[1];
            }

            
            //si se encontro coeficiente de deriva, sino se trataba de una constante
            if (coeficiente.length() > 0) {
                
                coeficiente=NewCoeficiente(coeficiente,exponente);
                if (i>0) {
                    if (coeficiente.contains("-")) {
                        resultado=resultado+"-";
                    }
                    else{
                        resultado=resultado+"-";
                    }
                }
                resultado=resultado+"("+coeficiente;
                
                exponente=NewExponente(exponente);
                
                
                
                if (exponente.length()>0) {
                    resultado=resultado+"x";
                    if (exponente.length()==1) {
                        if (parseInt(exponente) != 1) {
                            resultado=resultado+"^"+exponente;
                        }
                    }
                    else{
                        resultado=resultado+"^"+exponente;
                    }
                    
                }
            }
            resultado=resultado+")";
            
        } 
        resultado=resultado+"\n";
        return resultado;
    }
    
    String NewCoeficiente(String coeficiente, String exponente){
        String resultado="";
        if (coeficiente.contains("/") || exponente.contains("/") || coeficiente.contains(".") || exponente.contains(".")) {
            resultado=resultado+MultiplicarFraccion(HacerFraccion(coeficiente),HacerFraccion(exponente));
        }
        else{
            resultado=resultado+(parseInt(coeficiente)*parseInt(exponente));
        }
        return resultado;
    }
    
    String NewExponente(String exponente){
        String resultado="";
        int[] fraccion=HacerFraccion(exponente);
        fraccion[0]=fraccion[0]-fraccion[1];
        if (fraccion[0]<0 || fraccion[0]>0) {
            resultado=resultado+fraccion[0];
            if (fraccion[1] != 1) {
                resultado=resultado+"/"+fraccion[1];
            }
        }
        
        return resultado;
    }

    @Override
    public int[] HacerFraccion(String argumento) {
        int[] fraccion=new int[2]; //creamos el arreglo que contendra a la fraccion
        
        if (argumento.contains("/")) {
            String[] aux= argumento.split("/");
            fraccion[0]=parseInt(aux[0]);
            fraccion[1]=parseInt(aux[1]);
        }
        else if(argumento.contains(".")){
            String[] aux= argumento.split("\\.");
            
            int denominador=10/parseInt(aux[1]);
            
            fraccion[1]=denominador;
            fraccion[0]=(int) (parseFloat(argumento)/(parseFloat(aux[1])/10));
        }
        else{
            fraccion[0]=parseInt(argumento);
            fraccion[1]=1;
        }
        
        return fraccion;
    }

    @Override
    public String MultiplicarFraccion(int[] f1, int[] f2) {
        String resultado="";
        int[] producto= new int[2];
        producto[0]=f1[0]*f2[0];        
        producto[1]=f1[1]*f2[1];
        resultado=resultado+producto[0];
        if (producto[1] != 0) {
            resultado=resultado+"/"+producto[1];
        }
        return resultado;
    }
    
}
