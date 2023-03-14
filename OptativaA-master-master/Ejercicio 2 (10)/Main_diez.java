import java.util.Scanner;

public class Main_diez {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre:");
        String nombre = scanner.nextLine().trim().replaceAll("\\d", "").toUpperCase();

        System.out.println("Ingrese su primer apellido:");
        String apellido1 = scanner.nextLine().trim().replaceAll("\\d", "").toLowerCase();
        apellido1 = apellido1.substring(0, 1).toUpperCase() + apellido1.substring(1);

        System.out.println("Ingrese su segundo apellido:");
        String apellido2 = scanner.nextLine().trim().replaceAll("\\d", "").toLowerCase();
        apellido2 = apellido2.substring(0, 1).toUpperCase() + apellido2.substring(1);

        System.out.println("Nombre completo: " + nombre + " " + apellido1 + " " + apellido2);
    }
}
