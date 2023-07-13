// write a java program to find the last ocuurance index of a no.
import java.util.Scanner;
public class qus_5 {
    public static void main(String [] args){
         Scanner sc= new Scanner(System.in);
         int arr [] ={5,6,5,3,5,4};
         int lastindex =-1;
         System.out.println("Enter the value of x whose index last ocurrance you want to find");
         int x =sc.nextInt();
         for(int i=0;i<arr.length;i++){
            if(x==arr[i]){
                lastindex = i;

            }
         }
         System.out.println(lastindex);
        }
    
}
