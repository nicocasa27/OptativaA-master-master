import java.util.Scanner;
public class Main_cuatro {

    public static void main(String[] args) {


 //Variables
 float m1,m2,m3,m4,m5,m6,m7,prom;
 Scanner entrada = new Scanner(System.in);

 //Pedir datos
 System.out.println("Ingresa la primera calificación\n");
 m1 = entrada.nextFloat();

 System.out.println("Ingresa la siguiente calificación\n");
 m2 = entrada.nextFloat();

 System.out.println("Ingresa la siguiente calificación\n");
 m3 = entrada.nextFloat();

 System.out.println("Ingresa la siguiente calificación\n");
 m4 = entrada.nextFloat();

 System.out.println("Ingresa la siguiente calificación\n");
 m5 = entrada.nextFloat();

 System.out.println("Ingresa la siguiente calificación\n");
 m6 = entrada.nextFloat();

 System.out.println("Ingresa la siguiente calificación\n");
 m7 = entrada.nextFloat();


 //Operaciones
 prom = (m1+m2+m3+m4+m5+m6+m7)/7;

 //Resultado
 System.out.println("Tu promedio es: "+prom);


 //Si quieres limitar el promedio a máximo de dos decimales
 //Puedes usar DecimalFormat, enseñado por Alberto.



    }
}

