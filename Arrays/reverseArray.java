package Arrays;

import java.util.Scanner;

public class Main1 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println("Enter elements for array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        reverseArray(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    } 
    static int[] reverseArray(int[] arr){
        int low = 0;
        int high = arr.length-1;
       while(low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;
        }
return arr;
    }
}
