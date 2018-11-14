/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso4_ChainOfResponsability;

/**
 *
 * @author Rigo-PC
 */
public class ProcesadorVideos implements Procesador{
    
    private Procesador procesador;
    private String tipo;

    public ProcesadorVideos(String tipo) {
        this.tipo = tipo;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public void setProcesador(Procesador procesador) {
        this.procesador=procesador;
    }

    @Override
    public Procesador getProcesador() {
        return this.procesador;
    }

    @Override
    public void procesarArchivo(Archivo archivo) {
        if(archivo.getTipo().equals(this.tipo)){
            System.out.println("Procesando VIDEO llamado: "+archivo.getNombre()+
                    " que se encuentra en la ruta: "+archivo.getRuta());
        }else if(this.procesador!=null){
            System.out.println(this.tipo+" no puede corresponde con el del archivo: "+archivo.getNombre());
            this.procesador.procesarArchivo(archivo);
        }else{
            System.out.println("Aun no se encuentra habilitado el manejo de: "+archivo.getTipo());
        }
    }
}
