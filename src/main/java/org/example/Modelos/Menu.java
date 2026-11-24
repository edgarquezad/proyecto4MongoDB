package org.example.Modelos;

import org.example.Metodos.Validaciones;

import java.util.Scanner;

public class Menu {

    public static void menuAltas(Scanner scanner) {
        int seleccion;
        do {
            System.out.println("""
                    \n
                    1-Alta de animales
                    2-Alta de adoptantes
                    3-alta de Adopciones
                    0-volver Menu
                    """);
            System.out.println("seleccione una opcion:");

            seleccion = Validaciones.validarOpciones(scanner);

            switch (seleccion) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;

            }

        } while (seleccion != 0);
    }


    //MENU MODIFICACIONES
    public static void menuModificaciones(Scanner scanner) {
        int seleccion;
        do {
            System.out.println("""
                    \n
                    1-Modificacion de animales
                    2-Modificacion de adoptantes
                    3-Modificacion de Adopciones
                    0-volver Menu
                    """);
            System.out.println("seleccione una opcion:");

            seleccion = Validaciones.validarOpciones(scanner);

            switch (seleccion) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;

            }

        } while (seleccion != 0);
    }

    // MENU DE BAJAS
    public static void menuBajas(Scanner scanner) {
        int seleccion;
        do {
            System.out.println("""
                    \n
                    1-Baja de animales
                    2-Baja de adoptantes
                    3-Baja de Adopciones
                    0-volver Menu
                    """);
            System.out.println("seleccione una opcion:");

            seleccion = Validaciones.validarOpciones(scanner);

            switch (seleccion) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;

            }

        } while (seleccion != 0);
    }


}
