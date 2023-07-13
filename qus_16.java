// Reverse of array without creating new memory using Inplaxe method
import java.util.Scanner;
public class qus_16 {
    
       static void reversearray(int arr[]){
        int i=0,j=arr.length-1;
          while(i<j){
            swapinarray(arr, i, j);
            i++;
            j--;
          }
       } 
       static void swapinarray(int arr[],int i,int j){
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
       static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
      }
       System.out.println();
    }
    public static void main(String args []){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Size of array");
        int size = sc.nextInt();
        int arr [] = new int[size];
        System.out.println("Enter "+size+" element in array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
             reversearray(arr);
             printarray(arr);
    }
         
}
