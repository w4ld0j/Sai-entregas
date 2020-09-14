/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;
import jade.core.behaviours.Behaviour;
/**
 *
 * @author Wodo
 */
public class Comportamiento extends Behaviour{
    private int cont = 0;
    private boolean full = false;
    
    public void action(){
        cont++;
        System.out.println(cont);
        if(cont == 100) {
            full = true;
        }
    }
    public boolean done(){
        return full;
    }
}
