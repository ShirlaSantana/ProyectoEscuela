/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import Clases.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel Poot
 */
public class SQLUsuario extends Conectar{
    
        public boolean Registrar(Usuario usr) {
            
        PreparedStatement PsR = null;
        Conectar ConexionRegistrar = new Conectar();

        String sql = "INSERT INTO usuario VALUES(null,?,?,?)";

        try {
            PsR = ConexionRegistrar.getConnection().prepareStatement(sql);
            
            PsR.setString(1, usr.getUsuario());
            PsR.setString(2, usr.getPassword());
            PsR.setInt(3, usr.getIdTipo());
            PsR.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        } finally {
            ConexionRegistrar.Desconectar();
        }
    }

    public boolean Login(Usuario usr) {
        PreparedStatement PsL = null;
        ResultSet Rs = null;
        Conectar ConexionLogin = new Conectar();

        String sql = "SELECT u.IDUsuario, u.Usuario, u.Contraseña, u.IDTipoUsuarioU, t.TipoDeUsuario FROM usuario As u INNER JOIN tipousuario AS t ON u.IDTipoUsuarioU=t.IDTipoUsuario WHERE usuario = ? LIMIT 1";

        try {
            PsL = ConexionLogin.getConnection().prepareCall(sql);
            PsL.setString(1, usr.getUsuario());
            Rs = PsL.executeQuery();

            if (Rs.next()) {
                if (usr.getPassword().equals(Rs.getString(3))) {
                    
                    usr.setID(Rs.getInt(1));
                    usr.setIdTipo(Rs.getInt(4));
                    usr.setTipoUsuario(Rs.getString(5));
                    
                    return true;
                } else {
                    return false;
                }
            }

            return false;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        } finally {
            ConexionLogin.Desconectar();
        }
    }

    public int existeUsuario(String usuario) {
        PreparedStatement PsEU = null;
        ResultSet RsEU = null;
        Conectar ConexionEusuario = new Conectar();

        String sql = "SELECT IDUsuario FROM usuario WHERE usuario = ?";

        try {
            PsEU = ConexionEusuario.getConnection().prepareStatement(sql);
            PsEU.setString(1, usuario);
            RsEU  = PsEU.executeQuery();

            if (RsEU.next()) {
                return RsEU .getInt(1);
            }

            return 1;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return 1;
        } finally {
            ConexionEusuario.Desconectar();
        }
    }




}
