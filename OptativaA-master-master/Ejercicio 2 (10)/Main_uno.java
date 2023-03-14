import java.util.Scanner;
public class Main_uno {

    public static void main(String[] args) {
    
      // Declaramos Variables
float base, altura, area;

Scanner entrada = new Scanner(System.in);


// Poner los valores

System.out.println("\n Dame la base \n");
base = entrada.nextFloat();

System.out.println("\n Dame la altura \n");
altura = entrada.nextFloat();

// Operaciones
//area = (float) Math.sqrt(base*altura) / 2; 
area = (base * altura) / 2;


// Resultado
System.out.println("El area es de "+area+"mts.");



        }
    }
    
    