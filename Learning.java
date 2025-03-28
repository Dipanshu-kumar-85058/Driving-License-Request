import java.util.Scanner;
import java.util.Random;


public class Learning {
    public static void main(String[] args) {
        System.out.println("Welcome to the Driving Licence Application");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Hello " + name);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        byte limit = 0;

        if (age >= 18) {
            System.out.println("You are eligible for driving licence");
            limit = 1;
        }
        else {
            System.out.println("You are NOT eligible for driving licence");
            limit = 0;
        }

        if (limit == 1) {

        System.out.println("To apply for your Driving License,\nEnter other necessary details");

        System.out.print("Enter your phone number: ");
        long phoneNum1 = scanner.nextLong();
        int numDigits = String.valueOf(phoneNum1).length();

        if(numDigits!=10){
            System.out.println("The phone number is not valid\nTry Again");

        }
        else {

            System.out.print("Enter your full Address: ");
            String address = scanner.nextLine();

            // Reading /n error, adding scanner.nextLine()
            scanner.nextLine();

            System.out.print("Enter your vehicle Number/ID: ");
            String vehicleID = scanner.nextLine();

            long referenceNum = random.nextInt(100000000, 1000000000);

            System.out.println("Mr." + name + ", your request for a Driving License with with reference No. " + referenceNum + " has been submitted.");
            System.out.println("You will be notified after the Completion of your Request");
        }

        }
        else{
            System.out.println("The age eligibility criteria is 18 or above");
        }
        System.out.println("Thank you for using our service");
        scanner.close();
    }
}
