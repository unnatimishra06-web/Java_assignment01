package practicequestions;
import java.util.*;
class MultiplicationBy7{
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int result = (num1 << 3) - num1;
        System.out.println(result);
    }
}

