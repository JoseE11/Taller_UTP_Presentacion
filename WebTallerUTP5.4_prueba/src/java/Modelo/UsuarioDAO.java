/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Entidad.Usuario;
import Interfaces.CRUD_Usuario;
import java.util.List;
import Config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class UsuarioDAO implements CRUD_Usuario {
   Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Usuario usu = new Usuario();
    int r=0;
    @Override
    public List listar() {
 ArrayList<Usuario>list=new ArrayList<>();
       String sql="select * from usuarios where estado_usuario = '+1+' ";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Usuario usua =new Usuario();
                usua.setId_usuario(rs.getInt("id_usuario"));
                usua.setRol(rs.getInt("id_rol"));
                usua.setDni_ref(rs.getInt("dni"));
                usua.setNombre_usuario(rs.getString("nombre_usuario"));
                list.add(usua);
       }
        } catch (SQLException e) {
               e.printStackTrace(System.out);
        }
        return list;       }

       @Override
     public int validar(Usuario usu) {
       //String contraseña, nombre_usuario;
       //int id_usuario, rol, dni_ref;
       //boolean estado_usuario;
          int r=0;
       String sql="select * from usuarios where nombre_usuario=? and contraseña=? ";
       try{
           con=cn.getConnection();
           ps=con.prepareStatement(sql);
           
           ps.setString(1,usu.getNombre_usuario());
           ps.setString(2,usu.getContraseña());
           rs=ps.executeQuery();
           while(rs.next()){
               r=r+1;
               usu.setNombre_usuario(rs.getString("nombre_usuario"));
               usu.setContraseña(rs.getString("contraseña"));
           }
           if (r==1){
               return 1;
               
           }else{
               return 0;
           }
               
       }catch(Exception e)
       {
           e.printStackTrace(System.out);
            return 0;
       }
    
    }

    @Override
    public Usuario list(int id_usuario) {
    String sql="select * from usuarios where estado_usuario = '+1+' ";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
              
                usu.setId_usuario(rs.getInt("id_usuario"));
                usu.setRol(rs.getInt("id_rol"));
                usu.setDni_ref(rs.getInt("dni"));
                usu.setNombre_usuario(rs.getString("nombre_usuario"));
         
       }
        } catch (SQLException e) {
                              e.printStackTrace(System.out);

        }
        return usu;     
    }

    @Override
    public boolean add(Usuario usu) {
     String sql="insert into usuarios (id_usuario, id_rol, dni, nombre_usuario, contraseña, estado_usuario)"
             + "values('"+usu.getId_usuario()+"','"+usu.getRol()+"','"+usu.getDni_ref()+"','"+usu.getNombre_usuario()+"','"+usu.getContraseña()+"','1')";
    
        try {                                                                                                                                                    
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return false;     }

    @Override
    public boolean edit(Usuario usu) {
     String sql="update usuarios set id_usuario='"+usu.getId_usuario()+"', id_rol='"+usu.getRol()+"', nombre_usuario='"+usu.getNombre_usuario()+"', contraseña='"+usu.getContraseña()+"', estado_usuario='1' where id_usuario="+usu.getId_usuario();
   
            
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
    public boolean eliminar(int id_usuario) {
  String sql="update usuarios set estado_usuario='0' where id_usuario="+id_usuario;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
                e.printStackTrace(System.out);  
        }
        return false;    }
    
}
