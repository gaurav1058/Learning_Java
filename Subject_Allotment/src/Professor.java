public class Professor {
    public static String printProffName(String name){
        return professorName(name);
    }
    private static String professorName(String subjectName){

        if(subjectName == "Python"){
            return "Daniel Roy Greenfield";
        }

        if(subjectName == "C++"){
            return "Yashwant Kanatekar";
        }

        if(subjectName == "Java"){
            return "Tim Buchalka";
        }

        if(subjectName == "Go lang"){
            return "Ken Thompson";
        }

        if(subjectName == "Java Script"){
            return "Brendan Eich";
        }
        else
            return "null";
    }
}
