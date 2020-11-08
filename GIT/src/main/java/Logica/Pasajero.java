/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author thiag
 */
public class Pasajero extends Persona {

    private static Pasajero instancia;
    private String Pasaporte;

    public String getPasaporte() {
        return Pasaporte;
    }

    public void setPasaporte(String Pasaporte) {
        this.Pasaporte = Pasaporte;
    }

    public Pasajero(String Pasaporte, String Nombre, String Sexo, String Edad) {
        super(Nombre, Sexo, Edad);
        this.Pasaporte = Pasaporte;
    }

}
