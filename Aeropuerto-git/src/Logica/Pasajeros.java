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

    public int ObtenerPosicion(String pasaporte) {
        int val = 0;
        for (int i = 0; i < getListado().size(); i++) {
            if (pasaporte.equals(getListado().get(i).getPasaporte())) {
                val = i;

            } else {
                val = -1;

            }
        }
        return val;
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

    public void Modificar(int pos, String nombre,String pasaporte,String sexo,String edad) {
        pasajeros.get(pos).setNombre(nombre); 
        pasajeros.get(pos).setSexo(sexo);
        pasajeros.get(pos).setEdad(edad);
        pasajeros.get(pos).setPasaporte(pasaporte);
    }

    public void Eliminar(int pos) {
        pasajeros.remove(pos);
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
