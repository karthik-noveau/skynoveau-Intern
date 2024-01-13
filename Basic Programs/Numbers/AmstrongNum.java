import java.util.*;
public class AmstrongNum{
    public static void main(String[] argumnents){
        // Amstrong number

        // 153 3*3*3 5*5*5 1*1*1
        //      27 +   125  + 1  = 152+1 = 153
        // 1634

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a value : ");

        int a = nextInt();

        int b = a; // 153 -> 15 -> 0
        int c = a;  // 1
        int length = 0; // 3
        int total = 0;  // 153

        // String str = Integer.toString(a); // using pre-defined methods
        // String len = str.length();  

        while(b>0){  // 0 > 0
            b = b/10 // 1/10 =0
            length = length+1 // 2
        }


        for(int i = 0; i<length ; i++  ){
            int rem = c % 10; // 1 % 10 = 1
            int mul = rem * rem *rem ; //  1
            total = total + mul ;  // 27 + 125 = 152 , 152 + 1 = 153
            c = c/10; //1
        }

        if(total == a ){
            System.out.println(a + " is the Amstrong number");
        }
        else{
            System.out.println(a + " is not a Amstrong number");
        }

    }
}