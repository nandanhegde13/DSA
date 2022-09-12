package Arrays;

import java.util.Scanner;

public class Main {
    static Scanner scan  = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = new int[7];
        for(int i=0;i<arr.length;i++){
            arr[i] = scan.nextInt();
        }
         
         leaders1(arr);

//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }

    }


   static void leaders(int[] arr){
        //Naive approach
        for(int i=0;i<arr.length;i++){
            boolean flag = false;
           for(int j=i+1;j<arr.length;j++){
               if(arr[i]<= arr[j]){
                   flag=true;
                   break;
               }
           }
           if(flag==false){
               System.out.print(arr[i]+" ");
           }
        }

   }

   static void leaders1(int[] arr){
        // Better approach
       int n = arr.length;
       int cur_ldr = arr[n-1];
       System.out.print(cur_ldr+" ");
       for(int i=n-2;i>=0;i--){
           if(arr[i]>cur_ldr){
               cur_ldr = arr[i];
               System.out.print(cur_ldr+" ");
           }
       }
   }
}
