/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.trabajomundial_01_04_ctla_jsva;

/**
 *
 * @author eceba
 */
public class TrabajoMundial_01_04_CTLA_JSVA {

    public static void main(String[] args) {

        var ecuador = new Seleccion();
        ecuador.codigoFIFA = "ECU";
        ecuador.nombre = "Federación Ecuatoriana de Fútbol (FEF)";
        ecuador.participacionesMundial = 4;

        System.out.println(ecuador.obtienePais());

        var chile = new Seleccion();
        chile.codigoFIFA = "CHI";
        chile.nombre = "Federación Chilena de Fútbol (FCF)";
        chile.participacionesMundial = 9;

        System.out.println(ecuador.obtienePais());

        var enner = new Jugador();
        enner.nombre = "Enner Valencia";
        enner.posicion = "Goleador";
        enner.fechaNacimiento = 1989;
        enner.equipo = ecuador;

        var byron = new Jugador();
        byron.nombre = "Byron Castillo";
        byron.posicion = "Defensa";
        byron.fechaNacimiento = 1998;
        byron.equipo = ecuador;

        var reyArturo = new Jugador();
        reyArturo.nombre = "Arturo Vidal";
        reyArturo.posicion = "Mediocampo";
        reyArturo.fechaNacimiento = 1987;
        reyArturo.equipo = chile;
        
        var GustavoAlfaro = new Director();
        GustavoAlfaro.nombre = "Gustavo Alfaro";
        GustavoAlfaro.fechaNacimiento = 1989;
        GustavoAlfaro.equipo = ecuador;
        GustavoAlfaro.nacionalidad = "Argentina";
        
        var EduardoBerizzo = new Director();
        EduardoBerizzo.nombre = "Eduardo Berizzo";
        EduardoBerizzo.fechaNacimiento = 1969;
        EduardoBerizzo.equipo = chile;
        EduardoBerizzo.nacionalidad = "Argentina";

        System.out.println(enner.mostrarInfo());
        System.out.println(byron.mostrarInfo());
        System.out.println(reyArturo.mostrarInfo());
        System.out.println(GustavoAlfaro.mostrarInfo());
        System.out.println(EduardoBerizzo.mostrarInfo());

    }

}

