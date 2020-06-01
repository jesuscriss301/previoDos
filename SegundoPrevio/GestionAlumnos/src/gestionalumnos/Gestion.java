/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionalumnos;

import java.util.Hashtable;

/**
 *
 * @author Cristian
 */
public class Gestion {
    
    private Hashtable<String,Alumno> alumnos;
    private Hashtable<Integer,Asignatura> asignaturas;

    public Gestion() {
        this.alumnos = new Hashtable();
        this.asignaturas = new Hashtable();
    }
    
    public boolean agregarAlumno(String nombre, String apellido, String DNI, String direccion, String email, int edad){
        Alumno a = new Alumno(nombre,apellido,DNI,direccion,email,edad);
        if(!existeAlumno(a.getDNI())){
            this.alumnos.put(a.getDNI(), a);
            return true;
        }
        return false;
    }
    
    public boolean agregarAsignatura(int id, String nombre, int creditos){
        Asignatura a = new Asignatura(id,nombre,creditos);
        if(!existeAsignatura(a.getId())){
            this.asignaturas.put(a.getId(), a);
            return true;
        }return false;
    }
    
    public void modificarAlumno(String nombre, String apellido, String DNI, String direccion, String email, int edad){
        if(existeAlumno(DNI)){
            Alumno a = this.getAlumnos().get(DNI);
            a.setNombre(nombre);
            a.setApellido(apellido);
            a.setEmail(email);
            a.setDireccion(direccion);
            a.setEdad(edad);
        }
    }
    
    public void modificarAsignatura(int id, String nombre, int creditos){
        if(existeAsignatura(id)){
            Asignatura a = this.getAsignaturas().get(id);
            a.setNombre(nombre);
            a.setCreditos(creditos);
        }
    }
    
    public String consultarAlumno(String DNI){
        String rta = "";
        if(existeAlumno(DNI)){
           Alumno a = this.getAlumnos().get(DNI);
           rta = "Nombre "+a.getNombre()+"\nApellido "+a.getApellido()+
                   "\nDNI "+a.getDNI()+"\nDireccion "+a.getDireccion()+"\nEmail "+a.getEmail()+"\nEdad "+a.getEdad();
        }
        return rta;
    }
    
    public String consultarAsignatura(int id){
        String rta = "";
        if(existeAsignatura(id)){
           Asignatura a = this.getAsignaturas().get(id);
           rta = "ID Asignatura "+a.getId()+"\nNombre "+a.getNombre()+
                   "\nNo. de Creditos "+a.getCreditos();
        }
        return rta;
    }
    
    public void eliminarAlumno(String DNI){
        if(existeAlumno(DNI)){
            this.getAlumnos().remove(DNI);
        }
    }
    
    public void eliminarAsignatura(int id){
        if(existeAsignatura(id)){
            this.getAsignaturas().remove(id);
        }
    }
    
    private boolean existeAsignatura(int id) {
        if(this.asignaturas.isEmpty())
            return false;
        return this.getAsignaturas().get(id) != null;
    }
    
    private boolean existeAlumno(String DNI){
        if(this.alumnos.isEmpty())
            return false;
        return this.getAlumnos().get(DNI) != null;
    }

    public Hashtable<String, Alumno> getAlumnos() {
        return alumnos;
    }

    public Hashtable<Integer, Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(Hashtable<Integer, Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }

    public void setAlumnos(Hashtable<String, Alumno> alumnos) {
        this.alumnos = alumnos;
    }
    
    
}
