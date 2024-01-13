public class Reverse{
    public static void main(String[] arguments){

        int[] Arr = new int[]{1,3,1,4,1};
        int len = Arr.length;  // 5
        int len1 = len-1 ;  //3

        for(int i =0; i<len/2; i++){ // 2

                    int temp = Arr[i];  // 1
                    Arr[i] = Arr[len1];  // 1->5
                    Arr[len1] = temp;  // 5->1

                    len1--; // decrement for length
        }

        for(int i =0; i<len; i++){
             System.out.print(Arr[i] +" ");
        }

    }
}