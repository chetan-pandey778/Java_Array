//  find the uniaue number in array where all 
//the elements are being repeated twice with one value being unique
import java.util.Scanner;
public class qus_11{
    static int qus_9(int[] arr){
        int n =arr.length;
        int ans =-1;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }     
                  }       
                 
        }    
        for( int i=0;i<n;i++){
            if(arr[i]>0){
                ans=arr[i];
            }
          }
        return ans;
           
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array");
        int size = sc.nextInt();
    int arr[] = new int[size];
    System.out.println("enter "+size+" element in array");
    for(int i =0; i<size;i++){
        arr[i]=sc.nextInt();

    }
        System.out.println(qus_9(arr));

    }
}