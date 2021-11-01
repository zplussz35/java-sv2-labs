package typeconversion;

public class Conversion {
    public double convertDoubleToDouble(double num){
        int i=(int)num;
        double d = i;
        return d;
    }

    public byte[] convertIntArrayToByteArray(int[] nums){
        byte[] bytes=new byte[nums.length];
        for(int i=0;i< nums.length;i++){
            if(nums[i]>=0&&nums[i]<=127){
                bytes[i]=(byte)nums[i];
            }
            else{
                bytes[i]=-1;
            }
        }
        return bytes;
    }
    public int getFirstDecimal(double num){
        int num2=(int)num;
        int result=(int)((num-num2)*10);
        return result;
    }
}
