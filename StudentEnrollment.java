import java.util.Scanner;

public class StudentEnrollment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the student information
        System.out.print("Enter Student Name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter Course: ");
        String course = scanner.nextLine();

        System.out.print("Enter Course Code: ");
        String courseCode = scanner.nextLine();

        System.out.print("Enter Number of Units (Max 10): ");
        int numberOfUnits = scanner.nextInt();

        // Determine if the number of units are valid or invalid
        if (numberOfUnits < 1 || numberOfUnits > 10) {
            System.out.println("Invalid number of units. Please enter a value between 1 and 10.");
            return;
        }

        // Calculate the total enrollment fee
        final int feePerUnit = 1000;
        int totalFee = numberOfUnits * feePerUnit;

        // Print the client's name and the total enrollment fee
        System.out.println("Student Name: " + studentName);
        System.out.println("Total Enrollment Fee: " + totalFee);

        // To Determine payment amount
        System.out.print("Enter Payment Amount: ");
        int paymentAmount = scanner.nextInt();

        // To Determine if the payment is full, partial or overpayment
        if (paymentAmount == totalFee) {
            System.out.println("Status: Fully Paid");
        } else if (paymentAmount < totalFee) {
            System.out.println("Status: Partial Payment of " + paymentAmount);
        } else {
            System.out.println("Status: Overpayment. Change to be refunded: " + (paymentAmount - totalFee));
        }

        scanner.close();
    }
}