package practicequestions;
import java.util.*;
class Comparison {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int difference = num1 - num2;
        int signBit = (difference >> 31) & 1;
        int maximumValue = num1  - signBit * difference;
        System.out.println("Maximum value is: " + maximumValue);
    }
}