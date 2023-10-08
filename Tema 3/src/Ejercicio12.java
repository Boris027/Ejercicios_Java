import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) throws Exception {
       
    Scanner num1=new Scanner(System.in);
    
    System.out.print("Introduzca la nota de su primer examen: ");
    float nota1=num1.nextFloat();

    float notaresultante=nota1*4/10;

    System.out.print("¿Que nota quieres sacar en el trimestre?: ");
    float notatri=num1.nextFloat();

        float notanecesaria=(((notatri-notaresultante)*10f)/6f);
        System.out.printf("%s %.2f %s %.2f %s","Para tener un ",notatri," en el trimestre necesita sacar un ",notanecesaria," en el segundo examen.");
    }
}
