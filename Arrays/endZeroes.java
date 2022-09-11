package Arrays;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i <arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        moveZero(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static void moveZero(int[] arr){
      int count = 0;
      for(int i=0;i<arr.length;i++){
          if(arr[i]!=0){
              int temp = arr[i];
              arr[i] = arr[count];
              arr[count] = temp;
              count++;
          }
       }
    }
}
