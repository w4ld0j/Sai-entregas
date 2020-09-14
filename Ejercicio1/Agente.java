/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;
import jade.core.Agent;
/**
 *
 * @author Wodo
 */
public class Agente extends Agent{
    
    private Comportamiento comp;
    
    protected void setup() {
        comp = new Comportamiento();
        comp.setAgentName(getAID().getName());
        
        this.addBehaviour(comp);
    }
}
