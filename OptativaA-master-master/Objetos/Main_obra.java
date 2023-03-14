import java.util.Scanner;

public class Main_obra {

String nombre,fecha,autor,descripcion;
Scanner entrada = new Scanner(System.in);

void crearContacto(){

    System.out.println("Pon los datos de la obra ");
    

System.out.println("Nombre: ");
nombre = entrada.next();

System.out.println("Fecha: ");
fecha = entrada.next();

System.out.println("autor: ");
autor = entrada.next();

System.out.println("descripcion: ");
descripcion = entrada.next();

}


void mostrarDatos(){
    System.out.println("Nombre:" +nombre);
    System.out.println("Fecha:" +fecha);
    System.out.println("Autor:" +autor);
    System.out.println("Descripcion:" +descripcion);
}

}
