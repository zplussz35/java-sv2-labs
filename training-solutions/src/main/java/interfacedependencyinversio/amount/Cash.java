package interfacedependencyinversio.amount;

public class Cash implements Payable{

    @Override
    public int getPayableAmount(int amount) {
        char lastDigit=String.valueOf(amount).toCharArray()[String.valueOf(amount).length()-1];
        return switch (lastDigit) {
            case '0', '5' -> amount;
            case '1', '6' -> amount - 1;
            case '2', '7' -> amount - 2;
            case '3', '8' -> amount + 2;
            case '4', '9' -> amount + 1;
            default -> 0;
        };
    }
}
