import java.util.Scanner;

public class Hadiah {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan rangking");
        int rangking = input.nextInt();
        
        if (rangking == 1) {
            // Jika iya, memberi hadiah
            System.out.println("Selamat! Anda rangking 1, naik kelas, dan mendapat hadiah.");
        } else {
            System.out.println("Maaf, Anda tidak memenuhi syarat untuk mendapatkan hadiah.");
        }
        
        input.close();
    }
}