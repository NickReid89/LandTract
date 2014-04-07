import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Give the user choices.
        Choices();

    }

    public static void Choices() {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.print("\n\nWhat would you like to do?: \n");
            System.out.print("1. Measure the area of a land tract\n");
            System.out.print("2. Compare two land tracts.\n");
            System.out.print("3. Exit program\n");
            choice = sc.nextInt();

            switch (choice) {
                // Check the area of a land tract.
                case 1:
                    Area();
                    break;
                // compare land tracts.
                case 2:
                    Compare();
                    break;
                //exit.
                case 3:
                    break;
                default:
                    System.out.print("Error, please make another decision.");
                    break;

            }
        } while (choice != 3);

    }

    // Calls the Area method in the land tract class to give an area to the user.
    public static void Area() {
        double length, width;
        // asks for dimensions of land tract.
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the length of the land track?\n");
        System.out.print("Length = ");
        length = sc.nextDouble();
        System.out.print("What is the width of the land tract?\n");
        System.out.print("Width = ");
        width = sc.nextDouble();

        LandTract lt = new LandTract(length, width);
        System.out.print("\nThe area of the land tract is " + lt.toString());

    }

    // compares land tracts.
    public static void Compare() {

        double length, width;
        Scanner sc = new Scanner(System.in);

        // gathering dimensions.
        System.out.print("What is the first land tracts length? ");
        length = sc.nextDouble();
        System.out.print("What is the first land tracts width? ");
        width = sc.nextDouble();

        // First land tract.
        LandTract lt = new LandTract(length, width);
        System.out.print("What is the second land tracts length? ");
        length = sc.nextDouble();
        System.out.print("What is the second land tracts width? ");
        width = sc.nextDouble();
        // Second land tract.
        LandTract ltTwo = new LandTract(length, width);

        // Calls the overridden equals method and return a value based on the comparison.
        if (lt.equals(ltTwo) == -1) {
            System.out.print("The first land tract is smaller.");
        } else if (lt.equals(ltTwo) == 1) {
            System.out.print("The first land tract is bigger.");
        } else {
            System.out.print("They are of equal size");
        }
    }

}