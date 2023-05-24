/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetedos;

/**
 *
 * @author sofiv
 */
public class Medicos {

    private String nombre;
    private String especialidad;
    private double sueldo;

    public Medicos() {
    }

    public Medicos(String nom, String es, double s) {
        this.nombre = nom;
        this.especialidad = es;
        this.sueldo = s;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerEspecialidad() {
        return especialidad;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public void establecerEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void establecerSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    


}
