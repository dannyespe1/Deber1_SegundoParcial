
package com.espedanny.informacionestudiantes;

import java.util.Scanner;

public class Estudiante extends Persona {
    
    private String nivel; 
    private String carrera;
   
    @Override
    public void ingresarDatos(Scanner datos) {
        super.ingresarDatos(datos);

        System.out.print("Nivel: ");
        nivel = datos.nextLine();

        System.out.print("Carrera: ");
        carrera = datos.nextLine();
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Nivel: " + nivel);
        System.out.println("Carrera: " + carrera);
    }
    
}
