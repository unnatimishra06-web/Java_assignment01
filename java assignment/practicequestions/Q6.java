package practicequestions;
import java.util.*;
class Atm {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int account_balance = sc.nextInt();
        int withdrawal_amount = sc.nextInt();
        if(withdrawal_amount%100==0 && account_balance-withdrawal_amount>=1000){

                System.out.println("successful");
            }

       else{
            System.out.println("failure");
        }
    }
}
