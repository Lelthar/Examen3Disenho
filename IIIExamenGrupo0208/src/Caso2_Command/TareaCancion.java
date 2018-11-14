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
public class TareaCancion implements Tarea{
    
    private void sonarCancion() {
        System.out.println("Está sonando la canción...");
    }
    
    @Override
    public void run() {
       sonarCancion();
    }
    
}
