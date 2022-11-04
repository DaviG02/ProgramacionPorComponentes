/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author david
 */
public class Conexion {

    private Connection conectar;
    private String BD;
    private String usuario;
    private String contra;
    private static Conexion con; 
    
    private Conexion(Connection conectar, String BD, String usuario, String contra) {
        this.conectar = conectar;
        this.BD = BD;
        this.usuario = usuario;
        this.contra = contra;
    }
    
    private Conexion() {
        this.conectar = null;
        this.BD = "d5dmj8dagmjkv0";
        this.usuario = "postgres";
        this.contra = "123456";
    }
    
    public void conectar() {
        try {
            Class.forName("org.postgresql.Driver");
            this.BD = "jdbc:postgresql://ec2-35-170-21-76.compute-1.amazonaws.com:5432/d5dmj8dagmjkv0";
            this.usuario = "jmpogjqnzvovyw";
            this.contra = "8dfd44e4befce8c526a2eda1fa1cbc21df0a237385993bb2fe451807d8a2d22c";
            this.conectar = (Connection) DriverManager.getConnection(BD, usuario, contra);
        } catch (ClassNotFoundException | HeadlessException | SQLException e) {
            System.out.println("Error al intentar conectar: " + e);
        }
    }
    
    public Connection getConexion() {
        return conectar;
    }
    
    public static Conexion getIntance(){
        if(con==null){
            con=new Conexion();
        }
        return con;
    }       
}
