/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.iumafis.sistemaestudiantes2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Docente {
    private String nombre;
    private Integer cedula;
    List<Estudiantes> grupo;
    
    public Docente(){
        grupo = new ArrayList<>();
    }
    
    public void asignarEstudiante(Estudiantes estudiante){
     grupo.add(estudiante);
    }
    public List<Estudiantes> listarGrupo(){
        return this.grupo;
    }
        
    public Estudiantes mejorEstudiante(){
             if (grupo == null) {
        return null;
    }

    Estudiantes mejor = null;

    for (Estudiantes e : grupo) {
        if (mejor == null || e.getPromedio() > mejor.getPromedio()) {
            mejor = e;
        }
    }

    return mejor;
    
 
    
    }
    
}
