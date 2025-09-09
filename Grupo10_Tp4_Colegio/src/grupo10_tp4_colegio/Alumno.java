/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo10_tp4_colegio;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author Grupo10 TP4
 * Altamirano Karina
 * Gianfranco Antonacci Matías
 * Bequis Marcos Ezequiel
 * Dave  Natalia
 * Quiroga Dorzan Alejo
 * Franzinni Tatiana
 */
public class Alumno {
    int legajo;
    private String apellido;
    private String nombre;
    private HashSet<Materia> materias;

    public Alumno(int legajo, String apellido, String nombre, List<Materia> materias) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.materias = new HashSet<>();
    }

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }
    
    

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(HashSet<Materia> materias) {
        this.materias = materias;
    }
    
    public void agregarMateria(Materia m){
        if (m != null && !materias.contains(m)){
            materias.add(m);
        }
    }
    
    /*  --no pide este método pero podría estar
    public void quitarMateria(Materia materia){
            materias.remove(materia);
        }
    */

    public int cantidadMaterias(){
        return materias.size();
    }
    
}
