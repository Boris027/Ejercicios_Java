import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) throws Exception {
        Scanner xd=new Scanner(System.in);

        System.out.print("Introduzca la cantidad de euros que quieras pasar a pesetas: ");
        float euros=xd.nextFloat();
        float pesetas=166.386f;

        System.out.println(euros +" euros son " +euros*pesetas +" pesetas");

        
    }
}
