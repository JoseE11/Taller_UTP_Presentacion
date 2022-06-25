/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Entidad.Usuario;
import java.util.List;


public interface CRUD_Usuario {
    
    public List listar();
    public Usuario list(int id_usuario);
    public boolean add ( Usuario usu);
    public boolean edit ( Usuario usu);
    public boolean eliminar (int id_usuario);
    
}
