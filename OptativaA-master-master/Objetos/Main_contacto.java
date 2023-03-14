import java.util.Scanner;

public class Main_contacto {

String nombre,apellido,telefono,correo;
Scanner entrada = new Scanner(System.in);

void crearContacto(){

    System.out.println("Pon los datos solicitados de favor");
    

System.out.println("Nombre: ");
nombre = entrada.next();

System.out.println("Apellido: ");
apellido = entrada.next();

System.out.println("Telefono: ");
telefono = entrada.next();

System.out.println("Correo: ");
correo = entrada.next();

}


void mostrarDatos(){
    System.out.println("Nombre:" +nombre);
    System.out.println("Apellido:" +apellido);
    System.out.println("Telefono:" +telefono);
    System.out.println("Correo:" +correo);
}

}
