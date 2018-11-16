/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

/**
 *
 * @author Daniel Poot
 */
public class Usuario {
    private int ID;
    private String Usuario;
    private String Password;
    private String Last_session;
    private int IdTipo;
    private String TipoUsuario;

    public int getID() {
        return ID;
    }

    public void setID(int id) {
        this.ID = ID;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }
    
    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getLast_session() {
        return Last_session;
    }

    public void setLast_session(String Last_session) {
        this.Last_session = Last_session;
    }

    public int getIdTipo() {
        return IdTipo;
    }

    public void setIdTipo(int IdTipo) {
        this.IdTipo = IdTipo;
    }

    public String getTipoUsuario() {
        return TipoUsuario;
    }

    public void setTipoUsuario(String TipoUsuario) {
        this.TipoUsuario = TipoUsuario;
    }
    
    
    

}
