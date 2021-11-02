package stringmethods.filename;

import java.util.Locale;
import java.util.Scanner;

public class FileNameManipulator {
    public  char findLastCharacter(String str) throws Exception {
        String str2=str.trim();
        if(!str2.contains("."))
            throw new Exception("Nem egy fájlnév, mert hiányzik a pont és kiterjesztés!");
        return str2.charAt(str2.length()-1);
    }
    public String findFileExtension(String str) throws Exception {
        String str2=str.trim();
        if(!str2.contains("."))
            throw new Exception("Nem egy fájlnév, mert hiányzik a pont és kiterjesztés!");
        return str2.substring(str2.indexOf('.')+1,str2.length()).toLowerCase();
    }

    public boolean identifyFilesByExtension(String ext,String fileName) throws Exception {
        return findFileExtension(fileName).equalsIgnoreCase(ext.trim());
    }
    public boolean compareFilesByName(String searchedFileName,String actualFileName){
        return searchedFileName.trim().equals(actualFileName.trim());
    }
    public String changeExtensionToLowerCase(String fileName) throws Exception {
        String file=fileName.trim();
        String solution=file.substring(0,file.indexOf('.')+1)+findFileExtension(file).toLowerCase();
        return solution;
    }
    public String replaceStringPart(String fileName, String present, String target){
        if(!fileName.trim().contains(present.trim())){
            return "HIBA!: cserélendő szövegrész nincs a fájlnévben!";
        }
        String solution=fileName.trim().replace(present.trim(),target.trim());

        return  solution;
    }

    public static void main(String[] args) throws Exception {
        try{
            Scanner sc = new Scanner(System.in);
            FileNameManipulator f = new FileNameManipulator();
            System.out.print("adja meg a fájl nevét kiterjesztéssel: ");
            String fileName=sc.nextLine();
            System.out.println("Az utolsó karakter: "+f.findLastCharacter(fileName));
            System.out.println("A kiterjesztés: "+f.findFileExtension(fileName));
            System.out.println("TXT fájl? "+f.identifyFilesByExtension("TXT",fileName));
            System.out.print("Adjon meg még egy fájlnevet: ");
            String fileName2=sc.nextLine();
            System.out.println("Ugyanaz a fájl az előzővel?: "+f.compareFilesByName(fileName,fileName2));

            System.out.println("A kiterjesztés kisbetűsítése: "+f.changeExtensionToLowerCase(fileName2));

            System.out.print("Adja meg melyik fájlt szeretné átnevezni?: ");
            String fileName3=sc.nextLine();
            System.out.print("Adja meg melyik részét szeretné kicserélni: ");
            String present=sc.nextLine();
            System.out.print("Adja meg mire szeretné kicserélni: ");
            String target=sc.nextLine();
            System.out.println("Az új fájlnév: "+f.replaceStringPart(fileName3,present,target));
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}
