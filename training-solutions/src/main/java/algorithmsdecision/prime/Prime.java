package algorithmsdecision.prime;

public class Prime {
    public boolean isPrime(int number){
        if(number<2){
            return false;
        }
        if(number==2){
            return true;
        }
        for (int i =3; i <Math.sqrt(number) ; i++) {
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
}
