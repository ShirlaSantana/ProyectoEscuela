/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Daniel Poot
 */
public class PagoArticulo {
    private int IDArticulo;
    private String Articulo;
    private double CostoArticulo;
    private int NumArticulo;
    private double Pago;
    private int IDAlumnoPago;

    //Constructor
    
    public PagoArticulo(String Articulo, double CostoArticulo, int NumArticulo) {
        this.Articulo = Articulo;
        this.CostoArticulo = CostoArticulo;
        this.NumArticulo = NumArticulo;
    }

    //Metodos get
    public String getArticulo() {
        return Articulo;
    }

    public double getCostoArticulo() {
        return CostoArticulo;
    }

    public int getNumArticulo() {
        return NumArticulo;
    }

    public int getIDArticulo() {
        return IDArticulo;
    }

    public double getPago() {
        return Pago;
    }

    public int getIDAlumnoPago() {
        return IDAlumnoPago;
    }

    //Metodos set
    public void setArticulo(String Articulo) {
        this.Articulo = Articulo;
    }

    public void setCostoArticulo(double CostoArticulo) {
        this.CostoArticulo = CostoArticulo;
    }

    public void setNumArticulo(int NumArticulo) {
        this.NumArticulo = NumArticulo;
    }

    public void setIDArticulo(int IDArticulo) {
        this.IDArticulo = IDArticulo;
    }

    public void setPago(double Pago) {
        this.Pago = Pago;
    }

    public void setIDAlumnoPago(int IDAlumnoPago) {
        this.IDAlumnoPago = IDAlumnoPago;
    }

    
    
    @Override
    public String toString() {
        return "PagoArticulo{" + "Articulo=" + Articulo + ", CostoArticulo=" + CostoArticulo + ", NumArticulo=" + NumArticulo + '}';
    }
    
    
    
    
}
