/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso3_Mediator;

/**
 *
 * @author Rigo-PC
 */
public class Seda implements Programacion{
    
    private final Tambor tambor;
    private final Calentador calentador;
    private final Valvula valvula;
    private final Motor motor;
    private final Sensor sensor;

    public Seda(Tambor tambor, Calentador calentador, Valvula valvula, Motor motor, Sensor sensor) {
        this.tambor = tambor;
        this.calentador = calentador;
        this.valvula = valvula;
        this.motor = motor;
        this.sensor = sensor;
    }
    
    @Override
    public void iniciar() {
        this.tambor.iniciar();
    }
    
    
    @Override
    public void encender() {
        this.calentador.encender(15);
    }

    @Override
    public void apagar() {
        this.calentador.apagar();
    }

    @Override
    public void lavar() {
        this.motor.iniciarMotor(150);
    }

    @Override
    public void abrir() {
        this.valvula.abrir();
    }

    @Override
    public void cerrar() {
        this.valvula.cerrar();
    }

    @Override
    public boolean determinarTemp(int temp) {
       return sensor.evaluarTemperatura(temp);
    }
    
    @Override
    public void iniciarCiclo(){
        System.out.println("Agregando suavisante para Seda..");
        this.tambor.lavar();
    }

    @Override
    public void terminarCiclo() {
        System.out.println("Terminando ciclo de lavado..");
        this.valvula.eliminarDesechos();
    }
}
