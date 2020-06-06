/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johan leon
 */
public class Medico {
    private String nombre;
    private boolean disponible;
    private int pacientesAtendidos;

    public int getPacientesAtendidos() {
        return pacientesAtendidos;
    }

    public void setPacientesAtendidos(int pacientesAtendidos) {
        this.pacientesAtendidos = pacientesAtendidos;
    }
    
    public void agregarPaciente(){
        this.pacientesAtendidos++;
    }

    public Medico(String nombre, boolean disponible, int pacientesAtendidos) {
        this.nombre = nombre;
        this.disponible = disponible;
        this.pacientesAtendidos = pacientesAtendidos;
    }

    public Medico() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
