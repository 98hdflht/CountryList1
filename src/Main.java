// Quincy Yarbrough
// 7/9/2024

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    private static final ArrayList<String> countries = new ArrayList<>(); // set the array list as an object

    public static void main(String[] args) {
        int choice; // selection for switch statement
        System.out.println("Country List Manager"); // start of menu this line only appears the first time
        System.out.println("COMMAND MENU");
        do {
            displayMenu();
            choice = Console.getInt("Enter menu number: ");
            switch (choice) { // directs program based on choice
                case 1:
                    listCountries();
                    break;
                case 2:
                    addCountry();
                    break;
                case 3:
                    System.out.println("Goodbye.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);
    }

    public static void displayMenu() { // the menu that appears every time
        System.out.println("1 - List countries");
        System.out.println("2 - Add a country");
        System.out.println("3 - Exit");
    }

    public static void listCountries() { // lists the countries if the array contains them
        if (countries.isEmpty()) {
            System.out.println("No countries in the list.");
        } else {
            Collections.sort(countries);
            for (String country : countries) {
                System.out.println(country);
            }
        }
    }

    public static void addCountry() { // used to add a country to the list
        String country = Console.getString("Enter country: ");
        countries.add(country);
        System.out.println("This country has been added.");
    }
}
