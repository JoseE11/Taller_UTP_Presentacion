/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Config.Conexion;
import Entidad.Cliente;
import Entidad.Tecnico;
import Entidad.distrito;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class DAODistrito {
Conexion cn=new Conexion();
Connection con;
PreparedStatement ps;
ResultSet rs;
Tecnico t=new Tecnico();
     
public List listar() {
    ArrayList<distrito>list=new ArrayList<>();
       String sql="select * from distritos";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                distrito dist=new distrito();
                dist.setId_distrito(rs.getInt(1));
                dist.setNombre_distrito(rs.getString(2));
                
                list.add(dist);
       }
        } catch (SQLException e) {
        }
        return list;    
    }
    
}
