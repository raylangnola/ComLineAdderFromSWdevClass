public class ComLineAdder {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        double average = 0;
        for(int ndx = 0; ndx < args.length; ndx++) {
            try {
                sum += Integer.parseInt(args[ndx]);
                count++;
            } catch (Exception e) {
                System.out.printf("Couldn't convert %s\n",args[ndx]);
            }       
        }
        average = sum/count;
        System.out.printf("%d arguments, sum of %d values is: %,d, average of the values is: %s\n",args.length,count,sum,average);
    }
}