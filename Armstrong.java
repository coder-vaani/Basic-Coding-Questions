import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = n;

        int sum = 0;
        while (n > 0) {
            int r = n % 10;
            sum += r * r * r;
            n = n / 10;
        }
        if (temp == sum)
            System.out.println("Given number is Armstrong number.");
        else
            System.out.println("Given number is not an Armstrong number.");
        sc.close();
    }
}
