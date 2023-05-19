package VehiculoLanzadera;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InventarioNaves {
    private List<Nave> inventario;

    public InventarioNaves() {
        inventario = new ArrayList<>();
    }

    public void agregarNave(Nave nave) {
        inventario.add(nave);
    }

    public Nave buscarNave(String nombre) {
        for (Nave nave : inventario) {
            if (nave.getNombre().equalsIgnoreCase(nombre)) {
                return nave;
            }
        }
        return null;
    }


 public static void main(String[] args) {
    InventarioNaves inventario = new InventarioNaves();
    Scanner scanner = new Scanner(System.in);
    boolean continuar = true;

    while (continuar) {
        System.out.println("1. Crear nave");
        System.out.println("2. Buscar nave");
        System.out.println("3. Salir");
        System.out.print("Ingrese una opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        switch (opcion) {
            case 1:
                System.out.println("Seleccione el tipo de nave a crear:");
                System.out.println("1. Lanzadera");
                // Agregar más opciones de naves si es necesario

                int opcionNave = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea

                String nombre, descripcion;
                int empuje, peso, capacidadCarga;

                switch (opcionNave) {
                    case 1:
                        System.out.print("Ingrese el nombre de la lanzadera: ");
                        nombre = scanner.nextLine();
                        System.out.print("Ingrese la descripción de la lanzadera: ");
                        descripcion = scanner.nextLine();
                        System.out.print("Ingrese el empuje de la lanzadera: ");
                        empuje = scanner.nextInt();
                        System.out.print("Ingrese el peso de la lanzadera: ");
                        peso = scanner.nextInt();
                        System.out.print("Ingrese la capacidad de carga de la lanzadera: ");
                        capacidadCarga = scanner.nextInt();

                        Lanzadera lanzadera = new Lanzadera(nombre, descripcion, empuje, peso, capacidadCarga);
                        inventario.agregarNave(lanzadera);
                        break;

                    // Agregar más casos para crear otros tipos de naves si es necesario

                    default:
                        System.out.println("Opción inválida.");
                        break;
                }
                break;

            case 2:
                System.out.print("Ingrese el nombre de la nave a buscar: ");
                String nombreBusqueda = scanner.nextLine();
                Nave naveEncontrada = inventario.buscarNave(nombreBusqueda);
                if (naveEncontrada != null) {
                    System.out.println("Nave encontrada:");
                    System.out.println("Nombre: " + naveEncontrada.getNombre());
                    System.out.println("Descripción: " + naveEncontrada.getDescripcion());
                } else {
                    System.out.println("Nave no encontrada.");
                }
                break;

            case 3:
                continuar = false;
                break;

            default:
                System.out.println("Opción inválida.");
                break;
        }
    }
}
}
