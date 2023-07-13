// count the number of elements strictly grater than value of x
import java.util.Scanner;
public class qus_6 {
    public static void main(String[] args){
           int arr[]={5,4,6,7,8};
           Scanner sc =new Scanner(System.in);
           System.out.println("Enter the value of x");
           int x= sc.nextInt();
           int count=0;
           for(int i=0;i<arr.length;i++){
            if(x<arr[i]){
                count = count+1;
            }
        }
        System.out.println(count);
    }
}
