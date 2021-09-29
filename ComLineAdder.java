public class ComLineAdder {
    public static void main(String[] args) {
        int sum = 0;
        for(int ndx = 0; ndx < args.length; ndx++) {
            sum += Integer.parseInt(args[ndx]);
        }
        System.out.printf("Sum of %d values is: %,d\n",args.length,sum);
    }
}