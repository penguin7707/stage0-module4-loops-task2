package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        double a=0;
        while (a<=power){
            System.out.println((int)Math.pow(2,a));
            a++;
        }
    }
}
