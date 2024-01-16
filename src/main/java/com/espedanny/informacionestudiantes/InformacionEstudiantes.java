
package com.espedanny.informacionestudiantes;

import java.util.Scanner;


public class InformacionEstudiantes {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     int Estudiantes= 0; 
     
        System.out.println("Ingrese el numero de estudiantes a agregar: ");
        Estudiantes= scanner.nextInt();
        
        
  for (int i = 0; i < Estudiantes; i++) {
            System.out.println("Ingrese los datos del estudiante " + (i + 1));

            Estudiante estudiante = new Estudiante();
            estudiante.ingresarDatos(scanner);
            

            System.out.println("\nInformación del estudiante " + (i + 1));
            estudiante.mostrarDatos();

            System.out.println("\n-----------------------------\n");
        }
        scanner.close();
    }

}

