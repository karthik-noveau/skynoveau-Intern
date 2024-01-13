public class PrimeNum{
    public static void main(String[] args){
        // prime number
        // 5

        int a = 4;
        int count = 0; // 2
                     // 5<= 4
        for(int i=2; i<=a; i++){ // 
            if( a % i == 0 ){  // 4/2, 4/3, 4/4 
                count = count+1;  // 2
            }
        }

        if(count == 1){
            System.out.println(a + " is the Prime number");
        }
        else{
            System.out.println(a + " is not a prime number");
        }



    }
}