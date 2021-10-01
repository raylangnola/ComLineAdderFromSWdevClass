public class ComLineAdder {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for(int ndx = 0; ndx < args.length; ndx++) {
            try {
                sum += Integer.parseInt(args[ndx]);
                count++;
            } catch (Exception e) {
                System.out.printf("Couldn't convert %s\n",args[ndx]);
            }       
        }
        System.out.printf("Sum of %d values is: %,d\n",args.length,count,sum);
    }
}