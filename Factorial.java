import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Masukan Nilai n =  ");
        int n = input.nextInt();
        int factorial = 1;
        for(int i = 1; i <= n; ++i) {
            factorial *= i;
            System.out.println("Factorial of " + i + " is " + factorial);
        }
        input.close();
    }
}
