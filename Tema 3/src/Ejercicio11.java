import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) throws Exception {
       
        Scanner num1=new Scanner(System.in);
        
        System.out.print("Introduzca los Kb que quiera convetir a Mb: ");
        int mb=num1.nextInt();

        System.out.println(mb +" Kb son " +(mb/1024) +" Mb");
       

    }
}
