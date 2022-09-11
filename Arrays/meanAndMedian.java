import java.util.Arrays;
class Solution
{
  
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
  
  public int median(int A[],int N)
    {
      
       Arrays.sort(A);
       if(N%2==1){
           return (A[N/2]);
       }
       else{
           return((A[N/2]+A[(N/2)-1])/2);
       }
    
       
    }
    public int mean(int A[],int N)
    {  int sum =0;
       //Your code here
       for(int i =0;i<N;i++){
           sum += A[i];
       }
       return (sum/N);
    }

}

