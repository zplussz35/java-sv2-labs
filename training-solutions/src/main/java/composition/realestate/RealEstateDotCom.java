package composition.realestate;

public class RealEstateDotCom {
    public static void main(String[] args) {
        Address address = new Address("Debrecen","DE","Kárpát út",16);
        Details details= new Details("Nyugodt környék.",address,150,50);
        RealEstate realEstate= new RealEstate("Bungaló",210_000.50,details);

        System.out.println(realEstate.toString());

        realEstate.setDetails(new Details("Belváros",
                            new Address("Budapest","Bp","Nagy út 2.",17),
                            200,80));

        System.out.println(realEstate.toString());
    }
}
