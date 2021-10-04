import java.util.*;

public class ComLineAdder {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        ArrayList<Integer> numValues = new ArrayList<>();
        for(int ndx = 0; ndx < args.length; ndx++) {
            try {
                sum += Integer.parseInt(args[ndx]);
                count++;
                numValues.add(Integer.parseInt(args[ndx]));
            } catch (Exception e) {
                System.out.printf("Couldn't convert %s\n",args[ndx]);
            }       
        }
        System.out.printf("%d arguments, sum of %d values is: %,d\n",args.length,count,sum);
        int avg = sum / numValues.size();
        System.out.printf("The average of %d values is: %,d\n", numValues.size(), avg);
    }
}