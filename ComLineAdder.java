public class ComLineAdder {
    public static void main(String[] args) {
        if(args.length < 1){
            System.err.println("Must enter number on command line");
        }
        int sum = 0;
        for(int ndx = 0; ndx < args.length; ndx++) {
            try{
               sum += Integer.parseInt(args[ndx]); 
            }catch(Exception e){
                System.err.printf("Cannot convert %s\n", args[ndx]);
            }
            
        }
        System.out.printf("Sum of %d values is: %,d\n",args.length,sum);
    }
}