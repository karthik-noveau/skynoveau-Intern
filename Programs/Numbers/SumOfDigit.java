public class SumOfDigit{
    public static void main(String[] args){
        // sum of Digit
        // 123 = 1+2+3=6


         int num = 123; // 0
         int result = 0; //6
                //   4<=3
                
        for(int i=1; i<=3; i++){                 
            int rem = num % 10 ;// 12 % 10 = 1
            result = result +rem ; // 5+1=6
            num = num/10 ; // 12 / 10 =0
        }
        System.out.println("result "+result);
    }
}

