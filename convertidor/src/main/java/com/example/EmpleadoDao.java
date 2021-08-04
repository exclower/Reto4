package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmpleadoDao {

    Connection conexion;

    public EmpleadoDao(){
        try {
            conexion = DriverManager.getConnection("jdbc:sqlite:empleado.db");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void insertar(Empleado empleado){
        String sql = "insert into Empleado (nombre, edad, email) values (?,?,?)";
        try {
            PreparedStatement pstm = conexion.prepareStatement(sql);
            pstm.setString(1, empleado.getNombre());
            pstm.setInt(2, empleado.getEdad());
            pstm.setString(3, empleado.getEmail());
            pstm.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
}
