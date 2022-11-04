/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author david
 */
public class PersonaDAO {
    private static final String SQL_READALL="SELECT * FROM tb_persona ";
    private static final Conexion con= Conexion.getIntance();
    
    public PersonaDAO() {
     con.conectar();
    } 
    
    public List<PersonaInf> realAll() {              
        
        List<PersonaInf> lista = null;
        PreparedStatement ps;
        try {
            ps = con.getConexion().prepareStatement(SQL_READALL);
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {
                PersonaInf obj = new PersonaInf(
                        rs.getString("nombre"),
                        rs.getString("telefono"),
                        rs.getString("correo"),
                        rs.getString("clave"));
                lista.add(obj);
            }
        } catch (SQLException ex) {
            System.out.println("Error al intentar conectar: " + ex);
        }
        return lista; 
    } 
    
    public boolean insertar(PersonaInf objetv) {
        boolean verificar=false;
        String sql = "INSERT INTO tb_persona (nombre, telefono, correo, clave) VALUES('" + objetv.getNombre()
                + "','" + objetv.getTelf()+ "','" + objetv.getEmail() + "','" + objetv.getClave() + "')";     
        try {
            Statement ps;
            ps = con.getConexion().createStatement();
            ps.executeUpdate(sql);           
            verificar=true;       
        } catch (SQLException ex) {
            System.out.println("Error al conectar: " + ex);
           verificar=false;
        }
       return verificar;
    }

    
    
}
