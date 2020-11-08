/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Tripulante;

import Logica.Persona.Persona;

/**
 *
 * @author thiag
 */
public class Tripulante extends Persona {
    
    private String Cargo;
private String ID;
    public Tripulante(String ID,String Cargo, String Nombre, String Sexo, String Edad) {
        super(Nombre, Sexo, Edad);
        this.ID=ID;
        this.Cargo = Cargo;
        
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }
    
    
    

  
}
