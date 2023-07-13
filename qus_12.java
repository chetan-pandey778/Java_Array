// find 2nd largest no. in array
import java.util.Scanner;
public class qus_12 {

    static int findfirstmax(int arr[]){
        int mx = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>mx){
                mx = arr[i];
            }
        }
        return mx;

    } static int findsecondmax(int arr[]){
        int mx = findfirstmax(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==mx){
                arr[i]=Integer.MIN_VALUE;
            }
        }   int secondmax =findfirstmax(arr);
        return secondmax;

    }
    public static void main(String args[]){
     Scanner sc= new Scanner(System.in);
     System.out.println("enter the size of your array");
     int size = sc.nextInt();
     int arr[]= new int[size];
     System.out.println("Enter the "+size+" element in array");
     for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
     }

     System.out.println("second maximum element "+findsecondmax(arr));
}
}
