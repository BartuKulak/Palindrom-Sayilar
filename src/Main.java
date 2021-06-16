import java.util.Scanner;
public class Main {
    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, mod;

        while (temp != 0) {
            mod = temp % 10;
            reverseNumber = (reverseNumber * 10) + mod;
            temp /= 10;
        }
        if(number == reverseNumber)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int a = input.nextInt();
        if(isPalindrom(a))
            System.out.println("Polindrom Sayı");
        else
            System.out.println("Polindrom Sayı Değil");
    }
}