public class Ejercicio6 {
    public static void main(String[] args) throws Exception {
    
        float base=10f;
        float resultado=21*base/100;
        float fin=base+resultado;

        System.out.printf("%-15s %6.2f %n","Base imponible", base);
        System.out.printf("%-15s %6.2f %n","Iva(21%)",resultado);
        System.out.println("-----------------------");
        System.out.printf("%-15s %6.2f","Total",fin);

    }
}
