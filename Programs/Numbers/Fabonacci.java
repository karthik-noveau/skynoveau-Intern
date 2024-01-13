public class Fabonacci{
    public static void main(String[] args){

        // Fabonacci 0+1+2+3+4
        // 
         int a=0;// 3
         int b=1; // 5
         int c =0;
        
        for(int i = 0; i<=4; i++){
            c = a+b;
            a=b;
            b=c;
        } // 1025

    

      System.out.println("Fabonacci is : " + (c) );

    }
}