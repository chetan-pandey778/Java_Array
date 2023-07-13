// REverse an array consisting of integer value
import java.util.Scanner;
public class qus_15 {
      static int[] reversearray(int arr[]){
        int [] ans =new int[arr.length];
        int j=0;

        // tarverse orignal array in reverse direction
        for(int i=arr.length-1;i>=0;i--){
            ans[j++]=arr[i];
        }
             return ans;
      }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sizt of an array");
        int size = sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter "+size+" element in array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();        
        }
         int ans [] =reversearray(arr);
         for(int i=0;i<ans.length;i++){
          System.out.print(ans[i] + " ");
        
        }
    }
}
