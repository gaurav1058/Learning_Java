import java.util.ArrayList;

public class Student {
    private static ArrayList <String> subjects = new ArrayList<String>();
    public Integer cgpa;
    public Student(Integer cgpa) {
        this.cgpa = cgpa;
    }
    public void setSubjects(String name) {
        add(name);
    }

    public ArrayList<String> getSubjects() {
        return subjects;
    }

    public Integer getCgpa() {
        return cgpa;
    }

    public void setCgpa(Integer cgpa) {
        this.cgpa = cgpa;
    }
    
    private static void add(String newSubject){

        ArrayList<String> prev = PreviousSem.getSubjects();
        boolean temp = false;
        for( int i=0;i<prev.size();i++){
            if(prev.get(i) == newSubject){
                temp = true;
                break;
            }
        }
        if(temp== false){
            for(int i=0;i<subjects.size();i++){
                if(newSubject == subjects.get(i)){
                    temp= true;
                    break;
                }
            }
        }
        if(temp== false)
            subjects.add(newSubject);
    }

    public void printCurrentSemSubjects(){
        CurrentSemSubjects();
    }

    private static void CurrentSemSubjects(){
        for(int i=0;i<subjects.size();i++){
            System.out.println( i+1 + "-> "+ subjects.get(i)+ " and the instructur is: "+ Professor.printProffName(subjects.get(i)) );
        }
    }
    
}
