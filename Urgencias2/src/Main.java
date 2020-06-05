
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
        
        Medico e = new Medico("Johan", true, 0);
        Medico a = new Medico("Pablo", true, 0);
        Medico t = new Medico("ertr", true, 0);
        Medico y = new Medico("ertert", true, 0);
        Medico z = new Medico("dfgfg", true, 0);
        
        Paciente q = new Paciente("Pedro", true, 3, 3, "",e);
        //Paciente w = new Paciente("ro", false, 3, 2, "",a);
        Paciente r = new Paciente("primero", true, 3, 4, "",a);
        Paciente u = new Paciente("pr", true, 3, 6, "",y);
        Paciente n = new Paciente("cr", true, 3, 5, "",z);
        
        
        LinkedList<Medico> medicos = new LinkedList();
        medicos.add(e);
        medicos.add(a);
        medicos.add(t);
        medicos.add(y);
        medicos.add(z);
        
        LinkedList<Paciente> pacientes = new LinkedList();
        pacientes.add(q);
        //pacientes.add(w);
        pacientes.add(r);
        pacientes.add(u);
        pacientes.add(n);
        
        Urgencia urgencias = new Urgencia();
        urgencias.crearTurno(medicos, pacientes);
        //cr,primero,pr,pedro
        urgencias.insertarPaciente("un", r, 4);
        //urgencias.insertarPaciente("un", w, 3);
        urgencias.insertarPaciente("un", q, 2);
        urgencias.insertarPaciente("un", u, 3);
        urgencias.insertarPaciente("un", n, 5);
        
        urgencias.atenderPaciente();
        
        urgencias.listarTurno(medicos);
        
    }
}
