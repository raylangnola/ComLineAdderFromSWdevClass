import java.util.*;

public class ComLineAdder {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Enter at least 1 argument.");
            System.exit(0);
        }
        int sum = 0;
        for(int ndx = 0; ndx < args.length; ndx++) {
            try {
                sum += Integer.parseInt(args[ndx]);
            } catch (Exception e) {
                System.out.printf("Couldn't convert %s\n",args[ndx]);
            }
        }
        System.out.printf("Sum of %d values is: %d\n",args.length,sum);
        
        // Assignment requires using an array for at least 1 function, so another for loop will be used even though the same loop can be used to compute the sum
        List<Double> values = new ArrayList<>();
        for(int ndx = 0; ndx < args.length; ndx++) {
            try {
                values.add(Double.parseDouble(args[ndx]));
            } catch (Exception e) {
                System.out.printf("Couldn't convert %s\n", args[ndx]);
            }
        }

        // Calculate and print average
        double doubleSum = values.stream().mapToDouble(Double::doubleValue).sum();
        double average = doubleSum / args.length;
        System.out.printf("Average of all the values is: %,.2f\n", average);
        
        // List sorter
        values.stream().sorted().forEach(System.out::println);
    }
}