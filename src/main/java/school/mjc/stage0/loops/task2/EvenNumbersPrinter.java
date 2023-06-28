package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int first =0;
        while (first<=printTillInclusive){
            if (first==0 || first%2==0) System.out.println(first);
            first++;
        }

    }
}
