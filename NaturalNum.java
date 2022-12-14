
// Print natural numbers upto n
import java.util.*;

public class NaturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.print("Natural number upto " + n + " terms is: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}