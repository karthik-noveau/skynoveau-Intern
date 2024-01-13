import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args){
        // palindrome
        // 121 == 121
        // 131 == 131
        // 124 == 421

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number");
        // int num = sc.nextInt();
        
        int num = 124 ;
        int temp = num;  // 124
        int result = 0;  // 

        while(temp>0){ // 1 > 0
            int rem = temp % 10 ; // 1
            result = result*10 + rem ; //  
            temp = temp /10;  
        }



    }
} 