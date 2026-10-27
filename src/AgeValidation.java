
import java.util.Scanner;

public class AgeValidation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = Integer.parseInt(sc.nextLine());

            if (age < 18) {
                throw new InvalidAgeException(
                        "Age must be 18 or above."
                );
            }

            System.out.println(
                    "You are eligible. Age requirement satisfied."
            );

        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid age.");

        } finally {
            sc.close();
        }
    }
}
