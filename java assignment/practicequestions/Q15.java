package practicequestions;
import java.util.*;
class Swap{
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;

        System.out.println("num1 = " + num1 + ", num2 = " + num2);
    }
}

