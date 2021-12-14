package inheritanceconstructor.tea;

public class TeaMain {
    public static void main(String[] args) {
        Tea tea = new Tea("tea",300);
        HerbalTea herbalTea = new HerbalTea("herbal",500);

        System.out.println(tea.getName()+" "+tea.getPrice()+"\n"+
                herbalTea.getName()+" "+herbalTea.getPrice());
    }



}
