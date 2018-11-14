/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iiiexamengrupo0208;

import Caso1_Memento.Calculadora;
import Caso1_Memento.CareTaker;
import Caso1_Memento.Memento;
import Caso2_Command.ManejoTareas;
import Caso2_Command.Tarea;
import Caso2_Command.TareaCancion;
import Caso2_Command.TareaCorreo;
import Caso2_Command.TareaGaleria;
import Caso2_Command.TareaSms;
import Caso3_Mediator.Algodon;
import Caso3_Mediator.Boton;
import Caso3_Mediator.Calentador;
import Caso3_Mediator.Jeans;
import Caso3_Mediator.Motor;
import Caso3_Mediator.Programacion;
import Caso3_Mediator.Seda;
import Caso3_Mediator.Sensor;
import Caso3_Mediator.Tambor;
import Caso3_Mediator.Valvula;
import Caso4_ChainOfResponsability.Archivo;
import Caso4_ChainOfResponsability.Consola;
import java.awt.Point;

/**
 *
 * @author gerald
 */
public class IIIExamenGrupo0208 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
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
        
    
        /**
         *
         * Prueba Caso 3 Mediator
         * 
         */
        System.out.println("\nPRUEBA CASO 3 MEDIATOR");
        
        Boton boton = new Boton();
        Tambor tambor = new Tambor();
        Sensor sensor = new Sensor();
        Motor motor = new Motor();
        Valvula valvula = new Valvula();
        Calentador calentador = new Calentador();
        
        System.out.println("-----ALGODON-NECESITA: SIN TEMPERATURA - FUERZA DE:120 -CON DETERGENTE Y SUAVISANTE - 1 CICLO-----");
        Programacion lavadora = new Algodon(tambor, calentador, valvula, motor, sensor);
        
        boton.setProgramacion(lavadora);
        tambor.setProgramacion(lavadora);
        valvula.setProgramacion(lavadora);
        calentador.setProgramacion(lavadora);
        motor.setProgramacion(lavadora);
        
        boton.presionar();
        
        System.out.println("-----SEDA-NECESITA: CON TEMPERATURA - FUERZA DE:150 -SIN DETERGENTE Y CON SUAVISANTE - 1 CICLO----");
        lavadora = new Seda(tambor, calentador, valvula, motor, sensor);
        
        boton.setProgramacion(lavadora);
        tambor.setProgramacion(lavadora);
        valvula.setProgramacion(lavadora);
        calentador.setProgramacion(lavadora);
        motor.setProgramacion(lavadora);
        
        boton.presionar();
        
        System.out.println("-----JEANS-NECESITA: CON TEMPERATURA - FUERZA: 400 - CON DETERGENTE Y SUAVISANTE - 2 CICLOS-----");
        lavadora = new Jeans(tambor, calentador, valvula, motor, sensor);
        
        boton.setProgramacion(lavadora);
        tambor.setProgramacion(lavadora);
        valvula.setProgramacion(lavadora);
        calentador.setProgramacion(lavadora);
        motor.setProgramacion(lavadora);
        
        boton.presionar();
        
        /**
         *
         * Prueba Caso 4 Chain of responsability
         * 
         */
        
        System.out.println("\n\nPrueba Caso 4 Chain of responsability\n");
        Consola consola = new Consola();
        
        Archivo archivoTxt = new Archivo("Archivo1", "Text", "C:\\user");
        Archivo archivoDoc = new Archivo("Archivo2", "Doc", "C:\\user");
        Archivo archivoImagen = new Archivo("Archivo3", "Imagen", "C:\\user");
        Archivo archivoAudio = new Archivo("Archivo4", "Audio", "C:\\user");
        Archivo archivoVideo = new Archivo("Archivo5", "Video", "C:\\user");
        Archivo archivoExtra = new Archivo("Archivo6", "Excel", "C:\\user");
        
        consola.ejecutar(archivoTxt);
        System.out.println("---------------------------------------------------");
        consola.ejecutar(archivoDoc);
        System.out.println("---------------------------------------------------");
        consola.ejecutar(archivoImagen);
        System.out.println("---------------------------------------------------");
        consola.ejecutar(archivoAudio);
        System.out.println("---------------------------------------------------");
        consola.ejecutar(archivoVideo);
        System.out.println("---------------------------------------------------");
        consola.ejecutar(archivoExtra);
        
        /**
         *
         * Prueba Caso 2 Command
         * 
         */
        System.out.println("-----------------------Caso2-------------------");
        
        Tarea tareaCancion1 = new TareaCancion();
        Tarea tareaCancion2 = new TareaCancion();
        Tarea tareaCancion3 = new TareaCancion();
        Tarea tareaCancion4 = new TareaCancion();
        
        Tarea tareaCorre1 = new TareaCorreo();
        Tarea tareaCorre2 = new TareaCorreo();
        Tarea tareaCorre3 = new TareaCorreo();
        Tarea tareaCorre4 = new TareaCorreo();
        
        Tarea tareaGaleria1 = new TareaGaleria();
        Tarea tareaGaleria2 = new TareaGaleria();
        Tarea tareaGaleria3 = new TareaGaleria();
        Tarea tareaGaleria4 = new TareaGaleria();
        
        Tarea tareaSms1 = new TareaSms();
        Tarea tareaSms2 = new TareaSms();
        Tarea tareaSms3 = new TareaSms();
        Tarea tareaSms4 = new TareaSms();
        
        ManejoTareas manejoTareas = new ManejoTareas();
        
        manejoTareas.agregarTarea(tareaCancion1);
        manejoTareas.agregarTarea(tareaCorre1);
        manejoTareas.agregarTarea(tareaGaleria1);
        manejoTareas.agregarTarea(tareaSms1);
        
        manejoTareas.agregarTarea(tareaCancion2);
        manejoTareas.agregarTarea(tareaCorre2);
        manejoTareas.agregarTarea(tareaGaleria2);
        manejoTareas.agregarTarea(tareaSms2);
        
        manejoTareas.agregarTarea(tareaCancion3);
        manejoTareas.agregarTarea(tareaCorre3);
        manejoTareas.agregarTarea(tareaGaleria3);
        manejoTareas.agregarTarea(tareaSms3);
        
        manejoTareas.agregarTarea(tareaCancion4);
        manejoTareas.agregarTarea(tareaCorre4);
        manejoTareas.agregarTarea(tareaGaleria4);
        manejoTareas.agregarTarea(tareaSms4);
        
        //Se agregó un sleep de 1 segundo a los hilos para que se viera mejor la simulacion
        
        manejoTareas.iniciarHilos(10); //Es la cantidad de hilos que se van a crear y los inicia para realizar las tareas
        
        //manejoTareas.pararHilos(); //Para la ejecución de los hilos
        
    }
    
}
