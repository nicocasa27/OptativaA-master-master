import java.util.Scanner;

public class Main_seis {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Pedir información al usuario
        System.out.println("Ingresa el costo de cada carátula:");
        double costo = entrada.nextDouble();

        System.out.println("Ingresa el porcentaje de ganancia que deseas tener:");
        double porcentajeGanancia = entrada.nextDouble();

        // Calcular el precio de venta con impuestos
        double precioSinImpuestos = costo * (1 + porcentajeGanancia/100);
        double impuesto = precioSinImpuestos * 0.08;
        double precioConImpuestos = precioSinImpuestos + impuesto;

        // Calcular el dinero a reservar para impuestos y la ganancia neta
        double impuestoSobreRenta = precioConImpuestos * 0.25;
        double gananciaNeta = precioConImpuestos - costo - impuesto - impuestoSobreRenta;

        // Imprimir los resultados
        System.out.printf("El precio de venta con impuestos es: %.2f\n", precioConImpuestos);
        System.out.printf("El monto a reservar para impuestos es: %.2f\n", impuesto);
        System.out.printf("El monto aproximado para el pago de ISR es: %.2f\n", impuestoSobreRenta);
        System.out.printf("La ganancia neta es: %.2f\n", gananciaNeta);
    }
}
