import java.util.HashSet;
import java.util.Scanner;

public class SetdeEmails {
    public static void main(String[] args) {
        HashSet<String> registro = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Registro de emails: ");
            System.out.println("1. Registrar email");
            System.out.println("2. Mostrar todos los emails");
            System.out.println("3. Buscar un email");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el nuevo email: ");
                    String nuevoEmail = sc.nextLine().toLowerCase().trim();

                    if (registro.add(nuevoEmail)) {
                        System.out.println("Email registrado correctamente.");
                    } else {
                        System.out.println("Error: Email ya registrado.");
                    }
                    break;

                case 2:
                    System.out.println("Lista de correos registrados:");
                    if (registro.isEmpty()) {
                        System.out.println("(No hay emails en el registro)");
                    } else {
                        for (String email : registro) {
                            System.out.println("- " + email);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Introduce el email a buscar: ");
                    String buscar = sc.nextLine().toLowerCase().trim();

                    if (registro.contains(buscar)) {
                        System.out.println("El email está en la base de datos.");
                    } else {
                        System.out.println("El email NO está registrado.");
                    }
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        sc.close();
    }
}