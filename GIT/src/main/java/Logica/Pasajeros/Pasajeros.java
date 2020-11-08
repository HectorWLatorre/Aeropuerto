/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Pasajeros;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Pasajeros {

    private static ArrayList<Pasajero> pasajeros;
    private static Pasajeros instancia;

    public Pasajeros() {
        pasajeros = new ArrayList<>();
    }

    public static Pasajeros getInstancia() {
        if (instancia == null) {
            instancia = new Pasajeros();
        }

        return instancia;
    }

    public ArrayList<Pasajero> getListado() {
        return pasajeros;
    }

    public void Agregar(Pasajero P) {
        pasajeros.add(P);
    }


    public Pasajero Devolver(int pos) {
        return pasajeros.get(pos);
    }

    public boolean Existe(Pasajero p) {
        for (int i = 0; i < pasajeros.size(); i++) {
            if (p.getPasaporte().equals(pasajeros.get(i).getPasaporte())) {
                return true;
            }
        }
        return false;
    }

    public void Modificar(int pos, Pasajero p) {
        //Podemos remplazar un objeto segun posicion con el metodo set.
        
       pasajeros.set(pos, p);
    }

    public void Eliminar(int fila) {
     
        pasajeros.remove(fila);
    }

    public String devolverNumPasaporte(String pasaporte) {
        String reg=null;
        for (int i = 0; i < pasajeros.size(); i++) {
            if (pasaporte.equals(pasajeros.get(i).getPasaporte())) {
                reg = pasajeros.get(i).getPasaporte();
            }
        }
        return reg;
    }
}
