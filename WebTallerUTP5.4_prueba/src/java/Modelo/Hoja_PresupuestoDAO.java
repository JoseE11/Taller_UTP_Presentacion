/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Config.Conexion;
import Entidad.Hoja_Presupuesto;
import Interfaces.CRUD_Presupuesto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Hoja_PresupuestoDAO implements CRUD_Presupuesto{
Conexion cn=new Conexion();
Connection con;
PreparedStatement ps;
ResultSet rs;
Hoja_Presupuesto hp =new Hoja_Presupuesto();

    @Override
    public List listar() {
    ArrayList<Hoja_Presupuesto>list=new ArrayList<>();
       String sql="select * from hoja_presupuesto'";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Hoja_Presupuesto hpr=new Hoja_Presupuesto();
                hpr.setId_presupesto(rs.getInt("id_presupuesto"));
                hpr.setMonto_prespuesto(rs.getDouble("monto_presupuesto"));
                hpr.setDescripcion_presupuesto(rs.getString("descripcion_prespuesto"));
                hpr.setEstado_presupuesto(rs.getBoolean("estado_prespuesto"));
                list.add(hpr);
       }
        } catch (SQLException e) {
        }
        return list;     }

    @Override
    public Hoja_Presupuesto list(int id_presupesto) {
 String sql="select * from hoja_presupuesto'";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
  
                hp.setId_presupesto(rs.getInt("id_presupuesto"));
                hp.setMonto_prespuesto(rs.getDouble("monto_presupuesto"));
                hp.setDescripcion_presupuesto(rs.getString("descripcion_prespuesto"));
                hp.setEstado_presupuesto(rs.getBoolean("estado_prespuesto"));
       }
        } catch (SQLException e) {
        }
        return hp;     }    

    @Override
    public boolean add(Hoja_Presupuesto pres) {
        String sql="insert into hoja_trabajo (id_hoja_trabajo, dni_tecnico, dni_cliente, id_presupuesto, "
                + "monto_total ) "  
                + "values ('"+pres.getId_presupesto()+"',"
                + "'"+pres.getMonto_prespuesto()+"',"
                + "'"+pres.getDescripcion_presupuesto()+"',"
                + "'"+pres.isEstado_presupuesto()+"',)";
        try {                                                                                                                                                    
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
            
        } catch (Exception e) {
      
        }
        return false;        
    }

    @Override
    public boolean edit(Hoja_Presupuesto pres) {


    String sql="update persona set id_hoja_trabajo='"+pres.getId_presupesto()+"', "
            + "dni_tecnico='"+pres.getId_presupesto()+"',"
            + "dni_cliente='"+pres.getDescripcion_presupuesto()+"',"
            + "id_presupuesto='"+pres.isEstado_presupuesto()+"',"
            + " where id_hoja_trabajo="+pres.getId_presupesto();
                 try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
           } catch (Exception e) {
           }
         return false;      }

    @Override
    public boolean eliminar(int id_presupesto) {
 String sql="delete from hoja_trabajo where dni= "+id_presupesto;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            
        }
        return false;       }
    
}
