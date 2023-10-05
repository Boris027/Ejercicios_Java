public class Ejercicio5 {
    public static void main(String[] args) throws Exception {
        System.out.printf("%-10s %-10s %-10s %-10s %s \n","Lunes","Martes", "Mierc.", "Jueves", "Viernes");
        System.out.printf("%-10s %-10s %-10s %-10s %s \n","=====","======", "======", "======", "=======");
        System.out.printf("%-15s %-15s %-15s %-15s %s \n" ,"\033[32mPROG",  "\033[34mLM",   "\033[34mLM",   "\033[32mPROG", "\033[36mFOL");
        System.out.printf("%-15s %-15s %-15s %-15s %s \n" ,"\033[32mPROG",  "\033[34mLM",   "\033[34mLM",   "\033[32mPROG", "\033[36mFOL");
        System.out.printf("%-15s %-15s %-15s %-15s %s \n" ,"\033[32mPROG",  "\033[35mBD",   "\033[32mPROG", "\033[32mPROG", "\033[36mFOL");
        System.out.printf("%-15s %-15s %-15s %-15s %s \n" ,"\033[33mSI",    "\033[35mBD",   "\033[32mPROG",     "\033[35mBD", "\033[33mSI");
        System.out.printf("%-15s %-15s %-15s %-15s %s \n" ,"\033[33mSI",    "\033[31mED",   "\033[35mBD",   "\033[35mBD", "\033[33mSI");
        System.out.printf("%-15s %-15s %-15s %-15s %s  %s \n" ,"\033[33mSI",    "\033[31mED",   "\033[35mBD",   "\033[31mED", "\033[33mSI", "\033[37m");
    }
}
