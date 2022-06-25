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
int r;
    @Override
    public List listar() {
    
       String sql="select * from persona AS p INNER JOIN distritos AS d ON p.id_distrito=d.id_distrito where p.id_tipo_persona = 2 and p.estado_persona = 1";
       List<Cliente>lista=new ArrayList<>(); 
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
                cli.setDireccion(rs.getString("direccion"));
                cli.setTelefono(rs.getInt("telefono"));
                cli.setDistrito(rs.getString("nombre_distrito"));
                
                lista.add(cli);
       }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return lista;    
    }

    @Override
    public Persona list(int dni) {
       String sql="select * from persona AS p INNER JOIN distritos AS d ON p.id_distrito=d.id_distrito where dni="+dni;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
            //(dni, nombres, apellido_paterno, apellido_materno, id_tipo_persona, distrito, direccion, telefono, correo electronico) "  
                c.setDNI(rs.getInt("dni"));
                c.setNombre(rs.getString("nombres"));
                c.setAp_paterno(rs.getString("apellido_paterno"));
                c.setAp_materno(rs.getString("apellido_materno"));
                c.setId_distrito(rs.getInt("id_distrito"));
                c.setDistrito(rs.getString("nombre_distrito"));
                c.setDireccion(rs.getString("direccion"));
                c.setTelefono(rs.getInt("telefono"));
                c.setCorreo_electronico(rs.getString("correo_electronico"));
                
            }
        } catch (SQLException e) {
             e.printStackTrace(System.out);
        }
        return c;

    }
   @Override
    public int add(Cliente cli) {
        String sql="insert into persona (dni, nombres, apellido_paterno, "
                 + "apellido_materno, id_tipo_persona, id_distrito, id_horario, direccion, telefono, "
                 + "correo_electronico, especialidad, experiencia_laboral) "
                 
                 + "values ('"+cli.getDNI()+"',"
                 + "'"+cli.getNombre()+"',"
                 + "'"+cli.getAp_paterno()+"',"
                 + "'"+cli.getAp_materno()+"',"
                 + "'2',"
                 + "'"+cli.getId_distrito()+"',"
                 + "null,"
                 + "'"+cli.getDireccion()+"',"
                 + "'"+cli.getTelefono()+"',"
                 + "'"+cli.getCorreo_electronico()+"',"
                 + "null,"
                 + "'null')";
        try {                                                                                                                                                    
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();    
         }   
        catch (Exception e) {
            e.printStackTrace(System.out);
        }
      return r;    

    }
    @Override
    public int edit( Cliente cli) {
        //(dni, nombres, apellido_paterno, apellido_materno, id_tipo_persona, distrito, direccion, telefono, correo electronico) "  
     
        String sql = "update persona set dni='" + cli.getDNI() + "', "
                + "nombres='" + cli.getNombre() + "',"
                + " apellido_paterno='" + cli.getAp_paterno() + "', "
                + "apellido_materno='" + cli.getAp_materno() + "', "
                + "id_tipo_persona='2', "
                + "id_distrito='" + cli.getId_distrito() + "',"
                + "id_horario=null,direccion='" + cli.getDireccion() + "', "
                + "telefono='" + cli.getTelefono() + "',"
                + "correo_electronico='" + cli.getCorreo_electronico() + "',"
                + "especialidad=null,"
                + "experiencia_laboral=null "
                + "where dni=?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, cli.getDNI());
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return r;   
    }
    @Override
    public int eliminar(Cliente cli) {
         String sql="update persona set estado_persona = 0 where dni=?";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setInt(1, cli.getDNI());
            ps.executeUpdate();
        } catch (Exception e) {
            
        }
        return r ;
    }


}
