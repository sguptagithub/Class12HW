package Class12HW;

import java.util.Scanner;

public class HwFirstName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mom’s first name? ");
        String momName = scanner.nextLine();
        System.out.print("Dad’s first name? ");
        String dadName = scanner.nextLine();
        System.out.print("Boy or Girl? ");
        String gender = scanner.nextLine();

        String suggestedName = "";
        if (gender.equalsIgnoreCase("boy")) {
            suggestedName = dadName.substring(0, 3) + momName.substring(momName.length() - 2);
        } else if (gender.equalsIgnoreCase("girl")) {
            suggestedName = momName.substring(0, 2) + dadName.substring(dadName.length() - 3);
        } else {
            System.out.println("Invalid gender entered.");
            System.exit(0);
        }

        System.out.println("Suggested baby name: " + suggestedName.toUpperCase());
    }

}
