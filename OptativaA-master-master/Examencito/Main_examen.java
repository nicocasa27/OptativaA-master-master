import java.util.Scanner;

public class Main_examen {
    public static void main(String[] args) {
        // Variables
        float montoCuenta, porcentajePropina, montoPropina, totalPagar, montoPagado, cambio;

        // Pedir datos
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el monto de la cuenta:");
        montoCuenta = entrada.nextFloat();
        System.out.println("Ingrese el porcentaje de propina a dejar:");
        porcentajePropina = entrada.nextFloat();

        // Calcular el total a pagar y mostrarlo
        montoPropina = montoCuenta * (porcentajePropina / 100);
        totalPagar = montoCuenta + montoPropina;
        System.out.println("El total a pagar es: $" + Math.round(totalPagar * 100) / 100.0);

        // Pedir el monto pagado y calcular el cambio a devolver
        System.out.println("Ingrese el monto pagado:");
        montoPagado = entrada.nextFloat();
        cambio = montoPagado - totalPagar;
        System.out.println("El cambio a devolver es: $" + Math.round(cambio * 100) / 100.0);

        // Cerrar el Scanner
        entrada.close();
    }
}
