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
public class Valvula implements Parte{
    
    private Programacion programacion;
    
    @Override
    public void setProgramacion(Programacion programacion) {
        this.programacion=programacion;
    }
    
    public void abrir(){
        System.out.println("Valvula abierta: Llenando con agua..");
        this.programacion.cerrar();
    }
    
    public void cerrar(){
        System.out.println("Valvula cerrada: Agua lista..");
        this.programacion.encender();
    }
    
    public void eliminarDesechos(){
        System.out.println("Eliminando residuos..");
    }
}
