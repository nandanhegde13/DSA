package Arrays;

import java.util.Scanner;

public class Main {
    static Scanner scan  = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = new int[7];
        for(int i=0;i<arr.length;i++){
            arr[i] = scan.nextInt();
        }

        System.out.println(max_difference1(arr));

//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }

    }

  static int max_difference(int[] arr){
        //Naive approach
        // Theta n^2;
        int n= arr.length;
        int res = arr[1]-arr[0];
        for(int i=0;i<n-1;i++){
            for(int j = i+1;j<n;j++){
                res=Math.max(res,arr[j]-arr[i]);
            }
        }
        return res;
  }

  static int max_difference1(int[] arr){
        // better approach
        // theta n;
      int res = arr[1] - arr[0];
      int min = arr[0];
      for(int j=1;j<arr.length;j++){
          res = Math.max(res,arr[j]-min);
          min = Math.min(min,arr[j]);
      }
    return res;
  }

}
