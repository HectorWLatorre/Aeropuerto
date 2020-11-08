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
public class Vuelos {

    private final ArrayList<Vuelo> vuelos;
    private static Vuelos instancia;

    public Vuelos() {
        vuelos = new ArrayList<>();
    }

    public static Vuelos getInstancia() {
        if (instancia == null) {
            instancia = new Vuelos();
        }

        return instancia;
    }

    public void agregarVuelo(Vuelo v) {
        vuelos.add(v);
    }

    public ArrayList<Vuelo> getListado() {
        return vuelos;
    }

    public boolean retornarDestino(String destino, String origen) {
        for (int i = 0; i < vuelos.size(); i++) {
            return vuelos.get(i).getOrigen().equals(origen) & vuelos.get(i).getDestino().equals(destino);
        }
        return true;
    }

    public String devolverLista(int i) {
        String reg = "";

        reg
                = vuelos.get(i).getOrigen()
                + "              " + vuelos.get(i).getDestino()
                + "              " + vuelos.get(i).getKMViaje();

        return reg;
    }
}
