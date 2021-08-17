import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Person newPerson = new Person(2);
    private static Elevator elevator = new Elevator(1);
    public static void main(String[] args) {
        boolean quit = false;
        System.out.println("Elevator at floor 0 , with both the elevator and the floor doors opened.");
        availableOptions();
        while(!quit){
            int action;
            action = scanner.nextInt();
            scanner.nextLine();
            switch(action){
                case 0: 
                    exit();
                    quit = true;
                    break;
                case 1:
                    newMan();
                    break;
                case 2:
                    elevatorCall();
                    break;
                case 3:
                    lastFloor();
                    break;
                case 5:
                    availableOptions();
                    break;
                case 4: 
                    printStats();
                    break;
            }
        }        
    }

    private static void printStats(){
        Elevator elevator = new Elevator(1);
        System.out.println("Elevator at floor"+  elevator.floor() + " , with both the elevator and the floor doors opened.");
    }

    private static void newMan(){
        System.out.println("Enter on which floor the man is:- ");
        int floor= scanner.nextInt();
        scanner.nextLine();
        newPerson.changePresonFloor(floor);
        System.out.println("The person is standing on the "+ newPerson.getPersonFloor()+ " floor.");
    }

    private static void availableOptions(){
        System.out.println("Options available are:- ");
        System.out.println("0 -> to exit the process.");
        System.out.println("1 -> Position of the man.");
        System.out.println("2 -> Calling the elevator to its floor(always after the 1st process and before 3rd.)");
        System.out.println("3 -> enter final floor.");
        System.out.println("4 -> to know the position of elevator.");
        System.out.println("5 -> to know the available options.");
    }

    private static void elevatorCall(){
        if(elevator.floor() == newPerson.getPersonFloor()){
            System.out.println("No need to press the floor button, elevator is on "+ elevator.floor() +" lights on....");
        }
        else{
            elevator.change(newPerson.getPersonFloor());
            System.out.println("elevator comming to "+ newPerson.getPersonFloor() +" floor with geeeeeee.. sound.");
        }
    }

    private static void exit(){
        Elevator elevator = new Elevator(1);
        elevator.reset();
    }
    
    private static void lastFloor(){
        System.out.println("Enter the final floor:- ");
        int k=scanner.nextInt();
        scanner.nextLine();
        System.out.println("click sound....");
        if(k==newPerson.getPersonFloor())
            System.out.println("same floor");
        else{
            System.out.println("Going to final "+ k+" floor, "+ newPerson.getPersonFloor()+" floor door closed." );
            elevator.change(k);
        }
    }
}
