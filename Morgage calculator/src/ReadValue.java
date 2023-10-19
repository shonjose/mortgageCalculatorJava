import java.util.Scanner;

public class ReadValue {
    public static <string> double mortgageValue(string prompt, double min, double max) {

        //Reading value and setting the validation.
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        double value = scanner.nextDouble();

        while (true) {
            if (value <= min || value > max) {
                System.out.println("Enter a Value Between " + min + " and " + max );
                System.out.print(prompt);
                value = scanner.nextDouble();
                continue;
            }
            return value;
        }
    }
}
