package Arrays;

import java.util.Scanner;

public class Main {
    static Scanner scan  = new Scanner(System.in);
    public static void main(String[] args) {

       int num = 5;
        System.out.println(countSet(num));
     }


     static int countSet(int num){
        int res=0;
        while(num >0){
            res = res+(num&1);
            num = num>>1;
        }
        return res;
     }


     // Imp: Brian kerningham algo

     static int countSet1(int num) {
         int res = 0;
         while (num > 0) {
             num = (num & (num - 1));
             res++;
         }
         return res;
     }
}
