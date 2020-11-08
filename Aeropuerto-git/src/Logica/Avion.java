/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author thiag
 */
public class Avion {
    String Compania;
    String Modelo;
    private int APrimera, AEconomica;

    public Avion(String Compania, String Modelo, int APrimera, int AEconomica) {
        this.Compania = Compania;
        this.Modelo = Modelo;
        this.APrimera = APrimera;
        this.AEconomica = AEconomica;
    }

    public Avion() {//constructor vacio
    }

    public String getCompania() {
        return Compania;
    }

    public void setCompania(String Compania) {
        this.Compania = Compania;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getAPrimera() {
        return APrimera;
    }

    public void setAPrimera(int APrimera) {
        this.APrimera = APrimera;
    }

    public int getAEconomica() {
        return AEconomica;
    }

    public void setAEconomica(int AEconomica) {
        this.AEconomica = AEconomica;
    }
    
    
    
}
