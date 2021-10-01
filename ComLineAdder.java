import java.util.*;

public class ComLineAdder {
    public static void main(String[] args) {
        int sum = 0;
        ArrayList<Integer> valuesArray = new ArrayList<>();
        for(int ndx = 0; ndx < args.length; ndx++) {
            try {
                sum += Integer.parseInt(args[ndx]);
                valuesArray.add(Integer.parseInt(args[ndx]));
            } catch (Exception e) {
                System.out.printf("Couldn't convert %s\n",args[ndx]);
            }
        }
        int average = sum / valuesArray.size();
        System.out.printf("Average of %d values is: %,d\n",valuesArray.size(),average);
    }
}