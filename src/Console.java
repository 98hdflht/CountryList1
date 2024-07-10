import java.util.Scanner;

public class Console {
    private static Scanner sc = new Scanner(System.in);

    public static String getString(String prompt) { // used to get console input
        System.out.print(prompt);
        return sc.nextLine();
    }

    public static int getInt(String prompt) { // used to check if a number is entered for selection
        int value = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                value = sc.nextInt();
                isValid = true;
            } else {
                System.out.println("Error! Invalid selection please enter 1, 2, or 3. Try again.");
            }
            sc.nextLine(); // discard any other data entered on the line
        }
        return value;
    }
}
