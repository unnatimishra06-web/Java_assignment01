package practicequestions;

import java.util.*;
 class Final_bill {
    static double FinalBill(int price, int quantity) {
        double bill = price * quantity;
        double discount;
        if (bill >= 2000 && bill < 5000) {
            discount = 0.05 * bill;
        }
        else if (bill >= 5000) {
            discount = 0.10 * bill;
        }
        else {
            discount = 0;
        }

        bill = bill - discount;


        double finalBill = bill + (bill * 0.18);

        return finalBill;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int quantity = sc.nextInt();
        double finalAmount = FinalBill(price, quantity);

        System.out.println(finalAmount);
    }
}