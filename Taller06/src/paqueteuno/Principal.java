/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paqueteuno;

import java.util.Scanner;
import paquetedos.Ciudad;
import paquetedos.Enfermeros;

import paquetedos.Hospital;
import paquetedos.Medicos;

/**
 *
 * @author sofiv
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
        Scanner entrada = new Scanner(System.in);
        String nombre = "";
        String dir = "";
        String ciudad = "";
        String provincia = "";
        String nmed = "";
        String espMed;
        String nef = "";
        String tipoEf;

        int esp;
        int lim = 0;
        int lime = 0;

        double sMed;
        double sEf;

        Hospital h1;
        Medicos md[];
        Enfermeros ef[];

        //md = new Medicos[lim];
        /*HOSPITAL ZARUMA
Dirección: Barrio Central
Ciudad: Zaruma 
Provincia: El Oro
Número de especialidades: 7
Listado de médicos
- Richard Obrien - sueldo: 1000 - Pediatría
- Jacob Mcintyre - sueldo: 1100 - General
- Craig Alexander - sueldo: 1200 - Pediatría
- John Hernandez - sueldo: 1000 - Internista

Listado de enfermeros(as)
- William Bradshaw - sueldo: 800 - contrato
- Jennifer Muñoz - sueldo: 700 - contrato
- Jeffrey Bryant - sueldo: 1000 - nombramiento

Total de sueldos a pagar por mes: 13600*/
        System.out.println("Ingrese el nombre del hospital");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la dirección del hospital");
        dir = entrada.nextLine();
        System.out.println("Ingrese la ciudad del hospital");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese la provincia del hospital");
        provincia = entrada.nextLine();
        System.out.println("Ingrese el número de especialidades del hospital");
        esp = entrada.nextInt();
        System.out.println("Ingrese el número de medicos a ingresar");
        lim = entrada.nextInt();
        md = new Medicos[lim];
        entrada.nextLine();

        Ciudad cdd = new Ciudad(ciudad, provincia);
        for (int i = 0; i < md.length; i++) {
            System.out.println("Ingrese el nombre del medico");
            nmed = entrada.nextLine();
            System.out.println("Ingrese el sueldo del medico");
            sMed = entrada.nextDouble();
            System.out.println("Ingrese la especialidad del medico");
            entrada.nextLine();
            espMed = entrada.nextLine();
            md[i] = new Medicos(nmed, sMed, espMed);

        }
        System.out.println("Ingrese el número de enfermeros/as a ingresar");
        lime = entrada.nextInt();
        ef = new Enfermeros[lime];
        entrada.nextLine();

        for (int i = 0; i < ef.length; i++) {
            System.out.println("Ingrese el nombre del enfermero/a");
            nef = entrada.nextLine();
            // h1.establecerNombre(entrada.nextLine());
            System.out.println("Ingrese el sueldo del enfermero/a");
            sEf = entrada.nextDouble();
            System.out.println("Ingrese el tipo de contrato (nombramiento o contrato) del enfermero/a");
            entrada.nextLine();
            tipoEf = entrada.nextLine();
            ef[i] = new Enfermeros(nef, tipoEf, sEf);
        }
        h1 = new Hospital(nombre, cdd, esp, dir, md, ef);

        h1.CalcularSueldos(md, ef);
        System.out.printf("%s\n", h1);

    }

}
