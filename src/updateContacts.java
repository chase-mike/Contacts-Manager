import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class updateContacts {
    public static int mainMenu(String[] args) {
        System.out.println("Welcome to your contacts list!");
        System.out.println("1. View contacts.");
        System.out.println("2. Add a new contact.");
        System.out.println("3. Search a contact by name.");
        System.out.println("4. Delete an existing contact.");
        System.out.println("5. Exit.");
        System.out.println("Enter an option (1, 2, 3, 4 or 5):");
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        System.out.println("You chose: " + userChoice);
        return userChoice;
    }

    public static void printList() throws Exception{
        Path contactsPath = Paths.get("src/contactsList.txt");
        List<String> contactsList = Files.readAllLines(contactsPath);
        try {
            contactsList = Files.readAllLines(contactsPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String contact : contactsList) {
            System.out.println(contact);
        }
    }
    public static void addContact() throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first name of the contact you would like to add:");
        String firstName = scanner.nextLine();
        System.out.println("Enter the last name of the contact you would like to add:");
        String lastName = scanner.nextLine();
        System.out.println("Enter the phone number of the contact you would like to add:");
        String phoneNumber = scanner.nextLine();
        Files.write(
                Paths.get("src/contactsList.txt"),
                List.of(firstName + " " + lastName + "\t" + "| " + phoneNumber),
                StandardOpenOption.APPEND
        );
    }
    public static void searchLast() throws IOException {
        System.out.println("Enter the name of the contact you would like to search for:");
        Scanner scanner = new Scanner(System.in);
        String lastName = scanner.nextLine();
        Path contactsPath = Paths.get("src/contactsList.txt");
        List<String> contactsList = Files.readAllLines(contactsPath);
        try {
            contactsList = Files.readAllLines(contactsPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String s : contactsList) {
            if (s.contains(lastName)) {
                System.out.println(s);
            }
        }
    }
    public static void deleteContact() throws IOException {
        System.out.println("Enter the name or number of the contact you would like to delete:");
        Scanner scanner = new Scanner(System.in);
        String info = scanner.nextLine();
        Path contactsPath = Paths.get("src/contactsList.txt");
        List<String> contactsList = Files.readAllLines(contactsPath);
        try {
            contactsList = Files.readAllLines(contactsPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String s : contactsList) {
            if (s.contains(info)) {
                contactsList.remove(s);
                System.out.println("Contact deleted!");
                break;
            }
        }
        Files.write(
                contactsPath,
                contactsList
        );
    }

    private static Collection<Object> contactsList(int i) {
        return null;
    }


    public static void exit(){
        System.out.println("Exiting...Goodbye!");
        System.exit(0);
    }



}
