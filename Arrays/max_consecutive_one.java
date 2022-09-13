package Arrays;

import java.util.Scanner;

public class Main {
    static Scanner scan  = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = new int[7];
        for(int i=0;i<arr.length;i++){
            arr[i] = scan.nextInt();
        }

        System.out.println(max_consecutive_one(arr));

//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }

    }

  static int max_consecutive_one(int[] arr){
      // Big o of n;
        int res = 0,count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                count =0;
            }
            else{
                count++;
                res = Math.max(res,count);
            }
        }
        return res;
  }

}
