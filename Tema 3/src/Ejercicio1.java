import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner numero= new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int num1=numero.nextInt();
        System.out.print("Introduce un segundo número: ");
        int num2=numero.nextInt();

        System.out.println("La multiplicación de "+num1 +" x " +num2 +" = " +(num1*num2));
    }
}
