import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) throws Exception {
       
        Scanner num1=new Scanner(System.in);
        
        System.out.print("Introduzca los Mb que quiera convetir a Kb: ");
        int mb=num1.nextInt();

        System.out.println(mb +" Mb son " +(mb*1024) +" Kb");
       

    }
}
