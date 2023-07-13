// find last repeating value of array
import java.util.Scanner;
public class qus_14 {
    static int firstrepeatelement(int arr[]){
        for(int i=arr.length;i>0;i--){
           for(int j=arr.length-1;j>i;j--){
               if(arr[i]==arr[j]){
                   return arr[i];

               }
           }
        }
           return -1;
       }
   public static void main(String[] args){
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the size of array");
       int size = sc.nextInt();
       int arr []= new int[size];
       System.out.println("enter "+size+" element in array");
       for(int i=0;i<size;i++){
           arr[i]=sc.nextInt();
       }
          System.out.println("the Last repeating element is "+firstrepeatelement(arr));

   }
    
}
