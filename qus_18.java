// Rotate the given array 'a' by k steps.where k is non-negative and k can be greater than n;
import java.util.Scanner; 
public class qus_18 {
   static void swapinarray(int arr[],int i,int j){
    int temp;
    temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;

   }static void reverse(int arr[],int i,int j){
        while(i<j){
            swapinarray(arr, i, j);
            i++;
            j--;
        }
   }    

     static void rotateinplace(int arr[],int k){
        int n=arr.length;
        k=k%10;
         reverse(arr, 0, n-k-1);
         reverse(arr,n-k,n-1);
         reverse(arr,0,n-1);
 
        }
        static void printarray(int arr[]){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i] + " ");
          }
           System.out.println();
        }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the "+size+" element in array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
       System.out.println("enter k");
       int k=sc.nextInt();
       System.out.println("orignal array");
        printarray(arr);
       rotateinplace(arr, k);
      System.out.println("after rotation");
      printarray(arr);
    }
}
