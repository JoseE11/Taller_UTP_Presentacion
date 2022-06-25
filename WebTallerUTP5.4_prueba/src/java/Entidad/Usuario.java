/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

public class Usuario {
    String contraseña, nombre_usuario;
    int id_usuario, rol, dni_ref;
    boolean estado_usuario;

    public Usuario(String contraseña, String nombre_usuario, int rol, int DNI) {
        this.contraseña = contraseña;
        this.nombre_usuario = nombre_usuario;
        this.rol = rol;
    }

    public Usuario() {
            
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public int getDni_ref() {
        return dni_ref;
    }

    public void setDni_ref(int dni_ref) {
        this.dni_ref = dni_ref;
    }

    public boolean isEstado_usuario() {
        return estado_usuario;
    }

    public void setEstado_usuario(boolean estado_usuario) {
        this.estado_usuario = estado_usuario;
    }
    
    
    
}
