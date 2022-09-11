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
        isSorted(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
static boolean isSorted(int[] arr){
        boolean flag = false;
        int a = 0;
        for(int i=1;i<arr.length;){
            if(arr[i]>=arr[a]){
                a=i;
                i++;
                flag = true;
            }
            else{
                flag=false;
                break;

            }
        }
        return flag;
}
    
}
