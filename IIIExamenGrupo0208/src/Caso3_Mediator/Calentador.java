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
public class Calentador implements Parte{
    
    private Programacion programacion;
    
    @Override
    public void setProgramacion(Programacion programacion) {
        this.programacion=programacion;
    }
    
    public void encender(int temp){
        System.out.println("Calentador encendido: Aumentando temperatura de agua..");
        if(this.programacion.determinarTemp(temp)){
            this.programacion.apagar();
        }
    }
    
    public void apagar(){
        System.out.println("Calentador apagado: Temperatura correcta del agua....");
        this.programacion.lavar();
    }
}
