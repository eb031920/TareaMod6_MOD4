//Copyrigth:Ruth Bautista(202320050047)
//Este codigo gestiona empleados en java mediante tres clases:
//Primero la clase Empleado representa a un empleado con los atributos:nombre, edad y salario.
//Luego la clase GestorEmpleados se encarga de gestionar una lista de empleados, permitiendonos agregar o mostrar empleados.
//Finalmente en la clase GestionEmpleados presento un menú para que el usuario pueda interactuar con el sistema.
// Y así el usuario puede agregar empleados, ver la lista o salir del programa.
package com.mycompany.gestionempleados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Empleado {
    private String nombre;
    private int edad;
    private double salario;

    
    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

   
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }

    
    public void imprimirInfo() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Salario: " + salario);
    }
}


class GestorEmpleados {
    private List<Empleado> empleados;

    public GestorEmpleados() {
        empleados = new ArrayList<>();
    }

    
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    
    public void mostrarEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados para mostrar.");
        } else {
            for (Empleado empleado : empleados) {
                empleado.imprimirInfo();
            }
        }
    }
}



public class GestionEmpleados {

    public static void main(String[] args) {
         GestorEmpleados gestor = new GestorEmpleados();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Agregar empleado");
            System.out.println("2. Mostrar empleados");
            System.out.println("3. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine(); 
            if (opcion == 1) {
                System.out.print("Ingrese el nombre del empleado: ");
                String nombre = scanner.nextLine();
                System.out.print("Ingrese la edad del empleado: ");
                int edad = scanner.nextInt();
                System.out.print("Ingrese el salario del empleado: ");
                double salario = scanner.nextDouble();
                scanner.nextLine(); 

                Empleado empleado = new Empleado(nombre, edad, salario);
                gestor.agregarEmpleado(empleado);
                System.out.println("Empleado agregado exitosamente.");
            } else if (opcion == 2) {
                System.out.println("Lista de empleados:");
                gestor.mostrarEmpleados();
            } else if (opcion == 3) {
                System.out.println("Saliendo...");
                break;
            } else {
                System.out.println("Opción inválida. Intente de nuevo.");
            }
        }
        scanner.close();
    }
}

