/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionalumnos;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author Cristian
 */
public class Gestion {
    
    private Hashtable<String,Alumno> alumnos;
    private Hashtable<String,Asignatura> asignaturas;

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
    
    public boolean agregarAlumnoModificado(Alumno a){
         if(!existeAlumno(a.getDNI())){
            this.alumnos.put(a.getDNI(), a);
            return true;
        }
        return false;
    }
    
    public boolean agregarAsignaturaModificada(Asignatura as){
        Asignatura a = as;
        if(!existeAsignatura(a.getId())){
            this.asignaturas.put(a.getId(), a);
            return true;
        }return false;
    }
    
    public boolean agregarAsignatura(String id, String nombre, int creditos){
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
    
    public boolean eliminarAlumno(String DNI){
        
        if(this.getAlumnos().get(DNI) != null){
            this.getAlumnos().remove(DNI);
        Hashtable h = this.getAsignaturas();
        Enumeration e = h.keys();
        while(e.hasMoreElements()){
            Asignatura a = (Asignatura)h.get(e.nextElement().toString());
            a.eliminarAlumno(DNI);
        }
            return true;
        }
        return false;
    }
    
    public void eliminarAlumnoTemp(String dni){
        this.getAlumnos().remove(dni);
    }
    
    public void eliminarAsignaturaTemp(String id){
            this.getAsignaturas().remove(id);
    }
    
    public boolean matricularAsignaturaAlumno(Asignatura as, Alumno a){
        return this.getAlumnos().get(a.getDNI()).matricularAsignatura(as);
    }
    
    public void modificarAsignatura(String id, String nombre, int creditos){
        if(existeAsignatura(id)){
            Asignatura a = this.getAsignaturas().get(id);
            a.setNombre(nombre);
            a.setCreditos(creditos);
        }
    }
    
    public boolean eliminarAsignatura(String id){
        if(existeAsignatura(id)){
            if(!this.getAsignaturas().get(id).tieneAlumnos())  //VERIFICAR SI TIENE ALUMNOS
                this.getAsignaturas().remove(id);
            return true;
        }
        return false;
    }
    
    public boolean existeAsignatura(String id) {
        if(this.asignaturas.isEmpty())
            return false;
        return this.getAsignaturas().get(id) != null;
    }
    
    public boolean existeAlumno(String DNI){
        if(this.alumnos.isEmpty())
            return false;
        return this.getAlumnos().get(DNI) != null;
    }

    public Hashtable<String, Alumno> getAlumnos() {
        return alumnos;
    }

    public Hashtable<String, Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(Hashtable<String, Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }

    public void setAlumnos(Hashtable<String, Alumno> alumnos) {
        this.alumnos = alumnos;
    }
    
    
}
