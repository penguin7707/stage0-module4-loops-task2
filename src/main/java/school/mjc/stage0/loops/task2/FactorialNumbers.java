package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int a=0;
        int result =1;
        while (a<=printToInclusive){
            for(int i=1;i<=a;i++){
                result=result*i;
            }
            System.out.println(result);
            result=1;
            a++;
        }
    }
}
