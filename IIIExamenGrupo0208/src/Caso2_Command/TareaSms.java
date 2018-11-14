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
public class TareaSms implements Tarea{

    private void enviarSms() {
        System.out.println("Se está enviando el mensaje de sms...");
    }
    
    @Override
    public void run() {
       enviarSms(); 
    }
    
}
