import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) throws Exception {
       
       Scanner num1=new Scanner(System.in);

       System.out.print("Introduzca el radio del cono: ");
       float radio=num1.nextFloat();
       System.out.print("Introduzca la altura del cono: ");
       float altura=num1.nextFloat();
       float volumen=((3.14f*(radio*radio)*altura)/3);
       System.out.printf("%s%.2f","El volumen del cono es de: ",volumen);


    }
}
