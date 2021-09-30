import java.util.*;

public class ComLineAdder {
    static Scanner keyb = new Scanner(System.in);
    public static void main(String[] args) {
        if(args.length < 1){
            System.err.println("Must enter number on command line");
        }
        int sum = 0;
        List<Integer> listOfNums = new ArrayList<>();

        for(int ndx = 0; ndx < args.length; ndx++) {
            try{
                int num = Integer.parseInt(args[ndx]);
                listOfNums.add(num);
            }catch(Exception e){
                System.err.printf("Cannot convert %s\n", args[ndx]);
            }
        }
        System.out.println("This is the list" + listOfNums);
         
        for(int number: listOfNums){
                 sum += number;
             }

        double mean = sum / listOfNums.size();// calculates average
        System.out.printf("Sum of %d values is: %,d\n",args.length,sum);
        System.out.printf("Average of values is: %,.2f\n",mean);
    }// main
}// class

 