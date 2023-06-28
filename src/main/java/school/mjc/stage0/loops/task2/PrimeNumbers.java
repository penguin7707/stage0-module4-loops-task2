package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int a=3;
        int b=0;
        if(printToInclusive>=2) System.out.println(2);
        while (a<=printToInclusive){
            for(int i=2;i<a;i++){
                if(a%i==0) {
                    b=0;
                    break;
                }
                b=1;
            }
            if (b==1){
                System.out.println(a);
            }
            a++;
            b=0;
        }
    }
}
