
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johan leon
 * @param <T>
 */
public class Urgencia<T> {
    
    List medicosEnGuardia =  new LinkedList<>();
    
    public void crearTurno(LinkedList<Medico> medicos, LinkedList<Paciente> pacientesAsegurados ){
        
        for(int i = 0; i < medicos.size(); i++){
            if(medicos.get(i).isDisponible()){
                medicosEnGuardia.add(medicos.get(i).getNombre());
            }
             
        }
        
        Collections.sort(medicosEnGuardia);
       for(int i = 0; i < medicosEnGuardia.size(); i++){
           System.out.println("Medicos en turno: ");
           System.out.println(medicosEnGuardia.get(i));
       } 
       
       for(int i = 0; i < pacientesAsegurados.size(); i++){
           
          System.out.println("nombre del asegurado: "+ pacientesAsegurados.get(i).getNombre()
                  + " y su medico es : " + pacientesAsegurados.get(i).getMedicoHabitual().getNombre());
           
       }
       
        
        
//        for(int i = 0; i < pacientes.size(); i++){
//           
//        if(i < pacientes.size() - 1){
//            if(pacientes.get(i).getGradoEnfermedad() > pacientes.get(i + 1).getGradoEnfermedad()){
//                    Paciente paciente = pacientes.get(i);
//                    pacientes.remove(i);
//                    pacientes.addFirst(paciente);
//                }else {
//                Paciente paciente = pacientes.get(i + 1);
//                pacientes.remove(i + 1);
//                pacientes.addFirst(paciente);
//            }
//        } else {
//            
//        }
//        }
        
//        for(int i = 0; i < pacientes.size(); i++){
//          System.out.println(pacientes.get(i).getNombre());
//        }
        
    }
    
    public void insertarPaciente(String urgencias,Paciente paciente, int gradoEnfermedad){
        SalaDeEspera pacientesEspera = new SalaDeEspera();
        if(!pacientesEspera.getPacientesEnEspera().isEmpty()){
        for(int i = 0; i < pacientesEspera.getPacientesEnEspera().size(); i++){
            if(paciente.isAsegurado()){
                
                pacientesEspera.getPacientesEnEspera().add(paciente);
                pacientesEspera.getPacientesEnEspera().get(i).setGradoEnfermedad(gradoEnfermedad);
                pacientesEspera.getPacientesEnEspera().get(i).setUrgencia(urgencias);
                
                System.out.print("se agrego el paciente a la sala de espera");
                
                
            }else if(!paciente.isAsegurado()){
                System.out.println("El paciente no esta asegurado, que se muera");
            }
        }
        
    }else{
            if(paciente.isAsegurado()){
                pacientesEspera.getPacientesEnEspera().addFirst(paciente);
                pacientesEspera.getPacientesEnEspera().getFirst().setGradoEnfermedad(gradoEnfermedad);
                pacientesEspera.getPacientesEnEspera().getFirst().setUrgencia(urgencias);
                
                System.out.println("se agrego el paciente a la sala de espera");
            } else{
                System.out.println("El paciente no esta asegurado, que se muera");
            }
        }
    
    
}
}
