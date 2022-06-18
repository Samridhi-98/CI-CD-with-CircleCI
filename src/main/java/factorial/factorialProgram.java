package factorial;

public class factorialProgram {
    public long calculateFactorial(long num) {
        if(num==0 || num==1)
            return 1;
        long fact=1;
        for(long idx=2;idx<=num;idx++){
            fact*=idx;
        }
        return fact;
    }
}
