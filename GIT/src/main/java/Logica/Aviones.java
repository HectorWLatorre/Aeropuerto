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
public class Aviones {
      private final ArrayList<Avion> Aviones;
    private static Aviones instancia;

    public Aviones() {
        Aviones = new ArrayList<>();
    }

    public static Aviones getInstancia() {
        if (instancia == null) {
            instancia = new Aviones();
        }

        return instancia;
    }

    public void agregarAvion(Avion a) {
        Aviones.add(a);
    }

    public ArrayList<Avion> getListado() {
        return Aviones;
    }


   
}
  

