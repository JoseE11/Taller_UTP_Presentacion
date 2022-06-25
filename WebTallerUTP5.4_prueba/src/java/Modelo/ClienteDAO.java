/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Config.Conexion;
import Entidad.Cliente;
import Entidad.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Interfaces.CRUD_Cliente;


public class ClienteDAO implements CRUD_Cliente{
Conexion cn=new Conexion();
Connection con;
PreparedStatement ps;
ResultSet rs;
Cliente c=new Cliente();

    @Override
    public List listar() {
    ArrayList<Cliente>list=new ArrayList<>();
       String sql="select * from persona AS p INNER JOIN distritos AS d ON p.id_distrito=d.id_distrito where p.id_tipo_persona = 2 and p.estado_persona = 1";

        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Cliente cli=new Cliente();
                cli.setDNI(rs.getInt("dni"));
                cli.setNombre(rs.getString("nombres"));
                cli.setAp_paterno(rs.getString("apellido_paterno"));
                cli.setAp_materno(rs.getString("apellido_materno"));
                cli.setCorreo_electronico(rs.getString("correo_electronico"));
                cli.setId_distrito(rs.getInt("id_distrito"));
                cli.setDistrito(rs.getString("nombre_distrito"));
                cli.setDireccion(rs.getString("direccion"));
                cli.setTelefono(rs.getInt("telefono"));
                
                
                list.add(cli);
       }
        } catch (SQLException e) {
          e.printStackTrace(System.out);
        }
        return list;    
    }

    @Override
    public Persona list(int dni) {
       String sql="select * from persona where dni="+dni;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
            //(dni, nombres, apellido_paterno, apellido_materno, id_tipo_persona, id_distrito, direccion, telefono, correo electronico) "  
                c.setDNI(rs.getInt("dni"));
                c.setNombre(rs.getString("nombres"));
                c.setAp_paterno(rs.getString("apellido_paterno"));
                c.setAp_materno(rs.getString("apellido_materno"));
                c.setDistrito(rs.getString("id_distrito"));
                c.setDireccion(rs.getString("direccion"));
                c.setTelefono(rs.getInt("telefono"));
                c.setCorreo_electronico(rs.getString("correo_electronico"));
                c.setEstado_persona(rs.getInt("estado_persona"));
            }
        } catch (SQLException e) {
          e.printStackTrace(System.out);
        }
        return c;

    }
   @Override
    public boolean add(Cliente cli) {
               String sql="insert into persona (dni, nombres, apellido_paterno, "
                 + "apellido_materno, id_tipo_persona, id_distrito, id_horario, direccion, telefono, "
                 + "correo_electronico, especialidad, experiencia_laboral, estado_persona) "
                 
                 + "values ('"+cli.getDNI()+"',"
                 + "'"+cli.getNombre()+"',"
                 + "'"+cli.getAp_paterno()+"',"
                 + "'"+cli.getAp_materno()+"',"
                 + "'2',"
                 + "'"+cli.getDistrito()+"',"
                 + "null,"
                 + "'"+cli.getDireccion()+"',"
                 + "'"+cli.getTelefono()+"',"
                 + "'"+cli.getCorreo_electronico()+"',"
                 + "null,"
                 + "'null',"
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
    public boolean edit( Cliente cli) {
        //(dni, nombres, apellido_paterno, apellido_materno, id_tipo_persona, distrito, direccion, telefono, correo electronico) "  
     
                 //"insert into persona (dni, nombres, apellido_paterno, "
                 // + "apellido_materno, id_tipo_persona, id_distrito, id_horario, direccion, telefono, "
                 // + "correo_electronico, especialidad, experiencia_laboral, estado_persona) "

    String sql="update persona set dni='"+cli.getDNI()+"', nombres='"+cli.getNombre()+"',"
            + " apellido_paterno='"+cli.getAp_paterno()+"', "
            + "apellido_materno='"+cli.getAp_materno()+"', id_tipo_persona='2', "
            + "id_distrito='"+cli.getDistrito()+"',id_horario=null,direccion='"+cli.getDireccion()+"', "
            + "telefono='"+cli.getTelefono()+"',correo_electronico='"+cli.getCorreo_electronico()+"',especialidad=null,experiencia_laboral=null,estado_persona='1' "
            + " where dni="+cli.getDNI();
                 try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
           } catch (Exception e) {
               e.printStackTrace(System.out);           }
         return false;    
    }
    @Override
    public boolean eliminar(int dni) {
         //String sql="delete from persona where dni= "+dni;
         
         String sql= "update persona set estado_persona='0' where dni="+dni;
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
