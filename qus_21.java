import java.util.Scanner;
public class qus_21 {
    static void swapinarray(int arr[],int i,int j){
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
    static void sortzerosandones(int arr[]){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]==1 && arr[j]==0){
                swapinarray(arr, i, j);
                i++;
                j--;
            }
            if(arr[i]==0){
                i++;
            }if(arr[j]==1){
            j--;
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
