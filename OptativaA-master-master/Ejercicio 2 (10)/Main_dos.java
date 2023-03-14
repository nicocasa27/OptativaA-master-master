import java.util.Scanner;
public class Main_dos {

    public static void main(String[] args) {
    
      // Declaramos Variables
float base, altura, cinta;

Scanner entrada = new Scanner(System.in);


// Poner los valores

System.out.println("\n Dame el ancho \n");
base = entrada.nextFloat();

System.out.println("\n Dame el alto \n");
altura = entrada.nextFloat();

// Operaciones
cinta = (float) Math.sqrt(base*base + altura*altura); 

// Resultado
System.out.println("Debes cortar una cinta de "+cinta+"mts.");



        }
    }
    
    