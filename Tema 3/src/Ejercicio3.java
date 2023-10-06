import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) throws Exception {
        Scanner xd=new Scanner(System.in);

        System.out.print("Introduzca la cantidad de pesetas que quieras pasar a euros: ");
        float euros=xd.nextFloat();
        float pesetas=166.386f;

        System.out.println(euros +" pesetas son " +euros/pesetas +" euros");

        
    }
}
