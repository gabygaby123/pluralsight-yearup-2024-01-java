import java.util.Scanner;
public class FullNameApplication {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String firstName;
    String middleName;
    String lastName;
    String fullName;

    System.out.println("Please enter your first name: ");
    firstName = input.nextLine();

    System.out.println("Please enter your middle name: ");
    middleName = input.nextLine();

    System.out.println("Please enter your last name: ");
    lastName = input.nextLine();

    if (middleName.contains(" "))
    {
        fullName = firstName + lastName;
    }
    else {
        fullName = firstName + " " + middleName + " " + lastName;
    }

        System.out.println(fullName);
    }
}
