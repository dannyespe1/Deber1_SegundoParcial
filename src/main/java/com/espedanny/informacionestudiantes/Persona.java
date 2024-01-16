
package com.espedanny.informacionestudiantes;

import java.util.Scanner;

public abstract class Persona {
    
    protected String nombre;
    protected double edad; 
    protected String email; 

    public void ingresarDatos(Scanner datos) {
        System.out.print("Nombre: ");
        nombre = datos.nextLine();
        datos.nextLine();
        
        System.out.print("Edad: ");
        edad = datos.nextInt();
        datos.nextLine();

        System.out.print("Email: ");
        email = datos.nextLine();
    
    }
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " +edad);
        System.out.println("Email: " + (email == null || email.isEmpty() ? "Email no proporcionado" : email));
    }
}

