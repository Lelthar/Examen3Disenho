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
public class TareaCorreo implements Tarea{
    
    private void enviarCorreo() {
        System.out.println("Se está enviando el correo...");
    }
    
    @Override
    public void run() {
        enviarCorreo();
    }
    
}
