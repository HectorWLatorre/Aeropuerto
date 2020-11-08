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
public abstract class Persona {
    private  String Nombre;
    private  String Edad;
    private  String Sexo;

    public Persona(String Nombre,  String Edad,String Sexo) {
        this.Nombre = Nombre;
        this.Sexo = Sexo;
        this.Edad = Edad;
        
    }

    public String getNombre() {
        return Nombre;
    }

    public String getSexo() {
        return Sexo;
    }

    public String getEdad() {
        return Edad;
    }
    public void setNombre(String nom){
        this.Nombre=nom;
    }
    
    public void setSexo(String sex){
        this.Sexo=sex;
    }
    
    public void setEdad(String edad){
        this.Edad=edad;
    }
    
}
