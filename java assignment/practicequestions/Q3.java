package practicequestions;

import java.util.*;
 class Number {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int integer = sc.nextInt();
        if(integer>0){
            System.out.println("positive number");
        }
        else if(integer==0){
            System.out.println("number is 0");
        }
        else{
            System.out.println("negative number");
        }
        if(integer%2==0){
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");

        }
        if(integer%5==0 && integer%7==0){
            System.out.println("divisible by both 5  and 7");
        }
        else{
            System.out.println("not divisible by both 5  and 7");
        }
    }
}
