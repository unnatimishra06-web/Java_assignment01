package practicequestions;
import java.util.*;
class Sum {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
       while(num2!=0){
           int sum=num1^num2;
           int carry=(num1&num2)<<1;
           num1=sum;
           num2=carry;
           System.out.println(+num1);
       }


    }
}
