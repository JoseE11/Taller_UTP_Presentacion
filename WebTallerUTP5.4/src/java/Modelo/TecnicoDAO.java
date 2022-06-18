/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Config.Conexion;
import Entidad.Tecnico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Interfaces.CRUD_Tecnico;

/**
 *
 * @author User
 */
public class TecnicoDAO implements CRUD_Tecnico{
    Conexion cn=new Conexion();
Connection con;
PreparedStatement ps;
ResultSet rs;
Tecnico t=new Tecnico();

    @Override
    public List listar() {

   ArrayList<Tecnico>list=new ArrayList<>();
       String sql="select * from persona where id_tipo_persona = '1' and estado_persona='+1+'";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Tecnico tec=new Tecnico();
                tec.setDNI(rs.getInt("dni"));
                tec.setNombre(rs.getString("nombres"));
                tec.setAp_paterno(rs.getString("apellido_paterno"));
                tec.setAp_materno(rs.getString("apellido_materno"));
                tec.setHorario(rs.getInt("id_horario"));
                tec.setCorreo_electronico(rs.getString("correo_electronico"));
                tec.setTelefono(rs.getInt("telefono"));
                tec.setEspecialidad(rs.getString("especialidad"));
                tec.setExperiencia_labo(rs.getString("experiencia_laboral"));
                
                list.add(tec);
            }
        } catch (SQLException e) {
                  e.printStackTrace(System.out);
        }
        return list;  

    }

    @Override
    public Tecnico list(int dni) {
       String sql="select * from persona where dni="+dni;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
          
                t.setDNI(rs.getInt("dni"));
                t.setNombre(rs.getString("nombres"));
                t.setAp_paterno(rs.getString("apellido_paterno"));
                t.setAp_materno(rs.getString("apellido_materno"));
                t.setHorario(rs.getInt("id_horario"));
                t.setCorreo_electronico(rs.getString("correo_electronico"));
                t.setTelefono(rs.getInt("telefono"));
                t.setEspecialidad(rs.getString("especialidad"));
                t.setExperiencia_labo(rs.getString("experiencia_laboral"));
                
            }
        } catch (SQLException e) {
            
        }
        return t;
    }
    
    @Override
    public boolean add( Tecnico tec) {
        
         String sql="insert into persona (dni, nombres, apellido_paterno, "
                 + "apellido_materno, id_tipo_persona, id_distrito, id_horario, direccion, telefono, "
                 + "correo_electronico, especialidad, experiencia_laboral, estado_persona) "
                 
                 + "values ('"+tec.getDNI()+"',"
                 + "'"+tec.getNombre()+"',"
                 + "'"+tec.getAp_paterno()+"',"
                 + "'"+tec.getAp_materno()+"',"
                 + "'1',"
                  + "null,"
                 + "'"+tec.getHorario()+"',"
                 + "null,"
                 + "'"+tec.getTelefono()+"',"
                 + "'"+tec.getCorreo_electronico()+"',"
                 + "'"+tec.getEspecialidad()+"',"
                 + "'"+tec.getExperiencia_labo()+"',"
                 + "'1')";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return false;
    }

    
       @Override
    public boolean edit(Tecnico tec) {
        
                 //"insert into persona (dni, nombres, apellido_paterno, "
                 // + "apellido_materno, id_tipo_persona, id_distrito, id_horario, direccion, telefono, "
                 // + "correo_electronico, especialidad, experiencia_laboral, estado_persona) "

    String sql="update persona set dni='"+tec.getDNI()+"', nombres='"+tec.getNombre()+"', apellido_paterno='"+tec.getAp_paterno()+"', "
                 + "apellido_materno='"+tec.getAp_materno()+"', id_tipo_persona='1', id_distrito=null, id_horario='"+tec.getHorario()+"',direccion=null, telefono='"+tec.getTelefono()+"', "
                 + "correo_electronico='"+tec.getCorreo_electronico()+"', especialidad='"+tec.getEspecialidad()+"',"
                 + " experiencia_laboral='"+tec.getExperiencia_labo()+"', estado_persona='1' where dni="+tec.getDNI();
                 try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
           } catch (Exception e) {
                     e.printStackTrace(System.out);
           }
         return false;
    }
    
    
    
    @Override
    public boolean eliminar(int dni) {
 //String sql="delete from persona where dni= "+dni;
         String sql="update persona set estado_persona='0' where dni="+dni;
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
