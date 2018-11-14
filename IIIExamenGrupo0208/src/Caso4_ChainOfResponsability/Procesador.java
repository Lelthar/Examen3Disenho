/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso4_ChainOfResponsability;

/**
 *
 * @author Rigo-PC
 */
public interface Procesador {
    
    public void setProcesador(Procesador procesador);
    
    public Procesador getProcesador();
   
    public void procesarArchivo(Archivo archivo);
}
