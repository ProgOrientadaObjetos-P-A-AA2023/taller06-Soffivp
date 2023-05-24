/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetedos;

/**
 *
 * @author sofiv
 */
public class Enfermeros {

    private String nombre;
    private String tipo;
    private double sueldo;
    
    public Enfermeros(){
    }

    public Enfermeros(String nom, String t, double s) {
        nombre = nom;
        tipo = t;
        sueldo = s;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerTipo() {
        return tipo;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    public void establecerNombre(String nom) {
        this.nombre = nom;
    }

    public void establecerTipo(String t) {
        this.tipo = t;
    }

    public void establecerSueldo(double s) {
        this.sueldo = s;
    }

}
