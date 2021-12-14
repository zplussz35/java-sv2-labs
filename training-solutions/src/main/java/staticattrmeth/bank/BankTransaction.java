package staticattrmeth.bank;

public class BankTransaction {
    private static final long MIN_TRANSACTION_VALUE=1;
    private static final long MAX_TRANSACTION_VALUE=10_000_000;
    private static long countOfTransactions=0;
    private static long sumOfTransactions=0;
    private static long currentMinValue=MAX_TRANSACTION_VALUE;
    private static long currentMaxValue=MIN_TRANSACTION_VALUE;

    private long transactionValue;

    public BankTransaction(long transactionValue){
        if(transactionValue<MIN_TRANSACTION_VALUE || transactionValue>MAX_TRANSACTION_VALUE){
            throw new IllegalArgumentException("This transaction cannot be accepted! "+transactionValue);
        }
        this.transactionValue=transactionValue;
        countOfTransactions++;
        sumOfTransactions+=transactionValue;
        if(transactionValue>currentMaxValue){
            currentMaxValue=transactionValue;
        }
        if (transactionValue<currentMinValue){
            currentMinValue=transactionValue;
        }
    }

    public static void initTheDay(){
        countOfTransactions = 0;
        sumOfTransactions = 0;
        currentMinValue = MAX_TRANSACTION_VALUE;
        currentMaxValue = MIN_TRANSACTION_VALUE;
    }
    public static long getAverageOfTransaction(){
        if(countOfTransactions==0){
            return 0;
        }
        return sumOfTransactions/countOfTransactions;

    }
    public static long getCurrentMinValue(){
        if(countOfTransactions==0){
            return 0;
        }
        return currentMinValue;
    }
    public static long getCurrentMaxValue(){
        if(countOfTransactions==0){
            return 0;
        }
        return currentMaxValue;

    }
    public static long getSumOfTransactions(){
        return sumOfTransactions;
    }
    public long getTransactionValue(){
        return transactionValue;
    }
}
