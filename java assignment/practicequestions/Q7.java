package practicequestions;
import java.util.*;
class Number_operations {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reverse = 0;
        int sum = 0;
        int count = 0;
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            sum = sum + digit;
            count++;
            temp = temp / 10;
        }

        System.out.println("Reverse = " + reverse);
        System.out.println("Sum of digits = " + sum);
        System.out.println("Count of digits = " + count);
    }
}
