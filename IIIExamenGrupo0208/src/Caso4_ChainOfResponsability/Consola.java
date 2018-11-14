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
public class Consola {
    
    private final Procesador cadenaResponsabilidad;
    
    public Consola() {
        this.cadenaResponsabilidad = new ProcesadorTXT("Text");
        Procesador procesadorDoc = new ProcesadorDocumentos("Doc");
        Procesador procesadorImagen = new ProcesadorImagenes("Imagen");
        
        Procesador procesadorAudio = new ProcesadorAudios("Audio");
        Procesador procesadorVideo = new ProcesadorVideos("Video");
        
        this.cadenaResponsabilidad.setProcesador(procesadorDoc);
        
        procesadorDoc.setProcesador(procesadorImagen);
        
        procesadorImagen.setProcesador(procesadorAudio);
        
        procesadorAudio.setProcesador(procesadorVideo);

    }
    
    public void ejecutar(Archivo archivo){
        this.cadenaResponsabilidad.procesarArchivo(archivo);
    }
    
}
