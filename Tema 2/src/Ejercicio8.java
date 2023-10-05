public class Ejercicio6 {
    public static void main(String[] args) throws Exception {
    
        float base=99f;
        float resultado=21*base/100;
        float fin=base+resultado;
        System.out.printf("%14s%6s%.2f %n","Base imponible","", base);
        System.out.printf("%8s %11s%.2f%n","Iva(21%)","",resultado);
        System.out.println("--------------------------");
        System.out.printf("%5s%15s%.2f","Total","",fin);

    }
}
