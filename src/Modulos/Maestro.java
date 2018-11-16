/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulos;

import Clases.Conectar;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;

/**
 *
 * @author Daniel Poot
 */
public class Maestro extends Persona{
    private Date FechaInicio;
    private int AñosExp;
    private byte[] Fotografia;

    public Maestro() {
    }


    public Maestro(Date FechaInicio, int AñosExp, String Nombre, String ApellidoPaterno, String ApellidoMaterno, int Edad, Long NumCelular) {
        super(Nombre, ApellidoPaterno, ApellidoMaterno, Edad, NumCelular);
        this.FechaInicio = FechaInicio;
        this.AñosExp = AñosExp;
    }

    public Date getFechaInicio() {
        return FechaInicio;
    }

    public int getAñosExp() {
        return AñosExp;
    }

    public byte[] getFotografia() {
        return Fotografia;
    }

    public void setFechaInicio(Date FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public void setAñosExp(int AñosExp) {
        this.AñosExp = AñosExp;
    }

    public void setFotografia(byte[] Fotografia) {
        this.Fotografia = Fotografia;
    }
    
    public void MostrarMaestros(JComboBox<Maestro> ComboMaestroRG) {
        try{
            Conectar ConexionMaestro = new Conectar();
            ResultSet Res = ConexionMaestro.consulta("Select * FROM maestros  ");
            while(Res.next()){
            ComboMaestroRG.addItem(new Maestro(Res.getDate("FechaIngreso"), Res.getInt("Experiencia") ,Res.getString("Nombre") ,Res.getString("ApellidoPaterno") ,Res.getString("ApellidoMaterno"), Res.getInt("Edad"), Res.getLong("Telefono")));
            }
        }catch(SQLException Ex){
            System.err.println(Ex.getMessage());
        }
         
    }

    @Override
    public String toString() {
        return super.getNombre() + " " + super.getApellidoPaterno() + " " + super.getApellidoMaterno();
    }
    
    
    
    
}
