import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) throws Exception {
        
        Scanner num1=new Scanner(System.in);

        System.out.print("Introduce el precio del producto sin base imponible: ");
        float base=num1.nextFloat();
        float iva=base*21/100;

        System.out.printf("%-14s %9.2f %n","Base imponible",base);
        System.out.printf("%-14s %9.2f %n","Iva(21%)",iva);
        System.out.println("------------------------");
        System.out.printf("%-14s %9.2f", "Resultado:",base+iva);





    }
}
