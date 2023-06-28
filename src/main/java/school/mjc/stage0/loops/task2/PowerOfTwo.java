package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        double a=0;
        if(power<0) System.out.print("too much power");
        else {
            while (a<=power){
                System.out.println((int)Math.pow(2,a));
                a++;
            }
        }

    }
}
