/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Entidad.Equipos;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface CRUD_Equipo {
    public List listar();
    public Equipos list(int dni);
    public boolean add ( Equipos cli);
    public boolean edit ( Equipos cli);
    public boolean eliminar (int id);
}
