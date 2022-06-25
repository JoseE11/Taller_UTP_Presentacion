/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Config.Conexion;
import Entidad.Persona;
import Entidad.tipo_persona;
import Interfaces.CRUD_Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class PersonaDAO implements CRUD_Persona{
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Persona per = new Persona();
    tipo_persona tip= new tipo_persona();
    int r;
    @Override
    public Persona validar(String correo_electronico, int DNI) {
       
       String sql="select * from persona AS p INNER JOIN tipo_persona AS t ON p.id_tipo_persona=t.id_tipo_persona where correo_electronico=? and dni=? ";
       try{
           con=cn.getConnection();
           ps=con.prepareStatement(sql);
           
           ps.setString(1, correo_electronico);
           ps.setInt(2,DNI);
           rs=ps.executeQuery();
           while(rs.next()){
               per.setDNI(rs.getInt("dni"));
               per.setNombre(rs.getString("nombres"));
               per.setAp_paterno(rs.getString("apellido_paterno"));
               per.setCorreo_electronico(rs.getString("correo_electronico"));
               per.setTipo(rs.getString("nombre_tipo_persona"));
               
           }
       }catch(Exception e)
       {
           e.printStackTrace(System.out);
       }
      return per; 
    }

    @Override
    public int login(Persona per, tipo_persona tip) {
         String sql="select * from persona AS p INNER JOIN tipo_persona AS t ON p.id_tipo_persona=t.id_tipo_persona where correo_electronico=? and dni=? ";
       try{
           con=cn.getConnection();
           ps=con.prepareStatement(sql);
           
           ps.setString(1, per.getCorreo_electronico());
           ps.setInt(2,per.getDNI());
           rs=ps.executeQuery();
           while(rs.next()){
               r=r+1;
               per.setDNI(rs.getInt("dni"));
               per.setNombre(rs.getString("nombres"));
               per.setAp_paterno(rs.getString("apellido_paterno"));
               per.setCorreo_electronico(rs.getString("correo_electronico"));
               tip.setId_tipo_persona(rs.getInt("id_tipo_persona"));
               tip.setNombre_tipo_persona(rs.getString("nombre_tipo_persona"));
               
           }
           if(r==1){
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
    public Persona list(int dni) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
