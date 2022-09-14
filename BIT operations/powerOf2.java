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
        System.out.println(powOf2(num));

//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
     }

   static boolean powOf2(int num){
        if(num==0)
            return false;
        while(num!=1){
            if(num%2!=0)
                return false;
            num=num/2;
        }

        return true;
   }

   static boolean powerOf2(int n){
        if(n==0)
            return false;
        return ((n&(n-1)) == 0);

   }
}
