/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionalumnos;

/**
 *
 * @author Cristian
 */
public class GestionAlumnos {

    public static void main(String[] args) {
        
        Gestion g = new Gestion();
        
        g.agregarAlumno("jose", "ppopo", "5765765", "vjhvjvj", "jhfkhjf", 45);
        g.agregarAlumno("jose", "ppopo", "5769765", "vjhvjvj", "jhfkhjf", 45);
        
        System.out.println(g.getAlumnos().toString());
        
        g.eliminarAlumno("5765765");
        
        System.out.println(g.getAlumnos().toString());
        
        System.out.println(g.consultarAlumno("5769765"));
        
    }
    
}
