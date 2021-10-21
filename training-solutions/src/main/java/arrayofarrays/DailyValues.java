package arrayofarrays;

public class DailyValues {
    public int[][] getValues(){
        int[][] a = new int[12][];
        for (int i = 0; i < a.length; i++) {
            if(i<7){
                if(i%2==0){

                    a[i]=new int[31];
                }
                else{
                    if(i==1){
                        a[i]= new int[28];
                    }
                    else{
                        a[i]=new int[30];
                    }

                }
            }
            else{
                if(i%2==0){
                    a[i]=new int[30];
                }
                else{
                    a[i]=new int[31];
                }
            }

        }
        return a;
    }

    public static void main(String[] args) {
        DailyValues d = new DailyValues();
        int[][] a = d.getValues();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.print(a[i].length);
            System.out.println();
        }


    }
}
