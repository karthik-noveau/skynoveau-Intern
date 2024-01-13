class vowels{
    public static void main(String[] args){

        char a = 'w';
        // a e i o u

        // 1. else if
        // 2. logical OR operator
// way 1 :
        if( a=='a' ){  
            System.out.println( a + " is the vowel");
        }
        else if(a=='e'){  
             System.out.println( a + " is the vowel");
        }
         else if(a=='i'){ 
             System.out.println( a + " is the vowel");
        }
         else if(a=='o'){  
             System.out.println( a + " is the vowel");
        }
         else if(a=='u'){  
             System.out.println( a + " is the vowel");
        }
        else{
            System.out.println( a + " is not vowel");
        }


        // way 2 : Logical OR operator || 0 1 --> 1(true), 0 0 --> 0(false)

        if( a=='a'|| a=='e'|| a=='i'|| a=='o' || a=='u'){ // e==a , e==e
            System.out.println(a+" is the vowel");
        }
        else{
             System.out.println(a+" is not a vowel");
        }

    }
}