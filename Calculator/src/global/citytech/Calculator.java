package global.citytech;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b,c,selection;
        System.out.println("Please enter any two digits:");
        a= scan.nextInt();
        b= scan.nextInt();

        System.out.println("Make Your Selection");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Division");
        System.out.println("4.Multiplication");

        selection = scan.nextInt();
        while (selection>4){
            System.out.println("Please enter a correct selection");
            selection=scan.nextInt();
        }

        Operations oper = new Operations();

        if (selection==1){
            c=oper.add(a,b);
            System.out.println("Your answer is " +c);
        }
        else if (selection==2)
        {
            c=oper.sub(a,b);
            System.out.println("Your answer is " +c);
        }
        else if (selection==3)
        {
            c=oper.div(a, b);
            System.out.println("Your answer is " +c);
        }
        else if (selection==4)
        {
            c=oper.multi(a,b);
            System.out.println("Your answer is " +c);
        }
    }


}
