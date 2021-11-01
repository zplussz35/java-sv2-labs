package compositionlist.computer;

public class PersonalComputerMain {
    public static void main(String[] args) {
        Cpu cpu = new Cpu("AMD",1200);
        PersonalComputer personalComputer = new PersonalComputer(cpu);
        Software software= new Software("Windows 10",10.05);
        Hardware hardware = new Hardware("Mouse","GMXP-365");
        personalComputer.addSoftware(software);
        personalComputer.addHardware(hardware);

        System.out.println(personalComputer.toString());

    }
}
