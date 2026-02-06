package practicequestions;
import java.util.*;
 class Bits {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int setBitCount = 0;
        while (num1 != 0) {
            setBitCount += (num1 & 1);
            num1 = num1 >> 1;
        }
        System.out.println("Total set bits: " + setBitCount);
    }
}

