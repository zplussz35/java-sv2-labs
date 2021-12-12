package methodoverloading.classfivea;

public enum Number {

    ONE(0),TWO(1),THREE(2);
    private int value;
    private Number(int value){
        this.value=value;
    }

    public int getValue() {
        return value;
    }
}
