/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iiiexamengrupo0208;

import Caso1_Memento.Calculadora;
import Caso1_Memento.CareTaker;
import Caso1_Memento.Memento;
import java.awt.Point;

/**
 *
 * @author gerald
 */
public class IIIExamenGrupo0208 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /**
         * 
         * Caso 1 Memento Ejemplo
         * 
        */
        System.out.println("-----------------------Caso1-------------------");
        CareTaker careTaker = new CareTaker();
        
        Calculadora calculadora = new Calculadora();
        
        calculadora.asignarValorX(5);
        
        System.out.println("");
        
        calculadora.asignarValorY(7);
        
        System.out.println("");
        
        calculadora.asignarValorZ(4);
        
        System.out.println("");
        
        calculadora.setVariableX(calculadora.operacionAritmetica(calculadora.getVariableX(), 0, "suma"));
        
        careTaker.guardarEstado(calculadora.guardarEstadoMemento());
        
        System.out.println("");
        
        System.out.println("Save point");
        
        System.out.println("Valor x: "+Double.toString(calculadora.getVariableX()));
        System.out.println("Valor y: "+Double.toString(calculadora.getVariableY()));
        System.out.println("Valor z: "+Double.toString(calculadora.getVariableZ()));
        
        careTaker.guardarSavePoint(calculadora.savePoint());
        
        System.out.println("");
        
        calculadora.setVariableX(calculadora.operacionAritmetica(calculadora.getVariableX(), 3, "resta"));
        
        careTaker.guardarEstado(calculadora.guardarEstadoMemento());
        
        System.out.println("");
        
        System.out.println("Antes de la operacion");
        
        System.out.println("Valor x: "+Double.toString(calculadora.getVariableX()));
        System.out.println("Valor y: "+Double.toString(calculadora.getVariableY()));
        System.out.println("Valor z: "+Double.toString(calculadora.getVariableZ()));
        
        System.out.println("");
        
        calculadora.setVariableX(calculadora.operacionAritmetica(calculadora.getVariableX(), calculadora.getVariableZ(), "potencia"));
        
        careTaker.guardarEstado(calculadora.guardarEstadoMemento());
       
        System.out.println("");
        
        System.out.println("Antes del undo");
        
        System.out.println("Valor x: "+Double.toString(calculadora.getVariableX()));
        System.out.println("Valor y: "+Double.toString(calculadora.getVariableY()));
        System.out.println("Valor z: "+Double.toString(calculadora.getVariableZ()));
        
        calculadora.undo(careTaker.undo());
        
        System.out.println("");
        
        System.out.println("Despues del undo");
        System.out.println("Valor x: "+Double.toString(calculadora.getVariableX()));
        System.out.println("Valor y: "+Double.toString(calculadora.getVariableY()));
        System.out.println("Valor z: "+Double.toString(calculadora.getVariableZ()));
        
        System.out.println("");
        
        System.out.println("Recuperar save point");
        
        calculadora.obtenerSavePoint(careTaker.obtenerSavePoint(0));
        
        System.out.println("Despues del savepoint");
        System.out.println("Valor x: "+Double.toString(calculadora.getVariableX()));
        System.out.println("Valor y: "+Double.toString(calculadora.getVariableY()));
        System.out.println("Valor z: "+Double.toString(calculadora.getVariableZ()));
    }
    
}
