package practicequestions;

import java.util.*;
class Salary_calculator {

    static void main() {
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        double HRA;
        double DA;
        double Pf;
        double netsalary;
        if(salary>=30000)
        {
            HRA=0.20*salary;
            DA=0.15*salary;
        }
        else{
            HRA=0.10*salary;
            DA=0.08*salary;
        }
        Pf=0.12*salary;
        netsalary=salary+HRA+DA-Pf;
        System.out.println(netsalary);
    }
}
