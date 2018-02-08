
package programa04;
import java.util.Scanner;

public class Programa04 {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Hola perro, ¿Cuantos años tienes?");
        int edad;
        edad = entrada.nextInt();
        if (edad <= 6){
            System.out.println("pichon");
        }
        if ((edad >=7)&& (edad <=12)){
            System.out.println("Semi puberto");
        }      
        if ((edad >= 13)&& (edad <= 16)){
            System.out.println("Fapero");
        }
        if ((edad >= 17)&& (edad <= 24)){
            System.out.println("Semi adulto");
        }
        if ((edad >= 25)&& (edad <= 40)){
            System.out.println("Chavo Ruco");
        }
        if (edad >=41){
            System.out.println("Viejo");
        }
       
    }
    
}
