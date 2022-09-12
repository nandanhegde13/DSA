package Arrays;

import java.util.Scanner;

public class Main {
    static Scanner scan  = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i] = scan.nextInt();
        }
        leftRotateByOne(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }


    static void leftRotateByOne(int[] arr){
        int n= arr.length;
        int temp = arr[0];
        for(int i=0;i<n-1;i++){
            arr[i] = arr[i+1];
        }
        arr[n-1] = temp;
    }
}
