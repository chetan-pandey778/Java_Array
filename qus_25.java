//  PREFIX SUM OR RUNNING SUM
import java.util.Scanner;
public class qus_25 {
     static void prefixsum(int arr[]){
        arr[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i] = arr[i-1]+arr[i];
        }

     }
    static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        int arr[]= new int[size];
        System.out.println("Entrer "+size+" element in array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
         prefixsum(arr);
         printarray(arr);

    }
    
}

