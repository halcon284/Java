import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Zoologico zoologico = new Zoologico();

        int opcion;
        do {
            System.out.println("--MENU--");
            System.out.println("_________________________");
            System.out.println("1. Agregar animal");
            System.out.println("2. Mostrar animales");
            System.out.println("3. Realizar acción con animal");
            System.out.println("4. Salir");
            System.out.println("_________________________");
            System.out.print("Ingrese una opción: ");

            opcion = scanner.nextByte();

            switch (opcion) {
                case 1:
                    System.out.print("Tipo de animal (leon, elefante, pájaro): ");
                    String tipoAnimal = scanner.next();

                    switch (tipoAnimal) {
                        case "leon":
                            zoologico.agregarAnimal(new Leon());
                            break;
                        case "elefante":
                            zoologico.agregarAnimal(new Elefante());
                            break;
                        case "pájaro":
                            zoologico.agregarAnimal(new Pajaro());
                            break;
                        default:
                            System.out.println("Animal no válido");
                    }
                    break;
                case 2:
                    zoologico.mostrarListaAnimales();
                    break;
                case 3:
                    System.out.print("Selecciones el numero del animal agegado: ");
                    int accionador = scanner.nextInt();
                    System.out.print("sonido \nmoverse): ");
                    String accion = scanner.next();
                    zoologico.accion(accionador, accion);
                    break;
                case 4:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 4);
    }

}
