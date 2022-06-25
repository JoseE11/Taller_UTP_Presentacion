/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;
import Entidad.Persona;
import Entidad.Tecnico;
import java.util.List;

public interface CRUD_Tecnico {
    public List listar();
    public Tecnico list(int dni);
    public boolean add (Tecnico tec);
    public boolean edit (Tecnico tec);
    public boolean eliminar (int dni);
}
