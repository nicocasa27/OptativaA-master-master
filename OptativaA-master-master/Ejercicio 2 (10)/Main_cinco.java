import java.util.Scanner;
public class Main_cinco {

    public static void main(String[] args) {
        
        //Variables
        float n_actividades,n_tareas,n_examen,promedio;
        Scanner entrada = new Scanner(System.in);

        //Pedir datos
        System.out.println("¿Cuanto fue tu nota de actividades en clase?");
        n_actividades = entrada.nextFloat();

        System.out.println("¿Cuanto fue tu nota de tareas?");
        n_tareas = entrada.nextFloat();

        System.out.println("¿Cuanto fue tu nota de examen?");
        n_examen = entrada.nextFloat();

        //Calcular promedio ponderado
        promedio =  (n_actividades*0.4f) + (n_tareas*0.2f) + (n_examen*0.4f);

        //Imprimir resultado
        System.out.println("Tu promedio es de "+promedio);

    }

}