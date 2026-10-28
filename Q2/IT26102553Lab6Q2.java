import java.util.Scanner;

public class Q2B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        int x = 0;

        while (x < 10) {
            System.out.print("Enter number " + (x + 1) + ": ");
            numbers[x] = sc.nextInt();
            x = x + 1;
        }

        System.out.println("These are the numbers:");

        x = 0;
        while (x < 10) {
            System.out.print(numbers[x] + " ");
            x = x + 1;
        }
    }
}