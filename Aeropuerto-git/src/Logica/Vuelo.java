/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author thiag
 */
public class Vuelo {
    
  
    
    private String Origen, Destino;
    private int KMViaje;
    

    public Vuelo(String Origen, String Destino, int KMViaje) {
        
        this.Origen = Origen;
        this.Destino = Destino;
        this.KMViaje = KMViaje;
        
        
    }

    public String toString(){
        return Destino + " " + KMViaje;
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

    public int getKMViaje() {
        return KMViaje;
    }

    public void setKMViaje(int KMViaje) {
        this.KMViaje = KMViaje;
        
    }

    public int PresioPasaje(){
      int Precio = this.KMViaje * Fachada.getPorcentaje();
      return Precio;
    }
    
    
  
}
