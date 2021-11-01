package enumtype.solarsystem;

public enum SolarSystem {
    MERKUR(2),VENUSZ(1),FOLD(1),MARS(3),JUPITER(14),
    SZATURNUSZ(16),URANUSZ(5),NEPTUNUSZ(7),PLUTO(8);

    private int holdDb;

    SolarSystem(int holdDb){
        this.holdDb=holdDb;
    }

    public int getHoldDb() {
        return holdDb;
    }
}
