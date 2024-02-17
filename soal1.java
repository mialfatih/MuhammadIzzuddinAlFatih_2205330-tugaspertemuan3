package Tugas1;
import java.util.Scanner;

public class Kalkulator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numerators = new int[3];
        int[] denominators = new int[3];
        for (int i = 0; i < 3; i++) {
            numerators[i] = input.nextInt();
            denominators[i] = input.nextInt();
        }
        char operation = input.next().charAt(0);
        double result = calculate(numerators, denominators, operation);
        System.out.println("Hasil operasi: " + result);
        input.close();
    }
    
    public static double calculate(int[] numerators, int[] denominators, char operation) {
        double result = 0;
        switch (operation) {
            case '+':
                result = ((double) numerators[0] / denominators[0]) + ((double) numerators[1] / denominators[1]) + ((double) numerators[2] / denominators[2]);
                break;
            case '-':
                result = ((double) numerators[0] / denominators[0]) - ((double) numerators[1] / denominators[1]) - ((double) numerators[2] / denominators[2]);
                break;
            case '*':
                result = ((double) numerators[0] / denominators[0]) * ((double) numerators[1] / denominators[1]) * ((double) numerators[2] / denominators[2]);
                break;
            case '/':
                result = ((double) numerators[0] / denominators[0]) / ((double) numerators[1] / denominators[1]) / ((double) numerators[2] / denominators[2]);
                break;
            default:
                System.out.println("Operasi tidak valid.");
                System.exit(1);
        }
        return result;
    }
}
