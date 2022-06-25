/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;


public class Cliente extends Persona {
  String distrito, direccion;
  int id_distrito;

    public Cliente(String distrito, String direccion, int id_distrito, int DNI, int telefono, int tipo, int estado_persona, String nombre, String ap_paterno, String ap_materno, String correo_electronico) {
        super(DNI, telefono, tipo, estado_persona, nombre, ap_paterno, ap_materno, correo_electronico);
        this.distrito = distrito;
        this.direccion = direccion;
        this.id_distrito = id_distrito;
    }
       public Cliente() {
       
    }
       

    public int getId_distrito() {
        return id_distrito;
    }

    public void setId_distrito(int id_distrito) {
        this.id_distrito = id_distrito;
    }
    
   
 

  @Override
    public int getEstado_persona() {
        return estado_persona;
    }

  @Override
    public void setEstado_persona(int estado_persona) {
        this.estado_persona = estado_persona;
    }


  @Override
    public int getTipo() {
        return tipo;
    }

  @Override
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }


  
    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    @Override
    public void setCorreo_electronico(String correo_electronico) {
        super.setCorreo_electronico(correo_electronico); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getCorreo_electronico() {
        return super.getCorreo_electronico(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setAp_materno(String ap_materno) {
        super.setAp_materno(ap_materno); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getAp_materno() {
        return super.getAp_materno(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setAp_paterno(String ap_paterno) {
        super.setAp_paterno(ap_paterno); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getAp_paterno() {
        return super.getAp_paterno(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getNombre() {
        return super.getNombre(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setTelefono(int telefono) {
        super.setTelefono(telefono); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int getTelefono() {
        return super.getTelefono(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setDNI(int DNI) {
        super.setDNI(DNI); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int getDNI() {
        return super.getDNI(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
 
   
}
