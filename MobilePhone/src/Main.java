import java.util.Scanner;

public class Main {

    private static Scanner scanner =new Scanner(System.in);
    private static MobilePhone mobilePhone =new MobilePhone("9670 114677");
    public static void main(String[] args) {
        boolean quit=false;
        startPhone();
        while(!quit){
            System.out.println("Enter options: (6 to show the available options)");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action){
                case 0:
                    System.out.println("power off.....");
                    quit=true;
                    break;

                case 1:
                    mobilePhone.printContact();
                    break;

                case 2:
                    addNewContact();
                    break;

                case 3:
                    updateContact();
                    break;

                case 4:
                    removeContact();
                    break;

                case 5:
                    queryContact();
                    break;

                case 6:
                    printActions();
                    break;
            }              
        }
    }

    private static void startPhone(){
        System.out.println("Phone is starting......");
    }

    private static void printActions(){
        System.out.println("Available options:\n " +
                            "Press");
        System.out.println("0 -> To shut down:-");
        System.out.println("1 -> To print contact:-");
        System.out.println("2 -> To add new contact:-");
        System.out.println("3 -> To update the existing contact:-");
        System.out.println("4 -> To remove the existing contact:-");
        System.out.println("5 -> Query if the existing contact exist:-");
        System.out.println("6 -> Options Available:-");
    } 

    private static void addNewContact(){
        System.out.println("Enter new contact name: ");
        String name= scanner.nextLine();
        System.out.println("Enter new phone number: ");
        String phone= scanner.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        if(mobilePhone.addNewContact(newContact)){
            System.out.println("New contact added : name= "+ name+" phone number= "+ phone);
        }
        else{
            System.out.println("contact "+ name+" already exists");
        }
    }   

    private static void updateContact(){
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        System.out.print("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter new contact phone number: ");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }
        if(mobilePhone.updateContact(existingContactRecord, newContact)) {
            System.out.println("Successfully updated record");
        } else {
            System.out.println("Error updating record.");
        }
    }
    private static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }

        if(mobilePhone.removeContact(existingContactRecord)) {
            System.out.println("Successfully deleted");
        } else {
            System.out.println("Error deleting contact");
        }
    }

    private static void queryContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }

        System.out.println("Name: " + existingContactRecord.getName() + " phone number is"
        + existingContactRecord.getPhoneNumber());
    }
    
}