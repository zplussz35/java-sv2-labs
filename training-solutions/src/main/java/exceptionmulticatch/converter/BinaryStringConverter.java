package exceptionmulticatch.converter;

public class BinaryStringConverter {
    public boolean[] binaryStringToBooleanArray(String input) {
        if(input==null){
            throw new NullPointerException("Binary string is null.");
        }
        boolean[] result= new boolean[input.length()];
        int i=0;
        for (Character c:input.toCharArray()) {
            if(c.equals('1')){
                result[i]=true;
            }
            else if(c.equals('0')){
                result[i]=false;
            }
            else{
                throw new IllegalArgumentException("Binary string is null.");
            }
            i++;
        }
        return  result;
    }
    public String booleanArrayToBinaryString(boolean[] input){
        StringBuilder sb = new StringBuilder();
        if(input==null){
            throw new NullPointerException("input is Null!");
        }
        if(input.length==0){
            throw new  IllegalArgumentException("input is null!");
        }
        for (boolean b:input) {
            sb.append(b?"1":"0");
        }
        return sb.toString();
    }
}
