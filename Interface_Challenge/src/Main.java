import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        Player Gaurav = new Player("Gaurav", 20, 25);
        System.out.println(Gaurav.toString());

        saveObject(Gaurav);

        Gaurav.setHitPoints(60);
        System.out.println(Gaurav);

        Gaurav.setStrength(35);
        System.out.println(Gaurav);

        Gaurav.setWeapon("Gun");
        saveObject(Gaurav);

        // loadObjects(Gaurav);

        System.out.println(Gaurav);

        ISaveable wolf = new Monster("Wolf", 100, 97);
        System.out.println("Strength= "+((Monster) wolf).getStrength());
        System.out.println(wolf.toString());
        saveObject(wolf);
    }

    public static ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList<String>();
        boolean quit= false;
        int index= 0;
        System.out.println("Choose \n"+
                        "1 to enter a string \n"+
                        "0 to quit.");
        while(!quit){
            System.out.println("Choose an option: ");
            int choice= scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 0:
                    quit= true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput= scanner.nextLine();
                    values.add(index,stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISaveable objectToSave){
        for(int i=0;i<objectToSave.write().size();i++){
            System.out.println("Saving "+ objectToSave.write().get(i) +" to storage device.");
        }
    }

    public static void loadObjects(ISaveable objectToLoad){
        ArrayList<String> load = readValues();
        objectToLoad.read(load);
    }
}
