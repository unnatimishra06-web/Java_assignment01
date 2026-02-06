package practicequestions;
import java.util.*;
class Password{
    static void main() {
        Scanner sc = new Scanner(System.in);

        String usename = "admin";
        String password = "1234";

        for (int i = 1; i <= 3; i++) {

            System.out.print("Enter username: ");
            String user = sc.next();

            System.out.print("Enter password: ");
            String pass = sc.next();

            if (user.equals(usename) && pass.equals(password)) {

                System.out.println("Login successful");
                break;
            } else {
                System.out.println("Wrong credentials");

                if (i == 3) {
                    System.out.println("Account locked");
                }
            }
        }
    }
}


