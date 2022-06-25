/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Config.Conexion;
import Entidad.Tecnico;
import Entidad.distrito;
import Entidad.horario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class DAOHorario {
    Conexion cn=new Conexion();
Connection con;
PreparedStatement ps;
ResultSet rs;
Tecnico t=new Tecnico();
    public List listar() {
    ArrayList<horario>list=new ArrayList<>();
       String sql="select * from horarios";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                horario ho=new horario();
                ho.setId_horario(rs.getInt(1));
                ho.setNombre_horario(rs.getString(2));
                ho.setNombre_horario(rs.getString(2));
                
                list.add(ho);
       }
        } catch (SQLException e) {
        }
        return list;    
    }
}
