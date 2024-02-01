import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        //string is a class so that why its capital
        Scanner input = new Scanner(System.in);
        String name;
        float hours;
        float rate;
        float overtime;
        float totalpay;

        System.out.print("Enter Name: ");
        name = input.nextLine();
        System.out.print("Enter Hours: ");
        hours = input.nextFloat();
        System.out.print("Enter Rate: ");
        rate = input.nextFloat();
        input.nextLine();

        if(hours > 40.0) {
            overtime = (((hours - 40.0f) * (1.5f*rate)) + (40 * rate));
            System.out.println("You have earned: " + overtime + (hours*rate));
        }
        else {
            System.out.print(name + ", you have earned: $" + (hours*rate));
        }

    }
}