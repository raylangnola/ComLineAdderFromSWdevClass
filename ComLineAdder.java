import java.util.*;

public class ComLineAdder {
    static Scanner keyb = new Scanner(System.in);
    public static void main(String[] args) {
        if(args.length < 1){
            System.err.println("Must enter number on command line");
        }
        int sum = 0;
        //int [] totalSum = 0;
        List<Integer> listOfNums = new ArrayList<>();
        //System.out.println("These are the number: "+ numbers);
        //System.out.println("These are the args: "+ args[0]);
        
        for(int ndx = 0; ndx < args.length; ndx++) {
            try{
               //listOfNums.add(Integer.parseInt(args.get(ndx)));  // keeps printing out list at every iteration
               // index
                int num = Integer.parseInt(args[ndx]);
                listOfNums.add(num);
               
               //sum += Integer.parseInt(args[ndx]); // prints out sum
            }catch(Exception e){
                System.err.printf("Cannot convert %s\n", args[ndx]);
            }
            
       
        }
        System.out.println("This is the list" + listOfNums);
         
        for(int number: listOfNums){
                 sum += number;
             }

        //double mean = sum / listOfNums.size();// calculates average
        System.out.printf("Sum of %d values is: %,d\n",args.length,sum);
        //System.out.printf("Average of values is: %,.2f\n",mean);
    }// main
//     public void getListSum(){
        
//     }
}// class

 