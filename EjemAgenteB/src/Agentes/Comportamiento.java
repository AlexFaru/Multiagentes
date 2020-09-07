/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agentes;
import jade.core.behaviours.Behaviour;

/**
 *
 * @author Alex Faru
 */
public class Comportamiento extends Behaviour{
     int num = 0;
    public void action(){      
        System.out.println(num);
        num++;
    }
    public boolean done(){
        if(num <= 100)
            return false;
        return true;
    }
    
}
