package org.example;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import com.mongodb.client.MongoDatabase;
import org.example.Conexion.conexionBD;
import org.example.Metodos.Validaciones;
import org.example.Modelos.Menu;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //Conexion a MongoDB
        //LogManager.getLogManager().reset(); // eliminar los warning
       // Logger.getLogger("com.mongodb.client.MongoClient").setLevel(Level.SEVERE);
        conexionBD conexion = conexionBD.getInstance();
        MongoDatabase db = conexion.getDb();
        System.out.println("Conectado a: " + db.getName());

        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("""
                    1-Listado de Animales
                    2-Listado de Adoptantes
                    3-listado de Adopciones
                    4-Altas de animales, adoptantes, y adopciones
                    5-Modificaciones de animales, adoptantes y adopciones ya existentes.
                    6-Bajas de animales, adoptantes y adopciones ya existentes.
                    7-Listado y exportación de los metadatos\s
                    0-Salir
                    """);
            System.out.println("Seleccione una opcion: ");
            opcion = Validaciones.validarOpciones(scanner);

            switch (opcion) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    Menu.menuAltas(scanner);
                    break;
                case 5:
                    Menu.menuModificaciones(scanner);

                    break;
                case 6:
                    Menu.menuBajas(scanner);
                    break;


                default:
                    break;
            }


        } while (opcion != 0);
        scanner.close();
        System.out.println("Programa finalizado");


    }
}

