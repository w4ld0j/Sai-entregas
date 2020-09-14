/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;
import jade.core.behaviours.Behaviour;
/**
 *
 * @author Wodo
 */
public class Comportamiento extends Behaviour{
    private String agentName;
    
    public void setAgentName(String agentName){
        this.agentName = agentName;
    }
    public void action(){
        System.out.println("Hola Mundo, agente --> " + agentName);
    }
    public boolean done(){
        return true;
    }
}
