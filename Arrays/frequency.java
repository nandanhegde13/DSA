package Arrays;

import java.util.Scanner;

public class Main {
    static Scanner scan  = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = {10,10,10,30,30,40};
//        for(int i=0;i<arr.length;i++){
//            arr[i] = scan.nextInt();
//        }

        frequency(arr);

//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
     }

     static void frequency(int[] arr){
        int n = arr.length;
        int freq = 1;
        int i=1;
          while(i<n){
             while(i<n&& arr[i] == arr[i-1])
             {
                 freq++;
                 i++;
             }
              System.out.println(arr[i-1]+" "+freq);
             i++;
             freq=1;
          }
          if(i<n && arr[i]!=arr[i-1]){
              System.out.println(arr[n-1]+" "+1);
          }
     }
}
