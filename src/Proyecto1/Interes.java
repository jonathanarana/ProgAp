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
    private float vp,vf,i;
    private int n;
    public Interes(float vp,float vf,float i, int n){
        this.vp=vp;
        this.vf=vf;
        this.i=i;
        this.n=n;
    }
    
    public void log(){
        System.out.println("VP: "+vp);
        System.out.println("VF: "+vf);
        System.out.println("I: "+i);
        System.out.println("N: "+n);
    }
}
