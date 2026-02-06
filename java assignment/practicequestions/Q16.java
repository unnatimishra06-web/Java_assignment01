package practicequestions;
import java.util.*;
class OddorEven {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        if ((num1 & 1) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}


