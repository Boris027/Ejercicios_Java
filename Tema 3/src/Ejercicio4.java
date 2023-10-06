import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) throws Exception {
        Scanner xd=new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int num1=xd.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2=xd.nextInt();

        System.out.println("La suma de " +num1 +" y " +num2 +" es " +(num1+num2));
        System.out.println("La resta de " +num1 +" y " +num2 +" es " +(num1-num2));
        System.out.println("La multiplicación de " +num1 +" y " +num2 +" es " +(num1*num2));
        System.out.println("La division de " +num1 +" y " +num2 +" es " +(num1/num2));
    }
}
