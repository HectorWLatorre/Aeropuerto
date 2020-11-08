/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Tripulantes {
    private static Tripulantes instancia;
    private final ArrayList <Tripulante> tripulantes;
  
    
     public Tripulantes(){
         tripulantes= new ArrayList<>();
}
    
    public static Tripulantes getInstancia(){
         if (instancia == null) {
            instancia = new Tripulantes();
        }

        return instancia;
    }	

     public ArrayList<Tripulante> getListaT() {
        return tripulantes;
    }

      public void AgregarTripulante(Tripulante t){
        tripulantes.add(t);
    }
    
    
}






