/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Usuario
 */
public class Viajes {
    private String numPas;
   
    private String Origen;
    private String Destino;
    private String fechaPartida;
    private String fechaVuelta;
    
    public Viajes(String pasaporte, String origen, String destino, String ida,String vuelta){
        this.numPas=pasaporte;
      
        this.Origen=origen;
        this.Destino=destino;
        this.fechaPartida=ida;
        this.fechaVuelta=vuelta;
        
    }

    public String getFechaPartida() {
        return fechaPartida;
    }

    public void setFechaPartida(String fechaPartida) {
        this.fechaPartida = fechaPartida;
    }

    public String getFechaVuelta() {
        return fechaVuelta;
    }

    public void setFechaVuelta(String fechaVuelta) {
        this.fechaVuelta = fechaVuelta;
    }

   

    

    
    public String getNumPas() {
        return numPas;
    }

    public void setNumPas(String numPas) {
        this.numPas = numPas;
    }

    public String getOrigen() {
        return Origen;
    }

    public void setOrigen(String Origen) {
        this.Origen = Origen;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }
    
    
    
    }


