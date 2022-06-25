/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Config.Conexion;
import Entidad.Cita;
import Entidad.Cliente;
import Entidad.Tecnico;
import Interfaces.CRUD_Cita;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CitaDAO implements CRUD_Cita {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Cita c = new Cita();
   int r;

    public CitaDAO() {
    }

    @Override
    public List listar() {
        ArrayList<Cita> list = new ArrayList<>();
        String sql = "select * from cita where estado != '+0+'";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Cita ci = new Cita();
                Cliente cli = new Cliente();
                Tecnico tec = new Tecnico();
                ci.setId_cita(rs.getInt("id_cita"));
                cli.setDNI(rs.getInt("dni_cliente"));
                tec.setDNI(rs.getInt("dni_tecnico"));
                ci.setFecha_cita(rs.getString("fecha_cita"));
                ci.setHora_cita(rs.getString("hora_cita"));

                list.add(ci);
            }
        } catch (SQLException e) {
        }
        return list;
    }

    @Override
    public Cita list(int id_cita) {
        /*String sql = "select * from cita where id_cita=" + id_cita;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                //(dni, nombres, apellido_paterno, apellido_materno, id_tipo_persona, distrito, direccion, telefono, correo electronico) "  
                c.setId_cita(rs.getInt("id_cita"));
                c.setDni_cliente(rs.getInt("dni_cliente"));
                c.setDni_tecnico(rs.getInt("dni_tecnico"));
                c.setFecha_cita(rs.getDate("fecha_cita"));
                c.setHora_cita(rs.getTime("hora_cita"));
            }
        } catch (SQLException e) {
        }*/
        return c;
    }

    @Override
    public int add(Cita cit) {

        String sql = "insert into cita (dni_cliente, dni_tecnico, fecha_cita, hora_cita) values(?,?,?,?)  ";
            try{   
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
            
            ps.setInt(1, cit.getDni_cliente());
            ps.setInt(2, cit.getDni_tecnico());
            ps.setString(3, cit.getFecha_cita());
            ps.setString(4, cit.getHora_cita());

        } catch (Exception e) {

        }
        return r;
    }

    @Override
    public int edit(Cita cit) {
        //(id_cita, dni_cliente, dni_tecnico, fecha_cita, hora_cita) " 

       String sql = "UPDATE  cita SET dni_cliente=?, dni_tecnico=?, fecha_cita=?, hora_cita=? WHERE id_citas=?  ";
            try{   
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
            
            ps.setInt(1, cit.getDni_cliente());
            ps.setInt(2, cit.getDni_tecnico());
            ps.setString(3, cit.getFecha_cita());
            ps.setString(4, cit.getHora_cita());
            ps.setInt(5, cit.getId_cita());
            
        } catch (Exception e) {

        }
        return r;
    }

    @Override
    public int eliminar(int id_cita) {
        String sql = "delete from cita where id_cita= " + id_cita;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {

        }
        return r;
    }

}
