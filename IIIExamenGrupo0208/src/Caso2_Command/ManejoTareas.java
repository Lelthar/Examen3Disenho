/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso2_Command;

import java.util.concurrent.Semaphore;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gerald
 */
public class ManejoTareas {
   private Semaphore semaforoListaEspera;
   private boolean correr;
   private ArrayList<Tarea> listaEspera;

    public ManejoTareas() {
        semaforoListaEspera = new Semaphore(1);
        correr = false;
        listaEspera = new ArrayList<>();
    }
   
    public void pararHilos() {
        this.correr = false;
    }
    
    public void iniciarHilos(int cantidad) {
        this.correr = true;
        for (int i = 0; i < cantidad; i++) {
            HiloEjecucion hiloEjecucion = new HiloEjecucion();
            hiloEjecucion.start();
        }
    }
    
    public void agregarTarea(Tarea tarea) throws InterruptedException {
        semaforoListaEspera.acquire();
        listaEspera.add(tarea);
        semaforoListaEspera.release();
    }
    
    private class HiloEjecucion extends Thread {
        private HiloEjecucion() {
            
        }
        
        public void run() {
            while (correr) {
                try {
                    semaforoListaEspera.acquire();
                    
                    if (!listaEspera.isEmpty()) {
                        Tarea tarea = listaEspera.get(0);
                        listaEspera.remove(0);
                        tarea.run();
                    }
 
                    semaforoListaEspera.release();
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ManejoTareas.class.getName()).log(Level.SEVERE, null, ex);
                }   
                
            }
        }
    }
}
