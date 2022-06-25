/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Config.Conexion;
import Entidad.Equipos;
import Interfaces.CRUD_Equipo;
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
public class EquiposDAO implements CRUD_Equipo {
    Conexion cn=new Conexion();
Connection con;
PreparedStatement ps;
ResultSet rs;
Equipos pi=new Equipos();

    @Override
    public List listar() {
      ArrayList<Equipos>list=new ArrayList<>();
       String sql="select * from piezas";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Equipos equi=new Equipos();
                equi.setId_equipo(rs.getInt("id_equipo"));
                equi.setId_tipo_equipo(rs.getInt("id_tipo_equipo"));
                equi.setDni(rs.getInt("dni"));
                equi.setMarca(rs.getString("marca"));
                equi.setModelo(rs.getString("modelo"));
                equi.setEstado_equipo(rs.getBoolean("estado_equipo"));
                list.add(equi);    
            }
                  
        } catch (SQLException e) {
        }
        return list;  
         }

    @Override
    public Equipos list(int dni) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean add(Equipos cli) {
       String sql="insert into equipo (id_equipo, id_tipo_equipo, dni, marca, modelo,estado_equipo) "  
                + "values ('"+cli.getId_equipo()+"','"+cli.getId_tipo_equipo()+"','"+cli.getDni()+"','"+cli.getMarca()+"','"+cli.getModelo()+"','"+cli.isEstado_equipo()+"')";
    
        try {                                                                                                                                                    
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
            
        } catch (Exception e) {
      
        }
        return false;    }

    @Override
    public boolean edit(Equipos cli) {
     String sql="update equipo set id_equipo='"+cli.getId_equipo()+"', id_tipo_equipo='"+cli.getId_tipo_equipo()+"', dni='"+cli.getDni()+"', marca='"+cli.getMarca()+"', modelo='"+cli.getModelo()+"',estado_equipo='"+cli.isEstado_equipo()+"' where id_equipo="+cli.getId_equipo();  
          
    
        try {                                                                                                                                                    
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
            
        } catch (Exception e) {
      
        }
        return false;     
    }

    @Override
    public boolean eliminar(int id) {
    String sql="delete from equipo where id_equipo= "+id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            
        }
        return false;    }

}
