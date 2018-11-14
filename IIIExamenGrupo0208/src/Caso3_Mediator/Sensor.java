/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso3_Mediator;

/**
 *
 * @author Rigo-PC
 */
public class Sensor {
    
    public boolean evaluarTemperatura(int temp){
        System.out.println("Temperatura detectada por sensor: "+temp+" *C");
        return true;
    }
    
}
