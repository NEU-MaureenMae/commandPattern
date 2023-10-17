package src;

import java.util.Scanner;

public class ViewerApp {
    public static void main(String[] args) {

        // Create instances of devices
        Light light = new Light();
        MusicPlayer musicPlayer = new MusicPlayer();
        Thermostat thermostat = new Thermostat();

        // Create a remote control
        RemoteControl remoteControl = new RemoteControl();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Available devices:");
            System.out.println("1. Light");
            System.out.println("2. Music Player");
            System.out.println("3. Thermostat");
            System.out.println("4. Exit");

            System.out.print("Enter the device you want to control: ");
            int choice = scanner.nextInt();

            if (choice == 4) {
                System.out.println("\n3BSCS2 | Maureen-Mae B. Sebastian");
                break;
            }

            Device selectedDevice = null;

            switch (choice) {
                case 1:
                    selectedDevice = light;
                    break;
                case 2:
                    selectedDevice = musicPlayer;
                    break;
                case 3:
                    selectedDevice = thermostat;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid number.");
            }

            if (selectedDevice != null) {
                System.out.println("--Selected " + selectedDevice.getType()+ "--");

                boolean continueActions = true;
                while (continueActions) {
                    System.out.println("1. Turn On");
                    System.out.println("2. Turn Off");
                    System.out.println("3. Increase");
                    System.out.println("4. Decrease");
                    System.out.println("5. Get Status");
                    System.out.println("6. Go back to main menu");

                    System.out.print("Enter you want to perform: ");
                    int actionChoice = scanner.nextInt();

                    switch (actionChoice) {
                        case 1:
                            remoteControl.setCommand(new TurnOn(selectedDevice));
                            remoteControl.clickButton();
                            break;
                        case 2:
                            remoteControl.setCommand(new TurnOff(selectedDevice));
                            remoteControl.clickButton();
                            break;
                        case 3:
                            remoteControl.setCommand(new Increase(selectedDevice));
                            remoteControl.clickButton();
                            break;
                        case 4:
                            remoteControl.setCommand(new Decrease(selectedDevice));
                            remoteControl.clickButton();
                            break;
                        case 5:
                            remoteControl.setCommand(new Status(selectedDevice));
                            remoteControl.clickButton();
                            break;
                        case 6:
                            continueActions = false;  // Go back to the main menu
                            break;
                        default:
                            System.out.println("Invalid action. Please enter a valid number.");
                    }
                }
            }
        }
    }
}
