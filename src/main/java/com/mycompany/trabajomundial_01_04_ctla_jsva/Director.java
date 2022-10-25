/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajomundial_01_04_ctla_jsva;

/**
 *
 * @author eceba
 */
public class Director {
String nombre;
    String nacionalidad;
    int fechaNacimiento;
    Seleccion equipo;
    public String mostrarInfo() {
        return this.nombre + " exfutbolista de " + this.nacionalidad+ " nacio en " +this.fechaNacimiento+" ,es director tecnico de la seleccion " + this.equipo.nombre;
    }
    
}
