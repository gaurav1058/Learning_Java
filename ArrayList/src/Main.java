import java.util.Scanner;

public class Main {
    private static Scanner scanner =new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
    public static void main(String[] args) throws Exception {
        // ArrayList: Resizabe- array implementation os the list interface. 
        // Implement all the optional list operations, and permit all elements, including null. 
        // IN addition to implement the list interface,
        // this class provides methods to manipulate the size of the array that is used 
        // internally to store the list.
        // This class is roughly equivalent to Vectors, except that it 
        // is unsynchronized.

        boolean quit = false;
        int choice =0;
        printInstruction();
        while(!quit){
            System.out.println("Enter your choice: ");
            choice= scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 0:
                    printInstruction();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    quit= true;
                    break;
            }
        }
    }
    public static void printInstruction() {
        System.out.println("\t press");
        System.out.println("\t 0 to print instruction");
        System.out.println("\t 1 to print the list");
        System.out.println("\t 2 to add an item in the list");
        System.out.println("\t 3 to modify an item in the list");
        System.out.println("\t 4 to remove an item in the list");
        System.out.println("\t 5 to search an item in the list");
        System.out.println("\t 6 to quit the process");
    }   
    public static void addItem(){
        System.out.println("enter the item to add in the list");
        String s= scanner.nextLine();
        groceryList.addGroceryItems(s);
    }
    public static void modifyItem(){
        System.out.println("enter the item number: ");
        int itemNo= scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the replacement item: ");
        String s=scanner.nextLine();
        groceryList.modifyGroceryList(itemNo-1,s);
    }
    public static void removeItem() {
        System.out.println("enter the position of the item: ");
        int itemNo= scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryList(itemNo-1);
    }
    public static void searchItem(){
        System.out.println("Enter the item to search: ");
        String s=scanner.nextLine();;
        if(groceryList.findItem(s)!=null){
            System.out.println("item found");
        }
        else{
            System.out.println("item not found");
        }
    }
}
