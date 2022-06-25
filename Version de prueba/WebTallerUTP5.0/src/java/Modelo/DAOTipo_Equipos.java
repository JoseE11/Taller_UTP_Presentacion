/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Config.Conexion;
import Entidad.Tecnico;
import Entidad.distrito;
import Entidad.tipo_equipo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class DAOTipo_Equipos {
    
    Conexion cn=new Conexion();
Connection con;
PreparedStatement ps;
ResultSet rs;
Tecnico t=new Tecnico();
     
public List listar() {
    ArrayList<tipo_equipo>list=new ArrayList<>();
       String sql="select * from tipo_equipo";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                tipo_equipo tip=new tipo_equipo();
                tip.setId_tipo_equipo(rs.getInt(1));
                tip.setNombre_equipo(rs.getString(2));
                list.add(tip);
       }
        } catch (SQLException e) {
        }
        return list;    
    }
}
