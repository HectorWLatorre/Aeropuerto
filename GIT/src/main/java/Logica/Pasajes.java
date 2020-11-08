/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.ArrayList;

/**
 *
 * @author thiag
 */
public class Pasajes {
    private Vuelo vuelo;
 
    private ArrayList<Viajes> viajes;
    private Pasajero pasajero;
    
    public Pasajes() {
     
        viajes= new ArrayList<Viajes>();
    }

   

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }
    
    public boolean buscarCliente(String pasaporte){
        return pasajero.getPasaporte().equals(pasaporte);
    }
   
    
    public void agregarViaje(Viajes viaje){
        viajes.add(viaje);
    }
    

}

