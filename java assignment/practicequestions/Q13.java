package practicequestions;
import java.util.*;
class Multiplication {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int product = 0;
        boolean negative = false;
        if (num1 < 0) {
            num1 = -num1;
            negative = !negative;
        }
        if (num2 < 0) {
            num2 = -num2;
            negative = !negative;
        }
        while (num2> 0) {
            if ((num2& 1) == 1) {
               product =product + num1;
            }
            num1= num1 << 1;
            num2= num2 >> 1;
        }
        if (negative) {
            product = -product;
        }

        System.out.println(product);
    }
}
