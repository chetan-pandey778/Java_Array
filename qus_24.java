import java.util.Scanner;
public class qus_24{
     static void swapinarray(int arr[],int i,int j){
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
     } 
      static void reversearray(int arr[]){
        int i=0; int j=arr.length-1;
        while(i<j){
            swapinarray(arr, i, j);
            i++;
            j--;
        }

      }
        static int [] squresort(int arr[]){
           int n=arr.length;
           int k=0;
           int ans[]=new int[n];
            int left =0;      // Math.abs(arr[right])    Math.abs(arr[left])
            int right =n-1;
            while(left<=right){
            if( Math.abs(arr[right])<Math.abs(arr[left])){
             ans[k++] =arr[left]*arr[left];
            left++;
            }else{
                ans[k++] =arr[right]*arr[right];
            right--; 
            }
         
        }
        
        return ans;
    }
    static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
            System.out.println();
        }
    }
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int arr[] =new int[size];
        System.out.println("enter "+size+" element in array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();

        } 
         int ans []=squresort(arr);
         System.out.println("the non decresing sqre array is");
          reversearray(ans);
         printarray(ans);
         
    }
}