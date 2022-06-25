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
    public Persona list(int dni);
    public boolean add (Tecnico tec);
    public int edit (Tecnico tec);
    public int eliminar (Tecnico tec);
}
