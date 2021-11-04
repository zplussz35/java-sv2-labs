package formatlocaleprintf;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Run {
    private String name;
    private List<Double> kms;

    public Run(String name){
        this.name=name;
        this.kms= new ArrayList<>();
    }

    public void addRun(double km){
        this.kms.add(km);
    }
    public String printFormattedRunText(){
        String dateNow=LocalDate.now().toString();
        String s=String.format("Kedves %s! A mai dátum: %s. "+
                "Ezen a héten ez a(z) %d. futásod. Most %.1f-t futottál. Csak így tovább!",
                this.name, dateNow,kms.size(),this.kms.get(kms.size()-1));
        return s;
    }

    public static void main(String[] args) {
        Run run = new Run("Zoltán");
        run.addRun(1.23);
        System.out.println(run.printFormattedRunText());
        run.addRun(2.34);
        System.out.println(run.printFormattedRunText());
        run.addRun(7.7);
        System.out.println(run.printFormattedRunText());
        run.addRun(10.55);
        System.out.println(run.printFormattedRunText());
    }
}
