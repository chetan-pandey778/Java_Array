// print 1st repeating no. and if there is no repeting no. print -1
import java.util.Scanner;
public class qus_13 {
      static int firstrepeatelement(int arr[]){
         for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
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
           System.out.println("the first repeating element is "+firstrepeatelement(arr));

    }
    
}

