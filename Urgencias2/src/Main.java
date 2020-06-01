
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johan leon
 */
public class Main {
    public static void main(String[] args){
        Medico e = new Medico("Johan", true);
        Medico a = new Medico("Pablo", true);
        
        Paciente q = new Paciente("Pedro", true, 3, 3, "",e);
        Paciente w = new Paciente("ro", false, 3, 2, "",a);
        Paciente r = new Paciente("primero", true, 3, 4, "",a);
        
        
        LinkedList<Medico> medicos = new LinkedList();
        medicos.add(e);
        medicos.add(a);
        
        LinkedList<Paciente> pacientes = new LinkedList();
        pacientes.add(q);
        pacientes.add(w);
        pacientes.add(r);
        
        Urgencia urgencias = new Urgencia();
        urgencias.crearTurno(medicos, pacientes);
        
        urgencias.insertarPaciente("un ñero le metio un tiro", r, 4);
        urgencias.insertarPaciente("un ñero le metio un tiro", w, 3);
    }
}
