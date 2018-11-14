/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso2_Command;

/**
 *
 * @author gerald
 */
public class TareaGaleria implements Tarea{

    private void abrirGaleria() {
        System.out.println("Se está abriendo la galeria...");
    }
    
    @Override
    public void run() {
        abrirGaleria();
    }
    
}
