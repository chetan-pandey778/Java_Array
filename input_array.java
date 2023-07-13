import java.util.Scanner;

public class input_array {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        int arr[]= new int[size];
        System.out.print("Enter "+size+" element in array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();     
           
        }
        System.out.println("the "+size+" elements of array that you enterd is :");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    
}
 
}