public class Factorial{
    public static void main(String[] args){
        // Factorial 47! = 4*3*2*1 = 24
        // 1+2+3+4+5 -> sum of N numbers
       
        int a =4;

        int b=1;
        for(int i=a ; i>=1 ; i--){
             b = b*i;
        }

        System.out.println(b);
        
    }
} 