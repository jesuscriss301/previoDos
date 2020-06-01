
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
public class SalaDeEspera {
    private LinkedList <Paciente> pacientesEnEspera= new LinkedList();

    public SalaDeEspera() {
    }

    public LinkedList<Paciente> getPacientesEnEspera() {
        return pacientesEnEspera;
    }

    public void setPacientesEnEspera(LinkedList<Paciente> pacientesEnEspera) {
        this.pacientesEnEspera = pacientesEnEspera;
    }
    
}
