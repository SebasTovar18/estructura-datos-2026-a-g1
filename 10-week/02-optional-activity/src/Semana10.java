import java.util.Scanner;

public class Semana10 {

    // Metodo para validar enteros
    public static int leerEnteroValido(Scanner scanner, String mensaje, int min, int max) {
        int numero;

        while (true) {
            System.out.print(mensaje);
            String entrada = scanner.nextLine();

            // Solo números enteros este comentario se muestra cuando el usuario pone un valor distinto a un entero
            if (!entrada.matches("\\d+")) {
                System.out.println("Error: debe ingresar SOLO números enteros.");
                continue;
            }

            numero = Integer.parseInt(entrada);

            if (numero < min || numero > max) {
                System.out.println("Error: ingrese un número entre " + min + " y " + max);
            } else {
                return numero;
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int cantidadEstudiante = leerEnteroValido(
                scanner,
                "¿Cuántos estudiantes desea ingresar?: ",
                1,
                Integer.MAX_VALUE
        );

        String[] tipoDocumento = new String[cantidadEstudiante];
        Integer[] documento = new Integer[cantidadEstudiante];
        String[] nombre = new String[cantidadEstudiante];
        String[] correo = new String[cantidadEstudiante];

        String[] tipoDcumentoPermitodo = {"CC", "CE", "TI", "PA", "DNI", "RUT", "NIT"};

        for (int i = 0; i < cantidadEstudiante; i++) {

            System.out.println("\n--- Estudiante " + (i + 1) + " ---");

            // Mostrar opciones
            System.out.print("Tipos de documento: ");
            for (int j = 0; j < tipoDcumentoPermitodo.length; j++) {
                System.out.print("(" + (j + 1) + "=>" + tipoDcumentoPermitodo[j] + ") ");
            }
            System.out.println();

            int pos = leerEnteroValido(
                    scanner,
                    "Seleccione una opción: ",
                    1,
                    tipoDcumentoPermitodo.length
            );

            tipoDocumento[i] = tipoDcumentoPermitodo[pos - 1];

            documento[i] = leerEnteroValido(
                    scanner,
                    "Ingrese el número de documento: ",
                    1,
                    Integer.MAX_VALUE
            );

            System.out.print("Ingrese el nombre: ");
            nombre[i] = scanner.nextLine();

            System.out.print("Ingrese el correo: ");
            correo[i] = scanner.nextLine();
        }

        // Mostrar datos
        System.out.println("\n===== LISTA DE ESTUDIANTES =====");

        for (int i = 0; i < cantidadEstudiante; i++) {
            System.out.println("\nEstudiante " + (i + 1));
            System.out.println("Tipo Documento: " + tipoDocumento[i]);
            System.out.println("Documento: " + documento[i]);
            System.out.println("Nombre: " + nombre[i]);
            System.out.println("Correo: " + correo[i]);
        }

        System.out.println("\nPrograma ejecutado correctamente");
    }
}