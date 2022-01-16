package exceptionmulticatch.converter;

public class AnswerStat {
    private BinaryStringConverter binaryStringConverter;

    public AnswerStat(BinaryStringConverter binaryStringConverter) {
        this.binaryStringConverter=binaryStringConverter;
    }

    public boolean[] convert(String input){
        try{
            return binaryStringConverter.binaryStringToBooleanArray(input);
        }catch (NullPointerException | IllegalArgumentException ex){
            throw new InvalidBinaryStringException("Error",ex);
        }
    }

    public int answerTruePercent(String answers){
        boolean[] input=binaryStringConverter.binaryStringToBooleanArray(answers);
        int trueCount=0;
        for (boolean b:input) {
            if(b){
                trueCount++;
            }
        }
        return (int)Math.round(trueCount*1.0/input.length*100);
    }
}
