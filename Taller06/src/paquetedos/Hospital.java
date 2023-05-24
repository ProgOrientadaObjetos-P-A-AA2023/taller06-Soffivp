/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetedos;

/**
 *
 * @author sofiv
 */
public class Hospital {

    /*Se requiere administrar hospitales del país. Por cada entidad hospitalaria se necesita algunos atributos tales como: 
    nombre del hospital, ciudad del hospital, número de especialidades, conjunto de médicos, conjunto de enfermeros o enfermeras, 
    total de sueldos a cancelar por mes del personal del hospital, dirección del hospital.

Considerandos:

    La ciudad del hospital deberá se una entidad que tenga como características: nombre de la ciudad, provincia de la ciudad.
    Un médico se lo considera con atributos como: nombre del doctor, especialidad, sueldo mensual.
    Un efermero o enfermera tiene las siguientes características: nombre, tipo (nombramiento, contrato) y sueldo mensual.
    El sueldo total a cancelar es igual a la suma de los sueldos del conjunto de médicos y enfermeros(as) que forman parte de su personal.
    La solución debe tener dos paquetes.
    Las entidades deben tener constructores.
    En una clase llamada Principal, con el método main, se debe generar un objeto del tipo entidad hospitalaria. Se debe agregar sus valores por teclado.
    Al finalizar le proceso de ingreso; se debe imprimir el objeto (usar el método toString. Por ejemplo
     */
    private String nombre;
    private Ciudad ciudad;
    private int nespecialidades;
    private Medicos[] medicos;
    private Enfermeros[] enfermeros;
    private double totalsueldos;
    private String direccion;

    public Hospital() {
    }

    public Hospital(String n,Ciudad c, int num, String dir, Medicos[] m, Enfermeros[] e) {
        nombre = n;
        ciudad = c;
        nespecialidades = num;
        direccion = dir;
        medicos = m;
        enfermeros = e;

    }

    public String obtenerNombre() {
        return nombre;
    }

    public Ciudad obtenerCiudad() {
        return ciudad;
    }

    public int obtenerNespecialidades() {
        return nespecialidades;
    }

    public Medicos[] obtenerMedicos() {
        return medicos;
    }

    public Enfermeros[] obtenerEnfermeros() {
        return enfermeros;
    }

    public double obtenerSueldos() {
        return totalsueldos;
    }

    public String obtenerDireccion() {
        return direccion;
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public void establecerCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public void establecerNespecialidades(int nespecialidades) {
        this.nespecialidades = nespecialidades;
    }

    public void establecerMedicos(Medicos[] medicos) {
        this.medicos = medicos;
    }

    public void establecerEnfermeros(Enfermeros[] enfermeros) {
        this.enfermeros = enfermeros;
    }

    public void CalcularSueldos(Medicos[] md, Enfermeros[] ef) {

        double suma = 0;
        for (int i = 0; i < md.length; i++) {
            suma = suma + md[i].obtenerSueldo();
        }
        for (int i = 0; i < ef.length; i++) {
            suma = suma + ef[i].obtenerSueldo();
        }
        totalsueldos = suma;
    }

    public void establecerDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String toString() {
        String mensaje = String.format("\nHOSPITAL %S\n"
                + "Dirección: %s\nCiudad: %s \n"
                + "Provincia: %s\n"
                + "Número de especialidades: %d\n", obtenerNombre(),
                obtenerDireccion(), ciudad.nombre, ciudad.provincia,
                obtenerNespecialidades());
        mensaje = String.format("%sListado de médicos\n", mensaje);
        for (int i = 0; i < obtenerMedicos().length; i++) {
            //- Richard Obrien - sueldo: 1000 - Pediatría
            mensaje = String.format("%s - %s - sueldo: %.2f - %s\n",
                    mensaje,
                    obtenerMedicos()[i].obtenerNombre(),
                    obtenerMedicos()[i].obtenerSueldo(),
                    obtenerMedicos()[i].obtenerEspecialidad());
        }

        mensaje = String.format("%sListado de enfermeros(as)\n", mensaje);

        for (int i = 0; i < obtenerEnfermeros().length; i++) {
            //- Richard Obrien - sueldo: 1000 - Pediatría
            mensaje = String.format("%s - %s - sueldo: %.2f - %s\n",
                    mensaje,
                    obtenerEnfermeros()[i].obtenerNombre(),
                    obtenerEnfermeros()[i].obtenerSueldo(),
                    obtenerEnfermeros()[i].obtenerTipo());
        }

        mensaje = String.format("%s\nTotal de Sueldos a pagar: %.2f",
                mensaje, obtenerSueldos());


        return mensaje;
    }

}
