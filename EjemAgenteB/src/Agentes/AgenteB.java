/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agentes;
import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import Agentes.Comportamiento;
/**
 *
 * @author Alex Faru
 */
public class AgenteB extends Agent {
    
    int num = 0;
    protected void setup(){
        Comportamiento bh = new Comportamiento();
        this.addBehaviour(bh);
    }
    
}
