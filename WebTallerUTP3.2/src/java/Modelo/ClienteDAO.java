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


public class ClienteDAO implements CRUD{
Conexion cn=new Conexion();
Connection con;
PreparedStatement ps;
ResultSet rs;
Cliente p=new Cliente();

    @Override
    public List listar() {
    ArrayList<Cliente>list=new ArrayList<>();
       String sql="select * from persona where categoria = '+Cliente+' and estado != '+Desactivado+'";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Cliente cli=new Cliente();
                cli.setDNI(rs.getInt("dni"));
                cli.setNombre(rs.getString("nombres"));
                cli.setAp_paterno(rs.getString("apellido_Paterno"));
                cli.setAp_materno(rs.getString("apellido_Materno"));
                cli.setDireccion(rs.getString("direccion"));
                cli.setCorreo_electronico(rs.getString("correo_electronico"));
                cli.setTelefono(rs.getInt("telefono"));
                
                list.add(cli);
       }
        } catch (SQLException e) {
        }
        return list;    
    }

    @Override
    public Persona list(int id) {

    return null;

    }
   @Override
    public boolean add(Tecnico tec, Cliente cli) {
        String sql="insert into persona (dni, nombres, apellido_paterno, apellido_materno, "
                + "id_tipo_persona, distrito, direccion, telefono, correo electronico) "  
                + "values ('"+cli.getDNI()+"','"+cli.getNombre()+"',"
                + "'"+cli.getAp_paterno()+"','"+cli.getAp_materno()+"',"
                + "'"+cli.getTipo()+"','"+cli.getDistrito()+"',"
                + "'"+cli.getDireccion()+"','"+cli.getTelefono()+"',"
                + "'"+cli.getCorreo_electronico()+"')";
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Override
    public boolean eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
