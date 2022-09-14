package Arrays;

import java.util.Scanner;

public class Main {
    static Scanner scan  = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = {10,10,10,30,30,40};
//        for(int i=0;i<arr.length;i++){
//            arr[i] = scan.nextInt();
//        }
       int num = 5;
        System.out.println(isSet1(num,3));

//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
     }

     static boolean isSet(int num , int pos){
        if(((1<<pos-1) & num)!=0)
            return true;
        return false;
     }

     static boolean isSet1(int num,int pos){
        if( ((num>> (pos-1)) & 1) == 1 )
           return true;

        return false;
     }
}
