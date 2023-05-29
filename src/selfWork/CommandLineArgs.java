package selfWork;

import java.time.LocalDateTime;
import java.util.Arrays;

public class CommandLineArgs {
    public static void main(String[] args) {
        if(args.length >0){
            System.out.println("The following args ");
            System.out.println(Arrays.toString(args));
            System.out.println(args.length);
        }else {
            System.out.println("0 args");
        }


    }
}
