import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) throws Exception {
       
        Scanner num1=new Scanner(System.in);
        Scanner num2=new Scanner(System.in);

        float precio=12;

        System.out.print("Cuantos dias trabajas a la semana: ");
        int dias=num2.nextInt();
        System.out.print("¿Cuantas horas trabajas cada dia?: ");
        float horas=num1.nextFloat();

        System.out.printf("%s%.2f %s","Usted gana a la semana: ",(horas*precio)*dias,"euros a la semana");

       




    }
}
