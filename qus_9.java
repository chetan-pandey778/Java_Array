// count the number of pair whose sum is equal to the given value x.
import java.util.Scanner;
public class qus_9 {
    static int qus_9(int arr[], int target){
        int n =arr.length;
        int ans =0;
        for(int i=0;i<n;i++){//first number
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    ans++;
                }
            }

        }   return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int size = sc.nextInt();
        int arr []=new int[size];
        System.out.println("enter the "+size+" element in array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
          System.out.println("enter the target sum");
          int target = sc.nextInt();

        System.out.println(qus_9(arr,target));

    }
    
}
