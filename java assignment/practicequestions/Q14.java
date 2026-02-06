package practicequestions;
import java.util.*;
class QuotientWithoutDivision {

    static void main() {
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt();
        int divisor = sc.nextInt();
        int quotient = 0;
        while (dividend >= divisor) {

            int tempDivisor = divisor;
            int multiple = 1;
            while ((tempDivisor << 1) <= dividend) {
                tempDivisor = tempDivisor << 1;
                multiple = multiple << 1;
            }
            dividend = dividend - tempDivisor;

            quotient = quotient + multiple;
        }

        System.out.println("Quotient = " + quotient);
    }
}
