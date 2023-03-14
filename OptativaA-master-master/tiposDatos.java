import java.util.Scanner;

public class tiposDatos {
    public static void ejemploPrimitivos() {
 
        //int
        int edad = 2_147_483_647 ; //el _ es para serpararlos pero es invisible 

        //Para imprimir algo usa el sig comando
        System.out.println(edad);
    //para poder ejecutarlp hay que ir a nuestro main branch que en este caso es miana.java y hacemos lo sig 

        //Pones primero el nombre del archivo (tiposDatos) y luego pones la clase (ejemploPrimitivo), entonces te queda asi en tu main
    
            //tiposDatos.ejemploPrimitivo

    //long 
    long largo =  2_147_483_647 ;
    System.out.print(largo);

    //short
    short pequeno = 32_767;
    System.out.println(pequeno);

    //byte
    byte peque = 127;
    System.out.println(peque);

    //ahora van los mas importantes
    // Float y Double

    float flotante = 18.5f; 
    //se le pone la F para que sepa que es flotante
    System.out.println(flotante);


    //double
    double doble = 2345.67;
    System.out.println(doble);




    
}
 public static void ejemploEnvoltorios(){

//con esto se pueden hacer cosas mas padres


//integer
// los envoltorios va con mayuscula
Integer numero = 5; //intger es Numero entero
Integer numero2 = 16;
System.out.println(numero);
 System.out.println(numero.byteValue()); // le quita los decimales
 System.out.println(numero.doubleValue()); //le pone un .  , en este caso te da (5.0)
 System.out.println(numero.intValue()); // te da enteros
 System.out.println(numero.longValue()); // te da el num sin decimales
 System.out.println(numero.shortValue()); // te da el numero sin decimales
 System.out.println(8 + numero); // aqui el resultado es 13 porque en este caso es 8 + 13 
 System.out.println(8 + numero.toString()); //el resultado es 85 porque el 8 se le agrega el 5 que es mi numero original
 System.out.println(numero.equals(numero2)); //false porque no son iguales 
 System.out.println(numero.compareTo(numero2)); //Te puede dar -1 , 0 , 1 por el tema de que eso te dice si son iguales, menor o mayor 


 //float 
 Float numero3 = 3.1415f;
 Float numero4 = 21.87f;
 System.out.println(numero3);
 System.out.println(numero3.byteValue());
 System.out.println(numero3.doubleValue());
 System.out.println(numero3.intValue());
 System.out.println(numero3.longValue());
 System.out.println(numero3.shortValue());
 System.out.println(8 + numero3);
 System.out.println(8 + numero3.toString());
 System.out.println(numero3.equals(numero4));
 System.out.println(numero3.compareTo(numero4));

//short
Short numero5 = 32767;
Short numero6 = 32767;
System.out.println(numero5);
 System.out.println(numero5.byteValue());
 System.out.println(numero5.doubleValue());
 System.out.println(numero5.intValue());
 System.out.println(numero5.longValue());
 System.out.println(numero5.shortValue());
 System.out.println(8 + numero5);
 System.out.println(8 + numero5.toString());
 System.out.println(numero5.equals(numero6));
 System.out.println(numero5.compareTo(numero6));

//byte
Byte numero7 = 127;
Byte numero8 = 127; //duda, aqui no se que poner 
System.out.println(numero7);
 System.out.println(numero7.byteValue());
 System.out.println(numero7.doubleValue());
 System.out.println(numero7.intValue());
 System.out.println(numero7.longValue());
 System.out.println(numero7.shortValue());
 System.out.println(8 + numero7);
 System.out.println(8 + numero7.toString());
 System.out.println(numero7.equals(numero8));
 System.out.println(numero7.compareTo(numero8));




//long
Long numero9 = 9223372036854775807l;
Long numero10 = 9223372036854775807l; 
System.out.println(numero9);
 System.out.println(numero9.byteValue());
 System.out.println(numero9.doubleValue());
 System.out.println(numero9.intValue());
 System.out.println(numero9.longValue());
 System.out.println(numero9.shortValue());
 System.out.println(8 + numero9);
 System.out.println(8 + numero9.toString());
 System.out.println(numero9.equals(numero10));
 System.out.println(numero9.compareTo(numero10));


 //double
 Double numero11 = 1.79769313486232;
 Double numero12 = 1.79769313486232; 
 System.out.println(numero11);
 System.out.println(numero11.byteValue());
 System.out.println(numero11.doubleValue());
 System.out.println(numero11.intValue());
 System.out.println(numero11.longValue());
 System.out.println(numero11.shortValue());
 System.out.println(8 + numero11);
 System.out.println(8 + numero11.toString());
 System.out.println(numero11.equals(numero12));
 System.out.println(numero11.compareTo(numero12));


 //tarea


}



public static void operadores(){
    Integer calculadora1=4;
    Integer calculadora2=2;

    System.out.println("Suma:"+(calculadora1+calculadora2));
    System.out.println("Resta:"+(calculadora1-calculadora2));
    System.out.println("Multi:"+calculadora1*calculadora2);
    System.out.println("Divi:"+calculadora1/calculadora2); 
    System.out.println("Divi:"+calculadora1.floatValue()/calculadora2); //si le agreamos un float value te da los deciamales
    System.out.println("Residuo:"+calculadora1.floatValue()%calculadora2); 

}
public static void calculadorita(){

    //cuando hacemos un programa queremos que primero no de las variables, luego las __ y luego los resultados

//Definmos variables

    float calcejercicio1;
    float calcejercicio2;
    float suma;
    float resta;
    float multiplicacion;
    float division;
    float residuo;
    



    Scanner entrada = new Scanner(System.in);


    //ahora pedimos los datos 
    System.out.println("Ingresa un numero");
    calcejercicio1= entrada.nextFloat();

    // aqui le pedimos al user que nos de algun valor 
    System.out.println("Ingresa un numero");
    calcejercicio2= entrada.nextFloat();

    //Operaciones
    suma = calcejercicio1 + calcejercicio2;
    resta = calcejercicio1 - calcejercicio2;
    multiplicacion = calcejercicio1 * calcejercicio2;
    division = calcejercicio1 / calcejercicio2;
    residuo = calcejercicio1 % calcejercicio2;

    System.out.println("\n La Calculadora te regresa \n");
    System.out.println("suma:"+(calcejercicio1+calcejercicio2 + "=" + suma));
    System.out.println("resta:"+(calcejercicio1-calcejercicio2 + "=" + resta));
    System.out.println("multiplicacion:"+calcejercicio1*calcejercicio2 + "=" + multiplicacion);
    System.out.println("division:"+calcejercicio1/calcejercicio2 + "=" + division); 
    System.out.println("residuo:"+calcejercicio1%calcejercicio2 + "=" + residuo); 


    



}



}

        