/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetedos;

/**
 *
 * @author sofiv
 */
public class Ciudad {

    String nombre;
    String provincia;
    
    public Ciudad(){
    }
    public Ciudad(String nombre, String provincia) {
        this.nombre = nombre;
        this.provincia = provincia;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerProvincia() {
        return provincia;
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public void establecerProvincia(String provincia) {
        this.provincia = provincia;
    }

}
