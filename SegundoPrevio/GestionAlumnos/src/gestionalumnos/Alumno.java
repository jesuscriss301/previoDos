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
public class Alumno {
    
    private String nombre;
    private String apellido;
    private String DNI;
    private String direccion;
    private String email;
    private int edad;
    private LinkedList<Asignatura> asignaturas;

    public Alumno(String nombre, String apellido, String DNI, String direccion, String email, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.direccion = direccion;
        this.email = email;
        this.edad = edad;
        this.asignaturas = new LinkedList();
    }
    
    public boolean matricularAsignatura(Asignatura a){
         if(!existeAisgnatura(a)){
             this.asignaturas.add(a);
             a.getAlumnos().add(this);
             return true;
         }
         return false;
    }
    
    public void eliminarMateria(int pos){
        if(!this.asignaturas.isEmpty())
            this.asignaturas.remove(pos);
    }
    
    private boolean existeAisgnatura(Asignatura a){
        if(!this.asignaturas.isEmpty()){
            
            for (Asignatura as : this.asignaturas) {
                if(a.getId().equals(as.getId()))
                    return true;
            }
        }
     return false;   
    }
    
    @Override
    public String toString(){
        return this.getNombre()+" "+this.getApellido();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public LinkedList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(LinkedList<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }
    
    
    
}
