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
public interface Programacion {
    
    public void iniciar();
        
    public void encender();
    
    public void apagar();
    
    public void lavar();
    
    public void abrir();
    
    public void cerrar();
    
    public boolean determinarTemp(int temp);
        
    public void iniciarCiclo();
    
    public void terminarCiclo();
}
