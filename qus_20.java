import java.util.Scanner;
public class qus_20 {


static void sortzerosandones(int arr[]){
    int n =arr.length;
    int zeroes =0;
    for(int i=0;i<n;i++){
        if(arr[i]==0){
            zeroes++;
        }
    }
      for(int i=0;i<n;i++){
        if(i<zeroes){
            arr[i]=0;

        }else{
            arr[i]=1;
        }
      }
}
 static void printarray(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    
    }
    System.out.println();

 }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter "+size+" element in array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }  

        System.out.println("the orignal array is");
        printarray(arr);
        System.out.println("the sorted array");
        sortzerosandones(arr);
        printarray(arr);
        
    }
}
