import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) throws Exception {
        Scanner xd=new Scanner(System.in);

        System.out.print("Introduzca la base del rectangulo: ");
        float base=xd.nextFloat();
        System.out.print("Introduzca la altura del rectangulo: ");
        float altura=xd.nextFloat();

        System.out.println("El area del rectángulo es de: " +(base*altura));
    }
}
