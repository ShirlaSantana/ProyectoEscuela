/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulos;


import Clases.*;
import java.awt.Image;
import java.sql.Date;
import java.util.ArrayList;
/**
 *
 * @author Daniel Poot
 */
public class Alumno extends Persona {
    private java.sql.Date FechaInscripcion;
    private double CostoMensualidad;
    private double CostoInscripcion;
    private ArrayList PagosGenerales;
    private ArrayList  PagosArticulos;   
    private Grupo GrupoAlumno;
    private byte[] Fotografia;
    
    
    //Constructor
    public Alumno( java.sql.Date FechaInscripcion, double CostoMensualidad, double CostoInscripcion , Grupo GrupoAlumno, String Nombre, String ApellidoPaterno, String ApellidoMaterno, int Edad, Long NumCelular) {
        super(Nombre, ApellidoPaterno, ApellidoMaterno, Edad, NumCelular);
        this.FechaInscripcion = FechaInscripcion;
        this.CostoMensualidad = CostoMensualidad;
        this.CostoInscripcion = CostoInscripcion;
        this.GrupoAlumno = GrupoAlumno;
    }
    

    //Metodos get
    

    public java.sql.Date getFechaInscripcion() {
        return FechaInscripcion;
    }

    public double getCostoMensualidad() {
        return CostoMensualidad;
    }

    public double getCostoInscripcion() {
        return CostoInscripcion;
    }

    public ArrayList getPagosGenerales() {
        return PagosGenerales;
    }

    public ArrayList getPagosArticulos() {
        return PagosArticulos;
    }


    public Grupo getGrupoAlumno() {
        return GrupoAlumno;
        
    }

    public byte[] getFotografia() {
        return Fotografia;
    }
    //Metodos set

    public void setFechaInscripcion(java.sql.Date FechaInscripcion) {
        this.FechaInscripcion = FechaInscripcion;
    }

    public void setPagosGenerales(ArrayList PagosGenerales) {
        this.PagosGenerales = PagosGenerales;
    }

    public void setCostoMensualidad(double CostoMensualidad) {
        this.CostoMensualidad = CostoMensualidad;
    }

    public void setCostoInscripcion(double CostoInscripcion) {
        this.CostoInscripcion = CostoInscripcion;
    }

    public void setPagosGnerales(ArrayList PagosGnerales) {
        this.PagosGenerales = PagosGnerales;
    }

    public void setPagosArticulos(ArrayList PagosArticulos) {
        this.PagosArticulos = PagosArticulos;
    }

    public void setGrupoAlumno(Grupo GrupoAlumno) {
        this.GrupoAlumno = GrupoAlumno;
    }

    public void setFotografia(byte[] Fotografia) {
        this.Fotografia = Fotografia;
    }
    
    

    @Override
    public String toString() {
        return super.toString() + "\nFecha Inscripcio:" + getFechaInscripcion() +"\nMensualidad: "+ getCostoMensualidad() + "\nCosto de Inscripcion:"+ getCostoInscripcion()+ "\nGrupo del Alumno: " + getGrupoAlumno()
                +"\nPagos: " + getPagosGenerales() + "\nPago de Articulos: " + getPagosArticulos()  ;
    }
    
    
   
    
}
