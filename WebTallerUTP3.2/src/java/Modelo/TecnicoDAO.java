/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Config.Conexion;
import Interfaces.CRUD;
import Entidad.Cliente;
import Entidad.Persona;
import Entidad.Tecnico;
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
public class TecnicoDAO implements CRUD{
    Conexion cn=new Conexion();
Connection con;
PreparedStatement ps;
ResultSet rs;
Tecnico t=new Tecnico();

    @Override
    public List listar() {

   ArrayList<Tecnico>list=new ArrayList<>();
       String sql="select * from persona where id_tipo_persona = '+tec+' and estado != '+0+'";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Tecnico tec=new Tecnico();
                tec.setDNI(rs.getInt("dni"));
                tec.setNombre(rs.getString("nombres"));
                tec.setAp_paterno(rs.getString("apellido_Paterno"));
                tec.setAp_materno(rs.getString("apellido_Materno"));
                tec.setCorreo_electronico(rs.getString("correo_electronico"));
                tec.setTelefono(rs.getInt("telefono"));
                tec.setEspecialidad(rs.getString("especialidad"));
                tec.setExperiencia_labo(rs.getString("experiencia_laboral"));
                
                list.add(tec);
            }
        } catch (SQLException e) {
        }
        return list;  

    }

    @Override
    public Persona list(int dni) {
       String sql="select * from persona where Id="+dni;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
          
                t.setDNI(rs.getInt("dni"));
                t.setNombre(rs.getString("nombres"));
                t.setAp_paterno(rs.getString("apellido_Paterno"));
                t.setAp_materno(rs.getString("apellido_Materno"));
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
    public boolean add( Tecnico tec, Cliente cli) {
        
         //+ "values ('"+tec.get()+"','""',
         String sql="insert into persona (dni, nombres, apellido_Paterno, "
                 + "apellido_Materno, id_tipo_persona, id_horario, telefono, "
                 + "correo electronico, especialidad, experiencia_laboral) "
                 
                 + "values ('"+tec.getDNI()+"',"
                 + "'"+tec.getNombre()+"',"
                 + "'"+tec.getAp_paterno()+"',"
                 + "'"+tec.getAp_materno()+"',"
                 + "'"+tec.getTipo()+"',"
                 + "'"+tec.getHorario()+"',"
                 + "'"+tec.getTelefono()+"',"
                 + "'"+tec.getCorreo_electronico()+"',"
                 + "'"+tec.getEspecialidad()+"',"
                 + "'"+tec.getExperiencia_labo()+"')";
         
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
            
        } catch (Exception e) {
      
        }
        return false;
    }

    
       @Override
    public boolean edit(Tecnico tec, Cliente cli) {

    String sql="update persona set dni='"+tec.getDNI()+"', nombres='"+tec.getNombre()+"', apellido_Paterno='"+tec.getAp_paterno()+"', "
                 + "apellido_Materno='"+tec.getAp_materno()+"', id_tipo_persona='"+tec.getTipo()+"', id_horario='"+tec.getHorario()+"', telefono='"+tec.getTelefono()+"', "
                 + "correo electronico='"+tec.getCorreo_electronico()+"', especialidad='"+tec.getEspecialidad()+"', experiencia_laboral="+tec.getExperiencia_labo()+"' where dni="+tec.getDNI();
                 try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
           } catch (Exception e) {
           }
         return false;
    }
    
    
    
    @Override
    public boolean eliminar(int dni) {
 String sql="delete from persona where dni= "+dni;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            
        }
        return false;
    }


 
}
