import java.util.ArrayList;

public class ComLineAdder {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        double average = 0;
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int ndx = 0; ndx < args.length; ndx++) {
            try {
                numbers.add(Integer.parseInt(args[ndx]));
                count++;  
            } catch (Exception e) {
                System.out.printf("Couldn't convert %s\n",args[ndx]);
            }   
        }
        for(int j = 0; j < numbers.size(); j++){
            sum += numbers.get(j);
            average = sum/numbers.size();
        }
        System.out.printf("%d arguments, %1.2f average, sum of %d values is: %,d\n",args.length,average,count,sum);
    }
}