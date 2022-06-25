/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;


public class Tecnico extends Persona{
 String especialidad, experiencia_labo, nombre_horario, descripcion_horario;
 
 int horario;

    public Tecnico(String especialidad, String experiencia_labo, String nombre_horario, String descripcion_horario, int horario, int DNI, int telefono, String tipo, int estado_persona, String nombre, String ap_paterno, String ap_materno, String correo_electronico) {
        super(DNI, telefono, tipo, estado_persona, nombre, ap_paterno, ap_materno, correo_electronico);
        this.especialidad = especialidad;
        this.experiencia_labo = experiencia_labo;
        this.nombre_horario = nombre_horario;
        this.descripcion_horario = descripcion_horario;
        this.horario = horario;
    }

 
    

 @Override
    public int getEstado_persona() {
        return estado_persona;
    }

 @Override
    public void setEstado_persona(int estado_persona) {
        this.estado_persona = estado_persona;
    }

    public String getNombre_horario() {
        return nombre_horario;
    }

    public void setNombre_horario(String nombre_horario) {
        this.nombre_horario = nombre_horario;
    }

    public String getDescripcion_horario() {
        return descripcion_horario;
    }

    public void setDescripcion_horario(String descripcion_horario) {
        this.descripcion_horario = descripcion_horario;
    }


   
    
    public Tecnico() {

    }

 @Override
    public String getTipo() {
        return tipo;
    }

 @Override
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getExperiencia_labo() {
        return experiencia_labo;
    }

    public void setExperiencia_labo(String experiencia_labo) {
        this.experiencia_labo = experiencia_labo;
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
