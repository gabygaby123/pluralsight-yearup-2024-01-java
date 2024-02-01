import java.sql.SQLOutput;
import java.util.Scanner;
public class Math
{
    public static void main(String[] args)
    {
        //add scanner at the top
        int num1;
        int num2;
        int total;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        num1 = scan.nextInt();

        System.out.print("Enter the second number: ");
        num2 = scan.nextInt();
        scan.nextLine();

        System.out.println("Possible calculations:");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");
        System.out.print("Please select an option: ");
        String calculation = scan.nextLine();

        switch(calculation.toUpperCase()){
            case "A":
                System.out.println("The total is: " + (num1 + num2));
                break;
            case "S":
                System.out.println("The total is: " + (num1 - num2));
                break;
            case "M":
                System.out.println("The total is: " + (num1 * num2));
                break;
            case "D":
                System.out.println("The total is: " + (num1 / num2));
                break;
        }

    }
}
