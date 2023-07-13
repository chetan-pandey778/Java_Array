// SUFIX SUM OF ARRAY
import java.util.Scanner;
public class qus_28 {

    static void suffixsum(int arr[]){
        int n= arr.length;
        for(int i=n-2;i>=0;i--){
            arr[i]=arr[i]+arr[i+1];

        }
      

    }
    static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter "+size+" element in array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        suffixsum(arr);
        printarray(arr);
    }
    
}
