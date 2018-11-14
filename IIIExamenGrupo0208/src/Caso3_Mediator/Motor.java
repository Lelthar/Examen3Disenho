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
public class Motor implements Parte{
    private Programacion programacion;
    
    @Override
    public void setProgramacion(Programacion programacion) {
        this.programacion=programacion;
    }
    
    public void iniciarMotor(int fuerza){
        System.out.println("Motor inicia ejecución con una fuerza de : "+fuerza);
        this.programacion.iniciarCiclo();
    }
}
