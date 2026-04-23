/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.iumafis.sistemaestudiantes2;

import java.util.ArrayList;


public class GestorEstudiantes {

    
    private ArrayList<Estudiantes> lista = new ArrayList<>();

   
    public void agregar(Estudiantes e) {
        lista.add(e);
        System.out.println("✓ Agregado: " + e.getNombre());
    }

  
    public void listar() {
        if (lista.isEmpty()) {
            System.out.println("  (lista vacía)");
            return;
        }
        System.out.println("Código | Nombre          | Sem | Prom | Estado");
        System.out.println("─".repeat(55));
        for (Estudiantes e : lista) {
            System.out.println(e);   
        }
        System.out.println("Total: " + lista.size() + " estudiante(s)");
    }

   
    public Estudiantes buscarPorCodigo(int codigo) {
        for (Estudiantes e : lista) {
            if (e.getCodigo() == codigo) {
                return e;
            }
        }
        return null;   
    }

  
    public ArrayList<Estudiantes> obtenerAprobados() {
        ArrayList<Estudiantes> resultado = new ArrayList<>();
        for (Estudiantes e : lista) {
            if (e.getPromedio() >= 3.0 && e.isActivo()) {
                resultado.add(e);
            }
        }
        return resultado;
    }

  
    public double promedioGeneral() {
        if (lista.isEmpty()) {
            return 0.0;
        }
        double suma = 0.0;
        for (Estudiantes e : lista) {
            suma += e.getPromedio();
        }
        return suma / lista.size();
    }

   
    public boolean eliminar(int codigo) {
        Estudiantes encontrado = buscarPorCodigo(codigo);
        if (encontrado != null) {
            lista.remove(encontrado);
            System.out.println("✓ Eliminado: " + encontrado.getNombre());
            return true;
        }
        System.out.println("✗ Código " + codigo + " no encontrado");
        return false;
    }
    
    public void reportePorSemestre(int semestre) {
    int contador = 0;
    double suma = 0;

    for (Estudiantes estudiante : lista) {
        if (estudiante.getSemestre() == semestre) {
            System.out.println(estudiante);

            suma += estudiante.getPromedio(); 
            contador++;
        }
    }

    if (contador == 0) {
        System.out.println("No hay estudiantes en ese semestre");
    } else {
        double promedioGrupal = suma / contador;
        System.out.println("Cantidad de estudiantes: " + contador);
        System.out.println("Promedio grupal: " + promedioGrupal);
    }
 }

}
