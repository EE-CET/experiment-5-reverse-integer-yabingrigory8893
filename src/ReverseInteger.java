import java.util.Scanner;

public class ReverseInteger { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int reversed = 0;
            while (n != 0) {
                int digit = n % 10;
                reversed = reversed * 10 + digit;
                n /= 10;
            }
            System.out.println(reversed);
        }
        scanner.close();
    }
}
