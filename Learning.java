import java.util.Scanner;

public class Learning {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner scanner = new Scanner(System.in);

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

        System.out.println("Enter other necessary details");

        System.out.print("Enter your phone number: ");
        long phoneNum1 = scanner.nextLong();
        int numDigits = String.valueOf(phoneNum1).length();

        if(numDigits!=10){
            System.out.println("The phone number is not valid\nTry Again");

        }
        else {

            System.out.print("Enter your full Address: ");
            String address = scanner.nextLine();
            scanner.nextLine();

            System.out.print("Enter your vehicle Number/ID: ");
            String vehicleID = scanner.nextLine();
        }

        }
        else{
            System.out.println("The age eligibility criteria is 18 or above");
        }
        scanner.close();

        System.out.println("Mr." + name + ", your request for a Driving License with Necessary details has been submitted.");
        System.out.println("You will be notified after the Completion of your Request");
    }
}
