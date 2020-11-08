/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Pasajeros;

import Logica.Persona.Persona;


/**
 *
 * @author thiag
 */
public class Pasajero extends Persona {

    private String Pasaporte;

    public Pasajero(String Pasaporte, String Nombre, String Edad, String Sexo) {
        super(Nombre, Edad, Sexo);
        this.Pasaporte = Pasaporte;
    }

    public String getPasaporte() {
        return Pasaporte;
    }

    public void setPasaporte(String Pasaporte) {
        this.Pasaporte = Pasaporte;
    }

   

}
