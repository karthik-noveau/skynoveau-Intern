import java.util.Scanner;

public class Duplicate{
    public static void main(String[] args){
         

        // Run time input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array length : ");
        int len = sc.nextInt();

        int[] dup = new int[len];

        System.out.println("Enter the array values : ");
        for(int i=0 ; i<len; i++){
            dup[i]=sc.nextInt();
        }

        // manual input

        // int[] dup = new int[]{5,4,4,2,2};  // 22445
        // int len = dup.length;
        
        for(int i=0; i<len; i++){

            for(int j=i+1; j<len; j++){
                if(dup[i]==dup[j]){
                    System.out.print("duplicate value : " + dup[j]);
                }
            }

        }
    }
}