import java.util.*;

public class ComLineAdder {
    public static void main(String[] args) {
        int sum = 0;
        List<Integer> total = new ArrayList<>();
        for(int ndx = 0; ndx < args.length; ndx++) {
            try {
                total.add(Integer.parseInt(args[ndx]));
            } catch (Exception e) {
                System.out.printf("Couldn't convert %s\n",args[ndx]);
            }       
        }
        for(int num : total){
                   sum += num;
               }
        System.out.printf("Sum of %d values is: %,d\n",args.length,sum);
    }
}