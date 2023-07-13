// Write a Java Program to find a ocuurance no. in array
import java.util.Scanner;
public class qus_4 {
    public static void main(String[]args){
        int arr[] ={5,6,5,1,5};
         Scanner sc= new Scanner(System.in);
         System.out.println("Enter the no. whose occuranc you want to found");
         int x = sc.nextInt();
         int count =0;
        for(int i=0;i<arr.length;i++){
            if(x==arr[i]){
                   count = count+1;
            }
         } 
         System.out.println("the ocuurance of no."+x+" is "+count);
    }
    
}
