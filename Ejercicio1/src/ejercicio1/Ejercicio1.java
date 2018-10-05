
package ejercicio1;
import java.util.Scanner; 

public class Ejercicio1 {
    Scanner teclado=new Scanner(System.in);
    public static String persona1, persona2;
    public void  ingnombres(){
        System.out.println("Ingrese Nombres:");
        System.out.println(" Estudiante  1: ");
        persona1=teclado.next();
        System.out.println(" Estudiante 2: ");
        persona2=teclado.next();
    }
    public void presentar(){
        System.out.println("Estudiante 1: ");
        System.out.println("Noimbre: "+persona1);
        System.out.println("Estudiante  2: ");
        System.out.println("Noimbre: "+persona2);
    }   
}
class Estudiante{
    public static void main (String[]args){
        Ejercicio1 ing=new Ejercicio1();
        Ejercicio1 pre=new Ejercicio1();
        ing.ingnombres();
        pre.presentar(); 
    }        
}
