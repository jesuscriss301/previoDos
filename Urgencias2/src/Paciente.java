/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johan leon
 */
public class Paciente {
    
    private String nombre;
    private boolean asegurado;
    private int numeroAsegurado;
    private int gradoEnfermedad;
    private String urgencia;
    private Medico medicoHabitual;

    public Paciente(String nombre, boolean asegurado, int numeroAsegurado, Medico medicoHabitual) {
        this.nombre = nombre;
        this.asegurado = asegurado;
        this.numeroAsegurado = numeroAsegurado;
        this.medicoHabitual = medicoHabitual;
    }

    

    public Medico getMedicoHabitual() {
        return medicoHabitual;
    }

    public void setMedicoHabitual(Medico medicoHabitual) {
        this.medicoHabitual = medicoHabitual;
    }

    public Paciente(String nombre, boolean asegurado, int numeroAsegurado, int gradoEnfermedad, String urgencia, Medico medicoHabitual) {
        this.nombre = nombre;
        this.asegurado = asegurado;
        this.numeroAsegurado = numeroAsegurado;
        this.gradoEnfermedad = gradoEnfermedad;
        this.urgencia = urgencia;
        this.medicoHabitual = medicoHabitual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isAsegurado() {
        return asegurado;
    }

    public void setAsegurado(boolean asegurado) {
        this.asegurado = asegurado;
    }

    public int getNumeroAsegurado() {
        return numeroAsegurado;
    }

    public void setNumeroAsegurado(int numeroAsegurado) {
        this.numeroAsegurado = numeroAsegurado;
    }

    public int getGradoEnfermedad() {
        return gradoEnfermedad;
    }

    public void setGradoEnfermedad(int gradoEnfermedad) {
        this.gradoEnfermedad = gradoEnfermedad;
    }

    public String getUrgencia() {
        return urgencia;
    }

    public void setUrgencia(String urgencia) {
        this.urgencia = urgencia;
    }

    

    public Paciente() {
    }
    
    
}
