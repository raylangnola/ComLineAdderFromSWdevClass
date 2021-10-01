import java.util.*;
public class ComLineAdder {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        List<Integer> intAmount = new ArrayList<Integer>();
        
        for(int ndx = 0; ndx < args.length; ndx++) {
            try {
                sum += Integer.parseInt(args[ndx]);
                int i = Integer.parseInt(args[ndx]);
                intAmount.add(i);
                 count++;
            } catch (Exception e) {
                System.out.printf("Couldn't convert %s\n",args[ndx]);
                
            }  
        }
        for (int i: intAmount){
            sum += i;
        }
        System.out.printf("%d arguments, sum of %d values is: %,d\n",args.length,count,sum);
    }
}

