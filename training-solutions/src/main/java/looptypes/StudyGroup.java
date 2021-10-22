package looptypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudyGroup {
    public void  printStudyGroups(List<String> students){
        List<String> group1 = new ArrayList<>();
        List<String> group2 = new ArrayList<>();

        for (String s:students) {
            if(s.length()>10){
                group2.add(s);
            }
            else{
                group1.add(s);
            }
        }
        System.out.println("Az 1. cssoport tagjai:");
        System.out.println(group1.toString());
        System.out.println("Az 2. cssoport tagjai:");
        System.out.println(group2.toString());
    }
    public static void main(String[] args) {
        String[] studentsArray={"Kis Pál","Kis Anasztázia","Bartók Eszter","Somogyi Viktória",
                "Hon János","Ott géza", "Nagy Imre","Dolgos Dorottya","Buzás Árpád","Sas Tamás","Gál Márk"};
        List<String> students = new ArrayList<>(Arrays.asList(studentsArray));
        StudyGroup studyGroup=new StudyGroup();
        studyGroup.printStudyGroups(students);
    }
}
