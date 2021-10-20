package classstructuremethods;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();
        client.setName("Zoltán");
        client.setYear(1999);
        client.setAddress("1000 Budapest, Kiss utca 1");
        System.out.println("Your name: "+client.getName());
        System.out.println("Your year of birth: "+client.getYear());
        System.out.println("Your address: "+client.getAddress());
        client.migrate("1001 Budapest, Nagy utca 2");
        System.out.println("Your new address: "+client.getAddress());
    }
}
