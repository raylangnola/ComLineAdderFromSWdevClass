package ComLineAdderFromSWdevClass;


public class ComLineAdder {
    public static void main(String[] args) {
        Integer[] values = new Integer[args.length];
        int index = 0;
        for (String str : args){
            try{
                values[index] = Integer.parseInt(str);
                index++;
            }catch(Exception e){
                System.out.printf("Couldn't convert %s\n",args[index]);
                index -= 1;
            }
        }
        int sum = 0;
        for(int ndx = 0; ndx < values.length; ndx++) {
            if (values[ndx]==null){
                continue;
            }
            sum += values[ndx];
        }
        System.out.printf("Sum of %d values is: %,d\n",args.length,sum);
    }
}
