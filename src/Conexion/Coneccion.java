/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Alumno
 */
public class Coneccion {
    private Connection con=null;

    public Coneccion() {
    }
    
    public Connection conectar(){
        try{
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDataSource");
            con=DriverManager.getConnection("jdbc:sqlserver://localhost; databasename=Empresa","sa","sasa");
            JOptionPane.showMessageDialog(null, "Conexion exitosa");
        }catch(Exception e){
            e.printStackTrace();
        };
        return con;
    }
}
