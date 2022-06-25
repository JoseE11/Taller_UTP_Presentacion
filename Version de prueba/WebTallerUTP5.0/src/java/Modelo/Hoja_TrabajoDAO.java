/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import Config.Conexion;
import Entidad.Hoja_Trabajo;
import Interfaces.CRUD_HTrabajo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Hoja_TrabajoDAO implements CRUD_HTrabajo {
Conexion cn=new Conexion();
Connection con;
PreparedStatement ps;
ResultSet rs;
Hoja_Trabajo ht =new Hoja_Trabajo();

    @Override
    public List listar() {
    ArrayList<Hoja_Trabajo>list=new ArrayList<>();
       String sql="select * from hoja_trabajo'";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Hoja_Trabajo htr=new Hoja_Trabajo();
                htr.setId_hoja_trabajo(rs.getInt("id_hoja_trabajo"));
                htr.setDni_tecnico_ref(rs.getInt("dni_tecnico"));
                htr.setDni_cliente_ref(rs.getInt("dni_cliente"));
                htr.setId_presupuesto_ref(rs.getInt("id_presupuesto"));
                htr.setMonto_total(rs.getDouble("monto_total"));
                list.add(htr);
       }
        } catch (SQLException e) {
        }
        return list;      
    }

    @Override
    public Hoja_Trabajo list(int id_hoja_trabajo) {
       String sql="select * from hoja_trabajo where id_hoja_trabajo="+id_hoja_trabajo;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
            //(dni, nombres, apellido_paterno, apellido_materno, id_tipo_persona, distrito, direccion, telefono, correo electronico) "  
                
                ht.setId_hoja_trabajo(rs.getInt("id_hoja_trabajo"));
                ht.setDni_tecnico_ref(rs.getInt("dni_tecnico"));
                ht.setDni_cliente_ref(rs.getInt("dni_cliente"));
                ht.setId_presupuesto_ref(rs.getInt("id_presupuesto"));
                ht.setMonto_total(rs.getDouble("monto_total"));
            }
        } catch (SQLException e) {
        }
        return ht;    }

    @Override
    public boolean add(Hoja_Trabajo hojt) {
        String sql="insert into hoja_trabajo (id_hoja_trabajo, dni_tecnico, dni_cliente, id_presupuesto, "
                + "monto_total ) "  
                + "values ('"+hojt.getId_hoja_trabajo()+"',"
                + "'"+hojt.getDni_tecnico_ref()+"',"
                + "'"+hojt.getDni_cliente_ref()+"',"
                + "'"+hojt.getId_presupuesto_ref()+"',"
                + "'"+hojt.getMonto_total()+"')";
        try {                                                                                                                                                    
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
            
        } catch (Exception e) {
      
        }
        return false;    
    }

    @Override
    public boolean edit(Hoja_Trabajo hojt) {

    String sql="update persona set id_hoja_trabajo='"+hojt.getId_hoja_trabajo()+"', "
            + "dni_tecnico='"+hojt.getDni_tecnico_ref()+"',"
            + "dni_cliente='"+hojt.getDni_cliente_ref()+"',"
            + "id_presupuesto='"+hojt.getId_presupuesto_ref()+"',"
            + "monto_total='"+hojt.getMonto_total()+"',"
            + " where id_hoja_trabajo="+hojt.getId_hoja_trabajo();
                 try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
           } catch (Exception e) {
           }
         return false;        
    }

    @Override
    public boolean eliminar(int id_hoja_trabajo) {
         String sql="delete from hoja_trabajo where dni= "+id_hoja_trabajo;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            
        }
        return false;    }
    
    
    
    
}
