public class sort{

   public static void main(String[] args){


    int[] numbers = new int[]{5,8,6,4,7}; // 4, 5, 6, 7, 8
    int len = numbers.length;

    // for sorting
    for(int i=0; i<len; i++){      
                
         for(int j=i+1; j<len; j++){    
                       
             if(numbers[i]>numbers[j]){   
               int temp = numbers[i];   
               numbers[i] = numbers[j];   
               numbers[j] = temp; 
             } 

         }

    }

    // print the sorted array values
    for(int i=0; i<len; i++){
      System.out.print(numbers[i] +" ");
    }

    System.out.println("");

   // print 2nd min and max value from the array
    System.out.println("second minimum value is : " + numbers[1]);
    System.out.println("second maximum value is : " + numbers[len-2]);  //5-2



   }
}