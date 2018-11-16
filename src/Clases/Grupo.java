/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import Modulos.Maestro;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JComboBox;

/**
 *
 * @author Daniel Poot
 */
public class Grupo {
    private String TipoDeGrupo;
    private Horario Horario;
    private Maestro MaestroGrupo;
    private ArrayList Alumnos;
    //Constructor 

    public Grupo() {
    }
    

    public Grupo(String TipoDeGrupo, Horario Horario, Maestro MaestroGrupo, ArrayList Alumnos) {
        this.TipoDeGrupo = TipoDeGrupo;
        this.Horario = Horario;
        this.MaestroGrupo = MaestroGrupo;
        this.Alumnos = Alumnos;
    }

    //Metodos Get
    public String getTipoDeGrupo() {
        return TipoDeGrupo;
    }

    public Horario getHorario() {
        return Horario;
    }

    public Maestro getMaestroGrupo() {
        return MaestroGrupo;
    }

    public ArrayList getAlumnos() {
        return Alumnos;
    }
    
    //Metodos set

    public void setTipoDeGrupo(String TipoDeGrupo) {
        this.TipoDeGrupo = TipoDeGrupo;
    }

    public void setHorario(Horario Horario) {
        this.Horario = Horario;
    }

    public void setMaestroGrupo(Maestro MaestroGrupo) {
        this.MaestroGrupo = MaestroGrupo;
    }

    public void setAlumnos(ArrayList Alumnos) {
        this.Alumnos = Alumnos;
    }
    

    @Override
    public String toString() {
        return "\nGrupo: " + getTipoDeGrupo() + "    Horario: " + getHorario() + "\nMaestro del Grupo: " + MaestroGrupo + "\nAlumnos: " + getAlumnos() ;
    }
    
    
    
    
    
    
}
