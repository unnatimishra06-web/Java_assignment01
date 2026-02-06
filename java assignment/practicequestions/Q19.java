package practicequestions;
import java.util.*;
class Power {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        boolean isPowerOfTwo = (num1 > 0) && ((num1 & (num1 - 1)) == 0);
        System.out.println("Is power of 2: " + isPowerOfTwo);
    }
}
