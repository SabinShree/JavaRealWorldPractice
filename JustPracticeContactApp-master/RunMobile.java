package BankingAPp.ArrayListChallenge;

import java.util.Scanner;

public class RunMobile {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("9815012345");

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        System.out.println(startPhone());
        availableActions();

        while (!quit) {
            System.out.println("Enter action: (6 to show available actions)");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    addNewContacts();
                    break;
                case 2:
                    removeContacts();
                    break;
                case 3:
                    updateContacts();
                    break;
                case 4:
                    searchContacts();
                    break;
                case 5:
                    mobilePhone.printContact();
                    break;
                case 6:
                    availableActions();
                    break;
                case 7:
                    System.out.println("Phone is shutting down...");
                    quit = true;
            }

        }

    }

    public static void addNewContacts() {
        System.out.println("Enter a contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter a contact number: ");
        String phoneNumber = scanner.nextLine();
        Contact contact = Contact.addNewContact(name, phoneNumber);
        if (mobilePhone.addContact(contact)) {
            System.out.println("Successfully added Name: " + name + ", Phone number: " + phoneNumber);
        } else {
            System.out.println("Already on file.");
        }
    }

    public static void removeContacts() {
        System.out.println("Enter a existing contact name: ");
        String existingContactName = scanner.nextLine();
        Contact contact = mobilePhone.queryContact(existingContactName);
        if (contact != null) {
            mobilePhone.removeContact(contact);
        } else {
            System.out.println("Error in deleting... ");
        }
    }

    public static void updateContacts() {
        System.out.println("Enter a existing contact name:");
        String existingContact = scanner.nextLine();
        Contact existingContactName = mobilePhone.queryContact(existingContact);
        if (existingContactName == null) {
            System.out.println("Not found in our contacts. ");
        } else {
            System.out.println("Enter a new contact name:");
            String newContact = scanner.nextLine();
            System.out.println("Enter a new phone Number");
            String newPhoneNumber = scanner.nextLine();
            Contact newContactName = Contact.addNewContact(newContact, newPhoneNumber);
            if (mobilePhone.updateContact(existingContactName, newContactName)) {
                System.out.println("Contact " + existingContactName.getName() + " , is replaced with " + newContactName.getName());
            } else {
                System.out.println("Error");
            }
        }
    }

    public static void searchContacts() {
        System.out.println("Enter a contact Name");
        String name = scanner.nextLine();

        Contact contact = mobilePhone.queryContact(name);
        if (contact == null) {
            System.out.println("Not in our file.");
        } else {
            System.out.println("Contact name: " + contact.getName() + " is found");
        }
    }

    public static void availableActions() {
        System.out.println("Provided a action: ");
        System.out.println("\t 1. To Add the contact list.");
        System.out.println("\t 2. To remove the contact list. ");
        System.out.println("\t 3. To update the contact list.");
        System.out.println("\t 4. To search the contact list. ");
        System.out.println("\t 5. To print the available contact list.");
        System.out.println("\t 6. To print the available actions.");
        System.out.println("\t 7. To exit the contact app.");
        System.out.println("Enter a actions: ");
    }

    private static String startPhone() {

        return "Phone is started";
    }
}
