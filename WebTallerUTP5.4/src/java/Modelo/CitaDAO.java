/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Config.Conexion;
import Entidad.Cita;
import Interfaces.CRUD_Cita;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class CitaDAO implements CRUD_Cita{
Conexion cn=new Conexion();
Connection con;
PreparedStatement ps;
ResultSet rs;
Cita c = new Cita();

    public CitaDAO() {
    }
    @Override
    public List listar() {
    ArrayList<Cita>list=new ArrayList<>();
    //       String sql="select * from persona AS p INNER JOIN distritos AS d ON p.id_distrito=d.id_distrito where p.id_tipo_persona = 2 and p.estado_persona = 1";

       String sql="select * from citas where estado_cita = '+1+'";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Cita ci=new Cita();
                ci.setId_cita(rs.getInt("id_cita"));
                ci.setDni_cliente(rs.getInt("dni_cliente"));
                ci.setDni_tecnico(rs.getInt("dni_tecnico"));
                ci.setFecha_cita(rs.getDate("fecha_cita"));
                ci.setHora_cita(rs.getTime("hora_cita"));

                list.add(ci);
       }
        } catch (SQLException e) {
                e.printStackTrace(System.out);
        }
        return list;        
    }

    @Override
    public Cita list(int id_cita) {
    String sql="select * from citas where id_cita="+id_cita;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
            //(dni, nombres, apellido_paterno, apellido_materno, id_tipo_persona, distrito, direccion, telefono, correo electronico) "  
                c.setId_cita(rs.getInt("id_cita"));
                c.setDni_cliente(rs.getInt("dni_cliente"));
                c.setDni_tecnico(rs.getInt("dni_tecnico"));
                c.setHora_cita(rs.getTime("hora_cita"));
                c.setFecha_cita(rs.getDate("fecha_cita"));
            
            }
        } catch (SQLException e) {
                e.printStackTrace(System.out);
        }
        return c;
    }

    @Override
    public boolean add(Cita cit) {

        String sql="insert into citas (id_cita, dni_cliente, dni_tecnico, hora_cita, fecha_cita, estado_cita) "  
                + "values ('"+cit.getId_cita()+"','"+cit.getDni_cliente()+"',"
                + "'"+cit.getDni_tecnico()+"','"+cit.getHora_cita()+"',"
                + "'"+cit.getFecha_cita()+"','1')";
        //sql="insert into  ( , , ) values ('"++"','"++"','"++"') ";
        try {                                                                                                                                                    
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
            
        } catch (Exception e) {
                e.printStackTrace(System.out);
      
        }
        return false;      }

    @Override
    public boolean edit(Cita cit) {
        //(id_cita, dni_cliente, dni_tecnico, fecha_cita, hora_cita) " 

    String sql="update citas set id_cita='"+cit.getId_cita()+"',"
            + "dni_cliente='"+cit.getDni_cliente()+"',dni_tecnico='"+cit.getDni_tecnico()+"', "
            + "hora_cita='"+cit.getHora_cita()+"',fecha_cita='"+cit.getFecha_cita()+"',estado_cita='1'"
            + " where id_cita="+cit.getId_cita();
                 try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
           } catch (Exception e) {
                   e.printStackTrace(System.out);
           }
         return false;      }

    @Override
    public boolean eliminar(int id_cita) {
     String sql="update citas set estado_cita='0' where id_cita="+id_cita;
  // String sql="update persona set estado_persona='0' where dni="+dni;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
                e.printStackTrace(System.out);
        }
        return false;   
    }
    
    
    
}
