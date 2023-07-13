// import java.util.Scanner;
// public class qus_23 {
//    static void swapinarray(int arr[],int i,int j){
//     int temp;
//     temp=arr[i];
//     arr[i]=arr[j];
//     arr[j]=temp;
//    }
//    static void reversearray(int arr[]){
//     int i=0,j=arr.length-1;
//       while(i<j){
//         swapinarray(arr, i, j);
//         i++;
//         j--;
//       }
//    } 
//        static void printarray(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i] +" ");
//         }
//        }
//     public static void main(String [] args){
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter the size of array");
//         int size =sc.nextInt();
//         int arr[]=new int[size];
//         System.out.println("Enter "+size+" element in array");
//          for(int i=0;i<size;i++){
//             arr[i]=sc.nextInt();
//          }
//         //  System.out.println("Enter the value of k");
//         //  int k = sc.nextInt();
//            System.out.println("the element of array is");
//             printarray(arr);
//             System.out.println("the reverse array is");
//             reversearray(arr);
//             printarray(arr);

//     }
    
// }
import java.util.Scanner;
public class qus_23 {
   static void swapinarray(int arr[],int i,int j){
    int temp;
    temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
   }
   static void reversearray(int arr[],int i,int j){
      while(i<j){
        swapinarray(arr, i, j);
        i++;
        j--;
      }
   }  
      static void rotateinplace(int arr[],int k)
      {
         int n = arr.length;
        k = k%10;
        reversearray(arr, 0, n-k-1);
        reversearray(arr, n-k, n-1);
        reversearray(arr, 0, n-1);
      }

         static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
            System.out.println();
        }
       }
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size =sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter "+size+" element in array");
         for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
         }
           System.out.println("Enter the value of k");
             int k = sc.nextInt();
           System.out.println("the element of array is");
            printarray(arr);
            System.out.println("the reverse array is");
            rotateinplace(arr, k);
            printarray(arr);
            

    }
    
}