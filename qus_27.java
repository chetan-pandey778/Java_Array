// DIVIDE ARRAY AND CHEAK THAT PREFIX SUM EQUAL TO SUFFIX SUM IF EQUAL RETURN TRUE OTHERWISE FALSE
import java.util.Scanner;
public class qus_27 {

    static int findArraysum(int arr[]){
        int totalsum = 0;
        for(int i=0;i<arr.length;i++){
            totalsum += arr[i];
        }
        return totalsum;
    }
    static boolean equalsumpartition(int arr[]){
        int totalsum=findArraysum(arr);
        int prefixsum=0;
        for(int i=0;i<arr.length;i++){
            prefixsum +=arr[i];
            int suffixsum = totalsum-prefixsum;
            if(prefixsum==suffixsum){
                return true;
            }
        }
          return false;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int arr[]  = new int[size];
        System.out.println("enter "+size+" element in array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Equal Partition Possible: "+equalsumpartition(arr));

    }
    
}
