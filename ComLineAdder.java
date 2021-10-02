import java.util.*;
public class ComLineAdder {
    public static void main(String[] args) {
        int sum = 0;
        int avg = 0 ;
        int count = 0;
        for(int ndx = 0; ndx < args.length; ndx++) {
            try {
                sum += Integer.parseInt(args[ndx]);
                count++;
            } catch (Exception e) {
                System.out.printf("Couldn't convert %s\n",args[ndx]);
            }       
        }
        ArrayList <Integer> avgArray = new ArrayList <>();
        if(args.length >= 1){
            avg = sum /args.length;  
            avgArray.add(avg);
        }
        
        System.out.println("avg: " + avg);
        System.out.printf("%d arguments, sum of %d values is: %,d\n",args.length,count,sum);
    }
}