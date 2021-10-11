package cstevens_week13;

/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: Chad Stevens
 * @Assignment Name: Week 13 Assignment
 * @Date: August 15, 2021
 * @Description: Abstract Classes
 */

//Imports
import java.util.InputMismatchException;
import java.util.Scanner;

//Begin Class Main
public class Main {

    //Begin Main Method
    public static void main(String[] args) {

        /* Local Variables */
        int choice1 = 0;    //main menu
        final int LOW = 1;  //main menu
        final int HIGH = 6; //main menu
        int choice2 = 0;     //quantity of instruments
        String choice3;     //display instruments
        String choice4;     //enter more instruments
        String bName;       //brass names
        String sName;       //strings names
        String wName;       //woodwind names
        String pName;       //percussion names

        /* New Instance of Subclass ErrorHandling */
        ErrorHandling handle = new ErrorHandling();

        /* New Scanner Object */
        Scanner sc = new Scanner(System.in);

        /* Instances of non-abstract sub-classes (using hard-coded values) */
        Brass horn = new Brass();
        Strings chord = new Strings();
        Woodwind flute = new Woodwind();
        Percussion drum = new Percussion();

        /* Call overridden play methods without user data */
        horn.play();
        chord.play();
        flute.play();
        drum.play();

        // Begin Outer Loop
        do {

            // Begin Main Menu Validation Loop
            do {
                System.out.print("Select one of the following instrument "
                        + "families:\n1. Brass\n2. Strings\n3. Woodwind\n"
                        + "4. Percussion\n5. Display All Instruments\n"
                        + "6. Exit\n->: ");
                try {
                    do {
                        choice1 = sc.nextInt();
                        handle.setValidateRange(choice1, LOW, HIGH);
                    } while (!handle.getRange());
                } catch (InputMismatchException IME) {
                    System.err.printf("Exception: %s\n", IME);
                    sc.nextLine();
                    System.err.println("Selection must be a number. "
                            + "Try again.");
                }
            } while (!handle.getRange());

            switch (choice1) {

                case 1:
                    do {
                        System.out.printf("How many %s instruments would you "
                                + "like to enter? ->: ", horn.family);
                        try {
                            do {
                                choice2 = sc.nextInt();
                                handle.setValidateInt(choice2);
                            } while (!handle.getValidateInt());
                        } catch (InputMismatchException IME) {
                            System.err.printf("Exception! %s\n", IME);
                            sc.nextLine();
                            System.err.println("Selection must be a number. "
                                    + "Try again.");
                        }
                    } while (!handle.getValidateInt());
                    sc.nextLine();
                    for (int i = 1; i <= choice2; i++) {
                        System.out.printf("Enter instrument %d ->: ", i);
                        bName = sc.nextLine();
                        horn.setNames(bName);
                    }
                    System.out.printf("\nDisplay instruments?\n"
                            + "(Y for Yes, N for No) ->: ");
                    do {
                        choice3 = sc.next();
                        handle.setYesNo(choice3);
                    } while (!handle.getYesNo());

                    if (choice3.equalsIgnoreCase("y")) {
                        horn.display();
                    }
                    break;

                case 2:
                    do {
                        System.out.printf("How many %s instruments would you "
                                + "like to enter? ->: ", chord.family);
                        try {
                            do {
                                choice2 = sc.nextInt();
                                handle.setValidateInt(choice2);
                            } while (!handle.getValidateInt());
                        } catch (InputMismatchException IME) {
                            System.err.printf("Exception! %s\n", IME);
                            sc.nextLine();
                            System.err.println("Selection must be a number. "
                                    + "Try again.");
                        }
                    } while (!handle.getValidateInt());
                    sc.nextLine();
                    for (int i = 1; i <= choice2; i++) {
                        System.out.printf("Enter instrument %d ->: ", i);
                        sName = sc.nextLine();
                        chord.setNames(sName);
                    }
                    System.out.printf("Display instruments?\n"
                            + "(Y for Yes, N for No) ->: ");
                    do {
                        choice3 = sc.next();
                        handle.setYesNo(choice3);
                    } while (!handle.getYesNo());

                    if (choice3.equalsIgnoreCase("y")) {
                        chord.display();
                    }
                    break;

                case 3:
                    do {
                        System.out.printf("How many %s instruments would you "
                                + "like to enter? ->: ", flute.family);
                        try {
                            do {
                                choice2 = sc.nextInt();
                                handle.setValidateInt(choice2);
                            } while (!handle.getValidateInt());
                        } catch (InputMismatchException IME) {
                            System.err.printf("Exception! %s\n", IME);
                            sc.nextLine();
                            System.err.println("Selection must be a number. "
                                    + "Try again.");
                        }
                    } while (!handle.getValidateInt());
                    sc.nextLine();
                    for (int i = 1; i <= choice2; i++) {
                        System.out.printf("Enter instrument %d ->: ", i);
                        wName = sc.nextLine();
                        flute.setNames(wName);
                    }
                    System.out.printf("Display instruments?\n"
                            + "(Y for Yes, N for No) ->: ");
                    do {
                        choice3 = sc.next();
                        handle.setYesNo(choice3);
                    } while (!handle.getYesNo());

                    if (choice3.equalsIgnoreCase("y")) {
                        flute.display();
                    }
                    break;

                case 4:
                    do {
                        System.out.printf("How many %s instruments would you "
                                + "like to enter? ->: ", drum.family);
                        try {
                            do {
                                choice2 = sc.nextInt();
                                handle.setValidateInt(choice2);
                            } while (!handle.getValidateInt());
                        } catch (InputMismatchException IME) {
                            System.err.printf("Exception! %s\n", IME);
                            sc.nextLine();
                            System.err.println("Selection must be a number. "
                                    + "Try again.");
                        }
                    } while (!handle.getValidateInt());
                    sc.nextLine();
                    for (int i = 1; i <= choice2; i++) {
                        System.out.printf("Enter instrument %d ->: ", i);
                        pName = sc.nextLine();
                        drum.setNames(pName);
                    }
                    System.out.printf("Display instruments?\n"
                            + "(Y for Yes, N for No) ->: ");
                    do {
                        choice3 = sc.next();
                        handle.setYesNo(choice3);
                    } while (!handle.getYesNo());

                    if (choice3.equalsIgnoreCase("y")) {
                        drum.getNames();
                    }
                    break;

                case 5:
                    sc.nextLine();
                    System.out.print("This will display all instruments.\n");
                    horn.play();
                    chord.play();
                    flute.play();
                    drum.play();
                    break;

                case 6:
                    System.out.printf("Exiting Program. Goodbye.\n");
                    System.exit(0);

                default:
                    break;

            }

            System.out.printf("\nEnter more instruments?\n"
                    + "(Y for Yes, N for No) ->: ");
            do {
                choice4 = sc.next();
                handle.setYesNo(choice4);
            } while (!handle.getYesNo());

        } while (choice4.equalsIgnoreCase("y"));

        System.out.printf("Exiting Program. Goodbye.\n");

    }

} //End Main Method
