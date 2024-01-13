import java.util.Scanner;

public class PowerValue{
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter base value : ");
    int a = sc.nextInt();

    System.out.println("Enter exponent value : ");
    int b = sc.nextInt();
    // 2^3 = 2*2*2 = 8

    int result = 1;
    for(int i=1; i<=b ;i++ ){
        result = result * a;
    }

    System.out.println(" result : " + result);


    }
}