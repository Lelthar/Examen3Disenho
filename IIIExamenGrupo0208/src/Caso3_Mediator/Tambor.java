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
public class Tambor implements Parte{
    
    private Programacion programacion;
    
    @Override
    public void setProgramacion(Programacion programacion) {
        this.programacion=programacion;
    }
    
    public void iniciar(){
        System.out.println("Cargando ropa..");
        this.programacion.abrir();
    }
    
    public void lavar(){
        System.out.println("Lavando ropa...");
        this.programacion.terminarCiclo();
    }
    
}
