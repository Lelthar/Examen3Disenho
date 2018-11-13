/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso1_Memento;

/**
 *
 * @author gerald
 */
public class Calculadora {
    private double variableX;
    private double variableY;
    private double variableZ;

    public Calculadora() {
        this.variableX = 0;
        this.variableY = 0;
        this.variableZ = 0;
    }
    
    public double getVariableX() {
        return this.variableX;
    }

    public void asignarValorX(double variableX) {
        System.out.println("Entrada");
        System.out.println("Operando 1: "+Double.toString(this.variableX));
        System.out.println("Operacion: Asignación");
        this.variableX = variableX;
        System.out.println("Salida");
        System.out.println("Operando 1: "+Double.toString(this.variableX));
        
    }

    public void setVariableX(double variableX) {
        this.variableX = variableX;
    }

    public void setVariableY(double variableY) {
        this.variableY = variableY;
    }

    public void setVariableZ(double variableZ) {
        this.variableZ = variableZ;
    }

    public double getVariableY() {
        return this.variableY;
    }

    public void asignarValorY(double variableY) {
        System.out.println("Entrada");
        System.out.println("Operando 1: "+Double.toString(this.variableY));
        System.out.println("Operacion: Asignación");
        this.variableY = variableY;
        System.out.println("Salida");
        System.out.println("Operando 1: "+Double.toString(this.variableY));
        
    }

    public double getVariableZ() {
        return this.variableZ;
    }

    public void asignarValorZ(double variableZ) {
        System.out.println("Entrada");
        System.out.println("Operando 1: "+Double.toString(this.variableZ));
        System.out.println("Operacion: Asignación");
        this.variableZ = variableZ;
        System.out.println("Salida");
        System.out.println("Operando 1: "+Double.toString(this.variableZ));
        
    }
    
    public double operacionAritmetica(double operando1, double operando2,String tipo) {
        if (tipo.equals("suma")) {
            System.out.println("Entrada");
            System.out.println("Operando 1: "+Double.toString(operando1));
            System.out.println("Operando 2: "+Double.toString(operando2));
            System.out.println("Operacion: Suma");
            System.out.println("");
            operando1 += operando2;
            System.out.println("Salida");
            System.out.println("Operando 1: "+Double.toString(operando1));
            System.out.println("Operando 2: "+Double.toString(operando2));
            System.out.println("Resultado: "+Double.toString(operando1));
            return operando1;
        } else if (tipo.equals("resta")) {
            System.out.println("Entrada");
            System.out.println("Operando 1: "+Double.toString(operando1));
            System.out.println("Operando 2: "+Double.toString(operando2));
            System.out.println("Operacion: Resta");
            System.out.println("");
            operando1 -= operando2;
            System.out.println("Salida");
            System.out.println("Operando 1: "+Double.toString(operando1));
            System.out.println("Operando 2: "+Double.toString(operando2));
            System.out.println("Resultado: "+Double.toString(operando1));
            return operando1;
        } else if (tipo.equals("multiplicacion")) {
            System.out.println("Entrada");
            System.out.println("Operando 1: "+Double.toString(operando1));
            System.out.println("Operando 2: "+Double.toString(operando2));
            System.out.println("Operacion: Multiplicación");
            System.out.println("");
            operando1 *= operando2;
            System.out.println("Salida");
            System.out.println("Operando 1: "+Double.toString(operando1));
            System.out.println("Operando 2: "+Double.toString(operando2));
            System.out.println("Resultado: "+Double.toString(operando1));
            return operando1;
        } else if (tipo.equals("division")) {
            System.out.println("Entrada");
            System.out.println("Operando 1: "+Double.toString(operando1));
            System.out.println("Operando 2: "+Double.toString(operando2));
            System.out.println("Operacion: División");
            System.out.println("");
            operando1 /= operando2;
            System.out.println("Salida");
            System.out.println("Operando 1: "+Double.toString(operando1));
            System.out.println("Operando 2: "+Double.toString(operando2));
            System.out.println("Resultado: "+Double.toString(operando1));
            return operando1;
        } else if (tipo.equals("potencia")) {
            System.out.println("Entrada");
            System.out.println("Operando 1: "+Double.toString(operando1));
            System.out.println("Operando 2: "+Double.toString(operando2));
            System.out.println("Operacion: Potencia");
            System.out.println("");
            operando1 = Math.pow(operando1, operando2);
            System.out.println("Salida");
            System.out.println("Operando 1: "+Double.toString(operando1));
            System.out.println("Operando 2: "+Double.toString(operando2));
            System.out.println("Resultado: "+Double.toString(operando1));
            return operando1;
        } else if (tipo.equals("raiz")) {
            System.out.println("Entrada");
            System.out.println("Operando 1: "+Double.toString(operando1));
            System.out.println("Operando 2: "+Double.toString(operando2));
            System.out.println("Operacion: Raiz");
            System.out.println("");
            operando1 = Math.pow(Math.E, Math.log(operando1)/operando2);
            System.out.println("Salida");
            System.out.println("Operando 1: "+Double.toString(operando1));
            System.out.println("Operando 2: "+Double.toString(operando2));
            System.out.println("Resultado: "+Double.toString(operando1));
            return operando1;
        } else {
            return 0;
        }
    }
    
    
    public Memento guardarEstadoMemento() {
        Memento memento = new Memento();
        memento.setVariableX(this.variableX);
        memento.setVariableY(this.variableY);
        memento.setVariableZ(this.variableZ);
        
        return memento;     
    }
    
    public void undo(Memento memento) {
        this.variableX = memento.getVariableX();
        this.variableY = memento.getVariableY();
        this.variableZ = memento.getVariableZ();
    }
    
    public void obtenerSavePoint(Memento memento) {
        this.variableX = memento.getVariableX();
        this.variableY = memento.getVariableY();
        this.variableZ = memento.getVariableZ();
    }
    
    public Memento savePoint() {
        Memento memento = new Memento();
        memento.setVariableX(this.variableX);
        memento.setVariableY(this.variableY);
        memento.setVariableZ(this.variableZ);
        
        return memento;   
    }
    
    public void restaurarEstadoInicial(Memento memento) {
        this.variableX = memento.getVariableX();
        this.variableY = memento.getVariableY();
        this.variableZ = memento.getVariableZ();
    }
    
}