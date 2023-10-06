import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) throws Exception {
        Scanner xd=new Scanner(System.in);

        System.out.print("Introduzca la base del triángulo: ");
        float base=xd.nextFloat();
        System.out.print("Introduzca la altura del triángulo: ");
        float altura=xd.nextFloat();

        System.out.println("El area del triángulo es de: " +(base*altura/2));
    }
}
