/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Logica.Tripulante.Tripulantes;
import Logica.Tripulante.Tripulante;
import Logica.Vuelos.Vuelo;
import Logica.Vuelos.Vuelos;
import Logica.Pasajeros.Pasajero;
import Logica.Pasajeros.Pasajeros;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Fachada {
    private static int porcentaje = 75;
     private static Fachada instancia2;
    private Fachada() {
    }
   public static Fachada getInstancia(){
         if (instancia2 == null) {
            instancia2 = new Fachada();
        }

        return instancia2;
    }	

    public static int getPorcentaje() {
        return porcentaje;
    }

    public static void setPorcentaje(int porcentaje) {
        Fachada.porcentaje = porcentaje;
    }
   
public void InicializarVuelos(){
     Vuelos Vs = Vuelos.getInstancia();
     Vs.agregarVuelo(new Vuelo("Montevideo","Brasilia", 1400 ));
     Vs.agregarVuelo(new Vuelo("Montevideo","Bogota", 6700 ));
     Vs.agregarVuelo(new Vuelo("Montevideo","Santiago", 2400 ));
     Vs.agregarVuelo(new Vuelo("Montevideo","Buenos Aires", 600 ));
}

public ArrayList<Pasajero> Pasajeros(){
        Pasajeros p =Pasajeros.getInstancia();
       return p.getListado();
   }

public ArrayList<Tripulante> Triuplantes(){
    Tripulantes t = Tripulantes.getInstancia();
    return t.getListaT();
    }

public ArrayList<Vuelo> Vuelos(){
    Vuelos Vs = Vuelos.getInstancia();
    return Vs.getListado();
    }




        
public boolean Agregar(Pasajero P){
     
       Pasajeros Ps = Pasajeros.getInstancia();
       if(Ps.Existe(P)){
           System.out.println("No se agrego");
           return false;
       }else{
           Ps.Agregar(P);
           System.out.println("Agregado con exito");
           return true;
       }
   }

public boolean agregaTripulante(String ID, String cargo, String nombre, String sexo, String edad){
    Tripulante T = new Tripulante(ID,cargo,nombre,sexo,edad);
    Tripulantes Ts = Tripulantes.getInstancia();
    Ts.AgregarTripulante(T);
    return true;
}




public void agregarViaje(String pasaporte,String origen, String destino,String ida, String vuelta){
    Pasajeros Ps = Pasajeros.getInstancia();
    Vuelos Vs = Vuelos.getInstancia();
    String numPasaporte=Ps.devolverNumPasaporte(pasaporte);
     if (Vs.retornarDestino(destino, origen)&numPasaporte!=null){
         Pasajes pasaje= new Pasajes(); 
         Viajes nuevo = new Viajes(pasaporte,origen,destino,ida,vuelta);
             pasaje.agregarViaje(nuevo);
         System.out.println("Se agrego su viaje");
            }else {
         System.out.println("viaje no agregado");
     }
}

public void agregarDestino (String origen,String destino,int distancia){
    Vuelo v = new Vuelo(origen,destino,distancia);
    Vuelos Vs = Vuelos.getInstancia();
    Vs.agregarVuelo(v);
}

public String devolverDestinos(int i){
    Vuelos Vs = Vuelos.getInstancia();
    return Vs.devolverLista(i);
}
public ArrayList<Vuelo> DevolverDestinos2(){
    Vuelos Vs = Vuelos.getInstancia();
    return Vs.getListado();
}

}





