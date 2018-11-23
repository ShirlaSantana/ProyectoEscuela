/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulos;

import java.awt.Image;

/**
 *
 * @author Daniel Poot
 */
public class Persona {
    private String Nombre;
    private String ApellidoPaterno;
    private String ApellidoMaterno;
    private int Edad;
    private Long NumCelular;

    

    //Contructor
    
    
    
    public Persona() {
    }

    public Persona(String Nombre, String ApellidoPaterno, String ApellidoMaterno) {
        this.Nombre = Nombre;
        this.ApellidoPaterno = ApellidoPaterno;
        this.ApellidoMaterno = ApellidoMaterno;
    }

    
    public Persona(String Nombre, String ApellidoPaterno, String ApellidoMaterno, int Edad, Long NumCelular) {
        this.Nombre = Nombre;
        this.ApellidoPaterno = ApellidoPaterno;
        this.ApellidoMaterno = ApellidoMaterno;
        this.Edad = Edad;
        this.NumCelular = NumCelular;
    }

    //Metodos get
    
    public String getNombre() {
        return Nombre;
    }

    public String getApellidoPaterno() {
        return ApellidoPaterno;
    }

    public String getApellidoMaterno() {
        return ApellidoMaterno;
    }

    public int getEdad() {
        return Edad;
    }

    public Long getNumCelular() {
        return NumCelular;
    }
    

    
    //Metodos set

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellidoPaterno(String ApellidoPaterno) {
        this.ApellidoPaterno = ApellidoPaterno;
    }

    public void setApellidoMaterno(String ApellidoMaterno) {
        this.ApellidoMaterno = ApellidoMaterno;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public void setNumCelular(Long NumCelular) {
        this.NumCelular = NumCelular;
    }
    
    @Override
    public String toString() {
        return "\nNombre: " + getNombre() + "\nApellidoPaterno: " + getApellidoPaterno() + "\nApellidoMaterno: " + getApellidoMaterno() + "\nEdad: " + getEdad() + "\nNumero de celular: " + getNumCelular();
        
    }
    
    
    
    
    
    
    
}
