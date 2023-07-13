// count the number of triplet whose sum is equal to the given value x.
import java.util.Scanner;
public class qus_10 {
  static int qus_10(int arr[],int target){ 
    int n = arr.length; 
    int ans =0;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            for(int k=j+1;k<n;k++){
                if(target==arr[i]+arr[j]+arr[k]){
                    ans = ans+1;
                }
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

        System.out.println(qus_10(arr,target));

    }
    
    
}
