package practicequestions;
import java.util.*;
class Calculator {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Menu/n: 1. Addition\n" +
                "  2. Subtraction\n" +
                "  3. Multiplication\n" +
                "  4. Division\n" +
                "  5. Modulus");
        System.out.print("choose option from operations : ");
        int num3 = sc.nextInt();
        switch(num3){
            case 1:
                System.out.println(num1+num2);
                break;
            case 2:
                System.out.println(num1-num2);
                break;
            case 3:
                System.out.println(num1*num2);
                break;
            case 4:
                if(num2 != 0)
                    System.out.println(num1 / num2);
                else
                    System.out.println("Cannot divide by zero");
                     break;
            case 5:
                System.out.println(num1%num2);
                break;
            default:
                System.out.println("end");
        }
        }

    }

