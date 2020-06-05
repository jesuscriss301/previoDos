
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johan leon
 * 
 */
public class Urgencia {
    int contador = 0;
    List<Medico> medicosEnGuardia =  new LinkedList();
    PriorityQueue<Paciente> pacientesEnEspera = new PriorityQueue();
    SalaDeEspera espera = new SalaDeEspera();

    
    
    public void crearTurno(LinkedList<Medico> medicos, LinkedList<Paciente> pacientesAsegurados ){
        
        for(int i = 0; i < medicos.size(); i++){
            if(medicos.get(i).isDisponible()){
                medicosEnGuardia.add(medicos.get(i));
                
            }
             
        }
        
        
       for(int i = 0; i < medicosEnGuardia.size(); i++){
           System.out.println("Medicos en turno: ");
           System.out.println(medicosEnGuardia.get(i).getNombre());
       } 
       
       for(int i = 0; i < pacientesAsegurados.size(); i++){
           
          System.out.println("nombre del asegurado: "+ pacientesAsegurados.get(i).getNombre()
                  + " y su medico es : " + pacientesAsegurados.get(i).getMedicoHabitual().getNombre());
           
       }
       
        
       
        
    }
    
    public void insertarPaciente(String urgencias,Paciente paciente, int gradoEnfermedad){
        
        if(paciente.isAsegurado()){
            
            paciente.setGradoEnfermedad(gradoEnfermedad);
            paciente.setUrgencia(urgencias);
            pacientesEnEspera.add(paciente);
            System.out.println("se agrego el paciente a la sala de espera");
            
        }else {
            System.out.println("El paciente no esta asegurado, que se muera");
        }
        

    
}       
    public void atenderPaciente(){
       
          int c1 = 0;
          
          for(Paciente p : pacientesEnEspera){//ordenando los pacientes por grado de enfermedad
              System.out.println(p.getNombre());
          }
        
         for(Paciente e : pacientesEnEspera){
             int cPacientes = medicosEnGuardia.get(c1).getPacientesAtendidos();
              if(pacientesEnEspera.element().getMedicoHabitual().getNombre().equals(medicosEnGuardia.get(c1).getNombre())){
                  cPacientes++; 
                  medicosEnGuardia.get(c1).setPacientesAtendidos(cPacientes);
                  
              } else {
//                  cPacientes++;
//                  medicosEnGuardia.get(0).setPacientesAtendidos(cPacientes);
              }
              
              c1++;
                
                
          }
         
//         for(int i = 0; i < medicosEnGuardia.size(); i++){
//                 int cPacientes = medicosEnGuardia.get(i).getPacientesAtendidos();
//             if(medicosEnGuardia.get(i).getNombre().equals(pacientesEnEspera.element().getMedicoHabitual().getNombre())){
//                 cPacientes++;
//                 medicosEnGuardia.get(i).setPacientesAtendidos(cPacientes);
//             } else {
//                 
//                 medicosEnGuardia.get(0).setPacientesAtendidos(cPacientes);
//             }
//         }
        
//       for(Paciente e : pacientesEnEspera){
//             c1++;
//             int cPacientes = medicosEnGuardia.get(c1).getPacientesAtendidos();
//              if(e.getMedicoHabitual().getNombre().equals(medicosEnGuardia.get(c1).getNombre())){
//                  cPacientes++;
//                  medicosEnGuardia.get(c1).setPacientesAtendidos(cPacientes);
//              } else {
//                  cPacientes++;
//                  medicosEnGuardia.get(0).setPacientesAtendidos(cPacientes);
//              }
//          }
        
    }
    
    public void listarTurno(LinkedList<Medico> medicos){
         for(int i = 0; i < medicos.size(); i++){
          System.out.println("El medioco " + medicosEnGuardia.get(i).getNombre() + " ha atendido a: " + medicosEnGuardia.get(i).getPacientesAtendidos() 
           + " pacientes");
        }
    }
    
}
