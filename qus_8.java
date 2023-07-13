// print the array's small element in 1st no. than print the biggest element in 2nd no.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class qus_8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size =  sc.nextInt();
        int arr[] =new int[size];
        Arrays.sort(arr);
        System.out.println("enter the "+size+" element in array");
        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();
            
        }for(int i=0;i<size;i++){
            
        }
        // System.out.println(arr[0]);
        // System.out.println(arr[size]-1);

    }
    
}
