/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso1_Memento;

import java.util.ArrayList;

/**
 *
 * @author gerald
 */
public class CareTaker {
    private ArrayList<Memento> estados;
    private ArrayList<Memento> savePoints;

    public CareTaker() {
        estados = new ArrayList<>();
        savePoints = new ArrayList<>();
    }
    
    public void limpiarCareTaker () {
        this.estados.clear();
        this.savePoints.clear();
    }
    
    public void guardarEstado(Memento estado) {
        this.estados.add(estado);
    }
    
    public void guardarSavePoint(Memento savePoint) {
        System.out.println("Posicion del savepoint: "+Integer.toString(this.savePoints.size()));
        this.savePoints.add(savePoint);  
    }
    
    public Memento undo() {
        Memento memento = estados.get(estados.size()-2);
        estados.remove(estados.size()-1);
        return memento;
    }
    
    public Memento obtenerSavePoint(int posicion) {
        Memento memento = estados.get(posicion);
        return memento;
    }
    
    
}
