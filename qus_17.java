import java.util.Scanner;
public class qus_17 {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int arr[]= new int[size];
        System.out.println("Enter "+size+" element in array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
          int temp;
          int start =0;
          int end =size-1;
          while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
          }System.out.println("the revere array is");
          for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
          }
    }
    
}
