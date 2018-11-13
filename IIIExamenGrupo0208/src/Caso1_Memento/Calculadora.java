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

    public double getVariableX() {
        return variableX;
    }

    public void setVariableX(double variableX) {
        this.variableX = variableX;
    }

    public double getVariableY() {
        return variableY;
    }

    public void setVariableY(double variableY) {
        this.variableY = variableY;
    }

    public double getVariableZ() {
        return variableZ;
    }

    public void setVariableZ(double variableZ) {
        this.variableZ = variableZ;
    }
    
    public void asignarValor(double operando1 , double operando2) {
        operando1 = operando2;
    }
    
    public void operacionAritmetica(double operando1, double operando2,String tipo) {
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
