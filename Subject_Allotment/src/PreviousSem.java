import java.util.ArrayList;

public class PreviousSem {
    private static ArrayList <String> subjects = new ArrayList<String>();

    public static ArrayList<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(String name) {
        add(name);
    }

    private static void add(String name){
        subjects.add(name);
    }

    public void printPreviousSemSubjects(){
        PreviousSemSubjects();
    }
    
    private static void PreviousSemSubjects(){
        for(int i=0;i<subjects.size();i++){
            System.out.println( i+1 + "-> "+ subjects.get(i));
        }
    }
    
}
