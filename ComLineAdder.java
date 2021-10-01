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
        for(int i = 0; i < numbers.size(); i++){
            sum += numbers.get(i);
            average = sum/numbers.size();
        }
        System.out.printf("%d arguments, %1.1f average, sum of %d values is: %,d\n",args.length,average,count,sum);
    }
}