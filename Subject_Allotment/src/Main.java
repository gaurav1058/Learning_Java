import java.util.Scanner;

public class Main {

    private static Student currentSemSubject = new Student(10);

    private static PreviousSem prevSemSubject = new PreviousSem();

    private static Scanner scanner= new Scanner(System.in); 

    public static void main(String[] args) {

        prevSemSubject.setSubjects("Yoga");
        prevSemSubject.setSubjects("Dance");
        prevSemSubject.setSubjects("Cricket");
        prevSemSubject.setSubjects("Football");
        prevSemSubject.setSubjects("C++");
        prevSemSubject.setSubjects("Java");

        printAvailableSubjects();

        boolean quit = false;
        while(quit == false){
            System.out.println("Choose the number to add elective.");
            Integer k = scanner.nextInt();
            scanner.nextLine();
            switch(k){

                case 1:
                    currentSemSubject.setSubjects("Python");
                    break;

                case 2:
                    currentSemSubject.setSubjects("C++");
                    break;

                case 3:
                    currentSemSubject.setSubjects("Java");
                    break;

                case 4:
                    currentSemSubject.setSubjects("Go lang");
                    break;

                case 5:
                    currentSemSubject.setSubjects("Java Script");
                    break;

                case 6:
                    currentSemSubject.printCurrentSemSubjects();
                    break;

                case 7:
                    prevSemSubject.printPreviousSemSubjects();    
                    break;
                case 8:
                    quit= true;
                    break;
                    
            }
        }
    }

    private static void printAvailableSubjects(){
        System.out.println("1-> Python");
        System.out.println("2-> C++");
        System.out.println("3-> Java");
        System.out.println("4-> Go lang");
        System.out.println("5-> Java Script");
        System.out.println("6-> To print the current semester subjects");
        System.out.println("7-> To print the previous semester subjects");
        System.out.println("8-> Quit");
    }
   
}
