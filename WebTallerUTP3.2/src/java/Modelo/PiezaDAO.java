/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Config.Conexion;
import Entidad.Pieza;
import Interfaces.CRUD_Pieza;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class PiezaDAO implements CRUD_Pieza {
Conexion cn=new Conexion();
Connection con;
PreparedStatement ps;
ResultSet rs;
Pieza pi=new Pieza();
    
    @Override
    public List listar() {
   ArrayList<Pieza>list=new ArrayList<>();
       String sql="select * from piezas";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Pieza pie=new Pieza();
                pie.setId_pieza(rs.getString("id_pieza"));
                pie.setNombre_pieza(rs.getString("nombre_pieza"));
                pie.setDescripcion(rs.getString("descripcion_pieza"));
                pie.setEstado_pieza(rs.getBoolean("estado_pieza"));
                list.add(pie);
       }
        } catch (SQLException e) {
        }
        return list;      }

    @Override
    public Pieza list(int id) {
       String sql="select * from piezas where id_pieza="+id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){

                pi.setId_pieza(rs.getString("id_pieza"));
                pi.setNombre_pieza(rs.getString("nombre_pieza"));
                pi.setDescripcion(rs.getString("descripcion_pieza"));
                pi.setEstado_pieza(rs.getBoolean("estado_pieza"));
            
       }
        } catch (SQLException e) {
        }
        return pi;    

    }

    @Override
    public boolean add(Pieza pie) {
     String sql="insert into piezas (id_pieza, nombre_pieza, descripcion_pieza) "  
                + "values ('"+pie.getId_pieza()+"','"+pie.getNombre_pieza()+"','"+pie.getDescripcion()+"')";
    
        try {                                                                                                                                                    
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
            
        } catch (Exception e) {
      
        }
        return false;     }

    @Override
    public boolean edit(Pieza pie) {

     String sql="update piezas set id_pieza='"+pie.getId_pieza()+"', nombre_pieza='"+pie.getNombre_pieza()+"', descripcion_pieza='"+pie.getDescripcion()+"' where id_pieza="+pie.getId_pieza();  
          
    
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
         String sql="delete from piezas where id_pieza= "+id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            
        }
        return false;
    }

}
