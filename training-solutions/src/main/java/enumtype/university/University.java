package enumtype.university;

public enum University {
    BME("Budapesti Műszaki és Gazdaságtudományi Egyetem"),
    DE("Debreceni Egyetem"),ELTE("Eötvös Lóránd Tudományegyetem"),
    ME("Miskolci Egyetem"),PE("Pécsi Tudományegyetem");

    private String name;
    University(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }
}
