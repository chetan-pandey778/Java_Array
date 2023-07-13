// import java.util.Scanner;
// public class qus_26 {
//     static int [] prefixsum(int arr[]){
//         arr[0]=arr[0];
//         for(int i=1;i<arr.length;i++){
//             arr[i] = arr[i-1]+arr[i];
//         }
//               return prefixsum();
//      }
//     static void printarray(int arr[]){
//         for(int i=1;i<arr.length;i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the size of array");
//         int size = sc.nextInt();
//         int arr[]= new int[size];
//         System.out.println("Entrer "+size+" element in array");
//         for(int i=1;i<size;i++){
//             arr[i]=sc.nextInt();
//         }
//           int [] prefsum = prefixsum(arr);
//            System.out.println("enter the value of q");
//            int q=sc.nextInt();
          
//            while(q-->0){
//             System.out.println("enter the value of l");
//             int l= sc.nextInt();
//             System.out.println("enter the value of r");
//             int r = sc.nextInt();
//             int ans = prefsum[r]-prefsum[l-1];
//             System.out.println(ans);
           
//            }

//     }
// }
import java.util.Scanner;

public class qus_26 {
    static int[] prefixsum(int arr[]) {
        int n = arr.length;
        int[] prefixSum = new int[n + 1];
        prefixSum[0] = 0;
        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i - 1];
        }
        return prefixSum;
    }

    static void printarray(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter " + size + " elements in the array");
        for (int i = 1; i <= size; i++) {
            arr[i - 1] = sc.nextInt();
        }
        int[] prefixSum = prefixsum(arr);
        System.out.println("Enter the number of queries (q)");
        int q = sc.nextInt();

        while (q-- > 0) {
            System.out.println("Enter the value of l");
            int l = sc.nextInt();
            System.out.println("Enter the value of r");
            int r = sc.nextInt();

            int ans = prefixSum[r] - prefixSum[l - 1];
            System.out.println("Sum of subarray from index " + l + " to " + r + " is: " + ans);
        }
    }
}
