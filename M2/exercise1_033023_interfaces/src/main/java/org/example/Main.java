package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Connectable[] devices = new Connectable[5];

        System.out.println("Welcome to the Device Manager App!!");
        System.out.println("===================================\n");

        System.out.println("Setup the devices");
        System.out.println("=================\n");


        for (int i = 0; i<devices.length; i++){
            int selection = promptInt("What type of device would you like to add?\n1. Fridge\n2. Toaster\n3. Tv",1,3);
            switch(selection){
                case 1:
                    devices[i] = new Fridge();
                    break;
                case 2:
                    devices[i] = new Toaster();
                    break;
                case 3:
                    devices[i] = new Tv();
                    break;
            }

        }


        System.out.println("Interact with the devices");
        System.out.println("=========================\n");


        // Come up with a menu system which will provide the following:
        // Select the device (one of the 5 in our array)
        int selection = promptInt("Select device:\n1. Fridge\n2. Toaster\n3. Tv1\n4. Tv2\n5. Tv3",1,5)-1;
        Connectable device = devices[selection];
        int interactionSelection = promptInt("1. Get device name\n2. Turn On Device\n3. Turn Off Device\n4. Get Device Status\n5. Quit",1,5);
        switch(interactionSelection){
            case 1:
                System.out.println("The name of your device is: " + device.getName());
                break;
            case 2:
                device.turnOn();
                System.out.println("You have turned on your device");
                break;
            case 3:
                device.turnOff();
                System.out.println("You have turned off your device");
                break;
            case 4:
                device.getState();
                if (device.getState()==true){
                    System.out.println("Device is on");
                }else{
                    System.out.println("Device is off");
                }
                break;
            case 5:
                break;
        }
        // - 1. Get Device Name
        // - 2. Turn On Device
        // - 3. Turn Off Device
        // - 4. Get Device Status
        // - 5. Quit
        // This process should continue until the user enters '5' to Quit

        System.out.println("\nThanks for using the Device Manager App. Bye!");
    }

    // Utility method to prompt user for integer input
    public static int promptInt(String message) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        while (true) {

            try {
                System.out.println(message);
                String input = sc.nextLine();
                result = Integer.parseInt(input);
                break;
            } catch (NumberFormatException ex) {
                System.out.println("Invalid input");
            }
        }
        return result;
    }

    // Utility method to prompt user for integer input within a range
    public static int promptInt(String message, int min, int max) {
        int result = 0;

        boolean isValid = false;
        while (!isValid) {
            result = promptInt(message);
            if (result > max || result < min) {
                System.out.println("Entry out of range: " + min + " - " + max + ". Try again.");
            }
            else {
                isValid = true;
            }
        }
        return result;
    }


}