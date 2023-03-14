import java.util.Scanner;
public class Main_tres {

    public static void main(String[] args) {
    
      // Declaramos Variables
float peso, altura, IMC;

Scanner entrada = new Scanner(System.in);


// Poner los valores

System.out.println("\n Dame el peso \n");
peso = entrada.nextFloat();

System.out.println("\n Dame la altura \n");
altura = entrada.nextFloat();

// Operaciones
//area = (float) Math.sqrt(base*altura) / 2; 
IMC = peso / (altura * altura);


// Resultado
//System.out.println("Debes cortar una cinta de "+IMC+"mts.");
if (IMC <18.5 ) {
    System.out.println("Tu IMC dice que estas muy flan, tu IMC es de"+IMC+"");
} else if (IMC < 25) {
    System.out.println("Tu IMC dice que estas normal, tu IMC es de"+IMC+"");
} else if (IMC < 30) {
    System.out.println("Tu IMC dice que tienes sobrepeso., tu IMC es de"+IMC+"");
} else if (IMC < 40) {
    System.out.println("Tu IMC indica que ya te pasaste, tu IMC es de"+IMC+"");
}


        }
    }
    
    