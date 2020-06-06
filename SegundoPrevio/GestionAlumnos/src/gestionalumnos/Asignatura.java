/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionalumnos;

import java.util.LinkedList;

/**
 *
 * @author Cristian
 */
public class Asignatura {
    
    private String id;
    private String nombre;
    private int creditos;
    private LinkedList<Alumno> alumnos;

    public Asignatura(String id, String nombre, int creditos) {
        this.id = id;
        this.nombre = nombre;
        this.creditos = creditos;
        alumnos = new LinkedList();
    }
    
    @Override
    public String toString(){
        return this.getNombre();
    }

    public String getId() {
        return id;
    }

    public LinkedList<Alumno> getAlumnos() {
        return alumnos;
    }
    
    public void eliminarAlumno(String dni){
        int i = 0;
        for (Alumno a : this.getAlumnos()) {
            if(a.getDNI().equals(dni)){
                this.getAlumnos().remove(i);
                break;
            }
            i++;
        }
    }
    
    public int getCantidadAlumnos(){
        return this.getAlumnos().size();
    }

    public void setAlumnos(LinkedList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
    
    public boolean tieneAlumnos(){
        return !this.getAlumnos().isEmpty();
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    
    
    
}
