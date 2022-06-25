/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;
import Entidad.Cliente;
import Entidad.Persona;
import java.util.List;

public interface CRUD_Cliente {
    public List listar();
    public Persona list(int dni);
    public int add ( Cliente cli);
    public int edit ( Cliente cli);
    public int eliminar (Cliente cli);
}
