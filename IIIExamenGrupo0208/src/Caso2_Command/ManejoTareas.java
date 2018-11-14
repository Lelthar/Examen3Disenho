/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso2_Command;

import com.sun.corba.se.impl.orbutil.concurrent.Mutex;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gerald
 */
public class ManejoTareas {
   private Mutex mutexListaEspera;
   private boolean correr;
   private ArrayList<Tarea> listaEspera;

    public ManejoTareas() {
        mutexListaEspera = new Mutex();
        correr = false;
        listaEspera = new ArrayList<>();
    }
   
    public void pararHilos() {
        this.correr = false;
    }
    
    public void iniciarHilos(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            HiloEjecucion hiloEjecucion = new HiloEjecucion();
            hiloEjecucion.start();
        }
    }
    
    public void agregarTarea(Tarea tarea) throws InterruptedException {
        mutexListaEspera.acquire();
        listaEspera.add(tarea);
        mutexListaEspera.release();
    }
    
    private class HiloEjecucion extends Thread {
        private HiloEjecucion() {
            
        }
        
        public void run() {
            while (correr) {
                try {
                    mutexListaEspera.acquire();
                    
                    if (!listaEspera.isEmpty()) {
                        Tarea tarea = listaEspera.get(0);
                        listaEspera.remove(0);
                        tarea.run();
                    }
                    
                    mutexListaEspera.release();
                } catch (InterruptedException ex) {
                    Logger.getLogger(ManejoTareas.class.getName()).log(Level.SEVERE, null, ex);
                }   
                
            }
        }
    }
}
